package testing;

import org.openqa.selenium.firefox.FirefoxDriver;

public class GooglePgm 
{

	public static void main(String[] args) 
	{
		FirefoxDriver driver=new FirefoxDriver();
		driver.get("https://www.google.com");
		String title=driver.getTitle();
		System.out.println(title);
		String expected="google";
		
		
		
		
		if(title.equals(expected))
		{
			System.out.println("test pass");

		}
		else
		{
			System.out.println("test fail");

		}

	}

}
