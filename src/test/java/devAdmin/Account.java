package devAdmin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Account extends Login1{

	@Test(priority=0)
	public void ADD_Account() throws InterruptedException {

	Faker fk = new Faker();
	String accountName = fk.name().username();
	 String first = fk.letterify("?"); // Generates a random letter
	    String second = fk.letterify("?");

		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[2]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(accountName);
	    Thread.sleep(4000);
        driver.findElement(By.xpath("//input[@formcontrolname='sCode']")).sendKeys(first+second);
	    Thread.sleep(4000);

        driver.findElement(By.xpath("//input[@formcontrolname='fAmount']")).sendKeys("60000");
	    zz.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@formcontrolname='iCityId']")).click();
	    Thread.sleep(5000);
		
		List<WebElement> citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement citycheckbox:citycheckboxs ) {
			if(citycheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				citycheckbox.click();
			}
		}
		 Thread.sleep(5000);
        driver.findElement(By.xpath("//*[@tabindex='-1']/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	    Thread.sleep(5000);

	    driver.findElement(By.xpath("//input[@formcontrolname='ifranchiseId']")).click();
	    Thread.sleep(5000);
		
		List<WebElement> francheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement francheckbox:francheckboxs ) {
			if(francheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				francheckbox.click();
			}
		}
	    Thread.sleep(5000);

        driver.findElement(By.xpath("//*[@tabindex='-1']/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	    
	    driver.findElement(By.xpath("//input[@formcontrolname='iOfficeId']")).click();
	    Thread.sleep(5000);

		List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement ofccheckbox:ofccheckboxs ) {
			if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				ofccheckbox.click();
			}
		}
        driver.findElement(By.xpath("//*[@tabindex='-1']/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
   Thread.sleep(4000);
  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-account/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
   zz.executeScript("window.scrollBy(0,-500)");
	 
	  
 	WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
     String popups = popup.getText();

	     // String backgroundColor = popup.getCssValue("background-color");
           if (popups.contains(" Successfully ")) {
           	
           	System.out.println("Massage:"+ popups);

   Thread.sleep(4000);

	driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
    zz.executeScript("window.scrollBy(0,400)");
    Thread.sleep(7000);

    driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys(accountName);
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).clear();
    Thread.sleep(3000);
    driver.findElement(By.xpath("//input[@placeholder=\"Search\"]")).sendKeys(accountName);

    Assert.assertEquals(accountName, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-account/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText() );
   
           }
           else {
              	System.out.println("Massage:"+ popups);
		          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

           }
	}

	@Test(priority=1)

	public void Search_Account() throws InterruptedException {
		
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[4]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(9000);

		driver.navigate().refresh();
		Thread.sleep(4000);

		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
			Thread.sleep(9000);

	
		
		    Universal_methods UM=new Universal_methods();

	      Thread.sleep(5000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-account/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();

		Thread.sleep(18000);

			 String record=  UM.Ramdom_Record(driver);
	
 
     driver.findElement(By.name("sName")).sendKeys(record);
     Thread.sleep(4000);

     driver.findElement(By.name("sName")).clear();
     Thread.sleep(4000);

     driver.findElement(By.name("sName")).sendKeys(record);

		Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-account/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
	      zz.executeScript("window.scrollBy(0,300)");
			Thread.sleep(18000);

	     Assert.assertEquals( record, UM.First_Record_Of_Row(driver) );
	
}
}
