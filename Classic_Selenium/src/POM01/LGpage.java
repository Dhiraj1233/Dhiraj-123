package POM01;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LGpage 

{
	@FindBy(id="Email")
	private WebElement usn;
	
	//initilization
		public LGpage(WebDriver driver)
		{
			PageFactory.initElements(driver, this);
		}
		
		public void Enterusn()
		{
			usn.sendKeys("admin");
		}

}
