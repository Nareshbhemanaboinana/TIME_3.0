package devAdmin;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import Components.Universal_methods;

public class Combo_SubCourse extends Login1{

	@Test(priority=0)
	public void ADD_Combo_SubCourse() throws InterruptedException {

	Faker fk = new Faker();
    String courseName = fk.educator().course();
//	String coursecode = fk.code().asin();
	  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[12]/ul/li[8]/a"));
	    JavascriptExecutor zz = (JavascriptExecutor) driver;
	    zz.executeScript("arguments[0].scrollIntoView()", svenext);
	    Thread.sleep(4000);
	    zz.executeScript("arguments[0].click()", svenext);
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@formcontrolname='csubcourse']")).sendKeys(courseName);

	    
	    List<WebElement> dropdowns = driver.findElements(By.cssSelector("mat-select"));
		WebElement FirstDropdown = dropdowns.get(0);
		WebElement secoendDropdown = dropdowns.get(1);
		//WebElement ThirdDropdown = dropdowns.get(2);
		Thread.sleep(3000);

		FirstDropdown.click();
		Thread.sleep(3000);
		 Universal_methods UM=new Universal_methods();
		    UM.dropdownselection(driver);
		    
		    driver.findElement(By.xpath("//input[@formcontrolname='yearcode']")).sendKeys("24");

		    secoendDropdown.click();
			Thread.sleep(3000);
			 List<WebElement> Options = driver.findElements(By.cssSelector("mat-option"));
		        // Loop through the options to find the desired one
		        for (WebElement option : Options) {
		            if (option.getText().equals("2")) {
		                // Click on the desired option
		                option.click();
		                break; // Exit the loop once the desired option is found and clicked
		            }
		        }
				Thread.sleep(3000);
			    zz.executeScript("window.scrollBy(0,500)");
				Thread.sleep(3000);

		        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-subcourse/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div[1]/div/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
				Thread.sleep(3000);
 
		       UM.dropdownselection(driver);
				Thread.sleep(3000);

		       driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-subcourse/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div[1]/div/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				Thread.sleep(3000);

		       List<WebElement> Option1s = driver.findElements(By.cssSelector("mat-option"));
		        // Loop through the options to find the desired one
		        for (WebElement option : Option1s) {
		            if (option.getText().equals("MBA")) {
		                // Click on the desired option
		                option.click();
		                break; // Exit the loop once the desired option is found and clicked
		            }
		        }
				Thread.sleep(3000);

		        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-subcourse/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div[1]/div/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]/div")).click();
				Thread.sleep(3000);

		        List<WebElement> Option2s = driver.findElements(By.cssSelector("mat-option"));
		        // Loop through the options to find the desired one
		        for (WebElement option : Option2s) {
		            if (option.getText().equals("Finance")) {
		                // Click on the desired option
		                option.click();
		                break; // Exit the loop once the desired option is found and clicked
		            }
		        }
				Thread.sleep(3000);

		        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-subcourse/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div[2]/div/div/div[1]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				Thread.sleep(3000);

		        List<WebElement> Option3s = driver.findElements(By.cssSelector("mat-option"));
		        // Loop through the options to find the desired one
		        for (WebElement option : Option3s) {
		            if (option.getText().equals("MBA")) {
		                // Click on the desired option
		                option.click();
		                break; // Exit the loop once the desired option is found and clicked
		            }
		        }
				Thread.sleep(3000);

		        driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-subcourse/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/div[3]/div[2]/div/div/div[2]/mat-form-field/div/div[1]/div[3]/mat-select/div/div[2]")).click();
				Thread.sleep(3000);

		        List<WebElement> Option4s = driver.findElements(By.cssSelector("mat-option"));
		        // Loop through the options to find the desired one
		        for (WebElement option : Option4s) {
		            if (option.getText().equals("HR")) {
		                // Click on the desired option
		                option.click();
		                break; // Exit the loop once the desired option is found and clicked
		            }
		        }
		/*		List<WebElement> options=driver.findElements(By.cssSelector("mat-option"));

		for(int j=0; j<=options.size()-1;j++) {
			options.get(j).click();
			secoendDropdown.click();
			Thread.sleep(3000);
	  		List<WebElement> secooptions=driver.findElements(By.cssSelector("mat-option"));

			     if(secooptions.size()==1)  {
			 		Thread.sleep(3000);
			    	//driver.navigate().refresh();
			  	WebElement secoendtime=driver.findElement(By.cssSelector("mat-option"));
			 		Thread.sleep(3000);
			 		secoendtime.click();
			 		Thread.sleep(3000);
			 		FirstDropdown.click();

			 				}
			     
			      else {

			    	  for(int k=1; k<=secooptions.size()-1;k++) {
				    		 secooptions.get(k).click();
				    			Thread.sleep(3000);

				    		break;


	     }
			    		break;

					
				}

		}	
		

		ThirdDropdown.click();
		Thread.sleep(5000);
	    Universal_methods UM=new Universal_methods();
	    UM.dropdownselection(driver);
		Thread.sleep(5000);
*/

	  //  ThirdDropdown.click();
	    
	    zz.executeScript("window.scrollBy(0,500)");
	    Thread.sleep(4000);
		driver.findElement(By.xpath("//input[@formcontrolname='city']")).click();
		Thread.sleep(4000);

		
		
		List<WebElement> citycheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
		for(WebElement citycheckbox:citycheckboxs ) {
			if(citycheckbox.getText().equalsIgnoreCase("Select All")) {
				Thread.sleep(4000);
				citycheckbox.click();
			}
		}
		Thread.sleep(4000);

			driver.findElement(By.xpath("//*[@tabindex='-1']/app-city-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
			Thread.sleep(4000);

			driver.findElement(By.xpath("//input[@formcontrolname='franchisee']")).click();
			Thread.sleep(4000);

			
			
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
				Thread.sleep(4000);

				List<WebElement> ofccheckboxs =driver.findElements(By.cssSelector("mat-checkbox"));
				for(WebElement ofccheckbox:ofccheckboxs ) {
					if(ofccheckbox.getText().equalsIgnoreCase("Select All")) {
						Thread.sleep(4000);
						ofccheckbox.click();
					}
				}
				
				driver.findElement(By.xpath("//*[@tabindex='-1']/app-office-combo-course/mat-dialog-actions/div/div/button[1]/span[1]")).click();
					Thread.sleep(4000);

					
		 WebElement submitbutton =driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-subcourse/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[1]/div/form/button/span[1]"));
		 //zz.executeScript("arguments[0].scrollIntoView()", submitbutton);
		    Thread.sleep(4000);
		    zz.executeScript("arguments[0].click()", submitbutton);
		  
		  	WebElement popup =driver.findElement(By.xpath("//span[@class='mat-simple-snack-bar-content']"));
		      String popups = popup.getText();
				Thread.sleep(3000);

			     // String backgroundColor = popup.getCssValue("background-color");
		            if (popups.contains(" Successfully ")) {
		            	
		            	System.out.println("Massage:"+ popups);
		 
		    Thread.sleep(4000);
		   

		    zz.executeScript("window.scrollBy(0,-500)");
		    Thread.sleep(4000);

		    driver.findElement(By.xpath("//div[@tabindex=\"-1\"]")).click();
		    Thread.sleep(4000);
		    zz.executeScript("window.scrollBy(0,400)");
		    Thread.sleep(8000);

		    driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(courseName);
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//input[@aria-label='Search box']")).clear();
		    Thread.sleep(4000);
		    driver.findElement(By.xpath("//input[@aria-label='Search box']")).sendKeys(courseName);
		    Thread.sleep(4000);
		    Assert.assertEquals( courseName, driver.findElement(By.xpath("/html/body/app-root/app-main-layout/app-combo-subcourse/section/div/div[2]/div/div/div/mat-tab-group/div/mat-tab-body[2]/div/div/div/table/tbody/tr/td[1]")).getText() );

		            }
		            else {
		            	System.out.println("Massage:"+ popups);
				          throw new RuntimeException("Test failed because the popup message did not contain 'Successfully'.");

		            }
	}

	@Test(priority=1)

	public void Search_Combo_SubCourse() throws InterruptedException {
		
		
		  WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[9]/a"));
		JavascriptExecutor zz = (JavascriptExecutor) driver;
		zz.executeScript("arguments[0].scrollIntoView()", svenext);
		Thread.sleep(4000);
		zz.executeScript("arguments[0].click()", svenext);
		Thread.sleep(9000);

		driver.navigate().refresh();
		//Thread.sleep(4000);

		 // WebElement svenext = driver.findElement(By.xpath("//*[@id=\"leftsidebar\"]/div/ul/li[11]/ul/li[9]/a"));
		//JavascriptExecutor zz = (JavascriptExecutor) driver;
		//zz.executeScript("arguments[0].scrollIntoView()", svenext);
		//Thread.sleep(4000);
		//zz.executeScript("arguments[0].click()", svenext);
		
		
		 driver.findElement(By.xpath("//div[@tabindex='-1']")).click();

	
		
		    Universal_methods UM=new Universal_methods();

	      Thread.sleep(5000);

     driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
		String record=UM.Ramdom_Record(driver);
	    driver.findElement(By.xpath("//input[@formcontrolname='csubcourse']")).sendKeys(record);
		Thread.sleep(4000);
	     driver.findElement(By.xpath("//button[@type='submit'][1]")).click();
	      zz.executeScript("window.scrollBy(0,300)");
	
	     Assert.assertEquals( record, UM.First_Record_Of_Row(driver) );

		
	}



}
