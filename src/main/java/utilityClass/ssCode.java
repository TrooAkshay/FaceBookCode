package utilityClass;


import java.io.File;
import java.io.IOException;

import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;


public class ssCode {
WebDriver driver;

	public void takeSSCode() throws IOException {
	  driver = new ChromeDriver();
	  File SS = ((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
	  
	  File TakeSS = new File("C:\\Users\\trootech\\eclipse-workspace\\Facbook\\Screenshot\\"+".jpg");
		
	  FileHandler.copy(SS,TakeSS);
	}

      
	
}
