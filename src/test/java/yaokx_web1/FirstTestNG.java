package yaokx_web1;

import java.sql.Driver;

import junit.framework.Assert;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.AfterClass;

public class FirstTestNG {
	
	WebDriver driver;

	@BeforeClass
	public void openChrome() {
		System.setProperty("webdriver.chrome.driver",
				"C:/software/selenium/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("http://127.0.0.1:8081/yaokx_web1/MyHtml.html");
	}

	@AfterClass
	public void quitChrome() {
		driver.quit();
	}

	@Test
	public void testLogin() {
		WebElement userName = driver.findElement(By.id("login"));
		userName.clear();
		userName.sendKeys("guoyasoft");
		

		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("12345678");
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		boolean result=driver.getPageSource().contains("post success");

		
		Assert.assertEquals(false, result);
	}
	
}