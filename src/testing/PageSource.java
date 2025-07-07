package testing;

import org.openqa.selenium.firefox.FirefoxDriver;

public class PageSource 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		
		String pageSource=driver.getPageSource();
		
		
		if(pageSource.contains("Gmail"))
		{
			System.out.println("gmail is present");
		}
		else
		{
			System.out.println("gmail is not present");
		}
		driver.quit();   //to close entire brower
		//driver.close();   //to close current tab

	}

}
