package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AmazzonParentChild //when there isno unique attributes
{
FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://www.amazon.in/");
	}
	@Test
	public void test() 
	{
		driver.findElement(By.xpath("//div[@id='nav-xshop']/ul/li[6]/div/a")).click();
	}

}
