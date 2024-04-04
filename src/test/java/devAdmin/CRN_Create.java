package devAdmin;


import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class CRN_Create extends Login {

	@Test
	public  void CRN() throws InterruptedException {
		 Thread.sleep(4000);
		 WebElement ele=driver.findElement(By.linkText("Classes"));
				   ele.click();
		   WebElement elee=driver.findElement(By.partialLinkText("Schedule"));
				   elee.click();
				   Assert.assertEquals("http://smax-staging.smax5.com/dpc/#/mis/classes/class-schedule", driver.getCurrentUrl());



		}
		
	}


