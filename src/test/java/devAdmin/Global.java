package devAdmin;


public class Global  {
	
	 public static void main(String args[]) throws InterruptedException {
	/*System.setProperty("webdriver.chrome.driver", "./driver//chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
	driver.manage().window().maximize();
	

Thread.sleep(5000);
	String usid=driver.findElement(By.cssSelector("p.oxd-text:nth-child(1)")).getText();
	String [] ID =usid.split(":");
	System.out.println(ID[1]);
	String psd=driver.findElement(By.cssSelector("p.oxd-text:nth-child(2)")).getText();
	String [] PS =psd.split(":");
	System.out.println(PS[1]);
	driver.findElement(By.name("username")).sendKeys(ID[1].trim());
	driver.findElement(By.name("password")).sendKeys(PS[1].trim());
	driver.findElement(By.xpath("//button[@type='submit']")).click();
	//driver.quit();*/
	


 
		 String s="naresh";
		 String s1="";
		 for(int i=s.length()-1;i>=0;i--){
			
			  s1=s1+s.charAt(i);
		 }
		 System.out.println(s1);
	
	 
	 }}

