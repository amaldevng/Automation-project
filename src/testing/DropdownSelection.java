package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownSelection
{
FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
	}
	@Test
	public void test()
	{
		WebElement day=driver.findElement(By.xpath("//select[@id='day']"));
		Select fb=new Select(day);
		fb.selectByValue("11");
		
		WebElement month=driver.findElement(By.xpath("//select[@id='month']"));
		Select fbb=new Select(month);
		fbb.selectByVisibleText("May");
		
		
		WebElement year=driver.findElement(By.xpath("//select[@id='year']"));
		Select fbbb=new Select(year);
		fbbb.selectByIndex(2);
		
		
	}
}
