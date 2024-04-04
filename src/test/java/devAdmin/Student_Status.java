package devAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Student_Status extends Login {
	
	@Test (priority =0)
	public void ADDStudent_Status() throws InterruptedException {
	Faker fk = new Faker();
	String name = fk.name().firstName();
	Thread.sleep(3000);
	
	WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[19]/a"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
	zz.executeScript("arguments[0].scrollIntoView()", svenext);
	Thread.sleep(4000);
	zz.executeScript("arguments[0].click()", svenext);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@ng-reflect-name='SName']")).sendKeys("Bruna");
	Thread.sleep(4000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-student-status/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
	
	
	WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	String popups = popup.getText();
	Thread.sleep(3000);

	     // String backgroundColor = popup.getCssValue("background-color");
	if (popups.contains("Student Status Saved sucessfully!!!")) {
	      	
	      	System.out.println("Massage:"+ popups);

	
	Thread.sleep(4000);


	
	
	driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
	Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(name);
	Thread.sleep(4000);
    Universal_methods UM=new Universal_methods();

	Assert.assertEquals( name, UM.First_Record_Of_Row(driver)  );
	
	      }
	      else {
		      	System.out.println("Massage:"+ popups);
		          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	      }
	      
	      }

	@Test (priority =1)
	public void Search_Student_Status() throws InterruptedException {
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[19]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(4000);
		

	 	  WebElement head =driver.findElement(By.xpath("//div[@role='tablist']"));
	 		
			List<WebElement> buttons=head.findElements(By.tagName("div"));

			for(WebElement button:buttons ) {
				if(button.getText().equalsIgnoreCase("Search Student Status")) {
					Thread.sleep(4000);
					button.click();
				}
			}					Thread.sleep(4000);
			zz.executeScript("window.scrollBy(0,900)");
			Thread.sleep(4000);
			List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
			WebElement FirstDropdown = dropdowns.get(0);
			Thread.sleep(4000);
			FirstDropdown.click();
			Thread.sleep(5000);
			driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span")).click();

			zz.executeScript("window.scrollBy(0,-1100)");

			
			//driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-student-status/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/button/span[1]")).click();
            //Thread.sleep(5000);
            
            Universal_methods UM=new Universal_methods();
            String smst=UM.First_Record_Of_Row(driver);
				driver.findElement(By.name("sName")).sendKeys(smst);


			      Thread.sleep(3000);
			  //    UM.RadioButtons(driver, "Active");
			      Thread.sleep(3000);

			        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit'][1]"));
			        searchButton.click();
				      Thread.sleep(3000);

					zz.executeScript("window.scrollBy(0,300)");
			            Thread.sleep(4000);

			     
			            Assert.assertTrue(smst.equalsIgnoreCase(UM.First_Record_Of_Row(driver)));

			      
			            }
					

		
	}

