package Masters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import devAdmin.Login;

public class Source extends Login {
	
	@Test (priority =0)
	public void ADD_Source() throws InterruptedException {
	Faker fk = new Faker();
	String name = fk.name().firstName();
	Thread.sleep(3000);
	
	WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[9]/ul/li[7]/a"));
	JavascriptExecutor zz = (JavascriptExecutor) driver;
	zz.executeScript("arguments[0].scrollIntoView()", svenext);
	Thread.sleep(4000);
	zz.executeScript("arguments[0].click()", svenext);
	Thread.sleep(4000);
	
	driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(name);
	// Assuming you are using WebDriver and have found the root element
	WebElement rootElement = driver.findElement(By.tagName("body"));

	// Use XPath to locate the "Save" button by visible text
	WebElement saveButton = rootElement.findElement(By.xpath("//button[contains(@class, 'teams-primary') and contains(text(), 'Save')]"));
	saveButton.click();
	

	
	driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
	Thread.sleep(4000);

	

	WebElement button = driver.findElement(By.xpath("//button[@type=\"button\"][9]"));
	zz.executeScript("arguments[0].scrollIntoView()", button);
	Thread.sleep(4000);
	zz.executeScript("arguments[0].click()", button);
	Thread.sleep(4000);
	
}
}