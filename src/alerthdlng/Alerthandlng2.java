package alerthdlng;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Alerthandlng2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\workspace\\LMNproject\\Driver\\geckodriver.exe");
        WebDriver  driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/handling-alerts-using-selenium-webdriver/");
		driver.findElement(By.xpath(".//*[@id='content']/p[8]/button")).click();
		driver.manage().window().maximize();
		
		Alert alt=driver.switchTo().alert();
		alt.dismiss();
		System.out.println("clicked cancel button");
	}

}
