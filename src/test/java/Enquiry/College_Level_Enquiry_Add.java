package Enquiry;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.StaleElementReferenceException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.google.common.base.Function;

import Components.Universal_methods;
import devAdmin.Login;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;

public class College_Level_Enquiry_Add extends Login{
	
	@Test
	public void  College_Level_Enquiry_Adding() throws InterruptedException {
		
		Faker fk = new Faker();
		Universal_methods UM=new Universal_methods ();

	 // Actions actions = new Actions(driver);
	  //  String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
	    //String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
	    //String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    //String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    //String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string
       // WebDriverWait wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait with a timeout of 10 seconds
	     WebDriverWait wait = new WebDriverWait(driver, 15); // Adjust timeout as needed

	String Name = fk.name().firstName();
			  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/collegelevel']"));
				JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenextt);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenextt);
				//Thread.sleep(6000);
				

				List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
				WebElement FirstDropdown = dropdowns.get(0);
				WebElement secoendDropdown = dropdowns.get(1);
				WebElement thirdDropdown = dropdowns.get(2);
				WebElement fourthDropdown = dropdowns.get(3);
				WebElement fiveDropdown = dropdowns.get(4);
				WebElement sixDropdown = dropdowns.get(5);
				WebElement sevenDropdown = dropdowns.get(6);
				WebElement eightDropdown = dropdowns.get(7);
				WebElement nineDropdown = dropdowns.get(8);
				WebElement tenDropdown = dropdowns.get(9);
	            wait.until(ExpectedConditions.elementToBeClickable(FirstDropdown));

				FirstDropdown.click();
				UM.selectOptionByText(driver,  "2024");

		     
				   WebElement nameInput = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='sName']"))); // Wait for input field to be clickable
			        nameInput.sendKeys(Name);

			//	Thread.sleep(3000);
			  //    driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name);
			      driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sTelephoneNo']")).sendKeys("99999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Name+"@yopmail.com");
			      driver.findElement(By.xpath("//input[@formcontrolname='iDOB']")).sendKeys("07/06/1994");
			      secoendDropdown.click();
					UM.selectOptionByText(driver,  "Male");

			    //	Thread.sleep(3000);
			       
					zz.executeScript("window.scrollBy(0,500)");
					wait.until((ExpectedCondition<Boolean>) wd -> {
					    Number yOffset = (Number)((JavascriptExecutor) wd).executeScript("return window.pageYOffset");
					    return yOffset.longValue() >= 500L; // Convert to long and compare
					});


				//	Thread.sleep(3000);
			        wait.until(ExpectedConditions.elementToBeClickable(thirdDropdown));

			      thirdDropdown.click();
					UM.selectOptionByText(driver,  "OBC");

			     //	Thread.sleep(3000);
			        wait.until(ExpectedConditions.elementToBeClickable(fourthDropdown));

			      fourthDropdown.click();
					UM.selectOptionByText(driver,  "MBA");
					
			    	Thread.sleep(1000);
			       // wait.until(ExpectedConditions.elementToBeClickable(fiveDropdown));

			      //fiveDropdown.click();
			        WebElement dropdown = driver.findElement(By.cssSelector("mat-select[formcontrolname='iSubCourse']"));

			        // Maximum number of attempts to open the dropdown
			        int maxAttempts = 3;
			        int attempts = 0;
			        boolean dropdownOpened = false;

			        // Loop to click on the dropdown and wait for it to open
			        while (!dropdownOpened && attempts < maxAttempts) {
			            // Click on the dropdown
			            dropdown.click();

			            // Check if the dropdown options are visible
			            try {
			                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-option")));
			                dropdownOpened = true;
			            } catch (Exception e) {
			                // Dropdown options not visible, increment attempts counter
			                attempts++;
			                System.out.println("Dropdown not opened. Attempt " + attempts);
			                // Optionally, you can add a delay between attempts using Thread.sleep()
			            }
			        }

			        // If dropdown opened, perform actions on the dropdown options
			        if (dropdownOpened) {
			           // WebElement dropdownOptions = driver.findElement(By.cssSelector("mat-option"));
			            // Perform actions on the dropdown options
						UM.selectOptionByText(driver,  "Finance");
			          //  dropdownOptions.click();
			        } else {
			            System.out.println("Dropdown did not open after " + maxAttempts + " attempts.");
			        }

			        // Close the browser
			         
					driver.findElement(By.xpath("//span[text()=' Next ']")).click();
					driver.findElement(By.xpath("//input[@formcontrolname='sFatherName']")).sendKeys("Father");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherMobile']")).sendKeys("9999999999");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherEmail']")).sendKeys("Father@yopmail.com");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherOrganization']")).sendKeys("abc");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherDesignation']")).sendKeys("abc");
				      driver.findElement(By.xpath("//input[@formcontrolname='sGSTno']")).sendKeys("29ABCDE1234F1ZH");
						//Thread.sleep(3000);
						   WebElement button = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")));

					        // Click on the button
					        button.click();


					//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress1']")).sendKeys("hyd");
				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress2']")).sendKeys("hyd");
				      driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingState']")).click();			
						UM.selectOptionByText(driver,  "Telengana");
					    
				        WebElement iMailingCitydropdwn = driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingCity']"));

				        // Maximum number of attempts to open the dropdown
				        int maxAttemptss = 3;
				        int attemptss = 0;
				        boolean dropdownOpenedd = false;

				        // Loop to click on the dropdown and wait for it to open
				        while (!dropdownOpenedd && attempts < maxAttempts) {
				            // Click on the dropdown
				        	iMailingCitydropdwn.click();

				            // Check if the dropdown options are visible
				            try {
				                wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("mat-option")));
				                dropdownOpenedd = true;
				            } catch (Exception e) {
				                // Dropdown options not visible, increment attempts counter
				                attempts++;
				                System.out.println("Dropdown not opened. Attempt " + attempts);
				                // Optionally, you can add a delay between attempts using Thread.sleep()
				            }
				        }

				        // If dropdown opened, perform actions on the dropdown options
				        if (dropdownOpened) {
				            try {
					            // Call the method from the other class
						        UM.selectOptionByText(driver,  "Hyderabad");

					        } catch (TimeoutException e) {
					            // Handle the TimeoutException appropriately, such as logging an error message
					            e.printStackTrace();
					            // Optionally, retry the operation or take other corrective actions
					        }

				        } else {
				            System.out.println("Dropdown did not open after " + maxAttempts + " attempts.");
				        }

				        // Close the browser

						//Thread.sleep(3000);
						//   WebElement dropdown = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[formcontrolname='iMailingCity']")));

					        // Click on the dropdown
					      //  dropdown.click();
					      


					    //  driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingCity']")).click();			
	                   //  Thread.sleep(3000);
					    					  	//Thread.sleep(3000);

					      driver.findElement(By.xpath("//input[@ng-reflect-name='sMailingZipCode']")).sendKeys("500067");

					      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[1]/div/mat-checkbox/label/span[1]")).click();
		               //  Thread.sleep(4000);
		         //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		                 WebElement buttonR = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")));

		                 // Click on the button
		                 buttonR.click();

		                // Thread.sleep(3000);
		                 WebElement element = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")));

		                 // Click on the element
		                 element.click();
				  	
//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	
		                 List<WebElement> Optionss = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("mat-option")));

		             //    List<WebElement> Optionss = driver.findElements(By.cssSelector("mat-option"));
					        // Loop through the options to find the desired one
	                        
					        for (int i=0; i<=Optionss.size()-1; i++) {
					            wait.until(ExpectedConditions.elementToBeClickable(Optionss.get(i)));

					        	Optionss.get(1).click();
					        	//Thread.sleep(2000); 
					        	break;
				                  

					        	}
					   
					

	             driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		         UM.selectOptionByText(driver,  "CBSE");

						  //	Thread.sleep(3000);
					        WebElement oelement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")));

					        // Click on the element
					        oelement.click();

//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
	//Thread.sleep(3000); 
					         UM.selectOptionByText(driver,  "bhagavti");

	//					  	Thread.sleep(3000);

    WebElement NN = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")));

    // Click on the element
    NN.click();

	//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
//	Thread.sleep(3000); 
    UM.selectOptionByText(driver,  "Agra");

	//	Thread.sleep(3000);
	   WebElement inputFieldyrps = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[5]/mat-form-field/div/div[1]/div[3]/input")));

       // Send keys to the input field
	   inputFieldyrps.sendKeys("2016");

	  //	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("2016");
		
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("All");
	  	
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[7]/mat-form-field/div/div[1]/div[3]/input")).click();
	  
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[2]/div/button[2]/span[1]")).click();
					  //	Thread.sleep(3000);

					    WebElement DD = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")));
					    zz.executeScript("arguments[0].scrollIntoView(true);", DD);
				        Thread.sleep(1000);

					    zz.executeScript("arguments[0].click();", DD);
				    //    DD.click();

					  	//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	UM.selectOptionByText(driver,  "0");
	  	
		
		//Thread.sleep(3000);
    WebElement upp = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")));

    // Click on the element
    upp.click();

	//driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	UM.selectOptionByText(driver,  "0");
	//Thread.sleep(3000);

	   WebElement wd = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='sWorkingAs']")));

       // Send keys to the input field
	   wd.sendKeys("abc");

	
	//	driver.findElement(By.xpath("//input[@formcontrolname='sWorkingAs']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@formcontrolname='sEmployerName']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@formcontrolname='iNewspaper']")).click();
	//Thread.sleep(3000);

    List<WebElement> ofccheckboxs = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("mat-checkbox")));


	//List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement ofccheckbox:ofccheckboxs ) {
		if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
            wait.until(ExpectedConditions.elementToBeClickable(ofccheckbox));

			//Thread.sleep(4000);
			ofccheckbox.click();
		}
	}//Thread.sleep(3000);
	   WebElement button1 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@class='mat-focus-indicator btn-space teams-primary mat-flat-button mat-button-base']")));

       // Click on the button
	   button1.click();

	//WebElement button1 = driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn-space teams-primary mat-flat-button mat-button-base']"));
	//button1.click();
	//Thread.sleep(3000);
    WebElement inputFieldgh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='iKnowofTIME']")));

    // Click on the input field
    inputFieldgh.click();

	//driver.findElement(By.xpath("//input[@formcontrolname='iKnowofTIME']")).click();
	//Thread.sleep(3000);

    List<WebElement> ofccheckboxse = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("mat-checkbox")));

//	List<WebElement> ofccheckboxse =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement ofccheckbox:ofccheckboxse ) {
		if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
            wait.until(ExpectedConditions.elementToBeClickable(ofccheckbox));

			//Thread.sleep(4000);
			ofccheckbox.click();
		}
	}//Thread.sleep(3000);
    WebElement button11 = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-sources/mat-dialog-actions/div/div/button[1]/span[1]")));

    // Click on the button
    button11.click();

	//WebElement button11 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-sources/mat-dialog-actions/div/div/button[1]/span[1]"));
	//button11.click();
	//Thread.sleep(5000);
	  
	zz.executeScript("window.scrollBy(0,1000)");
	wait.until((ExpectedCondition<Boolean>) wds -> {
	    Number yOffset = (Number)((JavascriptExecutor) wds).executeScript("return window.pageYOffset");
	    return yOffset.longValue() >= 500L; // Convert to long and compare
	});
	WebElement dropdown01 = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]"));

	// Click the dropdown
	dropdown01.click();

	//Thread.sleep(3000);
	
    UM.selectOptionByText(driver,  "Morning");

  
    zz.executeScript("window.scrollBy(0,500)");
	wait.until((ExpectedCondition<Boolean>) wwd -> {
	    Number yOffset = (Number)((JavascriptExecutor) wwd).executeScript("return window.pageYOffset");
	    return yOffset.longValue() >= 500L; // Convert to long and compare
	});
	 
	      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/div/button[2]/span[1]")).click();
	      Thread.sleep(4000);
	   try {

	      Alert alert = driver.switchTo().alert();

	      // Print the text of the alert
	      String inputString = alert.getText();
	      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

	     System.out.println("Strudent Enquiry is : "+id);

	     Thread.sleep(3000);
	     alert.accept();
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	        String popups = popup.getText();

	        // Print the success message
	        System.out.println(" message: " + popups);
	     
       } catch (NoAlertPresentException e) {
    	   // WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	        String popups = popup.getText();

	        // Print the success message
	        System.out.println("Success message: " + popups);
	     
       }
	      // Close the alert (accept or dismiss based on your requirement)
	    //  alert.accept(); // To accept the alert

		
		}

	}



