package Practice;

import java.io.FileInputStream;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ReadDataFromPrpertyFile {

	public static void main(String[] args) throws Throwable {
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
	 FileInputStream fis = new FileInputStream("./src/test/resources/InsertintoPropertyfile.properties.txt");
      Properties pro = new Properties();
      pro.load(fis);
     
      String PASSWORD = pro.getProperty("password");
      String URL = pro.getProperty("url");
      String USERNAME = pro.getProperty("username");
      
      driver.get(URL);
      driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);		
        driver.findElement(By.id("login-button")).click();
	}

}
