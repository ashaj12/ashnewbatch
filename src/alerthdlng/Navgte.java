package alerthdlng;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Navgte {
	
	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\workspace\\LMNproject\\Driver\\geckodriver.exe" );
		WebDriver driver=new FirefoxDriver();
	    driver.navigate().to("https:www.gmail.com");
	     driver.findElement(By.id("identifierId")).sendKeys("chandrika.parlapati@gmail.com");
	     driver.findElement(By.xpath("//div[@class='ZFr60d CeoRYc']")).click();
	     driver.findElement(By.xpath(".//*[@id='password']/div[1]/div/div[1]/input")).sendKeys("deva191rani");
	     driver.findElement(By.linkText("Next")).click();
	}

}
