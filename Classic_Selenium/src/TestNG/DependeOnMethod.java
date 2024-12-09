package TestNG;

import org.testng.annotations.Test;

public class DependeOnMethod 
{

	@Test
	public void Signup()
	{
		System.out.println("signup successfull");
		
	}
	@Test(dependsOnMethods = "Signup")
	public void login()
	{
		System.out.println("login successfull");
	}
	@Test(dependsOnMethods = "login")
	public void frndreq()
	{
		System.out.println("frndreq sent successfull");
	}

}
