

package Browse;






import java.io.File;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.io.output.TeeOutputStream;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;

import org.openqa.selenium.io.FileHandler;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;
import org.testng.Reporter;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;

import Resources.ExtendreportsNG;
import java.io.ByteArrayOutputStream;
import java.io.OutputStream;
import java.io.PrintStream;
public class Listeners3 extends ExtendreportsNG implements ITestListener{
	ExtentTest test;
  
	ExtentReports extent =ExtendreportsNG.GetReportObject();
	private static ThreadLocal<ExtentTest> extentTest =new  ThreadLocal<ExtentTest>();
	private ByteArrayOutputStream consoleOutput;
    private PrintStream originalOut;
    private PrintStream customOut;

    public Listeners3() {
        consoleOutput = new ByteArrayOutputStream();
        originalOut = System.out;
        customOut = new PrintStream(new TeeOutputStream(originalOut, consoleOutput));
        System.setOut(customOut);
    }

	@Override
	public void onTestStart(ITestResult results) {
		test = extent.createTest(results.getMethod().getMethodName());

		extentTest.set(test);
	}

	@Override
	public void onTestSuccess(ITestResult results) {
		//test.log(Status.PASS, "Test Pass");
     //   test.log(Status.PASS, "Test is Pass" + consoleOutput.toString());
		//test.log(Status.PASS, MarkupHelper.createLabel("<span style='color: black;'>Test is Pass</span><br><pre style='border: 1px solid green; padding: 10px; color: black; background-color: green; font-weight: bold;'>" + consoleOutput.toString() + "</pre>", ExtentColor.GREEN));
		  String consoleOutputString = consoleOutput.toString();

		    // Reset console output for this method
		    consoleOutput.reset();

		    // Your existing code to log the test success status
		    extentTest.get().log(Status.PASS, MarkupHelper.createLabel("<span style='color: black;'>Test is Pass</span><br><pre style='border: 1px solid green; padding: 10px; color: black; background-color: green; font-weight: bold;'>" + consoleOutputString + "</pre>", ExtentColor.GREEN));
	}
	@Override
	public void onTestFailure( ITestResult results ) {
		
	//	test.log(Status.FAIL, "test fail");
       // test.log(Status.FAIL, "Test is fail" + consoleOutput.toString());
		//test.log(Status.FAIL, MarkupHelper.createLabel("<span style='color: black;'>Test is Fail</span><br><pre style='border: 1px solid red; padding: 10px; color: black; background-color: red; font-weight: bold;'>" + consoleOutput.toString() + "</pre>", ExtentColor.RED));
		  String consoleOutputString = consoleOutput.toString();

		    // Reset console output for this method
		    consoleOutput.reset();

		    // Your existing code to log the test failure status
		    extentTest.get().log(Status.FAIL, MarkupHelper.createLabel("<span style='color: black;'>Test is Fail</span><br><pre style='border: 1px solid red; padding: 10px; color: black; background-color: red; font-weight: bold;'>" + consoleOutputString + "</pre>", ExtentColor.RED));

		    extentTest.get().fail(results.getThrowable());
		try {
			driver=(WebDriver) results.getTestClass().getRealClass().getField("driver").get(results.getInstance());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}
		
		File f=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		//to get Date stamping with file
		Date dt= new Date();	//it will return system date
		
		DateFormat df1= new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss");//to convert into required format
		
		//to save screenshot with date stamping
		try {
			FileHandler.copy(f,new File(System.getProperty("user.dir")+"//Repots//index.html"+df1.format(dt)+".png")) ;
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			 extentTest.get().addScreenCaptureFromPath(System.getProperty("user.dir")+"//Repots//index.html"+df1.format(dt)+".png");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}//
		  }
		
    
		
	
	

		    


	    
    
	
	
	@Override
	public void onTestSkipped(ITestResult results) {
	
		
	}
	
	
	
	
	
	
	@Override
	public void onFinish(ITestContext context) {
		extent.flush();
		
	}

}

