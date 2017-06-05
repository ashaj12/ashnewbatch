import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Frameshandling {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\workspace\\LMNproject\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://toolsqa.com/iframe-practice-page/");
		driver.manage().window().maximize();
		driver.switchTo().frame("iframe1");
		WebElement frstname=driver.findElement(By.name("firstname"));
		frstname.sendKeys("asha");
		driver.switchTo().defaultContent();
		WebElement ele=driver.findElement(By.xpath(".//*[@id='content']/h1"));
		String str=ele.getText();
		System.out.println(str);

	}

}
