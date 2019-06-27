package first;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;  

public class Google {
	WebDriver driver;
	
	By textBox=By.className("gLFyf");
	By search= By.cssSelector("div.FPdoLc.VlcLAe input[value='Google Search']");
	
	public Google(WebDriver driver)
	{
		this.driver=driver;
	}
	
	public void sendText(String text)
	{
		driver.findElement(textBox).sendKeys(text);
	}
	public  void performSearch()
	{
		driver.findElement(search).click();
	}
}
