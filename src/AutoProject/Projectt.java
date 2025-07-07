package AutoProject;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Projectt 

	{
		WebDriver driver;
		@BeforeTest
		public void set()
		{
			driver =new ChromeDriver();
		}
		@BeforeMethod
		public void url()
		{
			driver.get("https://www.uncommongoods.com/");
		}
		
		@Test
		public void acc()
		{
			//sign up page test
			driver.findElement(By.xpath("/html/body/div[1]/app-ug-spa/div[1]/app-site-header/header/div[2]/div/div[5]/a[1]/span")).click();
			driver.findElement(By.xpath("//*[@id=\"createAccountFirstName\"]")).sendKeys("raavuthar k s");
			driver.findElement(By.xpath("//*[@id=\"createAccountEmail\"]")).sendKeys("ravutharkk@gmail.com");
			driver.findElement(By.xpath("//*[@id=\"createAccountPassword\"]")).sendKeys("ravu@123456A");
			
			driver.findElement(By.xpath("//*[@id=\"createAccountBtn\"]")).click();
			//driver.findElement(By.xpath("//*[@id=\"giftReminderDrawerNoThanks\"]")).click();
		}
			 
			
			
			//search
			//WebElement element= driver.findElement(By.xpath("//*[@id=\"inputGroupContainer\"]/div/div/div"));
			//element.click();
			//element.sendKeys("golf");
		
			@Test
			public void hover()
			{
			
		
			//mouse hover over men
			
			WebElement hov= driver.findElement(By.xpath("//*[@id=\"for-him\"]"));
			Actions ac=new Actions(driver);
			ac.moveToElement(hov);
			ac.perform();
			
			}
			
			@Test
			public void scroll()
			{
			//scroll down
			JavascriptExecutor js=(JavascriptExecutor) driver;
			
			js.executeScript("window.scrollBy(0,1000)","");
			//js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
			
			driver.findElement(By.xpath("/html/body/div[1]/app-ug-spa/div[1]/app-site-footer/footer/div[1]/div/div[1]/div/div[2]/div/div[3]/ul/li[9]/a")).click();
			
			}
			
			
			@Test
			public void logo()
			{
			//verify logo is there
			WebElement logo= driver.findElement(By.xpath("//*[@id=\"uncommon-goods-logo\"]"));
			if(logo.isDisplayed())
			{
				System.out.println("logo is displayed");
			}
			else
			{
				System.out.println("logo is not displayed");
			}
			}
			
			
			@Test
			public void text()
			{
			// text verification of a button
			String expected="wish list";
			WebElement ac=driver.findElement(By.id("wlcount"));
			String actual=ac.getDomAttribute("value");
			
			if(actual.equals(expected))
			{
				System.out.println("pass");
			}
			else
			{
				System.out.println("fail");
			}
			}
			
			
			
			@Test
			public void title()
			{
			//title verification
			String title=driver.getTitle();
			System.out.println(title);
			String expect="Uncommon goods | Uncommon Goods:Cool,Unique & Unusual gifts";
			if(title.equals(expect))
			{
				System.out.println("test pass");

			}
			else
			{
				System.out.println("test fail");

			}
			}
			
			
			@Test
			public void scrn() throws IOException
			{
			//screenshot of a element
			
			WebElement elemnt= driver.findElement(By.xpath("/html/body/div[1]/app-ug-spa/div[1]/app-site-header/header/div[2]/div/div[4]/app-header-search/div/div/div/div/form/div[1]/div/div/div"));
			File scrnshot=elemnt.getScreenshotAs(OutputType.FILE);
			FileHandler.copy(scrnshot, new File("./screenshot//searchbar.png"));
			
			
			
			//screenshot of whole page
			File screensht=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
			FileHandler.copy(screensht,new File("D://uncommonsite.png"));
			}
			
		}
	
		


