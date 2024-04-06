package devAdmin;


import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Single_course extends Login1 {
	

	@Test (priority =0)
	public void ADD_Single_course() throws InterruptedException {

		
		Faker fk = new Faker();
        String fakeCourseName = fk.educator().course();
        String first = fk.letterify("?"); // Generates a random letter
	    String second = fk.letterify("?");
   		Thread.sleep(3000);
		driver.manage().timeouts().implicitlyWait(5, TimeUnit.SECONDS);

		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[16]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(11000);
		
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[1]/div[1]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(fakeCourseName);

		driver.findElement(By.xpath("//input[@formcontrolname='code']")).sendKeys(first+second);
		Thread.sleep(4000);

		List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
		WebElement FirstDropdown = dropdowns.get(0);
		//WebElement secoendDropdown = dropdowns.get(1);
		FirstDropdown.click();
		Thread.sleep(4000);
		Universal_methods UM=new Universal_methods();
		UM.dropdownselection(driver);
	Thread.sleep(4000);
	zz.executeScript("window.scrollBy(0,400)");
	Thread.sleep(4000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[4]/div[1]/mat-form-field/div/div[1]/div[3]/input[1]")).click();
	Thread.sleep(4000);

	
	
	List<WebElement> citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
	for(WebElement citycheckbox:citycheckboxs ) {
		if(citycheckbox.getText().equalsIgnoreCase("Select All")) {
			Thread.sleep(4000);
			citycheckbox.click();
		}
	}

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-city-combo-course/mat-dialog-actions/div/div/button[1]")).click();
	Thread.sleep(6000);

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[4]/div[2]/mat-form-field/div/div[1]/div[3]/input")).click();
Thread.sleep(4000);

		
		
		List<WebElement> francheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement francheckbox:francheckboxs ) {
			if(francheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				francheckbox.click();
			}
		}

driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]")).click();
		Thread.sleep(6000);
			zz.executeScript("window.scrollBy(0,200)");
			Thread.sleep(4000);
driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[4]/div[3]/mat-form-field/div/div[1]/div[3]/input")).click();
Thread.sleep(4000);

			List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
			for(WebElement ofccheckbox:ofccheckboxs ) {
				if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
					Thread.sleep(4000);
					ofccheckbox.click();
				}
			}
		driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/mat-dialog-container/app-office-combo-course/mat-dialog-actions/div/div/button[1]")).click();
			Thread.sleep(6000);
				Thread.sleep(4000);

				driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]")).click();
					zz.executeScript("window.scrollBy(0,-400)");
				Thread.sleep(4000);
				WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
			      String popups = popup.getText();

				     // String backgroundColor = popup.getCssValue("background-color");
			            if (popups.contains(" Successfully ")) {
			            	System.out.println("Massage:"+ popups);


				 WebElement Tab= driver.findElement(By.xpath("//div[@tabindex='-1']"));
				 Tab.click();
					Thread.sleep(8000);
					zz.executeScript("window.scrollBy(0,400)");
					Thread.sleep(4000);
					 
				 driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys( first+second);
					Thread.sleep(3000);
					 driver.findElement(By.xpath("//input[@aria-label='Search box']")).click();
						Thread.sleep(3000);

					Assert.assertEquals( first+second, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-single-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[2]")).getText() );

			            }
			            else {
			            	System.out.println("Massage:"+ popups);
					          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

			            }

				  
	}
	
	@Test (priority =1)

	public void Search_Single_course() throws InterruptedException {
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[17]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(6000);
		 driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
			Universal_methods UM=new Universal_methods();

		      Thread.sleep(3000);
		      UM.RadioButtons(driver, "Active");
		      Thread.sleep(3000);

		        WebElement searchButton = driver.findElement(By.xpath("//button[@type='submit'][1]"));
		        searchButton.click();
			      Thread.sleep(3000);

 
Thread.sleep(19000);
	
String Ran=UM.Ramdom_Record(driver);
		driver.findElement(By.name("Course")).sendKeys(Ran);
	      Thread.sleep(3000);

        searchButton.click();
		zz.executeScript("window.scrollBy(0,300)");
		Thread.sleep(19000);

		Assert.assertEquals( Ran, UM.First_Record_Of_Row(driver) );

	
	}

		
	}