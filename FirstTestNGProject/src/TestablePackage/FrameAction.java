package TestablePackage;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

public class FrameAction {
  @Test
  public void fram() {
	  WebDriverManager.chromedriver().setup();
	  WebDriver driver=new ChromeDriver();
	  driver.get("https://jqueryui.com/droppable/");
		
		//switch your control to frame using WebElement 
//		WebElement frame=driver.findElement(By.cssSelector(".demo-frame"));
//		driver.switchTo().frame(frame);
				//or
		//driver.switchTo().frame(driver.findElement(By.cssSelector(".demo-frame")));
				//or
		//Switch your control to frame using  index ---> now you are allowed to identify any element inside the frame
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		WebElement drag=driver.findElement(By.id("draggable"));
		WebElement drop=driver.findElement(By.id("droppable"));
		act.dragAndDrop(drag, drop).build().perform();
		//get your control back to main page --> now you can identify any element from the main page again
		driver.switchTo().defaultContent();
		driver.findElement(By.cssSelector(".logo>a")).click();
  }
}
