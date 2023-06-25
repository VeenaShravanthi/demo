package simplejenkinsproject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jenkinsdemo {
	WebDriver driver;

	@Test
	
	public void demo()
	{
		WebDriverManager.chromedriver().setup();//112.0.5615.49
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.close();
	}
}
