package All_Flows;

import java.awt.HeadlessException;
import java.awt.Toolkit;
import java.awt.datatransfer.DataFlavor;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class Convert_Full_Payment__with_Discount_Cash_Payment extends Login{
	
	@Test
	public void Student_Convert_Full_Payment__with_Discount_Cash_Payment() throws InterruptedException, FindFailed, HeadlessException, UnsupportedFlavorException, IOException {


		String optionText2 = "Cash";
		
		
		Faker fk = new Faker();
		Universal_methods UM=new Universal_methods ();

	  Actions actions = new Actions(driver);
	    String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
	    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
	    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string
        WebDriverWait wait = new WebDriverWait(driver, 10); // Initialize WebDriverWait with a timeout of 10 seconds
	 //    WebDriverWait wait = new WebDriverWait(driver, 15); // Adjust timeout as needed

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
			      Thread.sleep(3000);
					UM.selectOptionByText(driver,  "Male");

			    	Thread.sleep(3000);
			       
					zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000);


					Thread.sleep(3000);
			        wait.until(ExpectedConditions.elementToBeClickable(thirdDropdown));

			      thirdDropdown.click();
			      Thread.sleep(3000);
					UM.selectOptionByText(driver,  "OBC");

			     	Thread.sleep(3000);
			        wait.until(ExpectedConditions.elementToBeClickable(fourthDropdown));

			      fourthDropdown.click();
			      Thread.sleep(3000);
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
	   //  alert.accept();
	      //  WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	      //  String popups = popup.getText();

	        // Print the success message
	    //    System.out.println(" message: " + popups);
	     
       } catch (NoAlertPresentException e) {
    	   // WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	        String popups = popup.getText();

	        // Print the success message
	        System.out.println("Success message: " + popups);
	     
       }


	      Alert alert = driver.switchTo().alert();

	      // Print the text of the alert
	      String inputString = alert.getText();
	      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

	      alert.accept();

          
		
	    
			  WebElement svenexxst = driver.findElement(By.xpath("//a[@href='#/fresh/individualf']"));
				//JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenexxst);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenexxst);
				//Thread.sleep(6000);
		
				WebElement	StudentIID =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='enquiryID']")));
				StudentIID.sendKeys(id);
				
				//driver.findElement(By.xpath("//input[@formcontrolname='enquiryID']")).sendKeys(id);
	
				zz.executeScript("window.scrollBy(0,400)");
			
				try {
					wait.until((ExpectedCondition<Boolean>) wwud -> {
					    Number yOffset = (Number)((JavascriptExecutor) wwud).executeScript("return window.pageYOffset");
					    return yOffset.longValue() >= 500L; // Convert to long and compare
					});
					} catch (TimeoutException e) {
				    System.out.println("Timeout occurred while waiting for element");
				    // Handle the exception as needed
				}
				
				  
				actions.sendKeys(Keys.TAB).perform();
				//Thread.sleep(3000);
				WebElement	Nextbutton01 =wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[2]/button/span[1]")));
				Nextbutton01.click();
				//driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[2]/button/span[1]")).click();
				try {
				    WebElement VCXZ = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")));
				    VCXZ.click();
				} catch (TimeoutException e) {
				    //System.out.println("Timeout waiting for the element to be clickable.");
				    // Handle the timeout exception as needed
				}
				//driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				UM.selectOptionByText(driver, "Single");
				/*try {
				    WebElement optionzqa = wait.until(ExpectedConditions.elementToBeClickable(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option/span")));
				    optionzqa.click();
				} catch (TimeoutException e) {
				    System.out.println("Timeout waiting for the option to be clickable.");
				    // Handle the timeout exception as needed
				}*/
			//	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option/span")).click();
				Thread.sleep(1000);
			    WebElement VCXZ11 = wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[formcontrolname='batchCode']")));

			    VCXZ11.click();
			      // driver.findElement(By.cssSelector("mat-select[formcontrolname='batchCode']")).click();			

				UM.selectOptionByText(driver, "MBA_Batch009");
				System.out.println("Enrolled Batch is: MBA_Batch009");
		        actions.sendKeys(Keys.TAB).perform();

					    //    int Discountamnt = Integer.parseInt(driver.findElement(By.xpath("//input[@formcontrolname='discountAmount']")).getText());

					        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

					        // Pause briefly to allow time for the system to process the copy action
					    //    Thread.sleep(1000);

					        // Access the system clipboard and retrieve the copied data
					        String copiedData1 = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

					        // Convert the copied data to an integer
					        int copiedInteger1 = Integer.parseInt(copiedData1);

				driver.findElement(By.xpath("//h5[text()=' Convert to full payment ']")).click();

				
			/*	  WebElement typeOfPayment = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form[1]/div/div[6]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]"));
			        
			        // Click on the dropdown
				   typeOfPayment.click();
					UM.selectOptionByText(driver,  "2 Installments");
					Thread.sleep(3000);

				zz.executeScript("window.scrollBy(0,400)");
				   Thread.sleep(3000);

			        int fstinstallment = Integer.parseInt(driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[7]/div/div[1]/div/div/table/tbody/tr[1]/td[2]")).getText());
        */
				   //int fstinstallment =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[7]/div/div[1]/div/div/table/tbody/tr[1]/td[2]")).getText();
				 //  Thread.sleep(3000);

					zz.executeScript("window.scrollBy(0,400)");
					wait.until((ExpectedCondition<Boolean>) wwd -> {
					    Number yOffset = (Number)((JavascriptExecutor) wwd).executeScript("return window.pageYOffset");
					    return yOffset.longValue() >= 500L; // Convert to long and compare
					});
					zz.executeScript("window.scrollBy(0,300)");

					wait.until((ExpectedCondition<Boolean>) wwd -> {
					    Number yOffset = (Number)((JavascriptExecutor) wwd).executeScript("return window.pageYOffset");
					    return yOffset.longValue() >= 500L; // Convert to long and compare
					});
						driver.findElement(By.xpath("//h5[text()=' Is any discount being offered now ']")).click();

						try {
							WebElement 	Dicountreson =wait.until(ExpectedConditions.elementToBeClickable(By.cssSelector("mat-select[formcontrolname='discountReason']")));
							Dicountreson.click();
						} catch (TimeoutException e) {
						    //System.out.println("Timeout waiting for the element to be clickable.");
						    // Handle the timeout exception as needed
						}		
					//driver.findElement(By.cssSelector("mat-select[formcontrolname='discountReason']")).click();
						//Thread.sleep(3000);

						UM.selectOptionByText(driver, "enrollment discounts");
						
						//Thread.sleep(3000);
				        actions.sendKeys(Keys.TAB).perform();
					//	Thread.sleep(3000);
				        actions.sendKeys(Keys.TAB).perform();
						//Thread.sleep(3000);

				    //    int Discountamnt = Integer.parseInt(driver.findElement(By.xpath("//input[@formcontrolname='discountAmount']")).getText());

				        actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();

				        // Pause briefly to allow time for the system to process the copy action
				        Thread.sleep(1000);

				        // Access the system clipboard and retrieve the copied data
				        String copiedData = (String) Toolkit.getDefaultToolkit().getSystemClipboard().getData(DataFlavor.stringFlavor);

				        // Convert the copied data to an integer
				        int copiedInteger = Integer.parseInt(copiedData);

			//	int Discountamnt=driver.findElement(By.xpath("//input[@formcontrolname='discountAmount']")).getText();
				
				int Firstinstall= copiedInteger1-copiedInteger;
		        String fstinstallmentString = String.valueOf(Firstinstall);
		        System.out.println("Discount Amount :"+copiedInteger);

		        System.out.println("Amount Paying after Discount :"+fstinstallmentString);
				zz.executeScript("window.scrollBy(0,-100)");

               
				wait.until((ExpectedCondition<Boolean>) wwd -> {
				    Number yOffset = (Number)((JavascriptExecutor) wwd).executeScript("return window.pageYOffset");
				    return yOffset.longValue() >= 500L; // Convert to long and compare
				});
				//	zz.executeScript("window.scrollBy(0,-500)");

				//   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
				  // Thread.sleep(3000);
				   // Find the radio group element
			         // Find all radio buttons within the radio group

				List<WebElement> ddropdowns = driver.findElements(By.cssSelector("mat-select"));
					WebElement eeightDropdown = ddropdowns.get(7);

			        // Click on the dropdown to open it
					eeightDropdown.click();			
			        //Thread.sleep(3000);
				List<WebElement> Optionspayments = wait.until(ExpectedConditions.presenceOfAllElementsLocatedBy(By.cssSelector("mat-option")));
				//Loop through the options to find the desired one


				for(WebElement Optionspayment :Optionspayments) {

				if(Optionspayment.getText().equals(optionText2)) {
				Optionspayment.click();
					String optionText =  Optionspayment.getText();
	              System.out.println("Payment Mode :"+optionText);

					  
					  
		          //  String labelContent = Optionspayment.findElement(By.className("mat-option-text")).getText();
		           // Optionspayment.click();
	              if(optionText.equals("Cash")) {
						  // Thread.sleep(3000);

			     // Click on the desired option
		            //	Optionspayment.click();
				 //  Thread.sleep(3000);
				 //  Thread.sleep(3000);
				   WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='totalAmountPaid']")));

				// Send keys to the input field
				inputField.sendKeys(fstinstallmentString);
				//	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);
					 //  Thread.sleep(3000);

				//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
					//   Thread.sleep(3000);

				   break; 
		            }
		            else if(optionText.equals("DD/Cheque")) {
		            	

	                  
		            	//Optionspayment.click();
		                Thread.sleep(3000);

	                	Date dt= new Date();	//it will return system date
	            		
	            		DateFormat df1= new SimpleDateFormat("dd/MM/yyyy");//to convert into required format
		                Thread.sleep(3000);

	                driver.findElement(By.xpath("//input[@formcontrolname='ddOrChequeNo']")).sendKeys(chequeNumber);	
	                Thread.sleep(3000);

	                driver.findElement(By.xpath("//input[@formcontrolname='ddOrChequeDate']")).sendKeys(df1.format(dt));	

	                Thread.sleep(3000);
	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		               driver.findElement(By.cssSelector("mat-select[formcontrolname='bankName']")).click();

	                Thread.sleep(3000);
	                UM.selectOptionByText(driver, "HSBC");
	            	
	                Thread.sleep(3000);
	                driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
	                Thread.sleep(3000);

	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
	                break;
		            }
		            else if(optionText.equals("Credit Card")) {
		          
	                	  
	                //	Optionspayment.click();
		                Thread.sleep(3000);

	                	driver.findElement(By.xpath("//input[@formcontrolname='creditCardAckNo']")).sendKeys(ackNumber);	
	                	   driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
	   	                Thread.sleep(3000);
	   	
	   	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
	                    break;
		            }
		            else if(optionText.equals("NEFT")) {
	               

	                //	Optionspayment.click();
		                Thread.sleep(3000);
	                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(neftReferenceNumber);	

	                	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
		   	                Thread.sleep(3000);
		   	
		   	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		                    break;

		            }
		            else if(optionText.equals("RTGS")) {
	              
	                	//Optionspayment.click();
		                Thread.sleep(3000);
	                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(rtgsReferenceNumber);	
	                	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
		   	                Thread.sleep(3000);
		   	
		   	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		                    break;

		            }
		            else if(optionText.equals("Direct Transfer to Bank")) {
	                
	               // 	Optionspayment.click();
		                Thread.sleep(3000);
	                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(referenceNumber);	
	                	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
		   	                Thread.sleep(3000);
		   	
		   	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		                    break;

		            }
		            else if(optionText.equals("TDS")) {
	                	//Optionspayment.click();
		                Thread.sleep(3000);

	                	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
	                	driver.findElement(By.xpath("//input[@formcontrolname='paymentRemarks']")).sendKeys("No");	
	   	              
	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
	                break;

		            }
		            else if(optionText.equals("Others")){
		            	
		            //	Optionspayment.click();
		                Thread.sleep(3000);


	                	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallmentString);	
	   	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();

		            }
	   	         else {
	 				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	                Thread.sleep(3000);
	                optionText="";	   	    
	                }
				} 
				}   // Default action if option not matched
	  		//	Thread.sleep(3000);

				zz.executeScript("window.scrollBy(0,500)");
				try {

					wait.until((ExpectedCondition<Boolean>) aqwwd -> {
					    Number yOffset = (Number)((JavascriptExecutor) aqwwd).executeScript("return window.pageYOffset");
					    return yOffset.longValue() >= 500L; // Convert to long and compare
					});
					} catch (TimeoutException e) {
				    //System.out.println("Timeout waiting for the element to be clickable.");
				    // Handle the timeout exception as needed
				}
				
	            WebElement formFilledBy = driver.findElement(By.cssSelector("mat-select[formcontrolname='formFilledBy']"));
			//	Thread.sleep(3000);
		        wait.until(ExpectedConditions.elementToBeClickable(formFilledBy));

		        // Click on the dropdown
			   formFilledBy.click();
				 Thread.sleep(3000);

			UM.selectOptionByText(driver,  "Parents");
						   Thread.sleep(3000);
							zz.executeScript("window.scrollBy(0,500)");
							  Thread.sleep(3000);

				driver.findElement(By.xpath("//h5[text()=' Student Signed On Rules & Regulations ']")).click();
			   
				//driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form[3]/div[1]/div[2]/mat-checkbox/label/span[1]")).click();
				//   Thread.sleep(3000);

					//   Thread.sleep(3000);

		            // Simulate pressing the Tab key
		            actions.sendKeys(Keys.TAB).perform();
					//   Thread.sleep(3000);

		            // Simulate pressing Ctrl+C
		            actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
					 //  Thread.sleep(3000);

			          //  actions.sendKeys(Keys.TAB).perform();

					   WebElement inputField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//input[@formcontrolname='checkvalidationNo']")));

		           //    WebElement inputField = driver.findElement(By.xpath("//input[@formcontrolname='checkvalidationNo']"));
		               inputField.sendKeys(Keys.CONTROL + "v");
		           	zz.executeScript("window.scrollBy(0,500)");
					wait.until((ExpectedCondition<Boolean>) wwd -> {
					    Number yOffset = (Number)((JavascriptExecutor) wwd).executeScript("return window.pageYOffset");
					    return yOffset.longValue() >= 500L; // Convert to long and compare
					});
					 //  Thread.sleep(3000);
					   WebElement Previewbtn = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[text()=' Preview Receipt ']")));
					   Previewbtn.click();
					//	driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
						 //  Thread.sleep(3000);
						   WebElement clsbtn = wait.until(ExpectedConditions.presenceOfElementLocated(By.xpath("//span[text()=' Close ']")));
						   clsbtn.click();
							//driver.findElement(By.xpath("//span[text()=' Close ']")).click();
							 //  Thread.sleep(3000);
							   String xpathExpression = "/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-vertical-stepper/div[2]/div/div/div/div[4]/div/button[3]/span[1]";

				 			// Wait for the element to be clickable
							WebElement xxpptthh = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpathExpression)));

							// Click on the element
							xxpptthh.click();
		              // driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body/div/div/div/mat-vertical-stepper/div[2]/div/div/div/div[4]/div/button[3]/span[1]")).click();
					   Thread.sleep(3000);
					   String xxpathExpression = "/html/body/div[3]/div/h2";

					// Wait for the element to be visible
					WebElement studentElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath(xxpathExpression)));
					
		            //   WebElement Student=driver.findElement(By.xpath("/html/body/div[3]/div/h2"));
				
		               String StudentID=studentElement.getText();
		               System.out.println(StudentID);
		               
		               String ReceiptNo= driver.findElement(By.xpath("/html/body/div[3]/div/div[2]")).getText();
		               System.out.println(ReceiptNo);

		               String originalText = StudentID;

		               // Split the text by spaces
		               String[] parts = originalText.split(" ");

		               // Iterate through the parts to find the desired text
		               String desiredText = null;
		               for (String part : parts) {
		                   if (part.startsWith("NARE")) {
		                       desiredText = part;
		                       break;
		                   }
		               }

		               // Print the desired text
		               if (desiredText != null) {
		                   System.out.println("Student ID: " + desiredText);
		               } else {
		                   System.out.println("Desired text not found in the original text.");
		               }
		               
					   Thread.sleep(5000);

	              
			
				
				

		
		
	
	
	
	}

}
