package TestablePackage;

import org.testng.annotations.Test;

import io.github.bonigarcia.wdm.WebDriverManager;

import org.testng.annotations.BeforeMethod;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;

public class FirstTestCase {
	public WebDriver driver;

	@Test
	public void LoginPage() {

		WebElement withoutFindelemnet = driver
				.findElement(By.cssSelector("div._36HLxm >div>form>div>input[type='text']"));

		withoutFindelemnet.sendKeys("8007514483", Keys.TAB);
		driver.switchTo().activeElement().sendKeys("9373893645", Keys.ENTER);

	}

	@BeforeMethod
	public void LaunchTheBrowse() {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();

		driver.get("https://www.flipkart.com");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

		// 8007514483 ,9373893645

	}

	@AfterMethod
	public void CloseBrowser() {

		//driver.close();

	}

}
