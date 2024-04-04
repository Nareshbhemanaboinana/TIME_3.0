package Masters;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.Test;

import devAdmin.Login;

public class Re_Enrollment_Fees extends Login {

	
	@Test
	public void Re_Enrollment_Fees_Adding() throws InterruptedException {
	
	    //WebDriverWait wait = new WebDriverWait(driver, 10); // Adjust timeout as needed
        //WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("/html/body/div[3]/div/div/snack-bar-container/div/div/simple-snack-bar/span")));
		 // WebElement successMessageElement = driver.findElement(By.xpath("//div[@style='visibility: hidden;']"));
		    WebDriverWait wait = new WebDriverWait(driver, 8); // Adjust timeout as needed
	        WebElement popup = wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='mat-simple-snack-bar-content']")));

	        // Extract the text content of the success message
	        String popups = popup.getText();

	        // Print the success message
	        System.out.println("Success message: " + popups);
	      
	        String color = popup.getCssValue("color");

	        System.out.println("Success message color : " + color);

        // Extract the text content from the popup
       // String popupText = popup.getText();
		//System.out.println(popupText);

        driver.close();
     //String massage=driver.findElement(By.id("PING_IFRAME_FORM_DETECTION")).getText();
	}
}
