package TestablePackage;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CreateAccount {
	
  @Test
  public void Resistration() throws InterruptedException {
	  
	  
	  
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.manage().window().maximize();
	  driver.get("http://demo.automationtesting.in/Register.html");
	  WebElement element=driver.findElement(By.xpath("//input[@placeholder='First Name']"));
	  element.sendKeys("Dinesh",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("jadhav",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("At post Gotewadi taluka mohol solapur",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("jadhavdinesh@gmail.com",Keys.TAB);
	  driver.switchTo().activeElement().sendKeys("7777399773",Keys.TAB);
	  driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-child(6) >div>div>input#checkbox1")).click();
	  WebElement dropdownhandle=driver.findElement(By.cssSelector("#Skills"));
	  Select dropdown=new Select(dropdownhandle);
	  
	//  WebElement defaultelement=dropdown.getFirstSelectedOption();
	  dropdown.selectByIndex(4);
	  Thread.sleep(1000);
	  dropdown.selectByVisibleText("C");
	  Thread.sleep(1000);
	  driver.findElement(By.cssSelector("#basicBootstrapForm>div:nth-child(10)>div>select>option:nth-child(6)")).click();
	  List<WebElement> text=driver.findElements(By.cssSelector("#basicBootstrapForm>div:nth-child(10)"));
	  for(int i=0;i<text.size();i++) {
		  System.out.println(text.get(i).getText());
	  }
	  
	  JavascriptExecutor java=(JavascriptExecutor)driver;
	  java.executeScript("window.scrollBy(0,2000)");
	  Thread.sleep(2000);
	  Actions act=new Actions(driver);
	  WebElement copy=driver.findElement(By.id("firstpassword"));
	  copy.sendKeys("jadhav");
	  act.moveToElement(copy).doubleClick().keyDown(Keys.CONTROL).sendKeys("c").keyUp(Keys.CONTROL).build().perform();
	  WebElement paste=driver.findElement(By.id("secondpassword"));
	  act.moveToElement(paste).click().keyDown(Keys.CONTROL).sendKeys("v").keyUp(Keys.CONTROL).build().perform();
	  
	  
	  java.executeScript("window.document.body.scrollHeight");
	  
	  
	  
	  
	  
	  
  }
  
}
