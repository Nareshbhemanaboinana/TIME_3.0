package Masters;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;
import devAdmin.Login;

public class Re_Enrollment_Fees extends Login  {

	
	@Test
	public void Re_Enrollment_Fees_Adding() throws InterruptedException {
		Faker fk = new Faker();
		  Actions actions = new Actions(driver);
			Universal_methods UM=new Universal_methods ();

		String optionText2 = "RTGS";
		   String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
		    String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
		    String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
		    String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
		    String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string

		    driver.navigate().refresh();
		    WebElement subpymntcmsalnc = driver.findElement(By.xpath("//a[@href='#/payments/campuspayment-updatefee']"));
			JavascriptExecutor zz = (JavascriptExecutor) driver;
			zz.executeScript("arguments[0].scrollIntoView()", subpymntcmsalnc);
			Thread.sleep(5000);
			zz.executeScript("arguments[0].click()", subpymntcmsalnc);
			Thread.sleep(3000);

			driver.findElement(By.xpath("//input[@formcontrolname='cGroupCode']")).sendKeys("HAN");
			Thread.sleep(3000);
		    zz.executeScript("window.scrollBy(0,600)");

			Thread.sleep(3000);
             //actions.sendKeys(Keys.TAB).perform();
				//Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[3]/button/span[1]")).click();
				Thread.sleep(3000);
			    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[1]/div/div/div/form/div[3]/button/span[1]")).click();
				Thread.sleep(3000);

			    driver.findElement(By.cssSelector("mat-select[formcontrolname='type']")).click();
				Thread.sleep(3000);

			   UM.selectOptionByText(driver, "Cash"); 
				Thread.sleep(3000);

			String scndndinstallmnt=   driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/div/div/div/div/div/table/tbody/tr[2]/td[2]")).getText();
			Thread.sleep(3000);
	
			driver.findElement(By.xpath("//input[@formcontrolname='amount']")).sendKeys(scndndinstallmnt);
			Thread.sleep(3000);

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-campuspayment-updatefee/section/div/div[2]/div/div/div/mat-vertical-stepper/div[2]/div/div/div/form/div[2]/button[2]/span[1]")).click();
				Thread.sleep(3000);
			    zz.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);

			//	driver.findElement(By.xpath("//h5[text()=' Student Signed On Rules & Regulations ']")).click();
			//	Thread.sleep(3000);

		        WebElement textElement = driver.findElement(By.xpath("//mat-label[contains(text(), 'Validation No ')]"));

				Thread.sleep(3000);

		        actions.doubleClick(textElement).perform();

				Thread.sleep(3000); 

	            actions.keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).perform();
				Thread.sleep(3000); 

 			//String validno=driver.findElement(By.xpath("//input[@formcontrolname='vNum1']")).getText();
			//Thread.sleep(3000); 

 			WebElement  subvalidationNo =driver.findElement(By.xpath("//input[@formcontrolname='vNum2']"));
			Thread.sleep(3000);

 			subvalidationNo.sendKeys(Keys.CONTROL + "v");
			Thread.sleep(3000);
		    zz.executeScript("window.scrollBy(0,600)");

			Thread.sleep(3000);
          
		    driver.findElement(By.xpath("//span[text()=' Preview ']")).click();
		    Thread.sleep(3000);
		    zz.executeScript("window.scrollBy(0,600)");

			Thread.sleep(3000);
			Thread.sleep(3000);
		    zz.executeScript("window.scrollBy(0,600)");

			Thread.sleep(3000);
		    driver.findElement(By.xpath("//span[text()=' Save and Do not Print ']")).click();

          

	}
}
