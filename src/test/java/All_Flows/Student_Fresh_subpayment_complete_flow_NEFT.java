package All_Flows;

import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.io.File;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.sikuli.script.Pattern;
import org.sikuli.script.Screen;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class Student_Fresh_subpayment_complete_flow_NEFT extends Login  {

	

	@Test
	public void Student_payment_complete_flow_NEFT() throws InterruptedException, FindFailed {
		
		String optionText2 = "NEFT";
		
		Faker fk = new Faker();
		
	  Actions actions = new Actions(driver);
        String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
        String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
        String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
        String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
        String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string

  String Name = fk.name().firstName();
			  WebElement svenextt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[3]/ul/li[3]/a"));
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
		        List<WebElement> matOptions = driver.findElements(By.cssSelector("mat-option"));
		        // Loop through the options to find the desired one
		        for (WebElement option : matOptions) {
		            if (option.getText().equals("2024")) {
		                // Click on the desired option
		                option.click();
		                break; // Exit the loop once the desired option is found and clicked
		            }
		        }

				Thread.sleep(3000);
			      driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name);
			      driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sTelephoneNo']")).sendKeys("99999999999");
			      driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Name+"@yopmail.com");
			      driver.findElement(By.xpath("//input[@formcontrolname='iDOB']")).sendKeys("07/06/1994");
			      secoendDropdown.click();
			      List<WebElement> matOptionss = driver.findElements(By.cssSelector("mat-option"));
			        // Loop through the options to find the desired one
			        for (WebElement option : matOptionss) {
			            if (option.getText().equals("Male")) {
			                // Click on the desired option
			                option.click();
			                break; // Exit the loop once the desired option is found and clicked
			            }
			        }
					Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000);

			      thirdDropdown.click();
			      List<WebElement> mmatOptions = driver.findElements(By.cssSelector("mat-option"));
			        // Loop through the options to find the desired one
			        for (WebElement option : mmatOptions) {
			            if (option.getText().equals("OBC")) {
			                // Click on the desired option
			                option.click();
			                break; // Exit the loop once the desired option is found and clicked
			            }
			        }
					Thread.sleep(3000);

			      fourthDropdown.click();
			      List<WebElement> maatOptions = driver.findElements(By.cssSelector("mat-option"));
			        // Loop through the options to find the desired one
			        for (WebElement option : maatOptions) {
			            if (option.getText().equals("MBA")) {
			                // Click on the desired option
			                option.click();
			                break; // Exit the loop once the desired option is found and clicked
			            }
			        }
					Thread.sleep(3000);

			      fiveDropdown.click();
			      List<WebElement> mattOptions = driver.findElements(By.cssSelector("mat-option"));
			        // Loop through the options to find the desired one
			        for (WebElement option : mattOptions) {
			            if (option.getText().equals("Finance")) {
			                // Click on the desired option
			                option.click();
			                break; // Exit the loop once the desired option is found and clicked
			            }
			        }		   
			        
			        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[1]/div/div/div/form/div[2]/button/span[1]")).click(); 
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
				      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				      List<WebElement> Options = driver.findElements(By.cssSelector("mat-option"));
				        // Loop through the options to find the desired one
				        for (WebElement option : Options) {
				            if (option.getText().equals("Telengana")) {
				                // Click on the desired option
				                option.click();
				                break; // Exit the loop once the desired option is found and clicked
				            }
				        }
				        Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/div[2]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
Thread.sleep(3000);
List<WebElement> Options789 = driver.findElements(By.cssSelector("mat-option"));
				        // Loop through the options to find the desired one
				        for (WebElement option : Options789) {
				            if (option.getText().equals("Hyderabad")) {
				                // Click on the desired option
				                option.click();
				                break; // Exit the loop once the desired option is found and clicked
				            }
				        }		   
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
	List<WebElement> Optionsss = driver.findElements(By.cssSelector("mat-option"));
	// Loop through the options to find the desired one
	for (WebElement option : Optionsss) {
	    if (option.getText().equals("CBSE")) {
	        // Click on the desired option
	        option.click();
	        break; // Exit the loop once the desired option is found and clicked
	    }
	}	
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
	  	List<WebElement> Options3s = driver.findElements(By.cssSelector("mat-option"));
	  //Loop through the options to find the desired one
	  for (WebElement option : Options3s) {
	   if (option.getText().equals("0")) {
	       // Click on the desired option
	       option.click();
	       break; // Exit the loop once the desired option is found and clicked
	   }
	  }	
		Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/form/div/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	List<WebElement> Options4s = driver.findElements(By.cssSelector("mat-option"));
	//Loop through the options to find the desired one
	for (WebElement option : Options4s) {
	 if (option.getText().equals("0")) {
	     // Click on the desired option
	     option.click();
	     break; // Exit the loop once the desired option is found and clicked
	 }
	}
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

	List<WebElement> Options5s = driver.findElements(By.cssSelector("mat-option"));
	//Loop through the options to find the desired one
	for (WebElement option : Options5s) {
	if (option.getText().equals("Morning")) {
	   // Click on the desired option
	   option.click();
	   break; // Exit the loop once the desired option is found and clicked
	}
	}
	Thread.sleep(3000);
	zz.executeScript("window.scrollBy(0,500)");

	 
	      driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-collegelevel/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/mat-vertical-stepper/div[5]/div/div/div/div/button[2]/span[1]")).click();
	      Thread.sleep(5000);

	      Alert alert = driver.switchTo().alert();

	      // Print the text of the alert
	      String inputString = alert.getText();
	      String id = inputString.substring(inputString.indexOf(":") + 2); // Adding 2 to exclude ": " from the result

	     System.out.println("Student Enquiry ID :"+id);

	     Thread.sleep(3000);
	     alert.accept();
	      // Close the alert (accept or dismiss based on your requirement)
	    //  alert.accept(); // To accept the alert




	
		
	    
			  WebElement svenexxst = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[4]/ul/li[2]/a"));
				//JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenexxst);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenexxst);
				Thread.sleep(6000);
		
				driver.findElement(By.xpath("//input[@formcontrolname='enquiryID']")).sendKeys(id);
				zz.executeScript("window.scrollBy(0,400)");
				Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[2]/button/span[1]")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option/span")).click();
				Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
				Thread.sleep(3000);
				List<WebElement> Options567s = driver.findElements(By.cssSelector("mat-option"));
				//Loop through the options to find the desired one
				for (WebElement option : Options567s) {
				if (option.getText().equals("MBA_Batch")) {
			     // Click on the desired option
				   option.click();
				   Thread.sleep(3000);
				   break; // Exit the loop once the desired option is found and clicked
				}
				}
				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[6]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
				List<WebElement> Options5567s = driver.findElements(By.cssSelector("mat-option"));
				//Loop through the options to find the desired one
				for (WebElement option : Options5567s) {
				if (option.getText().equals("2 Installments")) {
			     // Click on the desired option
				   option.click();
				   Thread.sleep(3000);
				   break; // Exit the loop once the desired option is found and clicked
				}
				}
				zz.executeScript("window.scrollBy(0,400)");
				   Thread.sleep(3000);

				   String fstinstallment =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[7]/div/div[1]/div/div/table/tbody/tr[1]/td[2]")).getText();
				   Thread.sleep(3000);

				  
				   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
				   Thread.sleep(3000);
				   // Find the radio group element
			         // Find all radio buttons within the radio group

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				   Thread.sleep(3000);
				List<WebElement> Optionspayments = driver.findElements(By.cssSelector("mat-option"));
				//Loop through the options to find the desired one


				for(WebElement Optionspayment :Optionspayments) {
	
				if(Optionspayment.getText().equals(optionText2)) {
				Optionspayment.click();
					String optionText =  Optionspayment.getText();
		              System.out.println("Payment Mode :"+optionText);

					  
					  
		          //  String labelContent = Optionspayment.findElement(By.className("mat-option-text")).getText();
		           // Optionspayment.click();
	              if(optionText.equals("Cash")) {
						   Thread.sleep(3000);

			     // Click on the desired option
		            //	Optionspayment.click();
				   Thread.sleep(3000);
				 //  Thread.sleep(3000);

					driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);
					   Thread.sleep(3000);

					driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
					   Thread.sleep(3000);

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
	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	                Thread.sleep(3000);
	            	List<WebElement> Bank_Names = driver.findElements(By.cssSelector("mat-option"));
					//Loop through the options to find the desired one
					for (WebElement Bank_Name : Bank_Names) {
					if (Bank_Name.getText().equals("HSBC")) {
				     // Click on the desired option
						Bank_Name.click();
					   Thread.sleep(3000);
					   break; // Exit the loop once the desired option is found and clicked
					}
					}
	                Thread.sleep(3000);
	                driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
	                Thread.sleep(3000);
	
	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
                    break;
		            }
		            else if(optionText.equals("Credit Card")) {
		          
	                	  
	                //	Optionspayment.click();
		                Thread.sleep(3000);

	                	driver.findElement(By.xpath("//input[@formcontrolname='creditCardAckNo']")).sendKeys(ackNumber);	
	                	   driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
	   	                Thread.sleep(3000);
	   	
	   	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
	                    break;
		            }
		            else if(optionText.equals("NEFT")) {
	               

	                //	Optionspayment.click();
		                Thread.sleep(3000);
	                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(neftReferenceNumber);	

	                	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
		   	                Thread.sleep(3000);
		   	
		   	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		                    break;

		            }
		            else if(optionText.equals("RTGS")) {
	              
	                	//Optionspayment.click();
		                Thread.sleep(3000);
	                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(rtgsReferenceNumber);	
	                	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
		   	                Thread.sleep(3000);
		   	
		   	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		                    break;

		            }
		            else if(optionText.equals("Direct Transfer to Bank")) {
	                
	               // 	Optionspayment.click();
		                Thread.sleep(3000);
	                	driver.findElement(By.xpath("//input[@formcontrolname='referrenceNo']")).sendKeys(referenceNumber);	
	                	  driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
		   	                Thread.sleep(3000);
		   	
		   	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
		                    break;

		            }
		            else if(optionText.equals("TDS")) {
	                	//Optionspayment.click();
		                Thread.sleep(3000);

	                	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
	                	driver.findElement(By.xpath("//input[@formcontrolname='paymentRemarks']")).sendKeys("No");	
	   	              
	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
                    break;

		            }
		            else if(optionText.equals("Others")){
		            	
		            //	Optionspayment.click();
		                Thread.sleep(3000);


	                	driver.findElement(By.xpath("//input[@formcontrolname='totalAmountPaid']")).sendKeys(fstinstallment);	
	   	                driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();

		            }
	   	         else {
	 				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
	                Thread.sleep(3000);
	                optionText="";	   	    
	                }
	                    // Default action if option not matched
	                 
	            }// Exit the loop once the desired option is found and clicked
				
				}
				
                Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[4]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				   Thread.sleep(3000);

				List<WebElement> Options15561s = driver.findElements(By.cssSelector("mat-option"));
				//Loop through the options to find the desired one
				for (WebElement option : Options15561s) {
				if (option.getText().equals("Parents")) {
			     // Click on the desired option
				   option.click();
				   Thread.sleep(3000);
				   break; // Exit the loop once the desired option is found and clicked
				}
				}
				   Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[4]/div/div/div/form/div[1]/div[2]/mat-checkbox/label/span[1]")).click();
				   Thread.sleep(3000);


		            // Simulate pressing the Tab key
		            actions.sendKeys(Keys.TAB).perform();
					   Thread.sleep(3000);

		            // Simulate pressing Ctrl+C
		            actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
					   Thread.sleep(3000);

			          //  actions.sendKeys(Keys.TAB).perform();


		               WebElement inputField = driver.findElement(By.xpath("//input[@formcontrolname='checkvalidationNo']"));
		               inputField.sendKeys(Keys.CONTROL + "v");

					   Thread.sleep(3000);

		               driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[4]/div/div/div/div/div/button[3]/span[1]")).click();
		               
		               WebElement Student=driver.findElement(By.xpath("/html/body/div[4]/div/h2"));
				
		               String StudentID=Student.getText();
		               System.out.println(StudentID);
		               
		               String ReceiptNo= driver.findElement(By.xpath("/html/body/div[4]/div/div[2]")).getText();
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

					   driver.navigate().refresh();
		               

		 			  WebElement svoenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[5]/ul/li[2]/a"));
		 			//	JavascriptExecutor zz = (JavascriptExecutor) driver;
		 				zz.executeScript("arguments[0].scrollIntoView()", svoenext);
		 				Thread.sleep(5000);
		 				zz.executeScript("arguments[0].click()", svoenext);
		 				Thread.sleep(6000);
		 		
		 			driver.findElement(By.xpath("//input[@formcontrolname='studentId']")).sendKeys(desiredText);
					Thread.sleep(3000); 

		 			zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000); 

					driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[3]/button/span[1]")).click();
					Thread.sleep(3000); 

				String secinstall=	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[2]")).getText();
				Thread.sleep(3000); 

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				Thread.sleep(3000); 

				List<WebElement> modeofpayments = driver.findElements(By.cssSelector("mat-option"));
				//Loop through the options to find the desired one
				for (WebElement option : modeofpayments) {
				if (option.getText().equals("Cash")) {
			     // Click on the desired option
				   option.click();
				   Thread.sleep(3000);
				   break; // Exit the loop once the desired option is found and clicked
				}
				}
	
				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
				Thread.sleep(3000); 

				List<WebElement> placeofs = driver.findElements(By.cssSelector("mat-option"));
				//Loop through the options to find the desired one
				//Loop through the options to find the desired one
				for (int i=0; i<=placeofs.size()-1; i++) {
					placeofs.get(1).click();
					Thread.sleep(3000); 
					break;
				   

					}
				Thread.sleep(3000); 

				driver.findElement(By.xpath("//input[@formcontrolname='amount']")).sendKeys(secinstall);
				zz.executeScript("window.scrollBy(0,400)");
				Thread.sleep(3000); 

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
				Thread.sleep(3000); 

				 Screen screen = new Screen();


				 String projectDirectory = System.getProperty("user.dir");

				 // Specify the relative path to the image file within the project directory
				 String imagePath = projectDirectory + File.separator + "images" + File.separator + "validationNo.png";

				 // Use the constructed image path
				 Pattern wordPattern = new Pattern(imagePath);
					Thread.sleep(3000); 

		            // Double click on the word using SikuliX
		            screen.doubleClick(wordPattern);
					Thread.sleep(3000); 

		            actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
					Thread.sleep(3000); 

	 			//String validno=driver.findElement(By.xpath("//input[@formcontrolname='vNum1']")).getText();
				//Thread.sleep(3000); 

	 			WebElement  subvalidationNo =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/input"));

	 			subvalidationNo.sendKeys(Keys.CONTROL + "v");
				Thread.sleep(3000); 

	 			driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-update-fee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[3]/div/button[2]/span[1]")).click();
				Thread.sleep(3000); 
				zz.executeScript("window.scrollBy(0,600)");
				Thread.sleep(3000); 

	 			driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-updatefee-preview/section/div/div[2]/div/div/div/div[3]/button[1]/span[1]")).click();
	
	
	 		String Subqpaymentrecpt	=driver.findElement(By.xpath("/html/body/div[4]/div/h2")).getText();
	
	
	         String originalsubsqpmt = Subqpaymentrecpt;

             // Split the text by spaces
             String[] partss = originalsubsqpmt.split(" ");

             // Iterate through the parts to find the desired text
             String desiredTextt = null;
             for (String part : parts) {
                 if (part.startsWith("NANA")) {
                     desiredTextt = part;
                     break;
                 }
             }

             // Print the desired text
             if (desiredTextt != null) {
                 System.out.println("Receipt ID: " + desiredTextt);
             } else {
                 //System.out.println("Desired text not found in the original text.");
             }

           
	}

}
