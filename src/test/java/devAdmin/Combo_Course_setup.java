package devAdmin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Combo_Course_setup extends Login{

	@Test (priority =0)
	public void ADD_Combo_Course() throws InterruptedException {

		
		Faker fk = new Faker();
        String fakeCourseNamee = fk.educator().course();
        String fakeCourseName = fakeCourseNamee.replace(" ", "");

        String first = fk.letterify("?"); // Generates a random letter
	    String second = fk.letterify("?");
   		Thread.sleep(3000);
   		Universal_methods UM=new Universal_methods();
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[7]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(4000);
	      driver.findElement(By.xpath("//input[@formcontrolname='comboCourseName']")).sendKeys(fakeCourseName);
	      driver.findElement(By.xpath("//input[@formcontrolname='ComboCourseCode']")).sendKeys(first+second);
	     // driver.findElement(By.xpath("//input[@formcontrolname='noOfCoursesCombo']")).sendKeys("3");
			Thread.sleep(4000);
			List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
			WebElement FirstDropdown = dropdowns.get(0);
		      zz.executeScript("window.scrollBy(0,300)");

			FirstDropdown.click();
driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[2]/span")).click();
Thread.sleep(3000);
driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/form/div[1]/div[6]/div[1]/div/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
Thread.sleep(3000);
		
//secoendDropdown.click();
			UM.dropdownselection(driver);
			Thread.sleep(3000);
		      zz.executeScript("window.scrollBy(0,300)");

driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/form/div[1]/div[6]/div[2]/div/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
Thread.sleep(3000);

UM.dropdownselection(driver);
			Thread.sleep(3000);

	      zz.executeScript("window.scrollBy(0,500)");
	      Thread.sleep(3000);

	      driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();

	  	List<WebElement> citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
	  	for(WebElement citycheckbox:citycheckboxs ) {
	  		if(citycheckbox.getText().equalsIgnoreCase("Select All")) {
	  			Thread.sleep(4000);
	  			citycheckbox.click();
	  		}
	  	}
	  			
	      driver.findElement(By.xpath("//*[@tabindex='-1']/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();

		    
		      Thread.sleep(3000);

	      driver.findElement(By.xpath("//input[@formcontrolname='franchisee']")).click();
	  	
			List<WebElement> francheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
			for(WebElement francheckbox:francheckboxs ) {
				if(francheckbox.getText().equalsIgnoreCase("Select All")) {
					Thread.sleep(4000);
					francheckbox.click();
				}
			}
		
		
		      driver.findElement(By.xpath("//*[@tabindex='-1']/app-franchisee-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
		    Thread.sleep(4000);

		    driver.findElement(By.xpath("//input[@formcontrolname='office']")).click();

			List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
			for(WebElement ofccheckbox:ofccheckboxs ) {
				if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
					Thread.sleep(4000);
					ofccheckbox.click();
				}
			}
			Thread.sleep(4000);
		      driver.findElement(By.xpath("//*[@tabindex='-1']/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
			Thread.sleep(3000);

		    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/div/form/div[2]/div/button/span[1]")).click();
		  //  Thread.sleep(7000);
		      zz.executeScript("window.scrollBy(0,-600)");
		  	WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
		      String popups = popup.getText();
			   Thread.sleep(3000);

			     // String backgroundColor = popup.getCssValue("background-color");
		            if (popups.contains(" Successfully ")) {
		            	
		            	System.out.println("Massage:"+ popups);
		      		  Thread.sleep(4000);

			  driver.findElement(By.xpath("//div[@tabindex='-1']")).click();
				Thread.sleep(8000);

				WebElement searchbox =  driver.findElement(By.xpath("//input[@aria-label='Search box']"));
				  zz.executeScript("arguments[0].scrollIntoView()", searchbox);
				  driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(fakeCourseName);
				Thread.sleep(3000);
				
				Assert.assertEquals( fakeCourseName, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr[1]/td[1]")).getText() );

		            }
		            else {
		            	System.out.println("Massage:"+ popups);
				          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

		            }
}
	
	
	@Test (priority =1)

	public void Search_Combo_Course() throws InterruptedException {
		
		WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[1]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(9000);
		
		driver.navigate().refresh();
		Thread.sleep(4000);
		WebElement ssvenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[1]/a"));
		//JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", ssvenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", ssvenext);
		Thread.sleep(9000);
		
		 driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
			Universal_methods UM=new Universal_methods();
driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[4]/div/button[1]/span[1]")).click();
 
Thread.sleep(5000);
	
String Ran=UM.Ramdom_Record(driver);
List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
WebElement FirstDropdown = dropdowns.get(0);
FirstDropdown.click();
List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

for(int j=0; j<=options.size()-1;j++) {
	if(Ran.equalsIgnoreCase(options.get(j).getText())) {
		options.get(j).click();
		break;
	}
}


driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-course/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/form/div[4]/div/button[1]/span[1]")).click();
		zz.executeScript("window.scrollBy(0,300)");
		Thread.sleep(5000);

		Assert.assertEquals( Ran, UM.First_Record_Of_Row(driver) );

	
	}

}