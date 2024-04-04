package Masters;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import devAdmin.Login;

public class Discount_Reasons extends Login{


	@Test(priority=0)

	public void ADD_Discount_Reasons() throws InterruptedException {


	Faker fk = new Faker();
    String designation = fk.job().title();
	String Name=fk.name().name();
	 String first = fk.letterify("?"); // Generates a random letter
     int second = fk.random().nextInt(9);
    //String fakePhoneNumber = fk.phoneNumber().phoneNumber();
	String adress=fk.address().fullAddress();
	Thread.sleep(3000);
	
	WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[8]/ul/li[5]/a"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
	zz.executeScript("arguments[0].scrollIntoView()", svenext);
	Thread.sleep(4000);
	zz.executeScript("arguments[0].click()", svenext);
	Thread.sleep(4000);

	driver.findElement(By.xpath("//input[@formcontrolname='schemeName']")).sendKeys(Name+"_scheme");
	driver.findElement(By.xpath("//input[@formcontrolname='discountAmount']")).sendKeys("900");

	Thread.sleep(4000);
	List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
	WebElement FirstDropdown = dropdowns.get(0);
	WebElement secoendDropdown = dropdowns.get(1);
	//WebElement ThirdDropdown = dropdowns.get(2);
	FirstDropdown.click();
	List<WebElement> options = driver.findElements(By.cssSelector("mat-option"));

	for(WebElement option :options) {
		if(option.getText().equals("TRG-M")){
			option.click();
			break;
		}
	}

	Thread.sleep(4000);
	secoendDropdown.click();
	List<WebElement> optionss = driver.findElements(By.cssSelector("mat-option"));

	for(WebElement option :optionss) {
		if(option.getText().equals("Mumbai")){
			option.click();
			break;
		}
	}
	
	Thread.sleep(3000);
	zz.executeScript("window.scrollBy(0,500)");

	   DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd-MM-yyyy");

       // Get today's date
       LocalDate today = LocalDate.now();

       // Print today's date with the specified format
     //  System.out.println("Today's Date: " + today.format(formatter)

       // Add 30 days to today's date
       LocalDate futureDate = today.plusDays(30);

       // Print the date after 30 days with the specified format
      // System.out.println("Date after 30 days: " + futureDate.format(formatter));

	driver.findElement(By.xpath("//input[@formcontrolname='startDate']")).sendKeys(today.format(formatter));
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@formcontrolname='iEndDate']")).sendKeys(futureDate.format(formatter));
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-discount-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div[5]/mat-checkbox/label/span[2]")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-discount-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div[5]/mat-checkbox/label/span[2]")).click();
	Thread.sleep(3000);
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-discount-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/button[1]/span[1]")).click();
	Thread.sleep(3000);
	zz.executeScript("window.scrollBy(0,-500)");
	driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
	Thread.sleep(3000);

	driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(Name+"_scheme");

	Assert.assertEquals( Name+"_scheme", driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-discount-reasons/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div[2]/div/div/table/tbody/tr[1]/td[1]")).getText() );

	
	}
}