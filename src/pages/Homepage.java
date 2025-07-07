package pages;

import java.io.File;
import java.io.IOException;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.io.FileHandler;

public class Homepage 
{
	 
	    WebDriver driver;

	    public void HomePage(WebDriver driver) {
	        this.driver = driver;
	    }

	    public void hoverOverMenu() {
	        WebElement menu = driver.findElement(By.xpath("//*[@id=\"for-him\"]"));
	        Actions actions = new Actions(driver);
	        actions.moveToElement(menu).build().perform();
	    }

	    public void scrollAndClickFooter() {
	        JavascriptExecutor js = (JavascriptExecutor) driver;
	        js.executeScript("window.scrollBy(0,1000)");
	        driver.findElement(By.xpath("/html/body/div[1]/app-ug-spa/div[1]/app-site-footer/footer/div[1]/div/div[1]/div/div[2]/div/div[3]/ul/li[9]/a")).click();
	    }

	    public boolean isLogoDisplayed() {
	        return driver.findElement(By.xpath("//*[@id=\"uncommon-goods-logo\"]")).isDisplayed();
	    }

	    public String getWishlistText() {
	        return driver.findElement(By.id("wlcount")).getText().trim();
	    }

	    public String getPageTitle() {
	        return driver.getTitle();
	    }

	    public void takeScreenshots() throws IOException {
	        // Element Screenshot
	        WebElement searchBox = driver.findElement(By.xpath("/html/body/div[1]/app-ug-spa/div[1]/app-site-header/header/div[2]/div/div[4]/app-header-search/div/div/div/div/form/div[1]/div/div/div"));
	        File src = searchBox.getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(src, new File("./screenshot/searchbar.png"));

	        // Full Page Screenshot
	        File fullPage = ((TakesScreenshot) driver).getScreenshotAs(OutputType.FILE);
	        FileHandler.copy(fullPage, new File("D://uncommonsite.png"));
	    
	}


}
