package TestNG;

import org.testng.annotations.Test;

public class Priority 
{
  
	@Test(priority=2)
	public void yellowboxtesting()
	{
		System.out.println("This is the testcase of yellowbox");
		
	}
	@Test(priority=1)
	public void login()
	{
		System.out.println("This is the testcase of login");
	}
	@Test(priority=0)
	public void signup()
	{
		System.out.println("This is the testcase of signup");
	}
}
