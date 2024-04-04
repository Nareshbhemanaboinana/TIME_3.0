package devAdmin;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

public class cratingnewapplicant   {
	public  WebDriver driver;
	
	@Test
	public void creatingnewapplication() throws InterruptedException {
        System.setProperty("webdriver.gecko.driver", "./Drivers//geckodriver.exe");
		WebDriver driver = new FirefoxDriver();
		driver.get("https://dev.syngymaxim.com/TIME_Web/#/admin/schllevel");
		driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    Thread.sleep(4000);
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-sidebar/div/aside/div/ul/li[10]/div/a/span")).click();
	    Thread.sleep(4000);
	    
	    driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[10]/ul/li[2]/a")).click();
	    
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-manage-staff/section/div/div[3]/div/div/div/div/div[1]/div/div[2]/ul/li[2]/div/img")).click();
	    Thread.sleep(4000);

	    driver.findElement(By.xpath("//input[@formcontrolname='name']")).sendKeys("Naresh");
	    driver.findElement(By.xpath("//input[@formcontrolname='loginName']")).sendKeys("Naresh.B");
	    driver.findElement(By.xpath("//*[@id=\"mat-select-12\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mat-select-14\"]")).click();
	    driver.findElement(By.xpath("//*[@id=\"mat-input-9\"]")).sendKeys("9949960330");
	    driver.findElement(By.xpath("//*[@id=\"mat-input-10\"]")).sendKeys("9949960330");
	    driver.findElement(By.xpath("//*[@id=\"mat-input-11\"]")).sendKeys("9949960330");
	    driver.findElement(By.xpath("//*[@id=\"mat-input-12\"]")).sendKeys("bheemanaboina@gmail.com");
	    driver.findElement(By.xpath("//*[@id=\"mat-input-13\"]")).sendKeys("bhemanaboina@time.com");
	    driver.findElement(By.xpath("//*[@id=\"mat-select-16\"]")).click();
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[11]/mat-form-field/div/div[1]/div[3]")).sendKeys("MCL");
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[12]/mat-form-field/div/div[1]/div[3]")).sendKeys("HYD");
	    driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-add-edit-manage-staff/section/div/div[2]/div/div/div/form/div[1]/div[13]/mat-form-field/div/div[1]/div[3]")).sendKeys("HYD");
	}

}
