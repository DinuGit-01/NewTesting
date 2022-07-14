package TestablePackage;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class GoogleLauch {
  @Test
  public void BrowserLaunch() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://demosite.executeautomation.com/");
	  driver.manage().window().maximize();
	  driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	  driver.get("https://demosite.executeautomation.com/");				
		driver.findElement(By.name("UserName")).sendKeys("execution");
		driver.findElement(By.name("Password")).sendKeys("admin");
		driver.findElement(By.xpath("//input[@name='Login']")).click();
		WebElement drop= driver.findElement(By.id("TitleId"));
		
		Select Dropdown=new Select(drop);
		System.out.println(""+Dropdown.isMultiple());
		List<WebElement> options=Dropdown.getOptions();
		for(int i=0;i<options.size();i++){
			System.out.println(options.get(i).getText());
		}
		
		String selected =Dropdown.getFirstSelectedOption().getText();
		System.out.println(selected);
	
		Dropdown.selectByIndex(1);
		
		
		
		
		
		
	  System.out.println("Dinesh JADHAV");
  }
  
}
