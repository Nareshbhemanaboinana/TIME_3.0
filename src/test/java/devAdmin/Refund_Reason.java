package devAdmin;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Refund_Reason extends Login1{

	@Test(priority=0)
	public void ADD_Refund_Reason() throws InterruptedException {

	
		
		Faker fk = new Faker();
		String name = fk.name().firstName();

		Thread.sleep(3000);
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[15]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(4000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-refund-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name);
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-refund-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
		
		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
		String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
		      if (popups.contains(" Successfully ")) {
		      	
		      	System.out.println("Massage:"+ popups);

		
		
		Thread.sleep(4000);

		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
		Thread.sleep(4000);
		zz.executeScript("window.scrollBy(0,400)");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(name);
		Thread.sleep(4000);
		
		Assert.assertEquals( name, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-refund-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText() );
          
		      }
		      else {
			      	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

		      }
		

}

	@Test(priority=1)

	public void Search_Refund_Reason() throws InterruptedException {
		
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[16]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(9000);

		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
			Thread.sleep(4000);
	
		//create reference object for WebTable
		      zz.executeScript("window.scrollBy(0,900)");

		      Thread.sleep(4000);
		WebElement dropdowns = driver.findElement(By.cssSelector("mat-select"));
		dropdowns.click();
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span")).click();
	      zz.executeScript("window.scrollBy(0,-1200)");

	      Thread.sleep(5000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-refund-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
		Universal_methods UM=new Universal_methods();
		String record=UM.Ramdom_Record(driver);
		driver.findElement(By.name("sName")).sendKeys(record);
		Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-refund-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
	      zz.executeScript("window.scrollBy(0,300)");
	
	     Assert.assertEquals( UM.Ramdom_Record(driver), UM.First_Record_Of_Row(driver) );

		
	}

	
}