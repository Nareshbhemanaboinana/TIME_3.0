package devAdmin;




import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;



public class Login1 {
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
		Thread.sleep(4000);
		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-signin/div/div[2]/div[2]/div/form/mat-form-field[1]/div/div[1]/div[3]/input")).sendKeys("SU");
		Thread.sleep(4000);

		driver.findElement(By.xpath("/html/body/app-root/app-auth-layout/app-signin/div/div[2]/div[2]/div/form/mat-form-field[2]/div/div[1]/div[3]/input")).sendKeys("test@1231");
		Thread.sleep(4000);

		driver.findElement(By.xpath("//button[@type='submit']")).click();
		Thread.sleep(29000);
	}
		 

		
	@AfterMethod()
	public void teardown() {
		driver.quit();
	}	 
	
}
	
	


