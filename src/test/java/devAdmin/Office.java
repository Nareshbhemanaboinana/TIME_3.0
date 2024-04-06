package devAdmin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.NoAlertPresentException;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Office extends Login1 {

	@Test(priority=0)

	public void ADD_Office() throws InterruptedException {


	Faker fk = new Faker();
	String name = fk.name().firstName();
	//String franchisee=fk.name().name();
	 String first = fk.letterify("?"); // Generates a random letter
     int second = fk.random().nextInt(9);
    //String fakePhoneNumber = fk.phoneNumber().phoneNumber();
	String adress=fk.address().fullAddress();
	Thread.sleep(3000);
	
	WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[13]/a"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
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
	List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

	for(int j=4; j<=options.size()-1;j++) {
		options.get(j).click();
		secoendDropdown.click();
		Thread.sleep(3000);
  		List<WebElement> secooptions=driver.findElements(By.cssSelector("mat-option"));

		     if(secooptions.size()==1)  {
		 		Thread.sleep(3000);
		    	//driver.navigate().refresh();
		  	WebElement secoendtime=driver.findElement(By.cssSelector("mat-option"));
		 		Thread.sleep(3000);
		 		secoendtime.click();
		 		Thread.sleep(3000);
		 		FirstDropdown.click();

		 				}
		     
		      else {

		    	  for(int k=1; k<=secooptions.size()-1;k++) {
			    		 secooptions.get(k).click();
			    			Thread.sleep(3000);

			    		break;


     }
		    		break;

				
			}

	}	
	



	//WebElement option = driver.findElement(By.xpath("//*[@id=\"mat-option-382\"]/span"));
	//option.click();
	
	//WebElement Franchisee = driver.findElement(By.cssSelector("mat-select"));
	
	  driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name+"LTD");
 	Thread.sleep(3000);

     driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[4]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(first+second);
 	//WebElement state = driver.findElement(By.cssSelector("mat-select"));
 	ThirdDropdown.click();
	Thread.sleep(3000);

    Universal_methods UM=new Universal_methods();
UM.dropdownselection(driver);
	
	
	Thread.sleep(3000);
	
    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[6]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(first+second);
	Thread.sleep(3000);

    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[7]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("adress");
    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[10]/mat-form-field/div/div[1]/div[3]/input")).sendKeys("99999999999");
    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div/div[12]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(name+"@yopmail.com");
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
      	
      	System.out.println("Massage:"+ popups);
	
      // Print the success message
   
//Thread.sleep(4000);
 

zz.executeScript("window.scrollBy(0,-500)");
Thread.sleep(3000);

driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
Thread.sleep(3000);
zz.executeScript("window.scrollBy(0,400)");
Thread.sleep(3000);

driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(name+"LTD");
Thread.sleep(2000);

Assert.assertEquals( name+"LTD",  UM.First_Record_Of_Row(driver) );

      }
      else {
        	System.out.println("Massage:"+ popups);
	          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

}	

	}
	@Test(priority=1)
	public void Search_Office() throws InterruptedException {
	
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[14]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div[2]/div/button[1]/span[1]")).click();

	      Universal_methods UM=new Universal_methods();
String opt=UM.Ramdom_Record(driver);
		driver.findElement(By.name("sName")).sendKeys(opt);
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-office/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div[2]/div/button[1]/span[1]")).click();
		zz.executeScript("window.scrollBy(0,300)");

		Assert.assertEquals(opt, UM.First_Record_Of_Row(driver));
	}
}
