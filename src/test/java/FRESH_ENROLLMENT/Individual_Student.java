package FRESH_ENROLLMENT;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import devAdmin.Login;

public class Individual_Student extends Login {
	
	@Test
	public void Individual_Student_Fresh_Enrollment_payment_Cash() throws InterruptedException, FindFailed {
		

		String optionText2 = "Cash";
		String id="NARE247319";
		Faker fk = new Faker();
		
	  Actions actions = new Actions(driver);
        String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
        String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
        String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
        String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
        String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string

    
		  WebElement svenexxst = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[4]/ul/li[2]/a"));
			JavascriptExecutor zz = (JavascriptExecutor) driver;
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

	}
}
