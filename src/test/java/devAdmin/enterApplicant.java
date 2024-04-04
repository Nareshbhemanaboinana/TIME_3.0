package devAdmin;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class enterApplicant extends Login  {
	
	@Test
	 public void DP()
	 {
		 driver.findElement(By.id("menu-my-applications")).click();
	 }
}
