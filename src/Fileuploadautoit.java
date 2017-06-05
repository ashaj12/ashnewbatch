import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Fileuploadautoit {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.gecko.driver","D:\\workspace\\LMNproject\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("file:///C:/Users/Sudarshan/Desktop/fileupload.html");
		driver.findElement(By.xpath(".//*[@id='1']")).click();
		
		Runtime.getRuntime().exec("C:\\Users\\Sudarshan\\Desktop\\fileupload.exe");
	}

}
