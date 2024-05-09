package LocatorsDemoRakeshSir;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class AbsoluteXpath {

	public static void main(String[] args) 
	{
		WebDriver driver;
		WebDriverManager.edgedriver().setup();
		driver=new EdgeDriver();
		driver.get("file:///C:/Users/dange/Downloads/Locators%20demo.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		
		driver.findElement(By.xpath("/html/body/div[2]/form/input[1]")).sendKeys("Priya");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[2]")).sendKeys("Dange");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[4]")).click();
		driver.findElement(By.xpath("/html/body/div[2]/form/input[6]")).sendKeys("riyu5");
		driver.findElement(By.xpath("/html/body/div[2]/form/input[7]")).sendKeys("abc@1");
		driver.findElement(By.xpath("/html/body/div[2]/form/button[1]")).click();
		
	}

}
