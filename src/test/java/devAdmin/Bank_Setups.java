package devAdmin;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Bank_Setups extends Login1 {
	

	 @Test(priority = 0)
	 
	 public void ADD_Bank() throws InterruptedException {

   Faker fk = new Faker();
    String bankName = fk.name().firstName();
	String bankcode = fk.code().asin();
	  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[3]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@formcontrolname='bankName']")).sendKeys(bankName);
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@formcontrolname='bankCode']")).sendKeys("FGER");

	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-bank/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	     String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
	           if (popups.contains(" Successfully ")) {
	           	
	           	System.out.println("Massage:"+ popups);

			 driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
				Thread.sleep(3000);
			    zz.executeScript("window.scrollBy(0,400)");
			    Thread.sleep(4000);

			 driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(bankName);
				Thread.sleep(3000);
				
				Assert.assertEquals( (bankName), driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-bank/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText());

	           }
	           else {
		           	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	           }
}

	 @Test(priority = 1)
	public void Search_Bank() throws InterruptedException {
		
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[5]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(11000);
		driver.navigate().refresh();
		Thread.sleep(4000);
		  WebElement svenexxt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[5]/a"));

		zz.executeScript("arguments[0].scrollIntoView()", svenexxt);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenexxt);
		Thread.sleep(11000);

		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();

	
		
		    Universal_methods UM=new Universal_methods();

	      Thread.sleep(5000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-bank/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();

		
			 String record=  UM.Ramdom_Record(driver);
	
 
     driver.findElement(By.name("bankName")).sendKeys(record);
		Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-bank/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
	      zz.executeScript("window.scrollBy(0,300)");
	
	     Assert.assertEquals( record, UM.First_Record_Of_Row(driver) );
	
}

}