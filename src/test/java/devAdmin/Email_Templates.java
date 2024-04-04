package devAdmin;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Email_Templates extends Login {

	@Test(priority=1)
	public void ADDEmail_Templates() throws InterruptedException {

	Faker fk = new Faker();
    String name=fk.name().firstName();
    WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[10]/a"));
    JavascriptExecutor zz = (JavascriptExecutor) driver;
    zz.executeScript("arguments[0].scrollIntoView()", svenext);
    Thread.sleep(4000);
    zz.executeScript("arguments[0].click()", svenext);
    Thread.sleep(4000);
    
    driver.findElement(By.xpath("//input[@ng-reflect-name='SSubject']")).sendKeys(name);
    driver.findElement(By.xpath("//textarea[@formcontrolname='SDescription']")).sendKeys("abcdefghijklmno");
    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-email-templates/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
	
driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-email-templates/section/div/div[2]/div/div/div/mat-tab-group/mat-tab-header/div/div/div/div[2]")).click();
Thread.sleep(4000);
zz.executeScript("window.scrollBy(0,400)");
Thread.sleep(4000);

driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(name);
Thread.sleep(4000);

Assert.assertEquals( name, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-email-templates/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[2]")).getText() );

	}
	

}
