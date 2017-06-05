import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Mousehovrhandlng {

	public static void main(String[] args) {
		 System.setProperty("webdriver.gecko.driver","D:\\workspace\\LMNproject\\Driver\\geckodriver.exe");
	        WebDriver  driver=new FirefoxDriver();
       	driver.manage().window().maximize();
		driver.get("https://www.facebook.com/");
		
		driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8106496041");
		driver.findElement(By.id("pass")).sendKeys("8106496041");
      driver.findElement(By.id("u_0_q"));
		/* driver.manage().timeouts().implicitlyWait(60, TimeUnit.SECONDS);
	     WebElement logoutbtn=driver.findElement(By.partialLinkText("Log out"));
	     logoutbtn.click();*/
		
   
	
	}

}
