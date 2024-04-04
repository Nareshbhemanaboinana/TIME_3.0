package USERS_ROLES;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class Manage_Staff extends Login{
	
	@Test
	public void Adding_Manage_Staff() throws InterruptedException, FindFailed {

	
		Faker fk = new Faker();
	    String name=fk.name().firstName();
	    // String code = fk.code().asin();
	     String firstLetter = fk.letterify("?"); // Generates a random letter
	     String secondLetter = fk.letterify("?");
	 	String name1 = fk.name().firstName();
		//String franchisee=fk.name().name();
		 String first = fk.letterify("?"); // Generates a random letter
	     int second = fk.random().nextInt(9);
	    //String fakePhoneNumber = fk.phoneNumber().phoneNumber();
		//String adress=fk.address().fullAddress();
		Thread.sleep(3000);
	
	 	
	 	WebElement svenexxt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[12]/a"));
	 JavascriptExecutor zz = (JavascriptExecutor) driver;
	 	zz.executeScript("arguments[0].scrollIntoView()", svenexxt);
	 	Thread.sleep(4000);
	 	zz.executeScript("arguments[0].click()", svenexxt);
	 	Thread.sleep(4000);
	 	List<WebElement> dropdowns1 = driver.findElements(By.cssSelector("mat-select"));
	 	Thread.sleep(4000);

	 	WebElement FirstDropdown1 = dropdowns1.get(0);
	 	WebElement secoendDropdown2 = dropdowns1.get(1);
	 	Thread.sleep(4000);

	 	FirstDropdown1.click();
	 	Thread.sleep(5000);
	   //  Universal_methods UM=new Universal_methods();

	     List<WebElement> matOptions = driver.findElements(By.cssSelector("mat-option"));
	     
	     int ran =matOptions.size();
	        int randomNumber = fk.number().numberBetween(28, ran);
	        
	        for(int i=0; i<=matOptions.size()-1;i++) {
	        	matOptions.get(randomNumber).click();
	             break; // Exit the loop once the desired option is found and clicked

	             
	        }

	      String City=  FirstDropdown1.getText();
	
	     WebElement franchiseename= driver.findElement(By.xpath("//input[@formcontrolname='fname']"));
	 	franchiseename.sendKeys(name+"_Pvt.Ltd");
	 	String FranchiseeName=name+"_Pvt.Ltd";
	 	driver.findElement(By.xpath("//input[@formcontrolname='fcode']")).sendKeys((firstLetter+secondLetter)+(firstLetter+secondLetter));
	 	 Date currentDate = new Date();
	      
	      // Print current date
	      SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
	     // System.out.println("Current Date: " + dateFormat.format(currentDate));
	      
	      // Add one year to the current date
	      Calendar calendar = Calendar.getInstance();
	      calendar.setTime(currentDate);
	      calendar.add(Calendar.YEAR, 1);
	      Date nextYearDate = calendar.getTime();
	      
	      // Print date after one year
	     // System.out.println("Date After One Year: " + dateFormat.format(nextYearDate));
	 	driver.findElement(By.xpath("//input[@formcontrolname='fdate']")).sendKeys(dateFormat.format(currentDate));
	    Universal_methods UM=new Universal_methods();

	 	driver.findElement(By.xpath("//input[@formcontrolname='rdate']")).sendKeys(dateFormat.format(nextYearDate));
	 	secoendDropdown2.click();
	 	UM.dropdownselection(driver);
	 	driver.findElement(By.xpath("//input[@formcontrolname='gstn']")).sendKeys("09AAACH7409R1ZZ");
	 	driver.findElement(By.xpath("//input[@formcontrolname='cgst']")).sendKeys("9");
	 	driver.findElement(By.xpath("//input[@formcontrolname='sgst']")).sendKeys("9");
	 	driver.findElement(By.xpath("//input[@formcontrolname='igst']")).sendKeys("9");
	 	driver.findElement(By.xpath("//input[@formcontrolname='directorName']")).sendKeys("Naresh");
	 	driver.findElement(By.xpath("//input[@formcontrolname='email']")).sendKeys(name+"@yopmail.com");
	 	driver.findElement(By.xpath("//input[@formcontrolname='emailt']")).sendKeys("Times@education.com");
	 	driver.findElement(By.xpath("//input[@formcontrolname='mobile']")).sendKeys("9999999999");
	 	
	 WebElement Savebutton=driver.findElement(By.xpath("//button[@type='submit']"));
	 zz.executeScript("arguments[0].scrollIntoView()", Savebutton);
	 zz.executeScript("arguments[0].click()", Savebutton);
	 Thread.sleep(4000);

	 zz.executeScript("window.scrollBy(0,-1000)");

	 WebElement popup1 =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	 String popups1 = popup1.getText();

	    // String backgroundColor = popup.getCssValue("background-color");
	       if (popups1.contains(" Successfully ")) {
	       	
	      // 	System.out.println("Massage:"+ popups1);
  }
	       else {
	         	System.out.println("Massage:"+ popups1);
	 	          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	       }

		
		
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[13]/a"));
	//	JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(4000);
		
		List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
		WebElement FirstDropdown = dropdowns.get(0);
		WebElement secoendDropdown = dropdowns.get(1);
		WebElement ThirdDropdown = dropdowns.get(2);
		WebElement fourDropdown = dropdowns.get(3);

		FirstDropdown.click();
		Thread.sleep(3000);
		//List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

		 List<WebElement> matOptionss22 = driver.findElements(By.cssSelector("mat-option"));
	     // Loop through the options to find the desired one
	     for (WebElement option : matOptionss22) {
	         if (option.getText().equals(City)) {
	             // Click on the desired option
	             option.click();
	             break; // Exit the loop once the desired option is found and clicked
	         }
	     }

		//WebElement option = driver.findElement(By.xpath("//*[@id=\"mat-option-382\"]/span"));
		//option.click();
		
		//WebElement Franchisee = driver.findElement(By.cssSelector("mat-select"));
		
	     secoendDropdown.click();
		 	Thread.sleep(3000);


		 List<WebElement> matOptionss23 = driver.findElements(By.cssSelector("mat-option"));
	     // Loop through the options to find the desired one
	     for (WebElement option : matOptionss23) {
	         if (option.getText().equals(FranchiseeName)) {
	             // Click on the desired option
	             option.click();
	             break; // Exit the loop once the desired option is found and clicked
	         }
	     }

	     
		  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name+"_Office-I");
	 	Thread.sleep(3000);
	 	String Office1=name+"_Office-I";

	     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(first+second);
	 	//WebElement state = driver.findElement(By.cssSelector("mat-select"));
	 	ThirdDropdown.click();
		Thread.sleep(3000);

	UM.dropdownselection(driver);
		
		
		Thread.sleep(3000);
		
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(first+second);
		Thread.sleep(3000);

	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[7]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("adress");
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[10]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("99999999999");
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[12]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name1+"@yopmail.com");
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[13]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Naresh@123");
		Thread.sleep(3000);

	   // WebElement owner = driver.findElement(By.cssSelector("mat-select"));
		fourDropdown.click();
		Thread.sleep(3000);
		UM.dropdownselection(driver);

		Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[15]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
	Thread.sleep(3000);
	JavascriptExecutor zzz = (JavascriptExecutor) driver;

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[16]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[17]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[18]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
	WebElement Savtbutton=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[19]/div/button/span[1]"));
	zzz.executeScript("arguments[0].scrollIntoView()", Savtbutton);
	Thread.sleep(3000);
	zzz.executeScript("arguments[0].click()", Savtbutton);

	WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	String popups = popup.getText();

	   // String backgroundColor = popup.getCssValue("background-color");
	      if (popups.contains(" Successfully ")) {
	      	
	     // 	System.out.println("Massage:"+ popups);
		
	      // Print the success message
	   
	//Thread.sleep(4000);
	 
    }
	      else {
	        	System.out.println("Massage:"+ popups);
		          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	}	

	  	zz.executeScript("window.scrollBy(0,-500)");

			WebElement s1venext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[13]/a"));
		//	JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", s1venext);
			Thread.sleep(4000);
			zz.executeScript("arguments[0].click()", s1venext);
			Thread.sleep(4000);
			
			List<WebElement> dropdownsof = driver.findElements(By.cssSelector("mat-select"));
			WebElement FirstDropdownof = dropdownsof.get(0);
			WebElement secoendDropdownof = dropdownsof.get(1);
			WebElement ThirdDropdownof = dropdownsof.get(2);
			WebElement fourDropdownof = dropdownsof.get(3);

			FirstDropdownof.click();
			Thread.sleep(3000);

			 List<WebElement> matOptionss2of2 = driver.findElements(By.cssSelector("mat-option"));
		     // Loop through the options to find the desired one
		     for (WebElement option : matOptionss2of2) {
		         if (option.getText().equals(City)) {
		             // Click on the desired option
		             option.click();
		             break; // Exit the loop once the desired option is found and clicked
		         }
		     }

			//WebElement option = driver.findElement(By.xpath("//*[@id=\"mat-option-382\"]/span"));
			//option.click();
			
			//WebElement Franchisee = driver.findElement(By.cssSelector("mat-select"));
			
		     secoendDropdownof.click();
			 	Thread.sleep(3000);


			 List<WebElement> matOptionssof23 = driver.findElements(By.cssSelector("mat-option"));
		     // Loop through the options to find the desired one
		     for (WebElement option : matOptionssof23) {
		         if (option.getText().equals(FranchiseeName)) {
		             // Click on the desired option
		             option.click();
		             break; // Exit the loop once the desired option is found and clicked
		         }
		     }

		     
			  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name+"_Office-II");
		 	Thread.sleep(3000);

		 	String Office2=name+"_Office-II";
		     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(second+first);
		 	//WebElement state = driver.findElement(By.cssSelector("mat-select"));
		     ThirdDropdownof.click();
			Thread.sleep(3000);

		UM.dropdownselection(driver);
			
			
			Thread.sleep(3000);
			
		    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(second+first);
			Thread.sleep(3000);

		    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[7]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("adress");
		    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[10]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("99999999999");
		    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[12]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name1+"@yopmail.com");
		    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[13]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("Naresh@123");
			Thread.sleep(3000);

		   // WebElement owner = driver.findElement(By.cssSelector("mat-select"));
			fourDropdownof.click();
			Thread.sleep(3000);
			UM.dropdownselection(driver);

			Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[15]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
		Thread.sleep(3000);
	//	JavascriptExecutor zzz = (JavascriptExecutor) driver;

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[16]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[17]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[18]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("500");
		WebElement Savetbutton=driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[19]/div/button/span[1]"));
		zzz.executeScript("arguments[0].scrollIntoView()", Savetbutton);
		Thread.sleep(3000);
		zzz.executeScript("arguments[0].click()", Savetbutton);

		WebElement popupof =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
		String popupsof = popupof.getText();

		   // String backgroundColor = popup.getCssValue("background-color");
		      if (popups.contains(" Successfully ")) {
		      	
		     	System.out.println("Massage:"+ popupsof);
			
		      // Print the success message
		   
		//Thread.sleep(4000);
		 
	    }
		      else {
		        	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

		}	


		//  String Name = fk.name().firstName();
		  WebElement svenextt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[14]/ul/li[1]/a"));
		//	JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", svenextt);
			Thread.sleep(5000);
			zz.executeScript("arguments[0].click()", svenextt);
			Thread.sleep(6000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-manage-staff/section/div/div[3]/div/div/div/div/div[1]/div/div[2]/ul/li[2]/div/img")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name+"_Admin");
	Thread.sleep(3000);
	
	driver.findElement(By.xpath("//input[@formcontrolname='loginName']")).sendKeys(name+"_Admin");
	Thread.sleep(3000);
	String LoginName=name+"_Admin";
	String Password ="Admin@123";
	
	System.out.println("Admin Login Name:"+LoginName);
	System.out.println("Admin Password:"+Password);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	Thread.sleep(3000);

	 List<WebElement> matOptionss = driver.findElements(By.cssSelector("mat-option"));
     // Loop through the options to find the desired one
     for (WebElement option : matOptionss) {
         if (option.getText().equals("QA_Admin")) {
             // Click on the desired option
             option.click();
             break; // Exit the loop once the desired option is found and clicked
         }
     }
 	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
	Thread.sleep(3000);

	List<WebElement> matOptionss1 = driver.findElements(By.cssSelector("mat-option"));
     // Loop through the options to find the desired one
     for (WebElement option : matOptionss1) {
         if (option.getText().equals("Designation")) {
             // Click on the desired option
             option.click();
             break; // Exit the loop once the desired option is found and clicked
         }
     }
 	Thread.sleep(3000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
 	Thread.sleep(3000);

     List<WebElement> matOptionss2 = driver.findElements(By.cssSelector("mat-option"));
     // Loop through the options to find the desired one
     for (WebElement option : matOptionss2) {
         if (option.getText().equals("Default")) {
             // Click on the desired option
             option.click();
             break; // Exit the loop once the desired option is found and clicked
         }
     }
 	Thread.sleep(3000);

     driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Admin@123");
 	Thread.sleep(3000);

     driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("Admin@123");
 	Thread.sleep(3000);

     driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']")).sendKeys("9999999999");
 	Thread.sleep(3000);
	zz.executeScript("window.scrollBy(0,500)");

     driver.findElement(By.xpath("//input[@formcontrolname='personalEmail']")).sendKeys("Admin@yopmail.com");
 	Thread.sleep(3000);
 
     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[11]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
    
 	Thread.sleep(3000);


     List<WebElement> matOptionss3 = driver.findElements(By.cssSelector("mat-option"));
     // Loop through the options to find the desired one
     for (WebElement option : matOptionss3) {
         if (option.getText().equals("Sheetal Srikanth S")) {
             // Click on the desired option
             option.click();
             break; // Exit the loop once the desired option is found and clicked
         }
     }
 
     driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();
		Thread.sleep(8000);

     List<WebElement> citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
 	for(WebElement citycheckbox:citycheckboxs ) {
 		if(citycheckbox.getText().equalsIgnoreCase(City)) {
 			Thread.sleep(4000);
 			citycheckbox.click();
 		}
 	}
	Thread.sleep(4000);

 	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	Thread.sleep(4000);

 	driver.findElement(By.xpath("//input[@formcontrolname='franchisee']")).click();
	Thread.sleep(4000);

	

    List<WebElement> francheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement citycheckbox:francheckboxs ) {
		if(citycheckbox.getText().equalsIgnoreCase(FranchiseeName)) {
			Thread.sleep(4000);
			citycheckbox.click();
		}
	}
	Thread.sleep(4000);

	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@formcontrolname='office']")).click();
	Thread.sleep(4000);

    List<WebElement> ocfcheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement citycheckbox:ocfcheckboxs ) {
		if(citycheckbox.getText().equalsIgnoreCase("Select All")) {
			Thread.sleep(4000);
			citycheckbox.click();
		}
		
	}
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[2]/div/button[1]/span[1]")).click();
	Thread.sleep(13000);
	
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-sidebar/div/aside/div/ul/li[15]/a/span")).click();
	
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-signin/div/div[2]/div[2]/div/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys(LoginName);
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-signin/div/div[2]/div[2]/div/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys(Password);
	Thread.sleep(3000);

	driver.findElement(By.xpath("//button[@type='submit']")).click();
	Thread.sleep(5000);


	 // String Name = fk.name().firstName();
	  WebElement s1venextt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[1]/a"));
	//	JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", s1venextt);
		Thread.sleep(5000);
		zz.executeScript("arguments[0].click()", s1venextt);
		Thread.sleep(6000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-manage-staff/section/div/div[3]/div/div/div/div/div[1]/div/div[2]/ul/li[2]/div/img")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name+"_Counsellor_Office-I");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='loginName']")).sendKeys(name+"Office-I");
Thread.sleep(3000);
String F1LoginName=name+"Office-I";
String F1Password ="Office@123";

System.out.println("Office-I Login Name:"+F1LoginName);
System.out.println("Office-I Password:"+F1Password);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(3000);

List<WebElement> FmatOptionss = driver.findElements(By.cssSelector("mat-option"));
// Loop through the options to find the desired one
for (WebElement option : FmatOptionss) {
   if (option.getText().equals("QA_Counsellor")) {
       // Click on the desired option
       option.click();
       break; // Exit the loop once the desired option is found and clicked
   }
}
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(3000);

List<WebElement> FmatOptionss1 = driver.findElements(By.cssSelector("mat-option"));
// Loop through the options to find the desired one
for (WebElement option : FmatOptionss1) {
   if (option.getText().equals("Designation")) {
       // Click on the desired option
       option.click();
       break; // Exit the loop once the desired option is found and clicked
   }
}
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(3000);

List<WebElement> FmatOptionss2 = driver.findElements(By.cssSelector("mat-option"));
// Loop through the options to find the desired one
for (WebElement option : FmatOptionss2) {
   if (option.getText().equals("Default")) {
       // Click on the desired option
       option.click();
       break; // Exit the loop once the desired option is found and clicked
   }
}
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Office@123");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("Office@123");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']")).sendKeys("9999999999");
Thread.sleep(3000);
zz.executeScript("window.scrollBy(0,500)");

driver.findElement(By.xpath("//input[@formcontrolname='personalEmail']")).sendKeys("Office@yopmail.com");
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[11]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();

Thread.sleep(3000);


List<WebElement> FmatOptionss3 = driver.findElements(By.cssSelector("mat-option"));
// Loop through the options to find the desired one
for (WebElement option : FmatOptionss3) {
   if (option.getText().equals(LoginName)) {
       // Click on the desired option
       option.click();
       break; // Exit the loop once the desired option is found and clicked
   }
}

driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();
	Thread.sleep(8000);

List<WebElement> Fcitycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement citycheckbox:Fcitycheckboxs ) {
	if(citycheckbox.getText().equalsIgnoreCase(City)) {
		Thread.sleep(4000);
		citycheckbox.click();
	}
}
Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@formcontrolname='franchisee']")).click();
Thread.sleep(4000);



List<WebElement> fra1ncheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement citycheckbox:fra1ncheckboxs ) {
	if(citycheckbox.getText().equalsIgnoreCase(FranchiseeName)) {
		Thread.sleep(4000);
		citycheckbox.click();
	}
}
Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@formcontrolname='office']")).click();
Thread.sleep(4000);

List<WebElement> F1ocfcheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement citycheckbox:F1ocfcheckboxs ) {
	if(citycheckbox.getText().equalsIgnoreCase(Office1)) {
		Thread.sleep(4000);
		citycheckbox.click();
	}
	
}
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[2]/div/button[1]/span[1]")).click();
Thread.sleep(13000);


// String Name = fk.name().firstName();
 WebElement s11venextt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[1]/a"));
//	JavascriptExecutor zz = (JavascriptExecutor) driver;
	zz.executeScript("arguments[0].scrollIntoView()", s11venextt);
	Thread.sleep(5000);
	zz.executeScript("arguments[0].click()", s11venextt);
	Thread.sleep(6000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-manage-staff/section/div/div[3]/div/div/div/div/div[1]/div/div[2]/ul/li[2]/div/img")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys(name+"_Counsellor_Office-II");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='loginName']")).sendKeys(name+"_Office-II");
Thread.sleep(3000);
String F2LoginName=name+"Office-II";
String F2Password ="Office@123";

System.out.println("Office-II Login Name:"+F2LoginName);
System.out.println("Office-II Password:"+F2Password);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[3]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(3000);

List<WebElement> F2matOptionss = driver.findElements(By.cssSelector("mat-option"));
//Loop through the options to find the desired one
for (WebElement option : F2matOptionss) {
if (option.getText().equals("QA_Counsellor")) {
  // Click on the desired option
  option.click();
  break; // Exit the loop once the desired option is found and clicked
}
}
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[4]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(3000);

List<WebElement> F2matOptionss1 = driver.findElements(By.cssSelector("mat-option"));
//Loop through the options to find the desired one
for (WebElement option : F2matOptionss1) {
if (option.getText().equals("Designation")) {
  // Click on the desired option
  option.click();
  break; // Exit the loop once the desired option is found and clicked
}
}
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[5]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[1]/span")).click();
Thread.sleep(3000);

List<WebElement> F2matOptionss2 = driver.findElements(By.cssSelector("mat-option"));
//Loop through the options to find the desired one
for (WebElement option : F2matOptionss2) {
if (option.getText().equals("Default")) {
  // Click on the desired option
  option.click();
  break; // Exit the loop once the desired option is found and clicked
}
}
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='password']")).sendKeys("Office@123");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='confirmPassword']")).sendKeys("Office@123");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@formcontrolname='phoneNumber']")).sendKeys("9999999999");
Thread.sleep(3000);
zz.executeScript("window.scrollBy(0,500)");

driver.findElement(By.xpath("//input[@formcontrolname='personalEmail']")).sendKeys("Office@yopmail.com");
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[11]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();

Thread.sleep(3000);


List<WebElement> F2matOptionss3 = driver.findElements(By.cssSelector("mat-option"));
//Loop through the options to find the desired one
for (WebElement option : F2matOptionss3) {
if (option.getText().equals(LoginName)) {
  // Click on the desired option
  option.click();
  break; // Exit the loop once the desired option is found and clicked
}
}

driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();
Thread.sleep(4000);

List<WebElement> F2citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement citycheckbox:F2citycheckboxs ) {
if(citycheckbox.getText().equalsIgnoreCase(City)) {
	Thread.sleep(4000);
	citycheckbox.click();
}
}
Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@formcontrolname='franchisee']")).click();
Thread.sleep(4000);



List<WebElement> fra2ncheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement citycheckbox:fra2ncheckboxs ) {
if(citycheckbox.getText().equalsIgnoreCase(FranchiseeName)) {
	Thread.sleep(4000);
	citycheckbox.click();
}
}
Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@formcontrolname='office']")).click();
Thread.sleep(8000);

List<WebElement> F2ocfcheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
for(WebElement citycheckbox:F2ocfcheckboxs ) {
if(citycheckbox.getText().equalsIgnoreCase(Office2)) {
	Thread.sleep(4000);
	citycheckbox.click();
}

}
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
Thread.sleep(3000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[2]/div/button[1]/span[1]")).click();
Thread.sleep(7000);

Thread.sleep(6000);


	}
}