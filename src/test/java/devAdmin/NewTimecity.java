package devAdmin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class NewTimecity extends Login{
	

	@Test (priority =0)
	public void ADD_Timecity() throws InterruptedException {

	
	// WebElement sidebar = driver.findElement(By.linkText("TIME CITY"));
		//sidebar.findElement(By.linkText("TIME CITY")).click();

		Faker fk = new Faker();
		String fakeCity = fk.address().city();
		//String code = fk.code().asin();
		String email = fk.name().firstName();
		 String first = fk.letterify("?");// Generates a random letter
		 String second = fk.letterify("?"); // Generates a random letter
		  String fir= first.toUpperCase();
		  String sec= second.toUpperCase();

		
		Thread.sleep(3000);

		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[20]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);

		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@aria-required='true'][1]")).sendKeys(fakeCity);
	Thread.sleep(3000);

	WebElement inputElement = driver.findElement(By.xpath("//input[@formcontrolname='SCode']"));
	inputElement.sendKeys(fir+sec);
	Thread.sleep(3000);
		WebElement state = driver.findElement(By.cssSelector("mat-select"));
		state.click();
		//Thread.sleep(3000);

		//List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
	//	WebElement FirstDropdown = dropdowns.get(0);
		//FirstDropdown.click();
		Thread.sleep(3000);
        Universal_methods UM=new Universal_methods();

		UM.dropdownselection(driver);

		WebElement inputElement1 = driver.findElement(By.xpath("//input[@formcontrolname='SEmailId']"));
		inputElement1.sendKeys(email+"@Yopmail");
		Thread.sleep(3000);

		WebElement submitButton = driver.findElement(By.xpath("//button[@ng-reflect-disabled='false'][1]"));
		submitButton.click();
		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
		String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
		      if (popups.contains(" Successfully ")) {
		      	
		      	System.out.println("Massage:"+ popups);

		
		driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
		Thread.sleep(4000);
		zz.executeScript("window.scrollBy(0,400)");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(fakeCity);
		Thread.sleep(4000);

		Assert.assertEquals( fakeCity, UM.First_Record_Of_Row(driver) );

	}
		      else {
			      	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

		      }
	}	 
		 @Test (priority =1)
			public void Search_Timecity() throws InterruptedException {
			 WebElement sidebar = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[20]/a"));


			//WebElement svenext = driver.findElement(By.linkText("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[20]/a"));
		 		JavascriptExecutor zz = (JavascriptExecutor) driver;
		        zz.executeScript("arguments[0].scrollIntoView(true);", sidebar);

		 	//	zz.executeScript("arguments[0].scrollIntoView()", sidebar);
		 		Thread.sleep(4000);
			zz.executeScript("arguments[0].click()", sidebar);
		 		Thread.sleep(9000);

		 	  WebElement head =driver.findElement(By.xpath("//div[@role='tablist']"));
		 		
				List<WebElement> buttons=head.findElements(By.tagName("div"));

				for(WebElement button:buttons ) {
					if(button.getText().equalsIgnoreCase("Search TIME City")) {
						Thread.sleep(4000);
						button.click();
					}
				}					Thread.sleep(4000);
			
				//create reference object for WebTable
				zz.executeScript("window.scrollBy(0,1300)");
				Thread.sleep(4000);

				List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
				WebElement FirstDropdown = dropdowns.get(1);
				Thread.sleep(4000);
				FirstDropdown.click();
				Thread.sleep(5000);
				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[3]/span")).click();
				Thread.sleep(5000);

				zz.executeScript("window.scrollBy(0,-1300)");
				Thread.sleep(5000);
	               Universal_methods UM=new Universal_methods();

			      Thread.sleep(3000);
			      UM.RadioButtons(driver, "Active");
			      Thread.sleep(3000);

			        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit'][1]"));
			        searchButton.click();
				      Thread.sleep(3000);

				    zz.executeScript("window.scrollBy(0,400)");
	            String smst=UM.Ramdom_Record(driver);
					driver.findElement(By.name("sName")).sendKeys(smst);

			        searchButton.click();
			            Thread.sleep(4000);

						zz.executeScript("window.scrollBy(0,300)");
				            Thread.sleep(4000);

						Assert.assertEquals( smst, UM.First_Record_Of_Row(driver) );

					}
					
				
		}

		

	

