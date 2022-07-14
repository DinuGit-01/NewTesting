package TestablePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;



import io.github.bonigarcia.wdm.WebDriverManager;

public class Parameterization {
	public WebDriver driver;
  @Test
  @Parameters({"username","password"})
  public void Parameterising(String username,String password) {
	  
	  WebDriverManager.chromedriver().setup();
	  driver=new ChromeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	  driver.findElement(By.id("username")).sendKeys(username);
	  
	 WebElement enter= driver.findElement(By.cssSelector("input[name='pwd']"));
	 enter.sendKeys(password,Keys.ENTER);
	  
	  
	  
  }
}
