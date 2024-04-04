package devAdmin;



import org.openqa.selenium.By;

import org.openqa.selenium.WebElement;




import org.testng.annotations.Test;

public class CRN_Search extends Login {
	
		
		

	
	@Test
	public void CRNSearch() throws InterruptedException {
	
  Thread.sleep(4000);
 WebElement ele=driver.findElement(By.linkText("Classes"));
		   ele.click();
   WebElement elee=driver.findElement(By.partialLinkText("Schedule"));
		   elee.click();
			//driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-class-schedule/section/div[1]/div[3]/div/div/div/div/div[1]/div/div[2]/ul/li[2]/div/button/span[1]/mat-icon")).click();
			//Select Acadamicyear=new Select(driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-class-schedule/section/div[1]/div[2]/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select")));
			//List<WebElement> options=Acadamicyear.getOptions();
			WebElement selectElement = driver.findElement(By.cssSelector("mat-select"));
			selectElement.click();
			Thread.sleep(5000);

			WebElement optionElement = driver.findElement(By.xpath("//mat-option/span[text()='2022 - 2023 ']"));
			
			optionElement.click();
			
			WebElement selectElement1 = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-class-schedule/section/div[1]/div[2]/div/form/div[1]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select"));
			selectElement1.click();
			Thread.sleep(5000);
			WebElement optionElement1 = driver.findElement(By.xpath("//mat-option/span[text()='Summer 2022-2023 ']"));
			optionElement1.click();
			WebElement selectElement2 = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-class-schedule/section/div[1]/div[2]/div/form/div[2]/div[1]/mat-form-field/div/div[1]/div[3]/mat-select"));
			selectElement2.click();
			Thread.sleep(5000);
			WebElement optionElement2 = driver.findElement(By.xpath("//mat-option/span[text()='Capstone Project ']"));

			optionElement2.click();
			WebElement selectElement3 = driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-class-schedule/section/div[1]/div[2]/div/form/div[2]/div[2]/mat-form-field/div/div[1]/div[3]/mat-select"));
			selectElement3.click();
			Thread.sleep(5000);
			WebElement optionElement3 = driver.findElement(By.xpath("//mat-option/span[text()='Capstone Project  ']"));

			optionElement3.click();
			Thread.sleep(5000);

			driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-class-schedule/section/div[1]/div[2]/div/form/div[3]/button/span[1]")).click();

			
          
		}





		
			
	}


