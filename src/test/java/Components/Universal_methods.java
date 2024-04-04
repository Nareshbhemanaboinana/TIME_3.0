package Components;

import java.io.File;
import java.io.FileOutputStream;
import java.io.PrintStream;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.PageFactory;

import devAdmin.Login;

public class Universal_methods    {

	public  WebDriver driver;

   

	public  String  Ramdom_Record( WebDriver rdriver ) throws InterruptedException {
		
		Thread.sleep(6000);
		 driver=rdriver;
			PageFactory.initElements(rdriver, this);

		WebElement myTable=driver.findElement(By.xpath("//table[@role='table']"));
		
		List<WebElement> trs=myTable.findElements(By.tagName("tr"));
		int d=(int)(Math.random()*((trs.size()-1)-1+1)+(1));
			
			List<WebElement> tds= trs.get(d).findElements(By.tagName("td"));
			for(int j=0; j<=tds.size()-1;j++) {
			//String statename1 =tds.get(0).getText();
			break;
		}
			return tds.get(0).getText();
	}

	public  String  First_Record_Of_Row( WebDriver rdriver ) throws InterruptedException {
		Thread.sleep(6000);
		 driver=rdriver;
			PageFactory.initElements(rdriver, this);
			WebElement myTable=driver.findElement(By.xpath("//table[@role='table']"));
			
			List<WebElement> trs=myTable.findElements(By.tagName("tr"));
				
				List<WebElement> tds= trs.get(1).findElements(By.tagName("td"));
				for(int j=0; j<=tds.size()-1;j++) {
				//String statename1 =tds.get(0).getText();
				break;
			}
				return tds.get(0).getText();
		}
	
	public  String  dropdownselection( WebDriver rdriver ) throws InterruptedException {
		Thread.sleep(3000);
		 driver=rdriver;
			PageFactory.initElements(rdriver, this);
		
		List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));
		int d=(int)(Math.random()*(options.size()-1-1+1)+(1));

		for(int j=0; j<=options.size()-1;j++) {

			options.get(d).click();
		break;
		}
		return null;
		
		
		
	}
	
		
	public  String RadioButtons(WebDriver rdriver, String label) throws InterruptedException {
			Thread.sleep(3000);
			 driver=rdriver;
				PageFactory.initElements(rdriver, this);
		
		   // Find the radio group element
	        WebElement radioGroup = driver.findElement(By.className("mat-radio-group"));

	        // Find all radio buttons within the radio group
	        java.util.List<WebElement> radioButtons = radioGroup.findElements(By.className("mat-radio-button"));

	        // Loop through the radio buttons and click the specified radio button
	        for (WebElement radioButton : radioButtons) {
	            String labelContent = radioButton.findElement(By.className("mat-radio-label-content")).getText();
	            if (labelContent.equals(label)) {
	                radioButton.click();
	                break; // Break the loop after clicking the specified radio button
	            }
	       
	        }
			return null;

	   }
	   
	 private static void redirectConsoleToFile(String filePath) {
	        try {
	            File logFile = new File(filePath);
	            if (!logFile.exists()) {
	                logFile.createNewFile();
	            }
	            FileOutputStream fos = new FileOutputStream(logFile);
	            PrintStream ps = new PrintStream(fos);
	            System.setOut(ps);
	            System.setErr(ps);
	        } catch (Exception e) {
	            e.printStackTrace();
	        }
	    
	
	


}
}
