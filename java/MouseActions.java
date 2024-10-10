
import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import net.bytebuddy.asm.Advice.Argument;
public class MouseActions {

	public static void main(String[] args) throws InterruptedException, AWTException, IOException {
  
	//	WebDriver driver=new ChromeDriver();
		/*
		driver.get("https://demo.automationtesting.in/Static.html");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//Drag and Drop
		WebElement src = driver.findElement(By.id("mongo"));
		WebElement dest = driver.findElement(By.id("droparea"));
		Actions a=new Actions(driver);
		a.dragAndDrop(src, dest).perform();
		*/
		
		//right click
		/*
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
		WebElement ele = driver.findElement(By.xpath("//span[text()='right click me']"));
		Actions a=new Actions(driver);
		a.contextClick(ele).perform();
		*/
		/*
		//Double Click
		driver.get("https://demo.guru99.com/test/simple_context_menu.html");
       WebElement element = driver.findElement(By.xpath("//button[text()='Double-Click Me To See Alert']"));
    	Actions a=new Actions(driver);
    	a.doubleClick(element).perform();
    	*/
		
		/*
		//Move to element
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//WebElement mElement = driver.findElement(By.xpath("//span[@class='action-inner']"));
		WebElement mElement = driver.findElement(By.xpath("//a[@class='link twitter']"));
		Actions a=new Actions(driver);
		a.moveToElement(mElement).click().build().perform();
		*/
		/*
		//Scroll into view
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.manage().timeouts().implicitlyWait(3000, TimeUnit.SECONDS);
		//WebElement mElement = driver.findElement(By.xpath("//span[@class='action-inner']"));
		WebElement mElement = driver.findElement(By.xpath("//a[@class='link twitter']"));
		JavascriptExecutor js=(JavascriptExecutor)driver;
		js.executeScript("arguments[0].scrollIntoView();",mElement);
				// js.executeScript("arguments[0].scrollIntoView(true);",mElement);
		
		*/
	
		/*
		cAddress.sendKeys(Keys.CONTROL);
		cAddress.sendKeys("A");
		cAddress.sendKeys(Keys.CONTROL);
		cAddress.sendKeys("C");
		cAddress.sendKeys(Keys.TAB);
		WebElement pAddress = driver.findElement(By.xpath("//textarea[@id='permanentAddress']"));
		cAddress.sendKeys(Keys.CONTROL);
		cAddress.sendKeys("A");
		cAddress.sendKeys(Keys.CONTROL);
		cAddress.sendKeys("C");
		cAddress.sendKeys(Keys.TAB);
		pAddress.sendKeys(Keys.CONTROL);
		pAddress.sendKeys("V");
		*/
		
		/*
		//Key board Actions
		driver.get("https://demoqa.com/text-box");
		driver.manage().window().maximize();
		WebElement cAddress = driver.findElement(By.xpath("//textarea[@id='currentAddress']"));
		FileLibrary f=new FileLibrary();
		//String n=f.getPropData("name");
		String value = f.getExcelData("ExcelA",1, 0);
		System.out.println(value);
		cAddress.sendKeys(value);
		Thread.sleep(3000);
		cAddress.click();
      Robot rb=new Robot();
		rb.delay(2000);
		
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_A);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_A);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_C);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);
		rb.keyRelease(KeyEvent.VK_C);
		
		//rb.keyPress(KeyEvent.VK_TAB);
		//PermenetAdd.click();
		rb.keyPress(KeyEvent.VK_TAB);
		
		rb.keyPress(KeyEvent.VK_CONTROL);
		rb.keyPress(KeyEvent.VK_V);
		
		rb.keyRelease(KeyEvent.VK_CONTROL);	

		rb.keyRelease(KeyEvent.VK_V);
		
		
		driver.close();
		*/
		/*
		//Write data in Excel Sheet
		//FileLibrary f=new FileLibrary();
		//f.setExcelData("ExcelA", 4, 2,"Java");
		FileInputStream fis=new FileInputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx");
		Workbook wb = WorkbookFactory.create(fis);
		//wb.getSheet("ExcelA").getRow(1).getCell(6).setCellValue("Testing");
		//Sheet sheet = wb.getSheetAt(0);
		 wb.getSheetAt(0).getRow(1).createCell(7).setCellValue("testing");
		FileOutputStream fos=new FileOutputStream("C:\\Users\\Brigosha_Guest\\eclipse-workspace\\LearnSelenium\\src\\test\\resources\\Config_Folder\\ExcelA.xlsx");
       wb.write(fos);
       wb.close();
		
		
		
		*/
		FileLibrary f=new FileLibrary();
		f.setExcelData(0, 1, 10,"Java123");
		
	}

}
