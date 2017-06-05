package alerthdlng;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class navgtns {

	public static void main(String[] args) {
		
	System.setProperty("webdriver.gecko.driver","D:\\workspace\\LMNproject\\Driver\\geckodriver.exe" );
	WebDriver driver=new FirefoxDriver();
    driver.navigate().to("https:www.gmail.com");
    driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
   driver.findElement(By.id("identifierId")).sendKeys("asha27894@gmail.com");
  driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
  
  driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("asha8106496041");
  
  driver.findElement(By.xpath(".//*[@id='passwordNext']/div[2]")).click();
//  driver.navigate().refresh();
   //driver.navigate().back();
  
    
    
	}

}
