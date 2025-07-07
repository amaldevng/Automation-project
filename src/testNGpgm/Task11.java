package testNGpgm;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.io.FileHandler;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class Task11 
{
	WebDriver driver;
	@BeforeTest
	public void set()
	{
		driver=new ChromeDriver();
	}
	@BeforeMethod
	public void url()
	{
		driver.get("https://tutorialsninja.com/demo/");
	}
	@Test
	public void test() throws IOException
	{
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"input-firstname\"]")).sendKeys("akshay");
		driver.findElement(By.xpath("//*[@id=\"input-lastname\"]")).sendKeys("bilahari");
		driver.findElement(By.xpath("//*[@id=\"input-email\"]")).sendKeys("abc1237@gmail.com");
		driver.findElement(By.xpath("//*[@id=\"input-telephone\"]")).sendKeys("9512364215");
		driver.findElement(By.xpath("//*[@id=\"input-password\"]")).sendKeys("123456");
		driver.findElement(By.xpath("//*[@id=\"input-confirm\"]")).sendKeys("123456");
		driver.findElement(By.xpath("/html/body/div[2]/div/div/form/div/div/input[1]")).click();
		
		WebElement elemnt= driver.findElement(By.xpath("//*[@id=\"input-email\"]"));
		File scrnshot=elemnt.getScreenshotAs(OutputType.FILE);
		FileHandler.copy(scrnshot, new File("./screenshot//email.png"));
		
		driver.findElement(By.xpath("//*[@id=\"top-links\"]/ul/li[2]/ul/li[1]/a")).click();
		
		driver.findElement(By.xpath("//*[@id=\"content\"]/div/div/a")).click();
		
	}
	
	

}
