package Practice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class BrowserLaunch
{

	public static void main(String[] args) 
	{
		
		// without using WebDrivermanager
		
		/*WebDriver driver;
		driver=new EdgeDriver();
		driver.get("https://www.saucedemo.com/v1/");*/
		
		
		//By using WebDriverManager
		
		WebDriverManager.edgedriver().setup();
		WebDriver driver = new EdgeDriver();
		
	
		
		driver.get("https://www.saucedemo.com/v1/");
		driver.findElement(By.id("user-name")).sendKeys("standard_user");
		driver.findElement(By.id("password")).sendKeys("secret_sauce");
        driver.findElement(By.id("login-button")).click();
	}

}
