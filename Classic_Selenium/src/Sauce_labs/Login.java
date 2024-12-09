package Sauce_labs;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login
{
	@FindBy(id="user-name")
	public WebElement usn;

	@FindBy(id="password")
	public WebElement psw;

	@FindBy(id="login-button")
	public WebElement login;
	
	public Login(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}

	public void EnterUsn()
	{
		usn.sendKeys("standard_user");
	}
	public void Enterpass()
	{
		psw.sendKeys("secret_sauce");
	}
	public void ClickLogin()
	{
		login.click();
	}


}
