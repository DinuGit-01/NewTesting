package TestablePackage;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class SceenShot {
  @Test
  public void Screenshot() {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://www.flipkart.com");
	  TakesScreenshot sc=(TakesScreenshot)driver;
	  //capture the screenshot in the form of file
	  File file=sc.getScreenshotAs(OutputType.FILE);
	  
	  
	 try {
		FileUtils.copyFile(file,new File ("C:\\Users\\user\\Pictures\\Camera Roll.png"));
	} catch (IOException e) {
		
		e.printStackTrace();
	}
	  
	  
	  
	  
  }
}
