package testing;

import java.io.File;
import java.io.IOException;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.io.FileHandler;

public class ScreenshotOfElement
{
	FirefoxDriver driver;
	@Before
	public void set()
	{
		driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() throws IOException
	{
		WebElement elemnt= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[8]/select[1]"));
		File scrnshot=elemnt.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrnshot, new File("./screenshot//reddifday.png"));
	}

}
