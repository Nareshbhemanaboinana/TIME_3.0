package devAdmin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Cancellation_Reason extends Login1{

	@Test(priority=0)
	public void ADD_Cancellation_Reason() throws InterruptedException {

	Faker fk = new Faker();
    String CRName = fk.name().firstName();
	String CRcode = fk.code().asin();
	  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[4]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(CRName);
	    driver.findElement(By.xpath("//input[@formcontrolname='sCode']")).sendKeys(CRcode);

	    driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();
		
		List<WebElement> citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement citycheckbox:citycheckboxs ) {
			if(citycheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				citycheckbox.click();
			}
		}
		Thread.sleep(4000);

        driver.findElement(By.xpath("//*[@tabindex='-1']/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	    Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@formcontrolname='franchise']")).click();
    	
		List<WebElement> francheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement francheckbox:francheckboxs ) {
			if(francheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				francheckbox.click();
			}
		}
	
		Thread.sleep(4000);

	    driver.findElement(By.xpath("//*[@tabindex='-1']/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@formcontrolname='office']")).click();


		List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement ofccheckbox:ofccheckboxs ) {
			if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				ofccheckbox.click();
			}
		}
		Thread.sleep(4000);

  	    driver.findElement(By.xpath("//*[@tabindex='-1']/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	
		  WebElement Submitbutton = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-cancellation-reason/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]"));
		  zz.executeScript("arguments[0].scrollIntoView()", Submitbutton);
		    Thread.sleep(3000);
		    zz.executeScript("arguments[0].click()", Submitbutton);
			WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
		     String popups = popup.getText();

			     // String backgroundColor = popup.getCssValue("background-color");
		           if (popups.contains(" Successfully ")) {
		           	
		           	System.out.println("Massage:"+ popups);

		 driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
			Thread.sleep(3000);
		    zz.executeScript("window.scrollBy(0,400)");
		    Thread.sleep(4000);

		 driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(CRName);
			Thread.sleep(3000);
			 driver.findElement(By.xpath("//input[@aria-label='Search box']")).clear();
				Thread.sleep(3000);
				 driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(CRName);
					Thread.sleep(6000);

			Assert.assertEquals( CRName, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-cancellation-reason/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[1]")).getText() );

		           }
		           else {
			           	System.out.println("Massage:"+ popups);
				          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

		           }
	}
	@Test(priority=1)

	public void Search_Cancellation_Reason() throws InterruptedException {
		
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[6]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(11000);
		driver.navigate().refresh();
		Thread.sleep(4000);

		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();

	
		
		    Universal_methods UM=new Universal_methods();

	      Thread.sleep(5000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-cancellation-reason/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();

		
			 String record=  UM.Ramdom_Record(driver);
	
 
     driver.findElement(By.name("sName")).sendKeys(record);
		Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-cancellation-reason/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
	      zz.executeScript("window.scrollBy(0,300)");
	
	     Assert.assertEquals( record, UM.First_Record_Of_Row(driver) );
	
}
}