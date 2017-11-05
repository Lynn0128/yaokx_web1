package yaokx_web1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class test_selenium{
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:/software/selenium/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		
		Thread.sleep(2000);
		
		driver.get("http://127.0.0.1:8080/yaokx_web1/MyHtml.html");
		
		Thread.sleep(2000);
		
		boolean isSuccess=driver.getPageSource().contains("login");
		System.out.println(isSuccess);
		
		WebElement userName=driver.findElement(By.id("login"));
		userName.clear();
		userName.sendKeys("guoyasoft");
		
        Thread.sleep(2000);
		
		WebElement password=driver.findElement(By.id("password"));
		password.clear();
		password.sendKeys("12345678");
		
		Thread.sleep(2000);
		
		WebElement submit=driver.findElement(By.xpath("//input[@type='submit']"));
		submit.click();
		
		Thread.sleep(2000);
		
		isSuccess=driver.getPageSource().contains("post success");
		System.out.println(isSuccess);
		
		driver.quit();
		
		
	}
}