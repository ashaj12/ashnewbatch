import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class Drop$drag {

	public static void main(String[] args) {
		System.setProperty("webdriver.gecko.driver","D:\\workspace\\LMNproject\\Driver\\geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("http://jqueryui.com/droppable/");
		driver.manage().window().maximize();
		driver.switchTo().frame(0);
		WebElement dragele=driver.findElement(By.id("draggable"));
		WebElement dropele=driver.findElement(By.id("droppable"));
		
		
		Actions act=new Actions(driver);
		act.dragAndDrop(dragele, dropele).build().perform();
	}

}
