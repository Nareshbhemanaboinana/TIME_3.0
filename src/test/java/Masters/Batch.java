package Masters;

import java.sql.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.Calendar;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import devAdmin.Login;

public class Batch extends Login {

	
	@Test
	public void ADD_Batch() throws InterruptedException {
		Faker fk = new Faker();
		   String Name = fk.name().firstName();
		    
			  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[8]/ul/li[1]/a"));
				JavascriptExecutor zz = (JavascriptExecutor) driver;
				zz.executeScript("arguments[0].scrollIntoView()", svenext);
				Thread.sleep(5000);
				zz.executeScript("arguments[0].click()", svenext);
				Thread.sleep(6000);
			      driver.findElement(By.xpath("//input[@formcontrolname='sName']")).sendKeys(Name+"_Batch");
			      driver.findElement(By.xpath("//input[@formcontrolname='sCode']")).sendKeys(Name);

			  	
			  	List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
			  	WebElement FirstDropdown = dropdowns.get(0);
			  	WebElement secoendDropdown = dropdowns.get(1);
			  	WebElement ThirdDropdown = dropdowns.get(2);
			  	WebElement fourDropdown = dropdowns.get(3);
			  	WebElement fiveDropdown = dropdowns.get(4);
			  	WebElement sixDropdown = dropdowns.get(5);

			  	FirstDropdown.click();
			  	Thread.sleep(3000);
			  	List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

			
			  	for(int i=1; i<=options.size()-1;i++) {
			  		options.get(i).click();
			  		break;
			  	}
			  	
			  	String Franchise=FirstDropdown.getText();
	System.out.println("Franchisee:"+Franchise);

	secoendDropdown.click();
	  	Thread.sleep(3000);
	  	List<WebElement> options0=driver.findElements(By.cssSelector("mat-option"));

		for(int i=1; i<=options0.size()-1;i++) {
			options0.get(i).click();
	  		break;
	  	}  	
	  	String Office =secoendDropdown.getText();
	  	System.out.println("Office:"+Office);

		ThirdDropdown.click();
		Thread.sleep(3000);

		List<WebElement> options00=driver.findElements(By.cssSelector("mat-option"));

		for(int i=1; i<=options00.size()-1;i++) {
			options00.get(i).click();
	  		break;
	  	}  
		fourDropdown.click();
		Thread.sleep(3000);
		List<WebElement> options000=driver.findElements(By.cssSelector("mat-option"));

		for(int i=1; i<=options000.size()-1;i++) {
			options000.get(i).click();
	  		break;
	  	} 
		String course=ThirdDropdown.getText();
	  	String subcourse =fourDropdown.getText();
	System.out.println("course:"+course);
	System.out.println("subcourse:"+subcourse);
	zz.executeScript("window.scrollBy(0,400)");
	Thread.sleep(5000);
	// Get today's date
	DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
	Date today = new  Date(0);
	String todayDate = dateFormat.format(today);
	//System.out.println("Today's date: " + todayDate);

	// Add 30 days to today's date
	Calendar calendar = Calendar.getInstance();
	calendar.setTime(today);
	calendar.add(Calendar.DATE, 30);
	Date after30Days = (Date) calendar.getTime();
	String after30DaysDate = dateFormat.format(after30Days);
	//System.out.println("Date after 30 days: " + after30DaysDate);

	driver.findElement(By.xpath("//input[@formcontrolname='sBatchStartDate']")).sendKeys(todayDate);

			
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@formcontrolname='sBatchFinishDate']")).sendKeys(after30DaysDate);
	   
	    

			
	//driver.findElement(By.xpath("//input[@formcontrolname='sBatchFinishDate']")).sendKeys(formattedFutureDate);
	//driver.findElement(By.xpath("//input[@formcontrolname='sBatchStartDate']")).sendKeys(formattedToday);

	fiveDropdown.click();
		List<WebElement> options090=driver.findElements(By.cssSelector("mat-option"));

		for(int j=4; j<=options090.size()-1;j++) {
			options090.get(j).click();

			break;
		}
	Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[2]/div[3]/mat-checkbox/label/span[1]")).click();

		driver.findElement(By.xpath("//input[@formcontrolname='iMinimumCapacity']")).sendKeys("40");
		driver.findElement(By.xpath("//input[@formcontrolname='iMaximumCapacity']")).sendKeys("100");
		//driver.findElement(By.xpath("//input[@formcontrolname='iMaximumCapacity']")).sendKeys("100");
		driver.findElement(By.xpath("//input[@formcontrolname='iPreferredCapacity']")).sendKeys("60");
		sixDropdown.click();
	    List<WebElement> mmmatOptions = driver.findElements(By.cssSelector("mat-option"));
	    // Loop through the options to find the desired one
	    for (WebElement option : mmmatOptions) {
	        if (option.getText().equals("2024")) {
	            // Click on the desired option
	            option.click();
	            break; // Exit the loop once the desired option is found and clicked
	        }
	    }
		Thread.sleep(3000);


		driver.findElement(By.xpath("//input[@formcontrolname='fFullPaymentAmount']")).sendKeys("1500");
		driver.findElement(By.xpath("//input[@formcontrolname='iMaxInstallments']")).sendKeys("2");
		Thread.sleep(3000);

		zz.executeScript("window.scrollBy(0,500)");
		Thread.sleep(3000);

	driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/mat-tab-group/div/mat-tab-body/div/div/table/tbody/tr[1]/td[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(todayDate);

			
		
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div/mat-tab-group/div/mat-tab-body/div/div/table/tbody/tr[2]/td[3]/mat-form-field/div/div[1]/div[3]/input")).sendKeys(after30DaysDate);
		Thread.sleep(3000);

		driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-batch/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[4]/div/button[1]/span[1]")).click();
		Thread.sleep(3000);
	}
}
