package TestablePackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.DataProvider;

public class TestDataProvider {
	
	
	private static WebDriver driver;
@DataProvider(name="Authentication")
public static Object[][] crendetials(){
	return new Object[][] {{"admin","manager"},{"admin","manage"},{"123345","dhuhueh"}};
}


@Test(dataProvider="Authentication")
public void Test(String username,String pass) {
	WebDriverManager.chromedriver().setup();
	driver =new ChromeDriver();
	driver.manage().timeouts().implicitlyWait(30,TimeUnit.SECONDS);
	 driver.get("https://demo.actitime.com/login.do");
	  driver.findElement(By.id("username")).sendKeys(username);
	  
	 WebElement enter= driver.findElement(By.cssSelector("input[name='pwd']"));
	 enter.sendKeys(pass,Keys.ENTER);
}





}