package POM01;



import org.testng.annotations.Test;



public class Execution extends LaunchBrowser
{

	@Test
	public void LGpage() throws Exception
	{
		LGpage lp=new LGpage(driver);
		Thread.sleep(2000);
		lp.Enterusn();
		
		
	}
	
	
	

}
