package Enquiry;

import java.util.List;
import java.util.NoSuchElementException;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class College_Level_Enquiry_Add extends Login{
	
	public void  College_Level_Enquiry_Add() throws InterruptedException {
		
		Faker fk = new Faker();
		Universal_methods UM=new Universal_methods ();

	  Actions actions = new Actions(driver);
	    String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
	    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
	    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string

	String Name = fk.name().firstName();
			  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/collegelevel']"));
				JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenextt);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenextt);
				Thread.sleep(6000);
				

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

				FirstDropdown.click();
				UM.selectOptionByText(driver,  "2024");

		     

				Thread.sleep(3000);
			      driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name);
			      driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sTelephoneNo']")).sendKeys("99999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Name+"@yopmail.com");
			      driver.findElement(By.xpath("//input[@formcontrolname='iDOB']")).sendKeys("07/06/1994");
			      secoendDropdown.click();
					UM.selectOptionByText(driver,  "Male");

			    	Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000);

			      thirdDropdown.click();
					UM.selectOptionByText(driver,  "OBC");

			     	Thread.sleep(3000);

			      fourthDropdown.click();
					UM.selectOptionByText(driver,  "MBA");

			    	Thread.sleep(3000);

			      fiveDropdown.click();
					UM.selectOptionByText(driver,  "Finance");
	  
			         
					driver.findElement(By.xpath("//span[text()=' Next ']")).click();
					driver.findElement(By.xpath("//input[@formcontrolname='sFatherName']")).sendKeys("Father");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherMobile']")).sendKeys("9999999999");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherEmail']")).sendKeys("Father@yopmail.com");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherOrganization']")).sendKeys("abc");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherDesignation']")).sendKeys("abc");
				      driver.findElement(By.xpath("//input[@formcontrolname='sGSTno']")).sendKeys("29ABCDE1234F1ZH");
						Thread.sleep(3000);


						driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress1']")).sendKeys("hyd");
				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress2']")).sendKeys("hyd");
				      driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingState']")).click();			
						UM.selectOptionByText(driver,  "Telengana");

						Thread.sleep(3000);

					      driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingCity']")).click();			
	                     Thread.sleep(3000);
	 					UM.selectOptionByText(driver,  "Hyderabad");
					  	Thread.sleep(3000);

					      driver.findElement(By.xpath("//input[@ng-reflect-name='sMailingZipCode']")).sendKeys("500067");

					      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[1]/div/mat-checkbox/label/span[1]")).click();
		                 Thread.sleep(4000);
		            driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		            Thread.sleep(3000);
					  	
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	List<WebElement> Optionss = driver.findElements(By.cssSelector("mat-option"));
					        // Loop through the options to find the desired one
	                        
					        for (int i=0; i<=Optionss.size()-1; i++) {
					        	Optionss.get(1).click();
					        	Thread.sleep(3000); 
					        	break;
				                  

					        	}
					   
					

	             driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
		         UM.selectOptionByText(driver,  "CBSE");

						  	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
	Thread.sleep(3000); 

	List<WebElement> Options1s = driver.findElements(By.cssSelector("mat-option"));
	// Loop through the options to find the desired one
	for (int i=0; i<=Options1s.size()-1; i++) {
		Options1s.get(1).click();
		Thread.sleep(3000); 
		break;
	      

		}
						  	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	Thread.sleep(3000); 

	List<WebElement> Options2s = driver.findElements(By.cssSelector("mat-option"));
	//Loop through the options to find the desired one
	//Loop through the options to find the desired one
	for (int i=0; i<=Options2s.size()-1; i++) {
		Options2s.get(1).click();
		Thread.sleep(3000); 
		break;
	   

		}
		Thread.sleep(3000);

	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("2016");
		
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("All");
	  	
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[7]/mat-form-field/div/div[1]/div[3]/input")).click();
	  
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[2]/div/button[2]/span[1]")).click();
					  	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	UM.selectOptionByText(driver,  "0");
	  	
		
		Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	UM.selectOptionByText(driver,  "0");
	Thread.sleep(3000);
	driver.findElement(By.xpath("//input[@formcontrolname='sWorkingAs']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@formcontrolname='sEmployerName']")).sendKeys("abc");
	driver.findElement(By.xpath("//input[@formcontrolname='iNewspaper']")).click();
	Thread.sleep(3000);


	List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement ofccheckbox:ofccheckboxs ) {
		if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
			Thread.sleep(4000);
			ofccheckbox.click();
		}
	}Thread.sleep(3000);

	WebElement button = driver.findElement(By.xpath("//button[@class='mat-focus-indicator btn-space teams-primary mat-flat-button mat-button-base']"));
	button.click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@formcontrolname='iKnowofTIME']")).click();
	Thread.sleep(3000);


	List<WebElement> ofccheckboxse =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement ofccheckbox:ofccheckboxse ) {
		if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
			Thread.sleep(4000);
			ofccheckbox.click();
		}
	}Thread.sleep(3000);
	WebElement button1 = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-sources/mat-dialog-actions/div/div/button[1]/span[1]"));
	button1.click();
	Thread.sleep(5000);

	zz.executeScript("window.scrollBy(0,1000)");

	WebElement dropdown = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]"));

	// Click the dropdown
	dropdown.click();

	Thread.sleep(3000);
	UM.selectOptionByText(driver,  "Morning");

	Thread.sleep(3000);
	zz.executeScript("window.scrollBy(0,500)");

	 
	      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/div/button[2]/span[1]")).click();
	      Thread.sleep(4000);
	   try {

	      Alert alert = driver.switchTo().alert();

	      // Print the text of the alert
	      String inputString = alert.getText();
	      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

	     System.out.println(id);

	     Thread.sleep(3000);
	     alert.accept();
	     WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	        String popups = popup.getText();

	        // Print the success message
	        System.out.println(" message: " + popups);
	     
       } catch (NoAlertPresentException e) {
    	    WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
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



