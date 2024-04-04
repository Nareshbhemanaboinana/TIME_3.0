package devAdmin;




import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;



public class State extends Login  {
	
	 @Test(priority = 0)	
	 public void ADD_State() throws InterruptedException {

		
		Faker fk = new Faker();
		String statename = fk.address().state();
		String statecode = fk.code().asin();
		Thread.sleep(3000);
		
   	 WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[18]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(5000);
		
		driver.findElement(By.xpath("//input[@ng-reflect-type='text']")).sendKeys(statename);
		driver.findElement(By.xpath("//input[@ng-reflect-name='statecode']")).sendKeys(statecode);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-state/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
		//Thread.sleep(6000);

	
			//  WebDriverWait wait = new WebDriverWait(driver, 3); // Adjust timeout as needed
		  //    WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	      String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
	            if (popups.equalsIgnoreCase("State Successfully Created !")) {
	            	WebElement ppopup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	  	          
	        		
     			   String ppopups = ppopup.getText();
     			     // System.out.println("Background color: " + backgroundColor);

     			      // Print the success message
     			      System.out.println(" message: " + ppopups);
     			      driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
     	     			Thread.sleep(4000);
     	     			zz.executeScript("window.scrollBy(0,400)");

     	     		driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(statename);
     	     		Thread.sleep(4000);
     	             Universal_methods UM=new Universal_methods();

     	     		Assert.assertEquals( statename, UM.First_Record_Of_Row(driver) );
     	 

	            }
	            else {

	         		WebElement ppopup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	          
	        		
	        			   String ppopups = ppopup.getText();
	        			     // System.out.println("Background color: " + backgroundColor);

	        			      // Print the success message
	        			      System.out.println(" message: " + ppopups);
	        		          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");
     
	        	 
	            }
  
           }
		
	
	 
	 @Test(priority = 1)		
	 
	 public void Search_State() throws InterruptedException {
	    	 WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[18]/a"));
	 		JavascriptExecutor zz = (JavascriptExecutor) driver;
	 		zz.executeScript("arguments[0].scrollIntoView()", svenext);
	 		Thread.sleep(4000);
	 		zz.executeScript("arguments[0].click()", svenext);
	 		Thread.sleep(5000);
	 		Thread.sleep(6000);

			 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
				Thread.sleep(4000);
	           
            Universal_methods UM=new Universal_methods();
            

		    UM.RadioButtons(driver, "Active");
		    
	      Thread.sleep(3000);

	        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit'][1]"));
	        searchButton.click();
		    zz.executeScript("window.scrollBy(0,400)");

            String smst=UM.Ramdom_Record(driver);
				driver.findElement(By.xpath("//input[@formcontrolname='stateName']")).sendKeys(smst);

		        searchButton.click();
		            Thread.sleep(4000);

					zz.executeScript("window.scrollBy(0,300)");
			            Thread.sleep(4000);

			            Assert.assertTrue(smst.equalsIgnoreCase(UM.First_Record_Of_Row(driver)));
				}
				
			
	}

	

	
	

	
