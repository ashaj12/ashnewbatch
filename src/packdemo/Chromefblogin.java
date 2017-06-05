package packdemo;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Chromefblogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","D:\\workspace\\LMNproject\\Driver\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8106496041");
		driver.findElement(By.id("pass")).sendKeys("8106496041");
		driver.findElement(By.xpath("//input[@id='u_0_q']")).click();
     WebElement navgtnbtn=driver.findElement(By.id("userNavigationLabel"));
	 navgtnbtn.click();
	 driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
     WebElement logoutbtn=driver.findElement(By.partialLinkText("Log out"));
     logoutbtn.click();
	}

}
