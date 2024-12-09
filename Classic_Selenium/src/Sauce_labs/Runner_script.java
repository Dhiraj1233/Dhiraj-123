package Sauce_labs;

import org.testng.annotations.Test;



public class Runner_script extends General_script
{
	@Test
	public void login() throws Exception
	{
		Login lp=new Login(driver);
		lp.EnterUsn();
		Thread.sleep(2000);
		lp.Enterpass();
		Thread.sleep(2000);
		lp.ClickLogin();
		Thread.sleep(2000);
	}

}
