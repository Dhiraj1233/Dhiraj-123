package TestNG;

import org.testng.annotations.Test;

public class InvocationCount 
{
	
	  
		@Test(invocationCount = 2)
		public void UploadPicinfaceboo()
		{
			System.out.println("pic upload successfull");
			
		}
		@Test(invocationCount =3)
		public void loginfacebook()
		{
			System.out.println("login successfull");
		}
		@Test(invocationCount=4)
		public void signupfacebook()
		{
			System.out.println(" signup successfull");
		}
	}



