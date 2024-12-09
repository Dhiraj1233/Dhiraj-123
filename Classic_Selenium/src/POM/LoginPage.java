package POM;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage
{
	//Declaration 
	@FindBy(id="email")
	private WebElement usn;
	
	@FindBy(name="pass")
	private WebElement psw;
	
	@FindBy(xpath="//button[@type='submit']")
	private WebElement login;
	
	
	//initilization
	public  LoginPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	//utilization
	public void Enterusn()
	{
		usn.sendKeys("admin");
	}
	public void EnterPass()
	{
		psw.sendKeys("admin@123");
	}
	public void click_Login()
	{
		login.click();
	}

}
