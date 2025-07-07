package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class SignupPage 

	 {
	    WebDriver driver;

	    public SignupPage(WebDriver driver) 
	    {
	        this.driver = driver;
	    }

	    By signUpBtn = By.xpath("/html/body/div[1]/app-ug-spa/div[1]/app-site-header/header/div[2]/div/div[5]/a[1]/span");
	    By firstName = By.xpath("//*[@id=\"createAccountFirstName\"]");
	    By email = By.xpath("//*[@id=\"createAccountEmail\"]");
	    By password = By.xpath("//*[@id=\"createAccountPassword\"]");
	    By createBtn = By.xpath("//*[@id=\"createAccountBtn\"]");

	    public void signUp(String name, String mail, String pass) 
	    {
	        driver.findElement(signUpBtn).click();
	        driver.findElement(firstName).sendKeys(name);
	        driver.findElement(email).sendKeys(mail);
	        driver.findElement(password).sendKeys(pass);
	        driver.findElement(createBtn).click();
	    
	}


}
