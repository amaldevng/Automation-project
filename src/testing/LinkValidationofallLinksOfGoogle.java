package testing;

import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.URL;
import java.util.List;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LinkValidationofallLinksOfGoogle 
{
	FirefoxDriver driver;
	String baseurl="https://www.google.co.in/";
	@Before
	public void set()
	{
		driver=new FirefoxDriver();
		driver.get(baseurl);
	}
	@Test
	public void test() throws IOException
	{
		
		 List<WebElement> li = driver.findElements(By.tagName("a"));         //to get number of links
		  //  System.out.println(li.size());
		    
		    for(WebElement temp:li)                                              //print links with texts
		    {
		    	String links=temp.getAttribute("href");
		    	 URL ob =new URL(baseurl);
		    	 HttpURLConnection con=(HttpURLConnection) ob.openConnection();
		    	 con.connect();
					if(con.getResponseCode()==200)
					{
						System.out.println("valid link");
					}
					else
					{
						System.out.println("invalid link");
					}
		    	
		    //	String texts=temp.getText(); 
		    	System.out.println(links+"");
		    	
		    }
		    
		   
			
			
	}

}
