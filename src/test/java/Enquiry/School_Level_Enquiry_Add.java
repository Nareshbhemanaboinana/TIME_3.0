package Enquiry;

import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class School_Level_Enquiry_Add extends Login{
	
	@Test
	public void school_Level_Enquiry_Adding() throws InterruptedException {
				Faker fk = new Faker();
				Universal_methods UM=new Universal_methods();
		    String Name = fk.name().firstName();
			  WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/schllevel\']"));
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
		        Thread.sleep(3000);

				UM.selectOptionByText(driver, "2024");
		        Thread.sleep(3000);

			      driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name);
			      driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sTelephoneNo']")).sendKeys("99999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Name+"@yopmail.com");
			      driver.findElement(By.xpath("//input[@formcontrolname='iDOB']")).sendKeys("07/06/1994");
			      secoendDropdown.click();
			        Thread.sleep(3000);
			      UM.selectOptionByText(driver, "Male");
					Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000);

			      thirdDropdown.click();
			      Thread.sleep(3000);
			      UM.selectOptionByText(driver, "OBC");
					Thread.sleep(3000);

			      fourthDropdown.click();
			      Thread.sleep(3000);
			      UM.selectOptionByText(driver, "MBA");
					Thread.sleep(3000);
			      fiveDropdown.click();
			      Thread.sleep(3000);
			      UM.selectOptionByText(driver, "Finance");
					Thread.sleep(3000);
			     	      
			        driver.findElement(By.xpath("//button[@type='submit'][1]")).click(); 
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherName']")).sendKeys("Father");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherMobile']")).sendKeys("9999999999");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherEmail']")).sendKeys("Father@yopmail.com");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherOrganization']")).sendKeys("abc");
				      driver.findElement(By.xpath("//input[@formcontrolname='sFatherDesignation']")).sendKeys("abc");
				      driver.findElement(By.xpath("//input[@formcontrolname='sGSTno']")).sendKeys("29ABCDE1234F1ZH");
						Thread.sleep(3000);

					    driver.findElement(By.xpath("//input[@formcontrolname='sMotherName']")).sendKeys("Mother");
					      driver.findElement(By.xpath("//input[@formcontrolname='sMotherMobile']")).sendKeys("9999999999");
					      driver.findElement(By.xpath("//input[@formcontrolname='sMotherEmail']")).sendKeys("Mother@yopmail.com");
					      driver.findElement(By.xpath("//input[@formcontrolname='sMotherOrganization']")).sendKeys("abc");
					      driver.findElement(By.xpath("//input[@formcontrolname='sMotherDesignation']")).sendKeys("abc");
					  Thread.sleep(3000);
					        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]")).click(); 

				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress1']")).sendKeys("hyd");
				      driver.findElement(By.xpath("//textarea[@formcontrolname='sMailingAddress2']")).sendKeys("hyd");
				      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
				      UM.selectOptionByText(driver, "Telengana");
						Thread.sleep(3000);
				     

                     driver.findElement(By.cssSelector("mat-select[formcontrolname='iMailingCity']")).click();
                      Thread.sleep(3000);

				      UM.selectOptionByText(driver, "Hyderabad");
						Thread.sleep(3000);
					      driver.findElement(By.xpath("//input[@ng-reflect-name='sMailingZipCode']")).sendKeys("500067");
					      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[1]/div/mat-checkbox/label/span[1]")).click(); 
						  	Thread.sleep(3000);
			
					      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		Thread.sleep(4000);
      			  	
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	
	
	List<WebElement> Optionss = driver.findElements(By.cssSelector("mat-option"));
					        // Loop through the options to find the desired one
	                        
					        for (int i=0; i<=Optionss.size()-1; i++) {
					        	Optionss.get(1).click();
					        	Thread.sleep(3000); 
					        	break;
				                  

					        	}
					   
					

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	
	Thread.sleep(3000);

    UM.selectOptionByText(driver, "CBSE");
		Thread.sleep(3000);
	

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	Thread.sleep(3000); 

	List<WebElement> Options1s = driver.findElements(By.cssSelector("mat-option"));
	// Loop through the options to find the desired one
	for (int i=0; i<=Options1s.size()-1; i++) {
		Options1s.get(1).click();
		Thread.sleep(3000); 
		break;
	      

		}
						  	Thread.sleep(3000);
/*	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	Thread.sleep(3000); 

	
		}
		*/Thread.sleep(3000);

	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("2016");
		
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[5]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("80");
	  	
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[1]/div[2]/div/div/table/tbody/tr[1]/td[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("80");
	  
	  	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/form/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
					  	Thread.sleep(3000);
//	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
					  	UM.selectOptionByText(driver, "IIT-JEE");
						Thread.sleep(3000);
						Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/form/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
	Thread.sleep(3000);

	UM.selectOptionByText(driver, "CPT/CLAT");
	Thread.sleep(3000);
	
	

	zz.executeScript("window.scrollBy(0,500)");
	Thread.sleep(3000);
	

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
	List<WebElement> Options2s = driver.findElements(By.cssSelector("mat-option"));
	//Loop through the options to find the desired one
	//Loop through the options to find the desired one
	for (int i=0; i<=Options2s.size()-1; i++) {
		
	
		Options2s.get(1).click();
		Thread.sleep(3000); 
		break;
	}  

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/form/div/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	List<WebElement> Options22s = driver.findElements(By.cssSelector("mat-option"));
	//Loop through the options to find the desired one
	//Loop through the options to find the desired one
	for (int i=0; i<=Options22s.size()-1; i++) {
		
	
		Options22s.get(1).click();
		Thread.sleep(3000); 
		break;
	}  

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/form/div/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	List<WebElement> Options222s = driver.findElements(By.cssSelector("mat-option"));
	//Loop through the options to find the desired one
	//Loop through the options to find the desired one
	for (int i=0; i<=Options222s.size()-1; i++) {
		
	
		Options222s.get(1).click();
		Thread.sleep(3000); 
		break;
	} 
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/form/div/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	List<WebElement> Options2222s = driver.findElements(By.cssSelector("mat-option"));
	//Loop through the options to find the desired one
	//Loop through the options to find the desired one
	for (int i=0; i<=Options2222s.size()-1; i++) {
		
	
		Options2222s.get(1).click();
		Thread.sleep(3000); 
		break;
	} 
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/form/div/div[7]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	List<WebElement> Options2222us = driver.findElements(By.cssSelector("mat-option"));

	for (int i=0; i<=Options2222us.size()-1; i++) {
		
		
		Options2222us.get(1).click();
		Thread.sleep(3000); 
		break;
	} 
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[4]/div/div/div/div[2]/div/button[2]/span[1]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@formcontrolname='iNewspaper']")).click();
	Thread.sleep(3000);


	List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement ofccheckbox:ofccheckboxs ) {
		if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
			Thread.sleep(4000);
			ofccheckbox.click();
		}
	}Thread.sleep(3000);

	WebElement saveButton = driver.findElement(By.xpath("//button[@type='button' and contains(span/text(),'Save')]"));
	saveButton.click();

	

	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@formcontrolname='iKnowofTIME']")).click();
	Thread.sleep(3000);


	List<WebElement> ofccheckboxse =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement ofccheckbox:ofccheckboxse ) {
		if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
			//Thread.sleep(4000);
			ofccheckbox.click();
		}
	}
	Thread.sleep(4000);

    
    // Click the button
	WebElement saveButtonn = driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-sources/mat-dialog-actions/div/div/button[1]/span[1]"));
	zz.executeScript("arguments[0].click()", saveButtonn);
	//saveButtonn.click(); // Or perform any other action you need
	Thread.sleep(3000);


	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	Thread.sleep(3000);
	List<WebElement> fracheckboxse =driver.findElements(By.cssSelector("mat-option"));
	for(WebElement fracheckbox:fracheckboxse ) {
		if(fracheckbox.getText().equalsIgnoreCase("Jodpur_New_Office")) {
			Thread.sleep(3000);

			fracheckbox.click();
			Thread.sleep(4000);

		}
	}
    
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-schllevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/div[2]/button[2]/span[1]")).click();
//	saveAnEnquiry.click(); // Or perform any other action you need

     
	Thread.sleep(4000);
	   try {

	      Alert alert = driver.switchTo().alert();

	      // Print the text of the alert
	      String inputString = alert.getText();
	      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

	     System.out.println("School level Enquiry ID is :"+id);

	     Thread.sleep(3000);
	     alert.accept();
	     WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	        String popups = popup.getText();

	        // Print the success message
	        System.out.println("Success message: " + popups);
	     
	      // Close the alert (accept or dismiss based on your requirement)
	    //  alert.accept(); // To accept the alert
       } catch (NoAlertPresentException e) {
   	    WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	        String popups = popup.getText();

	        // Print the success message
	        System.out.println("Success message: " + popups);
	     
      }

		
		}

	}






