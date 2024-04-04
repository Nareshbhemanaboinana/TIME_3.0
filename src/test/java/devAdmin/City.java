package devAdmin;


import java.util.List;
import java.util.Random;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class City extends Login{

	@Test(priority=0)
	public void ADD_City() throws InterruptedException {
	Faker fk = new Faker();
    String cityName = fk.address().cityName();
	String coursecode = fk.code().asin();
	  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[6]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);
	
	    driver.findElement(By.xpath("//input[@formcontrolname='cityname']")).sendKeys(cityName);
	    driver.findElement(By.xpath("//input[@formcontrolname='citycode']")).sendKeys(coursecode);

	    WebElement Noofcourse = driver.findElement(By.cssSelector("mat-select"));
	    Noofcourse.click();
		Thread.sleep(3000);

	    Universal_methods UM=new Universal_methods();
 
	    UM.dropdownselection(driver);
		Thread.sleep(3000);
  
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-city/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
		Thread.sleep(4000);


		WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	      String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
	            if (popups.contains(" Successfully ")) {
	            	
	            	System.out.println("Massage:"+ popups);
	           	 
	            	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-city/section/div/div[2]/div/div/div/mat-tab-group/mat-tab-header/div/div/div/div[2]")).click();
	            	Thread.sleep(4000);
	            	zz.executeScript("window.scrollBy(0,400)");
	            	Thread.sleep(4000);


	            	driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(cityName);
	            	Thread.sleep(4000);

	            	Assert.assertEquals( cityName, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-city/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText() );


	            	
	            }
	
	            else {
	            	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	            }
	           
	}

	@Test(priority=1)

	public void Search_City() throws InterruptedException {
		
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[8]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(7000);
		
		driver.navigate().refresh();
		  WebElement svenextt = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[8]/a"));
			//JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", svenextt);
			Thread.sleep(4000);
			zz.executeScript("arguments[0].click()", svenextt);
			Thread.sleep(7000);
			
		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();

	
		
		    Universal_methods UM=new Universal_methods();

	      Thread.sleep(5000);

	      UM.RadioButtons(driver, "Active");
	        WebElement bbutton = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-city/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[3]/div/button[1]/span[1]"));

	        bbutton.click();
	        Thread.sleep(4000);
		      zz.executeScript("window.scrollBy(0,300)");

		WebElement myTable=driver.findElement(By.xpath("//table[@role='table']"));
		
		List<WebElement> trs=myTable.findElements(By.tagName("tr"));
        int minRange = 0;
        int maxRange = (trs.size()-1);

        Random random = new Random();
        int randomNumber = random.nextInt(maxRange - minRange + 1) + minRange;

		//int d=(int)(Math.random()*((trs.size()-1)-1+1)+(1));
			
			List<WebElement> tds= trs.get(randomNumber).findElements(By.tagName("td"));
			for(int j=0; j<=tds.size()-1;j++) {
				String record= tds.get(1).getText();
			//String statename1 =tds.get(0).getText();
			
		
			 
	
			      zz.executeScript("window.scrollBy(0,-300)");

     driver.findElement(By.xpath("//input[@formcontrolname='CityCode']")).sendKeys(record);
		Thread.sleep(4000);
        bbutton.click();
	     zz.executeScript("window.scrollBy(0,300)");
	
	     Assert.assertEquals( record, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-city/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[2]")).getText() );
			
	     break;	
	}


	}
}
