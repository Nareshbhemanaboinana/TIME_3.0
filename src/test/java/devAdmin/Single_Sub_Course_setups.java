package devAdmin;

import java.text.SimpleDateFormat;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Single_Sub_Course_setups extends Login{
	

	@Test (priority =0)
	public void ADD_Single_Sub_Course() throws InterruptedException {
	Faker fk = new Faker();
    //String Name = fk.funnyName().name(); 
	 String first = fk.letterify("?"); // Generates a random letter
     int second = fk.random().nextInt(9);
 
    String fakeCourseName = fk.educator().course();

	  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[17]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);
	
		List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
		WebElement FirstDropdown = dropdowns.get(0);
		WebElement secoendDropdown = dropdowns.get(1);
		WebElement ThirdDropdown = dropdowns.get(2);
		//WebElement fourDropdown = dropdowns.get(3);
		FirstDropdown.click();
	    Universal_methods UM=new Universal_methods();
	   UM.dropdownselection(driver);
		  Thread.sleep(3000);

	  String Name= FirstDropdown.getText();
	
	 Thread.sleep(3000);
      driver.findElement(By.xpath("//input[@formcontrolname='subCourseName']")).sendKeys(fakeCourseName);
      driver.findElement(By.xpath("//input[@formcontrolname='code']")).sendKeys("EE");
      driver.findElement(By.xpath("//input[@formcontrolname='yearCode']")).sendKeys("24");
      Date currentDate = new Date();
      
      // Print current date
      SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-yyyy");
     // System.out.println("Current Date: " + dateFormat.format(currentDate));
      
      // Add one year to the current date
      Calendar calendar = Calendar.getInstance();
      calendar.setTime(currentDate);
      calendar.add(Calendar.MONTH, 1);
      Date nextYearDate = calendar.getTime();
    
 
      driver.findElement(By.xpath("//input[@formcontrolname='eDate']")).sendKeys(dateFormat.format(nextYearDate));
	  Thread.sleep(3000);

      zz.executeScript("window.scrollBy(0,500)");
	  Thread.sleep(3000);

      secoendDropdown.click();
	    UM.dropdownselection(driver);

      
      //driver.findElement(By.xpath("//input[@formcontrolname='subCourseFee']")).sendKeys("600");
	  Thread.sleep(3000);

	 
      Thread.sleep(3000);

      ThirdDropdown.click();
      Thread.sleep(5000);

  	
		List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

		for(int j=0; j<=options.size()-1;j++) {

			options.get(0).click();
		break;
		}
	     // fourDropdown.click();
      Thread.sleep(5000);

      List<WebElement> foptions=driver.findElements(By.cssSelector("mat-option"));

		for(int j=0; j<=foptions.size()-1;j++) {

			foptions.get(0).click();
		break;
		}
	  Thread.sleep(3000);

	    driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();
	    Thread.sleep(5000);
		
		List<WebElement> citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement citycheckbox:citycheckboxs ) {
			if(citycheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				citycheckbox.click();
			}
		}
		 Thread.sleep(5000);
      driver.findElement(By.xpath("//*[@tabindex='-1']/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	    Thread.sleep(5000);

	    driver.findElement(By.xpath("//input[@formcontrolname='franchisee']")).click();
	    Thread.sleep(5000);
		
		List<WebElement> francheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement francheckbox:francheckboxs ) {
			if(francheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				francheckbox.click();
			}
		}
	    Thread.sleep(5000);

      driver.findElement(By.xpath("//*[@tabindex='-1']/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
	    
	    driver.findElement(By.xpath("//input[@formcontrolname='office']")).click();
	    Thread.sleep(5000);

		List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement ofccheckbox:ofccheckboxs ) {
			if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				ofccheckbox.click();
			}
		}
      driver.findElement(By.xpath("//*[@tabindex='-1']/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
       Thread.sleep(4000);
       WebElement Submitbutton = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-sub-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[15]/button/span[1]"));
	    Thread.sleep(3000);
	   zz.executeScript("arguments[0].click()", Submitbutton);
	   
	   
		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	      String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
	            if (popups.contains(" Successfully ")) {
	            	
	            	System.out.println("Massage:"+ popups);

  /* 	WebElement svenexto = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[13]/a"));
   	zz.executeScript("arguments[0].scrollIntoView()", svenexto);
   	Thread.sleep(4000);
   	zz.executeScript("arguments[0].click()", svenexto);
   	Thread.sleep(4000);

		 
			Thread.sleep(8000);
			  WebElement svenextt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[2]/a"));
				zz.executeScript("arguments[0].scrollIntoView()", svenextt);
				Thread.sleep(4000);
				zz.executeScript("arguments[0].click()", svenextt);
				Thread.sleep(6000);*/
		 Thread.sleep(3000);
		 
	      zz.executeScript("window.scrollBy(0,-800)");
			 Thread.sleep(3000);

	   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-sub-course/section/div/div[2]/div/div/div/mat-tab-group/mat-tab-header/div/div/div/div[2]")).click();
			

			 Thread.sleep(3000);
		      zz.executeScript("window.scrollBy(0,1000)");

				WebElement searchbox =  driver.findElement(By.xpath("//input[@aria-label='Search box']"));
				  zz.executeScript("arguments[0].scrollIntoView()", searchbox);
				driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(Name);
				Thread.sleep(3000);
				
				Assert.assertEquals( Name, UM.First_Record_Of_Row(driver) );

	            }
	            else {
	            	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	            }
	}
	
	@Test (priority =1)

	public void Search_Singlesub_course() throws InterruptedException {
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[2]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(6000);
		 driver.findElement(By.xpath("//div[@role='tab'][2]")).click();
			Universal_methods UM=new Universal_methods();
			zz.executeScript("window.scrollBy(0,400)");
			Thread.sleep(4000);

		WebElement ele=	driver.findElement(By.xpath("//input[@formcontrolname='sName']"));
		ele.sendKeys(Keys.ENTER);
		Thread.sleep(19000);

		WebElement myTable=driver.findElement(By.xpath("//table[@role='table']"));
		
		List<WebElement> trs=myTable.findElements(By.tagName("tr"));
		int d=(int)(Math.random()*((trs.size()-1)-1+1)+(1));
			
			List<WebElement> tds= trs.get(d).findElements(By.tagName("td"));
			for(int j=0; j<=tds.size()-1;j++) {
			//String statename1 =tds.get(0).getText();
			break;
		}
			String Ran=tds.get(1).getText();
	

	

// Use substring to get the part of the string excluding the last two characters
String remainingPart = Ran.substring(0, Ran.length() - 2);

ele.sendKeys(remainingPart);
Thread.sleep(4000);
     
ele.sendKeys(Keys.ENTER);


		zz.executeScript("window.scrollBy(0,700)");
		Thread.sleep(19000);
        String output= driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-sub-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[2]")).getText();

     // Use substring to get the part of the string excluding the last two characters
     String remainingPartt = output.substring(0, Ran.length() - 2);

        Assert.assertEquals( remainingPart, remainingPartt );

	
	}

	

}
