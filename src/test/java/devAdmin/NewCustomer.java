package devAdmin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

public class NewCustomer extends  Login{
	@Test
	public void newcus() throws InterruptedException {
		driver.findElement(By.linkText("New Customer")).click();
		Thread.sleep(4000);
		
	
		WebElement frameElement = driver.findElement(By.xpath("/html/ins/div/iframe")); // Locate the first iframe element
		driver.switchTo().frame(frameElement);
		
		WebElement frameElement1 = driver.findElement(By.xpath("/html/body/div/div/div[2]/iframe")); // Locate the first iframe element
		driver.switchTo().frame(frameElement1);

			Thread.sleep(4000);
			driver.findElement(By.id("dismiss-button")).click();
			
			driver.switchTo().defaultContent(); 
			
			Faker fk=new Faker();
			String s=fk.name().firstName();
			String add=fk.address().fullAddress();
			String city=fk.address().city();
			String state=fk.address().state();
			String email=fk.internet().emailAddress();
			
			
			driver.findElement(By.name("name")).sendKeys(s);
			driver.findElement(By.xpath("/html/body/table/tbody/tr/td/table/tbody/tr[5]/td[2]/input[2]")).click();
			driver.findElement(By.name("dob")).sendKeys("28-07-1994");
			driver.findElement(By.name("addr")).sendKeys(add);
			driver.findElement(By.name("city")).sendKeys(city);
			driver.findElement(By.name("state")).sendKeys(state);
			driver.findElement(By.name("pinno")).sendKeys("422326");
			driver.findElement(By.name("emailid")).sendKeys(email);
			driver.findElement(By.name("telephoneno")).sendKeys("08010012233");
			driver.findElement(By.name("sub")).click();
			
			driver.navigate().back();

		
			
		
	}

}
