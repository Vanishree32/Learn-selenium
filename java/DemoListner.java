import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;



//@Listeners(ListernerImplementation.class)


public class DemoListner{
	
	public static WebDriver driver;
	/*
	@Test
	public void firstMethod() {
		 driver=new ChromeDriver();
		
		System.out.println("First Method Executed Sucessfully");
		
		
	}
	*/
	@Test
	public void secondMethod() {
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.xpath("//a[text()='adgash']")).click();
	}
	
	
}
