package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class UserLoginPage {

	WebDriver driver;

	public UserLoginPage(WebDriver driver) {
		this.driver = driver;
	}
	
	By user_email = By.cssSelector("#email");
	By user_password = By.cssSelector("#pass");
	By signin_btn = By.xpath("//button[@class='action login primary']/span[text()='Sign In']");
	
	public void enterEmailPassword(String email, String password)
	{
		driver.findElement(user_email).sendKeys(email);
		driver.findElement(user_password).sendKeys(password);
	}
	
	public void clickSignBtn()
	{
		driver.findElement(signin_btn).click();
	}
}
