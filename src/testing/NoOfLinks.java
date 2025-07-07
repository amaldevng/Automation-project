package testing;

import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;



public class NoOfLinks 
{

FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		
	}
	@Test
	public void test()
	{
		driver.get("https://google.com");
	     List<WebElement> li = driver.findElements(By.tagName("a"));         //to get number of links
	    System.out.println(li.size());
	    
	    for(WebElement temp:li)                                              //print links with texts
	    {
	    	String links=temp.getAttribute("href");
	    	String texts=temp.getText();
	    	System.out.println(links+".................."+texts);
	    	
	    }
	    	
	    
	    
	}
}
