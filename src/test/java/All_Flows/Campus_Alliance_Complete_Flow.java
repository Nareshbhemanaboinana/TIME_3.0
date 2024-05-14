package All_Flows;

import java.awt.HeadlessException;
import java.awt.datatransfer.UnsupportedFlavorException;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class Campus_Alliance_Complete_Flow extends Login {
	
	@Test
	@Parameters({"optionText2"})
	public void Campus_Alliance_Complete_Flow_Enquiry_Enrollment_subsequent_Pymnt(String optionText2) throws InterruptedException, FindFailed, HeadlessException, UnsupportedFlavorException, IOException {


	//	String  ="Cash";
		Faker fk = new Faker();
		Universal_methods UM=new Universal_methods ();
	     WebDriverWait wait = new WebDriverWait(driver, 20); // Adjust timeout as needed

	  Actions actions = new Actions(driver);
	   String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
	    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
	    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string

	String Name = fk.name().firstName().toUpperCase();
	 WebElement svenextt = driver.findElement(By.xpath("//a[@href='#/admin/campus']"));
				JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenextt);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenextt);
		        driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				

				driver.findElement(By.xpath("//input[@formcontrolname='sCampusName']")).sendKeys(Name);
				
				driver.findElement(By.xpath("//input[@formcontrolname='sGroupCode']")).sendKeys(Name);

				System.out.println("Group Name"+Name);
				System.out.println("Group code"+Name);

	WebElement insnme=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='sGroupName']")));
	insnme.sendKeys(Name+"-Institute");			
	//driver.findElement(By.xpath("//input[@formcontrolname='sGroupName']")).sendKeys(Name+"-Institute");
		   //     Thread.sleep(3000);
		    	WebElement img=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//img[@src='assets/images/times/add.png']")));
		    	img.click();
			//	driver.findElement(By.xpath("//img[@src='assets/images/times/add.png']")).click();
		    	WebElement cmpsname=wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='sName']")));
		    	cmpsname.sendKeys("Naresh");
			//	driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys("Naresh");

				driver.findElement(By.xpath("//input[@formcontrolname='sDesignation']")).sendKeys("Marketing Head");
				
				driver.findElement(By.xpath("//input[@formcontrolname='sEmail']")).sendKeys(Name+"@yopmail.com");

				driver.findElement(By.xpath("//input[@formcontrolname='sMobileNo']")).sendKeys("9988778899");

				driver.findElement(By.xpath("//input[@formcontrolname='sAlternateNo']")).sendKeys("9988778899");

				driver.findElement(By.xpath("//span[text()=' Submit ']")).click();
				Thread.sleep(3000);
		      //  driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);
				  zz.executeScript("window.scrollBy(0,500)");
					Thread.sleep(3000);

				
				//  WebElement Address = driver.findElement(By.xpath("//h4[text()='Address']"));
					//zz.executeScript("arguments[0].scrollIntoView()", Address);

					WebElement Address1 =driver.findElement(By.xpath("(//textarea[@aria-required='true'])[1]"));
				  Address1.sendKeys("Road No12, KPHP");
				  
					WebElement Address2 =driver.findElement(By.xpath("(//textarea[@aria-required='true'])[2]"));

				  Address2.sendKeys("Hyderabad");
				 // zz.executeScript("window.scrollBy(0,500)");
			       // driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

				  

					List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
					WebElement FirstDropdown = dropdowns.get(0);
					WebElement secoendDropdown = dropdowns.get(1);
				
					WebElement SIXDropdown = dropdowns.get(5);
					WebElement SEVENDropdown = dropdowns.get(6);

					WebElement eightropdown = dropdowns.get(7);

			     Thread.sleep(3000);
				  zz.executeScript("window.scrollBy(0,200)");
				     Thread.sleep(3000);

					FirstDropdown.click();
					Thread.sleep(3000);

			        UM.selectOptionByText(driver, "New Delhi");
			        
			        secoendDropdown.click(); 
					Thread.sleep(3000);

			        UM.selectOptionByText(driver, "Delhi");
			     
					driver.findElement(By.xpath("//input[@formcontrolname='sMailingZipcode']")).sendKeys("500045");

					driver.findElement(By.xpath("//input[@formcontrolname='sGstno']")).sendKeys("09AAACH7409R1ZZ");
	 
					driver.findElement(By.xpath("//input[@formcontrolname='sPanno']")).sendKeys("ABCTY1234D");
					Thread.sleep(3000);
					zz.executeScript("window.scrollBy(0,300)");
					Thread.sleep(3000);

					SIXDropdown.click();
					
			        UM.selectOptionByText(driver, "MBA");
			        Thread.sleep(3000);
  
			        SEVENDropdown.click();
			        Thread.sleep(3000);
 
			        UM.selectOptionByText(driver, "Finance");
			        
				    LocalDate today = LocalDate.now();

			        // Format for printing dates
			        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

					driver.findElement(By.xpath("//input[@formcontrolname='iBatchStartDate']")).sendKeys(today.format(formatter));
 
					driver.findElement(By.xpath("//span[text()=' Campus ']")).click();
					Thread.sleep(3000);	
				//	zz.executeScript("window.scrollBy(0,300)");
					//Thread.sleep(3000);	
		
                  driver.findElement(By.cssSelector("mat-select[formcontrolname='iPaymentOption']")).click();
					
			        UM.selectOptionByText(driver, "Per Student");

					driver.findElement(By.xpath("//input[@formcontrolname='feeperstd']")).sendKeys("1000");

					driver.findElement(By.xpath("//input[@formcontrolname='iTotalStudents']")).sendKeys("10");
					Thread.sleep(3000);	

						  zz.executeScript("window.scrollBy(0,500)");
							Thread.sleep(3000);	

					driver.findElement(By.xpath("//span[text()=' Save ']")).click();

					WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
				      String popups = popup.getText();

					     // String backgroundColor = popup.getCssValue("background-color");
				            if (popups.equalsIgnoreCase("Campus Group Successfully Created !")) {
				            	WebElement ppopup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
				  	          
				        		
			   			   String ppopups = ppopup.getText();
			   			     // System.out.println("Background color: " + backgroundColor);

			   			      // Print the success message
			   			      System.out.println(" message: " + ppopups);
			   			

				            }
				            else {

				         		WebElement ppopup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
				          
				        		
				        			   String ppopups = ppopup.getText();
				        			     // System.out.println("Background color: " + backgroundColor);

				        			      // Print the success message
				        			      System.out.println(" message: " + ppopups);
				        		          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");
			   
				        	 

		

					
			        
				            }
				            
			            
     	  WebElement CampusallianceEnrlmnt = driver.findElement(By.xpath("//a[@href='#/fresh/campusaliance-enrollment']"));
		//JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", CampusallianceEnrlmnt);
		Thread.sleep(5000);
		zz.executeScript("arguments[0].click()", CampusallianceEnrlmnt);
		Thread.sleep(5000);

		driver.findElement(By.xpath("//input[@formcontrolname='campusGroupCode']")).sendKeys(Name);

		driver.findElement(By.xpath("//span[text()=' Search ']")).click();
        Thread.sleep(3000);
		  zz.executeScript("window.scrollBy(0,500)");
	        Thread.sleep(3000);

		driver.findElement(By.xpath("(//img[@src='assets/images/times/generate.png'])[2]")).click();
        Thread.sleep(3000);

		zz.executeScript("window.scrollBy(0,350)");
	        Thread.sleep(3000);

		//driver.findElement(By.xpath("//a[text()='Didn't find batch code? Add new here.']")).click();
        driver.findElement(By.linkText("Didn't find batch code? Add new here.")).click();
	        Thread.sleep(3000);

	      driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name+"_Batch");
	      driver.findElement(By.xpath("//input[@formcontrolname='sCode']")).sendKeys(Name+"_Batch");
		            

          driver.findElement(By.cssSelector("mat-select[formcontrolname='iCourse']")).click();
     	 Thread.sleep(3000);

	        UM.selectOptionByText(driver, "MBA");
	   	 Thread.sleep(3000);
        
   driver.findElement(By.cssSelector("mat-select[formcontrolname='iSubCourse']")).click();
	 Thread.sleep(3000);
		
    UM.selectOptionByText(driver, "Finance");
	 Thread.sleep(3000);

   // LocalDate today = LocalDate.now();

    // Format for printing dates
    //DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");

    // Print today's date
  //  System.out.println("Today's Date: " + today.format(formatter));

    // Calculate date after 30 days
    LocalDate dateAfter30Days = today.plusDays(30);

    // Print date after 30 days
  //  System.out.println("Date after 30 days: " + dateAfter30Days.format(formatter));

driver.findElement(By.xpath("//input[@formcontrolname='sBatchStartDate']")).sendKeys(today.format(formatter));



       Thread.sleep(4000);
      driver.findElement(By.xpath("//input[@formcontrolname='sBatchFinishDate']")).sendKeys(dateAfter30Days.format(formatter));
	 Thread.sleep(3000);
      zz.executeScript("window.scrollBy(0,500)");
 	 Thread.sleep(3000);

      driver.findElement(By.cssSelector("mat-select[formcontrolname='iPlaceofSupply']")).click();

      UM.selectOptionByText(driver, "New Delhi");
      
		driver.findElement(By.xpath("//span[text()='Active']")).click();
		
		
		driver.findElement(By.xpath("//input[@formcontrolname='iMinimumCapacity']")).sendKeys("40");
		driver.findElement(By.xpath("//input[@formcontrolname='iMaximumCapacity']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@formcontrolname='iPreferredCapacity']")).sendKeys("60");
		 Thread.sleep(3000);
	      zz.executeScript("window.scrollBy(0,500)");
	 	 Thread.sleep(3000);


	     driver.findElement(By.cssSelector("mat-select[formcontrolname='iReportingYear']")).click();

	      UM.selectOptionByText(driver, "2024");
	      
		     driver.findElement(By.cssSelector("mat-select[formcontrolname='iCampusEnqId']")).click();

		      UM.selectOptionByText(driver, Name);
		      
		      
				driver.findElement(By.xpath("//span[text()=' Save ']")).click();
				 Thread.sleep(3000);
 
				zz.executeScript("window.scrollBy(0,350)");
				 Thread.sleep(3000);

			     driver.findElement(By.cssSelector("mat-select[formcontrolname='batchCode']")).click();

			      UM.selectOptionByText(driver, Name+"_Batch");
			      Thread.sleep(3000);
			      System.out.println("assign batch is :"+Name+"_Batch");
					zz.executeScript("window.scrollBy(0,200)");
					 Thread.sleep(3000);

					driver.findElement(By.xpath("//span[text()=' Modify Payment Schedule ']")).click();

					 Thread.sleep(3000);

			driver.findElement(By.xpath("//img[@src='assets/images/times/add.png']")).click();		
			 Thread.sleep(3000);

			driver.findElement(By.xpath("//img[@src='assets/images/times/add.png']")).click();		
			 Thread.sleep(3000);


WebElement table = driver.findElement(By.xpath("//table[@formarrayname='installmentGroup']//tbody"));
WebElement[] inputs = table.findElements(By.tagName("input")).toArray(new WebElement[0]);

String fstinstallmentString="5000";
// Input values into the inputs
for (int i = 0; i < inputs.length; i++) {
    // Replace "your_value" with the actual value you want to input
    inputs[0].sendKeys("1");
    inputs[1].sendKeys(fstinstallmentString);
    inputs[2].sendKeys(today.format(formatter));

    inputs[3].sendKeys("2");
    inputs[4].sendKeys(fstinstallmentString);
    inputs[5].sendKeys(dateAfter30Days.format(formatter));


    break;


}

    driver.findElement(By.xpath("//span[text()=' Save ']")).click();
    Thread.sleep(3000);
    zz.executeScript("window.scrollBy(0,300)");
    Thread.sleep(3000);

    driver.findElement(By.cssSelector("mat-select[formcontrolname='supply']")).click();
    

	UM.selectOptionByText(driver, "New Delhi");
   

	List<WebElement> ddropdowns = driver.findElements(By.cssSelector("mat-select"));
		WebElement eeightDropdown = ddropdowns.get(6);

        // Click on the dropdown to open it
		eeightDropdown.click();	
		 Thread.sleep(3000);

		   zz.executeScript("window.scrollBy(0,200)");
		    
		    Thread.sleep(3000);


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

		driver.findElement(By.xpath("//input[@formcontrolname='amountpaid']")).sendKeys(fstinstallmentString);
		   Thread.sleep(3000);

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

        	driver.findElement(By.xpath("//input[@formcontrolname='creditcard']")).sendKeys(ackNumber);	
        	   driver.findElement(By.xpath("//input[@formcontrolname='amountpaid']")).sendKeys(fstinstallmentString);	
               Thread.sleep(3000);

            //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
            break;
        }
        else if(optionText.equals("NEFT")) {
       

        //	Optionspayment.click();
            Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@formcontrolname='reference1']")).sendKeys(neftReferenceNumber);	

        	  driver.findElement(By.xpath("//input[@formcontrolname='amountpaid']")).sendKeys(fstinstallmentString);	
	                Thread.sleep(3000);
	
	             //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
                break;

        }
        else if(optionText.equals("RTGS")) {
      
        	//Optionspayment.click();
            Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@formcontrolname='reference2']")).sendKeys(rtgsReferenceNumber);	
        	  driver.findElement(By.xpath("//input[@formcontrolname='amountpaid']")).sendKeys(fstinstallmentString);	
	                Thread.sleep(3000);
	
	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
                break;

        }
        else if(optionText.equals("Direct Transfer to Bank")) {
        
       // 	Optionspayment.click();
            Thread.sleep(3000);
        	driver.findElement(By.xpath("//input[@formcontrolname='reference']")).sendKeys(referenceNumber);	
        	  driver.findElement(By.xpath("//input[@formcontrolname='amountpaid']")).sendKeys(fstinstallmentString);	
	                Thread.sleep(3000);
	
	              //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
                break;

        }
        else if(optionText.equals("TDS")) {
        	//Optionspayment.click();
            Thread.sleep(3000);

        	driver.findElement(By.xpath("//input[@formcontrolname='amountpaid']")).sendKeys(fstinstallmentString);	
        //	driver.findElement(By.xpath("//input[@formcontrolname='paymentRemarks']")).sendKeys("No");	
             
      //  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();
        break;

        }
        else if(optionText.equals("Others")){
        	
        //	Optionspayment.click();
            Thread.sleep(3000);


        	driver.findElement(By.xpath("//input[@formcontrolname='amountpaid']")).sendKeys(fstinstallmentString);	
            //   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[2]/button[2]/span[1]")).click();

        }
        else {
			driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-individualf/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/div/mat-vertical-stepper/div[3]/div/div/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
        Thread.sleep(3000);
        optionText="";	   	    
        }
	} 
	}   // Default action if option not matched
		Thread.sleep(3000);
   System.out.println("Amount paid first installment is : 5000");
	    zz.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);


		driver.findElement(By.xpath("//h5[text()=' Student Signed On Rules & Regulations ']")).click();
		

	 //   driver.findElement(By.cssSelector("mat-select[formcontrolname='formFilledBy']")).click();

		//UM.selectOptionByText(driver, "Parents");
		
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
			

			    zz.executeScript("window.scrollBy(0,400)");
				Thread.sleep(3000);
			    driver.findElement(By.xpath("//span[text()=' Save and Genarate Invoice ']")).click();
			    Thread.sleep(2000);

	               driver.findElement(By.xpath("//input[@formcontrolname='accountNo']")).sendKeys("123456789");
	               

	               driver.findElement(By.xpath("//input[@formcontrolname='bankName']")).sendKeys("SBI");

	               driver.findElement(By.xpath("//input[@formcontrolname='branchName']")).sendKeys("Ameetpet_Branch");

	               driver.findElement(By.xpath("//input[@formcontrolname='ifsc']")).sendKeys("SBI000112");

				    driver.findElement(By.xpath("//button[text()=' OK ']")).click();
				    Thread.sleep(2000);
				    driver.findElement(By.xpath("//span[text()=' Close ']")).click();
				    Thread.sleep(2000);

				    driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
				    Thread.sleep(2000);

				    driver.findElement(By.xpath("//span[text()=' Close ']")).click();
				    Thread.sleep(2000);

				    driver.findElement(By.xpath("//span[text()=' Print Receipt ']")).click();

				    Thread.sleep(2000);

				   driver.navigate().refresh();
				    WebElement subpymntcmsalnc = driver.findElement(By.xpath("//a[@href='#/payments/campuspayment-updatefee']"));
				//	JavascriptExecutor zz = (JavascriptExecutor) driver;
					zz.executeScript("arguments[0].scrollIntoView()", subpymntcmsalnc);
					Thread.sleep(5000);
					zz.executeScript("arguments[0].click()", subpymntcmsalnc);
					Thread.sleep(3000);

					driver.findElement(By.xpath("//input[@formcontrolname='cGroupCode']")).sendKeys(Name);
					Thread.sleep(3000);
				    zz.executeScript("window.scrollBy(0,600)");

					Thread.sleep(3000);
		             //actions.sendKeys(Keys.TAB).perform();
						//Thread.sleep(3000);
					    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[3]/button/span[1]")).click();
						Thread.sleep(3000);
					//    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[3]/button/span[1]")).click();
					//	Thread.sleep(3000);

					    driver.findElement(By.cssSelector("mat-select[formcontrolname='type']")).click();
						Thread.sleep(3000);

					   UM.selectOptionByText(driver, "Cash"); 
						Thread.sleep(3000);

					String scndndinstallmnt=   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[2]")).getText();
					Thread.sleep(3000);
			
					driver.findElement(By.xpath("//input[@formcontrolname='amount']")).sendKeys(scndndinstallmnt);
					Thread.sleep(3000);

					System.out.println("2nd installment payment is "+scndndinstallmnt);
						driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
						Thread.sleep(3000);
					    zz.executeScript("window.scrollBy(0,500)");
						Thread.sleep(3000);

					//	driver.findElement(By.xpath("//h5[text()=' Student Signed On Rules & Regulations ']")).click();
					//	Thread.sleep(3000);

				        WebElement textElement = driver.findElement(By.xpath("//mat-label[contains(text(), 'Validation No ')]"));

						Thread.sleep(3000);

				        actions.doubleClick(textElement).perform();

						Thread.sleep(3000); 

			            actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
						Thread.sleep(3000); 

		 			//String validno=driver.findElement(By.xpath("//input[@formcontrolname='vNum1']")).getText();
					//Thread.sleep(3000); 

		 			WebElement  subvalidationNo =driver.findElement(By.xpath("//input[@formcontrolname='vNum2']"));
					Thread.sleep(3000);

		 			subvalidationNo.sendKeys(Keys.CONTROL + "v");
					Thread.sleep(3000);
				    zz.executeScript("window.scrollBy(0,600)");

					Thread.sleep(3000);
		          
				    driver.findElement(By.xpath("//span[text()=' Preview Receipt ']")).click();
				    Thread.sleep(3000);
				    zz.executeScript("window.scrollBy(0,600)");

					Thread.sleep(3000);
					Thread.sleep(3000);
				    zz.executeScript("window.scrollBy(0,600)");
					Thread.sleep(3000);

				    driver.findElement(By.xpath("//span[text()=' Close ']")).click();

					Thread.sleep(3000);
				    driver.findElement(By.xpath("//span[text()=' Save and Do not Print ']")).click();


				String S=    driver.findElement(By.xpath("/html/body/div[4]/div/h2")).getText();
		
				System.out.println(S); 
				            }

}
