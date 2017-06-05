import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class Readdatafromconfigfile {

	public static void main(String[] args) throws IOException {
     String configfile="D:\\workspace\\LMNproject\\Data\\config.file";
     
     File f=new File(configfile);
     FileInputStream fp=new FileInputStream(f);
     
     Properties pro=new Properties();
     pro.load(fp);
     String ffdriver=pro.getProperty("ffgecko");
     String gecko=pro.getProperty("ffgeckopath");
      String url=pro.getProperty("fburl");
      String emailid=pro.getProperty("fbemail");
      String passwrd=pro.getProperty("fbpasswrd");
      String unl=pro.getProperty("fbnavgtnbtn");
      System.out.println(url);
      System.out.println(emailid);
      System.out.println(passwrd);
      System.out.println(unl);
      
      System.setProperty(ffdriver,gecko);
     WebDriver driver=new FirefoxDriver();
     driver.manage().window().maximize();
     driver.get(url);
     driver.findElement(By.id(Alllocatrs.emailid)).sendKeys(emailid);
     driver.findElement(By.id(Alllocatrs.passwrd)).sendKeys(passwrd);
     driver.findElement(By.id(Alllocatrs.login)).click();
     driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
    driver.findElement(By.partialLinkText("Log out"));
      
      
      
	}

}
