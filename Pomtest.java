package test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import first.Google;

	public class Pomtest {
		static Google ggl;
		@Test
	    public static void googleSearch(){
	    	System.setProperty("webdriver.chrome.driver","D:\\chromedriver_win32\\chromedriver.exe");  
	    	WebDriver driver=new ChromeDriver();  
	    	driver.navigate().to("http://www.google.com/");  
	    	ggl=(new Google(driver));
	    	ggl.sendText("maven");
	    	ggl.performSearch();
	    	
	    	
	    }
		
	}
