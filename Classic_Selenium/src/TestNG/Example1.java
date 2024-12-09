package TestNG;

import org.testng.Reporter;
import org.testng.annotations.Test;

public class Example1 
{
	@Test
	public void Testcase()
	{
		Reporter.log("Mahindra",true);
	}
	@Test
	public void Testcase1()
	{
		Reporter.log("Tata",true);
	}

}
