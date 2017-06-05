import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Scrollup$down {

	public static void main(String[] args) throws IOException {
 //we use javascript to scroll up and down there is no another method
		String confgfile="D:\\workspace\\LMNproject\\Data\\config.file";
		
		File f=new File(confgfile);
		FileInputStream fp=new FileInputStream(f);
		
		Properties pro=new Properties();
		pro.load(fp);
		
		String ffdriver=pro.getProperty("ffgecko");
		String ffgecko=pro.getProperty("ffgeckopath");
		String url=pro.getProperty("fburl");
	String emailid=pro.getProperty("fbemail");
		String psswrd=pro.getProperty("fbpasswrd");
		
		System.out.println(ffdriver);
		System.out.println(ffgecko);
		System.out.println(url);
		System.out.println(emailid);
		System.out.println(psswrd);
		
		System.setProperty(ffdriver,ffgecko);
	     WebDriver driver=new FirefoxDriver();
	     driver.manage().window().maximize();
	     driver.get(url);
	     driver.findElement(By.id(Alllocatrs.emailid)).sendKeys(emailid);
	     driver.findElement(By.id(Alllocatrs.passwrd)).sendKeys(psswrd);
	     //driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	     JavascriptExecutor jse = (JavascriptExecutor) driver;
		    jse.executeScript("window.scrollBy(0,350)", "");
		    
		    
	     driver.findElement(By.id(Alllocatrs.login)).click();
	 	
		    
		    
		  
			
	      
	
		
		
		
		
		
		
		
		
		
		
		
		
		
	}

}
