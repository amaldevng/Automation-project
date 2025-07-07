package tests;

import org.testng.Assert;
import org.testng.annotations.Test;

import pages.Homepage;
import pages.SignupPage;
import utils.Basetest;

public class Testing extends Basetest
{
	

	 

	    @Test
	    public void testSignUp() {
	        SignupPage signUp = new SignupPage(driver);
	        signUp.signUp("raavuthar k s", "ravutharkk@gmail.com", "ravu@123456A");
	    }

	    @Test
	    public void testHoverMenu() {
	        Homepage home = new Homepage();
	        home.hoverOverMenu();
	    }

	    @Test
	    public void testScrollToFooter() {
	        Homepage home = new Homepage();
	        home.scrollAndClickFooter();
	    }

	    @Test
	    public void testLogoVisible() {
	        Homepage home = new Homepage();
	        Assert.assertTrue(home.isLogoDisplayed(), "Logo is not visible");
	    }

	    @Test
	    public void testWishlistText() {
	        Homepage home = new Homepage();
	        Assert.assertEquals(home.getWishlistText().toLowerCase(), "wish list", "Text mismatch");
	    }

	    @Test
	    public void testTitle() 
	    {
	        Homepage home = new Homepage();
	        String expected = "Uncommon Goods | Cool, Unique & Unusual Gifts";
	        Assert.assertEquals(home.getPageTitle(), expected);
	    }

	    @Test
	    public void testScreenshots() throws Exception 
	    {
	        Homepage home = new Homepage();
	        home.takeScreenshots();
	    
	}


}
