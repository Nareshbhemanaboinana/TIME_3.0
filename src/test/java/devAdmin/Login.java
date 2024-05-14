package devAdmin;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Login {
	public  WebDriver driver;

	
	@BeforeMethod
    public void TEEMSLOGIN() throws InterruptedException {
		
		//System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
		 
		System.setProperty("webdriver.chrome.driver", "./SSD//chromedriver.exe");
 
	         driver = new ChromeDriver();
	     driver.get("https://dev.syngymaxim.com/TIME_Web/#/admin/schllevel");
		driver.manage().window().maximize();
        driver.navigate().refresh();

		driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverWait wait = new WebDriverWait(driver, 20);

	WebElement  Login= 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='username']")));
	Login.sendKeys("Jodpur");
		WebElement  pswd= 	wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//input[@formcontrolname='password']")));

		pswd.sendKeys("Jodpur@123");
		WebElement  Submit= wait.until(ExpectedConditions.elementToBeClickable(By.xpath("//button[@type='submit']")));
		Submit.click();
		Thread.sleep(5000);
	}

	/*
	
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}	 
	
	*/
	
}
	
	


