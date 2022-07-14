package TestablePackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class JavaScriptExecuter {
  @Test
  public void SriptExecutor() throws InterruptedException {
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demo.actitime.com/login.do");
	   JavascriptExecutor JS=(JavascriptExecutor)driver;
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  
	  JS.executeScript("document.getElementById('username').value='admin';");
	  driver.findElement(By.name("pwd")).sendKeys("manager");
	 // JS.executeScript("document.getElementByName('pwd').value='manager';");
	  JS.executeScript("document.getElementById('loginButton').click();");
	  JS.executeScript("window.scrollBy(0,2000)");
	  Thread.sleep(2000);
	  JS.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	  List<WebElement> list=driver.findElements(By.xpath("//body[@class='submit_tt myTT with-navigation  ext-chrome']/div[6]/table"));
	  
	  
	  
	  int size=list.size();
	  for(int i=0; i<size;i++) {
		  System.out.println(list.get(i).getText());
	  }
  
	  }
}
