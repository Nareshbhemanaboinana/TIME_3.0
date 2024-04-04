package Masters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;
import com.github.javafaker.Job;

import devAdmin.Login;

public class Designation extends Login {


	@Test(priority=0)

	public void ADD_Designation() throws InterruptedException {


	Faker fk = new Faker();
    String designation = fk.job().title();
	//String franchisee=fk.name().name();
	 String first = fk.letterify("?"); // Generates a random letter
     int second = fk.random().nextInt(9);
    //String fakePhoneNumber = fk.phoneNumber().phoneNumber();
	String adress=fk.address().fullAddress();
	Thread.sleep(3000);
	
	WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[8]/ul/li[10]/a"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
	zz.executeScript("arguments[0].scrollIntoView()", svenext);
	Thread.sleep(4000);
	zz.executeScript("arguments[0].click()", svenext);
	Thread.sleep(4000);
	driver.findElement(By.xpath("//input[@formcontrolname='sDesignation']")).sendKeys(designation);
	
	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-designation/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/form/div[2]/div/button[1]/span[1]")).click();
	driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(designation);

	Assert.assertEquals( designation, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-designation/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[1]")).getText() );

	
	}
}
