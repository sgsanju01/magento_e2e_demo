package stepDefinitions;

import org.openqa.selenium.WebDriver;

import io.cucumber.java.en.*;
import pages.CreateCustomer;
import pages.CustomerAccountPage;
import utilities.TestBase;

public class SignupSteps {
	
	WebDriver driver = TestBase.driver;
	
	CreateCustomer createCustomer;
	CustomerAccountPage customerAccountPage;

	@Given("I navigate to the signup page")
	public void i_navigate_to_the_signup_page() {
	    driver.get("https://magento.softwaretestingboard.com/customer/account/create/");
	}
	
	@When("I enter registration details")
	public void i_enter_registration_details() {
		createCustomer = new CreateCustomer(driver);
			createCustomer.enterSignUpDetails(  "sanjay",
												"gupta",
												"test1310@mail.com", 
												"test@123",
												"test@123");
	}
	
	@When("I click the signup button")
	public void i_click_the_signup_button() {
		createCustomer.clickSignupBtn();
	}
	
	@Then("I should see a success message")
	public void i_should_see_a_success_message() {
		customerAccountPage = new CustomerAccountPage(driver);
		customerAccountPage.successfullyCreatedAccount();
	}


}
