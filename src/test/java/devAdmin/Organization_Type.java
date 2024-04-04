package devAdmin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.aventstack.extentreports.Status;
import com.github.javafaker.Faker;

import Components.Listeners;
import Components.Universal_methods;

public class Organization_Type extends Login  {

	 @Test(priority = 0)
	 
	 public void ADD_Organization_Type() throws InterruptedException {

		 
		Faker fk = new Faker();
		String name = fk.name().firstName();

		Thread.sleep(3000);
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[14]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-organisation-types/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Darcie");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-organisation-types/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
		
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
		
		Assert.assertEquals( name, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-organisation-types/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText() );
          
		      }
		      else {
			      	System.out.println("Massage:"+ popups);
		          //  throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

		            org.testng.Assert.fail("Test failed because the popup message did not contain 'Successfully'."+popups);

		           
		            
		            
		      }

	
	}

	 @Test(priority = 1)
	public void Search_Organization_Type() throws InterruptedException {
		
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[15]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(7000);
		
		driver.navigate().refresh();
		//WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[15]/a"));
		//JavascriptExecutor zz = (JavascriptExecutor) driver;
	//	zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
	//	zz.executeScript("arguments[0].click()", svenext);
	//	Thread.sleep(7000);
	
		
		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
			Thread.sleep(4000);
	
		//create reference object for WebTable
		  
		      Universal_methods UM=new Universal_methods();
		      Thread.sleep(4000);
				List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
		WebElement	Firstdropdown = dropdowns.get(0);

		Firstdropdown.click();
		UM.dropdownselection(driver);
		
		Thread.sleep(3000);
		

	    UM.RadioButtons(driver, "Active");
	    
      Thread.sleep(3000);

        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit'][1]"));
        searchButton.click();
	 

		  zz.executeScript("window.scrollBy(0,300)");	    
	Assert.assertEquals( driver.findElement(By.xpath("//mat-select[@role='combobox'][1]")).getText(), UM.First_Record_Of_Row(driver) );

		
	}

}
