package Masters;

import org.sikuli.script.FindFailed;
import org.testng.annotations.Test;

import com.github.javafaker.Faker;

import devAdmin.Login;
@Test
public class Combo_Course_Batch {

	@Test
	public void all_Paymets () throws FindFailed, InterruptedException {
		
		Faker fk = new Faker();
	      String chequeNumber = fk.number().digits(8); // Example: Generate an 8-digit number
	        String ackNumber = fk.number().digits(10); // Example: Generate a 10-digit number
	        String neftReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	        String rtgsReferenceNumber = fk.regexify("[A-Z0-9]{10}"); // Example: Generate a 10-character alphanumeric string
	        String referenceNumber = fk.regexify("[A-Z0-9]{12}"); // Example: Generate a 12-character alphanumeric string

	        
	        System.out.println(ackNumber);
	}
	

}
