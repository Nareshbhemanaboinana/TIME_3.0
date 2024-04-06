package devAdmin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Category extends Login1{

	@Test(priority=0)
	public void ADD_Category() throws InterruptedException {

	Faker fk = new Faker();
    String Name = fk.name().firstName();
	String categorycode = fk.code().asin();
	  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[5]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@formcontrolname='SName']")).sendKeys(Name);
	    driver.findElement(By.xpath("//input[@formcontrolname='SCode']")).sendKeys(categorycode);

	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-category/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();

		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	     String popups = popup.getText();
		    Thread.sleep(3000);

		     // String backgroundColor = popup.getCssValue("background-color");
	           if (popups.contains(" Successfully ")) {
	           	
	           	System.out.println("Massage:"+ popups);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-category/section/div/div[2]/div/div/div/mat-tab-group/mat-tab-header/div/div/div/div[2]")).click();
Thread.sleep(4000);
zz.executeScript("window.scrollBy(0,400)");
Thread.sleep(4000);


driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(Name);
Thread.sleep(4000);

Assert.assertEquals(Name, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-category/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[1]")).getText() );
	           }
	           else {
		           	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	           }
	}

	@Test(priority=1)

	public void Search_Category() throws InterruptedException {
		
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[7]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(9000);

		driver.navigate().refresh();
		Thread.sleep(4000);
		
		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();

	
		
		    Universal_methods UM=new Universal_methods();

	      Thread.sleep(3000);
	      UM.RadioButtons(driver, "Active");
	      Thread.sleep(3000);

	        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit'][1]"));
	        searchButton.click();
		    zz.executeScript("window.scrollBy(0,400)");
	       	
			 String record=  UM.Ramdom_Record(driver);
	
 
     driver.findElement(By.name("sName")).sendKeys(record);
		Thread.sleep(4000);
        searchButton.click();
	    zz.executeScript("window.scrollBy(0,400)");

	
	     Assert.assertEquals( record, UM.First_Record_Of_Row(driver) );
			
	


	}
}
