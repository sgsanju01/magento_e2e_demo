package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.CustomerAccountPage;
import pages.UserLoginPage;
import utilities.TestBase;

public class LoginStep {
	
	/*	sanjay gupta
		email : test131@mail.com
		password : test@123
	 */
	
	WebDriver driver = TestBase.driver;

	CustomerAccountPage customerAccountPage;
	UserLoginPage userLoginPage;
	
	@Given("I navigate to the login page")
	public void i_navigate_to_the_login_page() {
	    
		String login_url = TestBase.getProperties("login.url");
		driver.get(login_url);
		
	}

	@When("I enter email and password")
	public void i_enter_email_and_password() {
		
		String useremail = TestBase.getProperties("email");
		String user_password = TestBase.getProperties("password");
		
		userLoginPage = new UserLoginPage(driver);
		userLoginPage.enterEmailPassword(useremail, user_password);
	}

	@When("I click the sign in button")
	public void i_click_the_sign_in_button() {
		userLoginPage.clickSignBtn();
	}

	@Then("I should see my account page")
	public void i_should_see_my_account_page() {
		customerAccountPage = new CustomerAccountPage(driver);
		customerAccountPage.verifyPageTitle();
	}


}
