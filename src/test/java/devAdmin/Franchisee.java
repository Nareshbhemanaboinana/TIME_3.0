package devAdmin;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Franchisee extends Login1 {

	@Test(priority=0)
	public void ADD_Franchisee() throws InterruptedException {
	Faker fk = new Faker();
    String name=fk.name().firstName();
   // String code = fk.code().asin();
    String firstLetter = fk.letterify("?"); // Generates a random letter
    String secondLetter = fk.letterify("?");

	
	WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[12]/a"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
	zz.executeScript("arguments[0].scrollIntoView()", svenext);
	Thread.sleep(4000);
	zz.executeScript("arguments[0].click()", svenext);
	Thread.sleep(4000);
	List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
	WebElement FirstDropdown = dropdowns.get(0);
	WebElement secoendDropdown = dropdowns.get(1);
	Thread.sleep(4000);

	FirstDropdown.click();
	Thread.sleep(5000);
    Universal_methods UM=new Universal_methods();

    List<WebElement> matOptions = driver.findElements(By.cssSelector("mat-option"));
    // Loop through the options to find the desired one
    for (WebElement option : matOptions) {
        if (option.getText().equals("Jodpur")) {
            // Click on the desired option
            option.click();
            break; // Exit the loop once the desired option is found and clicked
        }
    }	WebElement franchiseename= driver.findElement(By.xpath("//input[@formcontrolname='fname']"));
	franchiseename.sendKeys(name);
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

	driver.findElement(By.xpath("//input[@formcontrolname='rdate']")).sendKeys(dateFormat.format(nextYearDate));
	secoendDropdown.click();
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

WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
String popups = popup.getText();

   // String backgroundColor = popup.getCssValue("background-color");
      if (popups.contains(" Successfully ")) {
      	
      	System.out.println("Massage:"+ popups);

Thread.sleep(4000);

driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
Thread.sleep(4000);
zz.executeScript("window.scrollBy(0,400)");
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(name);
Thread.sleep(4000);

Assert.assertEquals( name, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-franchisee/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[2]")).getText());
      }
      else {
        	System.out.println("Massage:"+ popups);
	          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

      }
	
	}
	@Test(priority=1)
	public void Search_Franchisee() throws InterruptedException {
	
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[13]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-franchisee/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();

        Alert alert = driver.switchTo().alert();
        alert.accept();
	      Universal_methods UM=new Universal_methods();

			WebElement myTable=driver.findElement(By.xpath("//table[@role='table']"));
			
			List<WebElement> trs=myTable.findElements(By.tagName("tr"));
			int d=(int)(Math.random()*((trs.size()-1)-1+1)+(1));
				
				List<WebElement> tds= trs.get(d).findElements(By.tagName("td"));
				for(int j=0; j<=tds.size()-1;j++) {
					String opt= tds.get(1).getText();
			
				
				driver.findElement(By.name("sName")).sendKeys(opt);
		Thread.sleep(4000);

				
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-franchisee/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[2]/div/button[1]/span[1]")).click();
        alert.accept();
		zz.executeScript("window.scrollBy(0,300)");

		Assert.assertEquals(opt, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-franchisee/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[2]")).getText());
		break;

				}

}
}