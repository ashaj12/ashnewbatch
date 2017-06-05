package packdemo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.ie.InternetExplorerDriver;
//import org.openqa.selenium.support.ui.Select;

public class IEfblogin {

	public static void main(String[] args) {
		System.setProperty("webdriver.ie.driver","D:\\workspace\\LMNproject\\Driver\\IEDriverServer.exe");
     WebDriver driver=new InternetExplorerDriver();
	driver.get("https://www.facebook.com/");
	driver.manage().window().maximize();
	
	driver.findElement(By.xpath("//input[@id='email']")).sendKeys("8106496041");
	driver.findElement(By.xpath("//input[@id='pass']")).sendKeys("8106496041");
	driver.findElement(By.xpath("//input[@id='u_0_q']")).click();
	WebElement lstitem=driver.findElement(By.id("userNavigationLabel"));
     lstitem.click();
  driver.findElement(By.xpath("//[@class[id='_54nh]")).click();


	
	
	}

}
