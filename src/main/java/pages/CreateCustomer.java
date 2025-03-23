package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class CreateCustomer {

	public WebDriver driver;
	
	public CreateCustomer(WebDriver driver)
	{
		this.driver=driver;
	}
	
	By first_name = By.cssSelector("#firstname");
	By last_name = By.cssSelector("#lastname");
	By user_email = By.cssSelector("#email_address");
	By user_password = By.cssSelector("#password");
	By confirm_user_password = By.cssSelector("#password-confirmation");
	By create_an_account_btn = By.xpath("//button/span[text()='Create an Account']");
	
	public void enterSignUpDetails(String firstname, String lastname,String email,
									String password, String confirmpassword)
	{
		
		driver.findElement(first_name).sendKeys(firstname);
		driver.findElement(last_name).sendKeys(lastname);
		driver.findElement(user_email).sendKeys(email);
		driver.findElement(user_password).sendKeys(password);
		driver.findElement(confirm_user_password).sendKeys(password);
		
	}
	
	public void clickSignupBtn()
	{
		driver.findElement(create_an_account_btn).click();
	}
	
	
}
