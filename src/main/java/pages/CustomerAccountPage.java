package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

public class CustomerAccountPage {

	WebDriver driver;

	public CustomerAccountPage(WebDriver driver) {
		this.driver = driver;
	}

	By successful_create_user_message = 
			By.xpath("//div[text()='Thank you for registering with Main Website Store.']");
	
	By my_account_title = By.xpath("//h1/span[text()='My Account']");
	

	public void successfullyCreatedAccount() {
		String actual_message = driver.findElement(successful_create_user_message).getText();
		String expected_message = "Thank you for registering with Main Website Store.";
		Assert.assertEquals(expected_message, actual_message, "created successfully user account");
	}
	
	public void verifyPageTitle()
	{
		String actual_pagetitle = driver.findElement(my_account_title).getText();
		String expected_title = "My Account";
		Assert.assertEquals(expected_title, actual_pagetitle,
				"account login successfully and landed on my account page");
	}
}
