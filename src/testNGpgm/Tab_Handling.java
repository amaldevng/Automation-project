package testNGpgm;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Tab_Handling                //window handling
{
	ChromeDriver driver;
	@BeforeTest
	public void set()
	{
		
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void urlload()
	{
		driver.get("https://demo.guru99.com/popup.php");
	}
	@Test
	public void test()
	{
		String parentwindow = driver.getWindowHandle();
	    driver.findElement(By.xpath("/html/body/p[1]/a")).click();
	    
	    Set<String> allwindowhandle=driver.getWindowHandles();
	    
	    for(String handle:allwindowhandle)
	    {
	    	if(!handle.equalsIgnoreCase(parentwindow))
	    	{
	    		driver.switchTo().window(handle);
	    		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[5]/td[2]/input")).sendKeys("abcd@gmail.com");
	    		driver.findElement(By.xpath("/html/body/form/table/tbody/tr[6]/td[2]/input")).click();
	    	}
	    	driver.switchTo().window(parentwindow);
	    }
	}

}
