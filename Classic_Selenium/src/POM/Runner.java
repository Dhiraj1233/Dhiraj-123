package POM;

import org.testng.annotations.Test;

public class Runner extends Generic_Script
{
	@Test
	public void Login() throws Exception
	{
		LoginPage lp=new LoginPage(driver);
		lp.Enterusn();
		Thread.sleep(2000);
		lp.EnterPass();
		Thread.sleep(2000);
		lp.click_Login();
		Thread.sleep(2000);
		
	}

}
