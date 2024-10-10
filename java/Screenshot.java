
import java.io.File;
import java.io.IOException;
import java.util.UUID;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.ITestListener;
import org.testng.ITestResult;


public class Screenshot extends DemoListner{
	
     
//	static WebDriver driver;
	/*
	
	public static void main(String[] args) throws IOException {

	
		 driver=new ChromeDriver();
		driver.get("https://www.amazon.in/");
		  
		//coverting the webdriver object to Takesscreen shot object
		String random = UUID.randomUUID().toString();
		
		TakesScreenshot t=(TakesScreenshot)driver;
		//To create an image file
		File src=t.getScreenshotAs(OutputType.FILE);
		//To move image to destination
		File dest=new File("./Screenshots/"+random+".png");
		//To copy File at destination
		FileHandler.copy(src, dest);
		
		
	}
*/
	
	public void screenShottake() throws IOException  {
	
		      //String random = result.getName();
				//coverting the webdriver object to Takesscreen shot object
		
		
				String random = UUID.randomUUID().toString();
				
				TakesScreenshot t=(TakesScreenshot)driver;
				//To create an image file
				File src=t.getScreenshotAs(OutputType.FILE);
				//To move image to destination
				File dest=new File("./Screenshots/"+random+".png");
				//To copy File at destination
				FileHandler.copy(src, dest);
				//return "./Screenshots/"+".png";
	
	
	/*
	   TakesScreenshot driver=null;
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		try {
		FileUtils.copyFile(src,new File("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\Screenshots"));
		}
		catch(IOException e)
		{
			e.printStackTrace();
		}
}
}
*/
}
}