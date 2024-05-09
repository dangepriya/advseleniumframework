package Practice;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PropertyFile {

	public static void main(String[] args) throws Throwable
	{
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver=new EdgeDriver();
		
		// without using property file we launch the browser
		
		/*driver.get("https://www.saucedemo.com/v1/");
        
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");		
        driver.findElement(By.id("login-button")).click();*/
		

        //launch application by fetching data from prpertiesfile.
		
		FileInputStream fis = new FileInputStream("./src/test/resources/proprtyfile.properties.txt");
		Properties pro = new Properties();
		pro.load(fis);
		String URL = pro.getProperty("url");
		String USERNAME = pro.getProperty("username");
		String PASSWORD = pro.getProperty("password");
		
		driver.get(URL);
		driver.findElement(By.id("user-name")).sendKeys(USERNAME);
		driver.findElement(By.id("password")).sendKeys(PASSWORD);		
        driver.findElement(By.id("login-button")).click();
	}

}
