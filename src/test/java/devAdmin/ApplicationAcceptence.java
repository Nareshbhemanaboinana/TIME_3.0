package devAdmin;


import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.ProtocolException;
import java.net.URL;
import java.util.Scanner;
import java.util.Set;
import java.util.concurrent.TimeUnit;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class ApplicationAcceptence extends Login1 {
	
	@Test
  public void Form() throws InterruptedException, IOException {
		
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);  
     Thread.sleep(3000);
     
     Faker faker = new Faker();
     
     String firstname = faker.name().firstName();
     String fathername=faker.name().firstName();
     String lastname=faker.name().lastName();
     
    
	 driver.findElement(By.linkText("Admissions")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.linkText("Application Acceptances")).click();
	 Thread.sleep(3000);
	 driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-pendingapplications/section/div/div[3]/div[1]/div[1]/mat-tab-group/div/mat-tab-body[1]/div/div/div/div/div/div/div[1]/div/div[2]/ul/li/div/button/span[1]/mat-icon")).click();

	 driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(firstname);
	 driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(fathername);
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(lastname);
  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[3]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("7/28/1994");
	WebElement selectElement = driver.findElement(By.cssSelector("mat-select"));
	selectElement.click();
	
	Thread.sleep(5000);
	WebElement opt=driver.findElement(By.xpath("//*[@id=\"mat-option-14\"]/span"));
	opt.click();
	// Get the current window handle
			String mainWindowHandle = driver.getWindowHandle();

	JavascriptExecutor js = (JavascriptExecutor) driver;
	js.executeScript("window.open();");

	
	
	// Get all the window handles
	Set<String> allWindowHandles = driver.getWindowHandles();

	// Loop through the window handles to find the new window
	for (String handle : allWindowHandles) {
	    if (!handle.equals(mainWindowHandle)) {
	        // Switch to the new window
	        driver.switchTo().window(handle);
	        
	        // Perform actions on the new window
	        // For example, get the title of the new window
	         driver.get("https://yopmail.com/en/");
	         driver.findElement(By.xpath("/html/body/div/div[2]/main/div[3]/div/div[2]/div/a[1]/div[2]/h3")).click();
	        driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[2]/div/div[1]/div[2]/button[1]/span")).click();
	        driver.findElement(By.xpath("/html/body/div/div[2]/main/div/div[2]/div/div[1]/div[2]/div/button/span/span[1]")).click();
	        
	        String email=driver.findElement(By.id("geny")).getText();
	        		// Close the new window
	        driver.close();
	        
	        // Switch back to the main window
	        driver.switchTo().window(mainWindowHandle);
	    	
	        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(email);

	        
	        //driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[4]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]")).click();
	    	Thread.sleep(5000);
	    	
	    	
	    	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[5]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Naresh@123");
	    	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[5]/div[2]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Naresh@123");


	    	WebElement element = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-newapplicantlogin/section/div/div[2]/div/div/div[2]/form/div[6]/div/button[1]/span[1]"));
	    	JavascriptExecutor jse = (JavascriptExecutor)driver;
	    	jse.executeScript("arguments[0].scrollIntoView()", element);
	    	Thread.sleep(5000);

	    	element.click();
	    	
	    	Thread.sleep(3000);

	    	WebElement term=driver.findElement(By.cssSelector("mat-select"));
	    	term.click();
	    	
	    	Thread.sleep(3000);
	    	WebElement terms=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option/span"));
	    	terms.click();

	    	Thread.sleep(3000);

	    	WebElement program=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicationtype/section/div/div[2]/div/div/div[2]/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select"));
	    	program.click();
	    	
	    	Thread.sleep(3000);

	    	WebElement pro=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option/span"));
	    	pro.click();
	    	Thread.sleep(3000);

	    	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicationtype/section/div/div[2]/div/div/div[2]/form/div[2]/div/button[1]")).click();
	    	Thread.sleep(3000);

	    	


	    	WebElement save = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[1]/div/div/div/form/div/button/span[1]"));
	    	JavascriptExecutor executor = (JavascriptExecutor)driver;
	    	executor.executeScript("arguments[0].click();", save);

	    	Thread.sleep(3000);

	    	WebElement ctry=driver.findElement(By.cssSelector("mat-select"));
	    	ctry.click();
	    	Thread.sleep(3000);

	    	WebElement ut=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span"));
	    	ut.click();
	    	Thread.sleep(3000);

	    	WebElement dubai=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select"));
	    	dubai.click();
	    	Thread.sleep(3000);

	    	WebElement du=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span"));
	    	du.click();
	    	Thread.sleep(3000);

	    	
	    	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[2]/div/div/div/form/div[4]/div[2]/mat-form-field/div/div[1]/div[4]/input")).sendKeys("9900990099");
	    WebElement SN=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[2]/div/div/div/form/div[5]/button[2]"));
	    
		JavascriptExecutor jj = (JavascriptExecutor)driver;
    	jj.executeScript("arguments[0].click();", SN);
    	Thread.sleep(5000);
    	
    	
    	WebElement elemento = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select"));
    	JavascriptExecutor js7 = (JavascriptExecutor) driver;
    	js7.executeScript("arguments[0].click();", elemento);



        Thread.sleep(5000);
        

    	WebElement elem = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span"));
    	JavascriptExecutor js71 = (JavascriptExecutor) driver;
    	js71.executeScript("arguments[0].click();", elem);
    	Thread.sleep(5000);

    	WebElement re=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input"));
	    re.sendKeys("muslim");
    	Thread.sleep(3000);
    	
    	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("7/28/1994");
    	Thread.sleep(3000);


    	//WebElement maa=driver.findElement(By.cssSelector("mat-select"));
    	//maa.click();
    	//Thread.sleep(3000);
    	
    	//WebElement single=driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span"));
    	//single.click();
    	//Thread.sleep(3000);

        WebElement passprtnumber= driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[3]/div/div/div/form/div[5]/div[1]/mat-form-field/div/div[1]/div[3]/input"));
        String value="1119";
        JavascriptExecutor pass = (JavascriptExecutor) driver;
        pass.executeScript("arguments[0].value = arguments[1];", passprtnumber,value);
        Thread.sleep(5000);

        Actions actions = new Actions(driver);
        actions.sendKeys(passprtnumber, "0")
               .perform();
        Thread.sleep(5000);

        WebElement svenext =  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-applicantchecklist/section/div/div[2]/div/div[1]/div[2]/mat-vertical-stepper/div[3]/div/div/div/form/div[7]/button[2]/span[1]"));

    
        JavascriptExecutor zz= (JavascriptExecutor) driver;
    	zz.executeScript("arguments[0].scrollIntoView()", svenext);
    	zz.executeScript("arguments[0].click()", svenext);

    	
	    }
	}
	
	}

}
