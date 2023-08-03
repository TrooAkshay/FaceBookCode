package baseClass;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class driverINIT {
	
	public WebDriver chromeBrowserDriver() {
            WebDriverManager.chromedriver().setup();
            WebDriver driver = new ChromeDriver();
		    return driver;
	}
	
	
	public WebDriver firefoxBrowserDriver() {
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver1 = new FirefoxDriver();
		return driver1;
	}

}
