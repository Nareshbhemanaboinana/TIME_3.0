package Browse;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;
import java.io.PrintStream;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.markuputils.ExtentColor;
import java.io.OutputStream;

import Resources.ExtendreportsNG;

public class Listeners3 extends ExtendreportsNG implements ITestListener {
    ExtentTest test;
    ExtentReports extent = ExtendreportsNG.GetReportObject();
    private static ThreadLocal<ExtentTest> extentTest = new ThreadLocal<>();
    private ThreadLocal<ByteArrayOutputStream> consoleOutput = ThreadLocal.withInitial(ByteArrayOutputStream::new);
    private PrintStream originalOut;
    private PrintStream customOut;
    private WebDriver driver;

    public Listeners3() {
        originalOut = System.out;
        customOut = new PrintStream(new OutputStream() {
            @Override
            public void write(int b) throws IOException {
                consoleOutput.get().write(b);
                originalOut.write(b);
            }
        });
        System.setOut(customOut);
    }

    @Override
    public void onTestStart(ITestResult results) {
        test = extent.createTest(results.getMethod().getMethodName());
        extentTest.set(test);
    }

    @Override
    public void onTestSuccess(ITestResult results) {
        String consoleOutputString = consoleOutput.get().toString();
        consoleOutput.get().reset();
       /* extentTest.get().log(Status.PASS, MarkupHelper.createLabel(
        	    "<span style='background-color: green; color: black;'>Console Output:</span><br><pre style='border: 1px solid black; padding: 10px; color: black; background-color: #f2f2f2;'>"
        	    + consoleOutputString + "</pre>", ExtentColor.GREEN));*/
        extentTest.get().log(Status.PASS, MarkupHelper.createLabel("<span style='color: black;'>Test is Pass</span><br><pre style='border: 1px solid green; padding: 10px; color: black; background-color: green; font-weight: bold;'>" + consoleOutputString + "</pre>", ExtentColor.GREEN));

    }

    @Override
    public void onTestFailure(ITestResult results) {
        String consoleOutputString = consoleOutput.get().toString();
        consoleOutput.get().reset();
      /*  extentTest.get().log(Status.FAIL, MarkupHelper.createLabel(
        	    "<span style='background-color: red; color: black;'>Console Output:</span><br><pre style='border: 1px solid black; padding: 10px; color: black; background-color: #f2f2f2;'>"
        	    + consoleOutputString + "</pre>", ExtentColor.RED)) */
        extentTest.get().log(Status.FAIL, MarkupHelper.createLabel("<span style='color: black;'>Test is Fail</span><br><pre style='border: 1px solid red; padding: 10px; color: black; background-color: red; font-weight: bold;'>" + consoleOutputString + "</pre>", ExtentColor.RED));

        extentTest.get().fail(results.getThrowable());
        try {
            driver = (WebDriver) results.getTestClass().getRealClass().getField("driver").get(results.getInstance());
        } catch (Exception e1) {
            e1.printStackTrace();
        }
        File f = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
        Date dt = new Date();
        DateFormat df1 = new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss");
        try {
            FileHandler.copy(f, new File(System.getProperty("user.dir") + "//Repots//index.html" + df1.format(dt) + ".png"));
        } catch (IOException e) {
            e.printStackTrace();
        }
        try {
            extentTest.get().addScreenCaptureFromPath(
                    System.getProperty("user.dir") + "//Repots//index.html" + df1.format(dt) + ".png");
        } catch (IOException e) {
            e.printStackTrace();
        }
    }


    @Override
    public void onTestSkipped(ITestResult results) {
    }

    @Override
    public void onFinish(ITestContext context) {
        extent.flush();
    }

  
}
