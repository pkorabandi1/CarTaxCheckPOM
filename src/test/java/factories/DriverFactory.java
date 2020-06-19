package factories;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class DriverFactory {

	public static WebDriver getBrowser(String browsertype) {
		WebDriver driver = null;
		if(browsertype.equalsIgnoreCase("firefox")) {
			System.setProperty("webdriver.gecko.driver", "value");
			//driver = new FirefoxDriver();
		} else if (browsertype.equalsIgnoreCase("chrome")){
			System.setProperty("webdriver.chrome.driver", ".\\src\\test\\resources\\drivers\\chromedriver.exe");
			driver = new ChromeDriver();
	
		}
		
		driver.manage().window().maximize();
		return driver;
	}
}
