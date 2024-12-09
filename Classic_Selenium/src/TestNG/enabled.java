package TestNG;

import org.testng.annotations.Test;

public class enabled 
{
	@Test
	public void Signup()
	{
		System.out.println("signup successfull");
		
	}
	@Test(enabled=false)
	public void login()
	{
		System.out.println("login successfull");
	}
	@Test
	public void frndreq()
	{
		System.out.println("frndreq sent successfull");
	}

}
