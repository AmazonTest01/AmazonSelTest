package amazon;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class RegressionTesting 
{
   WebDriver driver;
   @Test
   @Parameters({"browser"})
	public void browser (String str) throws Exception
	{
		
       if(str.matches("firefox"))
       {
       	System.setProperty("webdriver.gecko.driver","c://geckodriver.exe");
			driver=new FirefoxDriver();
			
       }
       Home h=new Home(driver);
       h.checkout();

	}
  	
}
