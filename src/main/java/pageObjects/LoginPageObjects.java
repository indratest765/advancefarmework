package pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPageObjects {
	
	
	
	public LoginPageObjects(WebDriver driver) {
		PageFactory.initElements(driver, this);
	}
	
	
	@FindBy(name="login[email]")
	WebElement name_txt;
	
	@FindBy(name="login[password]")
	WebElement password_txt;
	
	@FindBy(xpath="//button[contains(text(),'Login')]")
	WebElement login_btn;
	
	
	public void login(String email,String password)
	{
		name_txt.sendKeys(email);
		password_txt.sendKeys(password);
		login_btn.click();
		
	}

}
