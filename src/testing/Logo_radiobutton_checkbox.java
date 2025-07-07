package testing;

import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Logo_radiobutton_checkbox 
{
FirefoxDriver driver;
	
	@Before
	public void setup()
	{
		driver=new FirefoxDriver();
		driver.get("https://register.rediff.com/register/register.php?FormName=user_details");
	}
	@Test
	public void test() 
	{
		//verify logo is there
		
		WebElement logo= driver.findElement(By.xpath("//img[@title='Rediffmail']"));
		if(logo.isDisplayed())
		{
			System.out.println("logo is displayed");
		}
		else
		{
			System.out.println("logo is not displayed");
		}
		//String log=logo.getAttribute("src");
		//System.out.println("logo url"+log);
		
		
		//verify radio button is there
		
		WebElement radio= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[9]/div[1]/label[1]/input[1]"));
		boolean sel=radio.isSelected();
		if(sel)         //or if(sel) is also correct
		{
		System.out.println("button is present "+sel);
		}
		else
		{
			System.out.println("no button "+sel);

		}
		
		
		//verify check box is there
		
		WebElement chk= driver.findElement(By.xpath("/html[1]/body[1]/div[2]/div[2]/form[1]/div[1]/div[15]/div[1]/input[1]"));
		boolean select=chk.isSelected();
		if(chk.isSelected())     //or we can put if(select)
		{
			System.out.println("check is present "+select);

		}
		else
		{
			System.out.println("check is absent "+select);

		}
		
		
		
		
		
	}
}
