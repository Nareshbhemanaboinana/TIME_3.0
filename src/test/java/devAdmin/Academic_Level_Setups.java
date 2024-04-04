package devAdmin;



import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Academic_Level_Setups extends Login{

	@Test(priority=0)
	public void ADD_Academic_Level() throws InterruptedException {

	Faker fk = new Faker();
    String Name = fk.name().firstName();
	  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[1]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("//input[@formcontrolname='SName']")).sendKeys(Name);

     	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-academic-level/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
     	  
	  	WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
	      String popups = popup.getText();

		     // String backgroundColor = popup.getCssValue("background-color");
	            if (popups.contains(" Successfully ")) {
	            	
	            	System.out.println("Massage:"+ popups);
	
		 driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
			Thread.sleep(3000);
		    zz.executeScript("window.scrollBy(0,400)");
		    Thread.sleep(4000);

		 driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(Name);
			Thread.sleep(3000);
			
			Assert.assertEquals( Name, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-academic-level/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText() );

	            }
	            else {
	            	System.out.println("Massage:"+ popups);
			          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

	            }
	}
	@Test(priority=1)

	public void Search_Academic_Level() throws InterruptedException {
		
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[3]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(9000);

		driver.navigate().refresh();
		Thread.sleep(4000);
		  WebElement svvenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[3]/a"));
			//JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", svvenext);
			Thread.sleep(4000);
			zz.executeScript("arguments[0].click()", svvenext);
			Thread.sleep(9000);

		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
			Thread.sleep(4000);

	
		
		    Universal_methods UM=new Universal_methods();

	      Thread.sleep(5000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-academic-level/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();

		Thread.sleep(4000);

			 String record=  UM.Ramdom_Record(driver);
	
 
     driver.findElement(By.name("sName")).sendKeys(record);
     Thread.sleep(4000);
     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-academic-level/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
	      zz.executeScript("window.scrollBy(0,300)");
			Thread.sleep(4000);

	     Assert.assertEquals( record, UM.First_Record_Of_Row(driver) );
	
}


}
