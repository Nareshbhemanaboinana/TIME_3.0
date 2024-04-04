package Components;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import com.github.javafaker.Faker;

public class practice {

	static WebDriver driver;
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./driver//chromedriver.exe");
		 driver=new ChromeDriver();
		driver.get("https://smax-staging.smax5.com/dpc/#/admissions/applicationchecklist/52fcb25e4695bec6");
		driver.manage().window().maximize();

    	WebElement ctry=driver.findElement(By.cssSelector("mat-select"));
    	ctry.click();
    	Thread.sleep(3000);
    	driver.findElement(By.xpath("/html/body/div[2]/div[2]/div/div/div/mat-option[1]/span")).click();
	}

}
