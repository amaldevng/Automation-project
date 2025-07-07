package testing;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class Screenshot 
{
FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() throws IOException 
	{
		File screensht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		FileHandler.copy(screensht,new File("D://err.png"));
	}
}
