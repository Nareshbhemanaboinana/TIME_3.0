package devAdmin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Follow_up_Status extends Login{

	@Test(priority=0)
	public void ADD_Follow_up_Status() throws InterruptedException {
Faker fk = new Faker();
String name=fk.name().firstName();
WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[11]/a"));
JavascriptExecutor zz = (JavascriptExecutor) driver;
zz.executeScript("arguments[0].scrollIntoView()", svenext);
Thread.sleep(4000);
zz.executeScript("arguments[0].click()", svenext);
Thread.sleep(4000);
driver.findElement(By.xpath("//input[@formcontrolname='SName']")).sendKeys(name);
WebElement Dropdown=driver.findElement(By.cssSelector("mat-select"));
Dropdown.click();
Thread.sleep(4000);

List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

for(int j=0; j<=options.size()-1;j++) {

	options.get(1).click();
break;
}
 
Thread.sleep(4000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-followup-status/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button")).click();
WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
String popups = popup.getText();

     // String backgroundColor = popup.getCssValue("background-color");
      if (popups.contains(" Successfully ")) {
      	
      	System.out.println("Massage:"+ popups);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-followup-status/section/div/div[2]/div/div/div/mat-tab-group/mat-tab-header/div/div/div/div[2]")).click();
Thread.sleep(4000);
zz.executeScript("window.scrollBy(0,400)");
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(name);
Thread.sleep(4000);

Assert.assertEquals( name, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-followup-status/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText() );
      }
      else {
        	System.out.println("Massage:"+ popups);
	          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

      }
	
	
	}
	@Test(priority=1)

	public void Search_Follow_up_Status() throws InterruptedException {
		
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[12]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(7000);
		
		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
			Thread.sleep(4000);
	
		//create reference object for WebTable
		      zz.executeScript("window.scrollBy(0,900)");

		      Thread.sleep(4000);
		      List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
		  	WebElement secoenddrop = dropdowns.get(1);
		  	secoenddrop.click();
		Thread.sleep(5000);
		
	    Universal_methods UM=new Universal_methods();
	    UM.dropdownselection(driver);
		Thread.sleep(3000);

	      zz.executeScript("window.scrollBy(0,-1200)");

	      Thread.sleep(5000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-followup-status/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
		String record=UM.Ramdom_Record(driver);
		driver.findElement(By.name("sName")).sendKeys(record);
		Thread.sleep(4000);
	     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-followup-status/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
	      zz.executeScript("window.scrollBy(0,300)");
	
	     Assert.assertEquals( UM.Ramdom_Record(driver), UM.First_Record_Of_Row(driver) );

		
	}


}
