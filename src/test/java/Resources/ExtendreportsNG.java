
/*
package Resources;






import org.openqa.selenium.WebDriver;

import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;

import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;




public class ExtendreportsNG {
	ExtentTest test;
	  public WebDriver driver;
 
	public static  ExtentReports GetReportObject() {
		
		String path=System.getProperty("user.dir")+"//Repots//index.html";
		ExtentSparkReporter reporter=new ExtentSparkReporter(path);
		reporter.config().setReportName("TEEMS 3.0 automation Results");
		reporter.config().setDocumentTitle("automation Test Results");
		reporter.config().setTheme(Theme.STANDARD);
		
		ExtentReports extent=new ExtentReports();
		extent.attachReporter(reporter);
		extent.setSystemInfo("Tester", "Naresh");
	
		return extent;
	}
	
	

    
    }
	
	*/	
package Resources;

import org.openqa.selenium.WebDriver;
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.reporter.ExtentSparkReporter;
import com.aventstack.extentreports.reporter.configuration.Theme;
import com.github.javafaker.Faker;

import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;

public class ExtendreportsNG {
    ExtentTest test;
    public WebDriver driver;


    public static ExtentReports GetReportObject() {
    //	 Faker faker = new Faker();
  //       int randomNumber = faker.random().nextInt(1, 5000); // Generates a random integer between 1 and 9
         
        
    	
    	Date dt= new Date();	//it will return system date
		
		DateFormat df1= new SimpleDateFormat("dd_MM_yyyy_HH_MM_ss");//to convert into required format
	        String reportDirectory = System.getProperty("user.dir")+"//Reports//"+"Report_"+df1.format(dt)+"//";
        String reportFilePath = reportDirectory + "index_"+".html";
        // Increment report count for uniqueness
        
        ExtentSparkReporter reporter = new ExtentSparkReporter(reportFilePath);
        reporter.config().setReportName("TEEMS 3.0 Automation Results");
        reporter.config().setDocumentTitle("Automation Test Results");
        reporter.config().setDocumentTitle("Company :syngymaxim");

     //  reporter.config().setTheme(Theme.STANDARD);

       reporter.config().setTheme(Theme.DARK);

        
        ExtentReports extent = new ExtentReports();
        extent.attachReporter(reporter);
        extent.setSystemInfo("Tester", "Naresh");
    	
        return extent;
    	
    	}
}
