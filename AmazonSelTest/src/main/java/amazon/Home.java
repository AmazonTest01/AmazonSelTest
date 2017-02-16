package amazon;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;

public class Home 
{
   WebDriver driver;
   public Home(WebDriver d)
   
   {
	   driver=d;
   }
   
   public void open()
   {
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20,TimeUnit.SECONDS);
		driver.get("https://www.amazon.in/");	
   }
   public void register() throws Exception
   {
	   open();
	   Thread.sleep(2000);
	   driver.findElement(By.id("nav-link-yourAccount")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("createAccountSubmit")).click();
	   Thread.sleep(3000);
	   driver.findElement(By.id("continue")).click();
	   String s=driver.findElement(By.xpath("//div[@class='a-alert-content']")).getText();
	   System.out.println("Error"+s);
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Chandu");
	   driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Abc123");
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   Thread.sleep(2000);
	   String s1=driver.findElement(By.xpath("//div[@class='a-alert-content']")).getText();
	   System.out.println("Error"+s1);
	   clear();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Chandu");
	   driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("adf451");
	   driver.findElement(By.xpath("//input[@id='ap_password']")).sendKeys("Abc123");
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   Thread.sleep(2000);
	   String s2=driver.findElement(By.xpath("//div[@class='a-alert-content']")).getText();
	   System.out.println("Error"+s2);
	   clear();
	   
	   Thread.sleep(2000);
	   driver.findElement(By.xpath("//input[@id='ap_customer_name']")).sendKeys("Chandu");
	   driver.findElement(By.xpath("//input[@id='ap_phone_number']")).sendKeys("8956653100");
	   driver.findElement(By.xpath("//input[@id='continue']")).click();
	   Thread.sleep(2000);
	   String s3=driver.findElement(By.xpath("//div[@class='a-alert-content']")).getText();
	   System.out.println("Error"+s3);
	   
   }
   public void checkout() throws Exception
   {
	   open();
	   Thread.sleep(2000);
	   driver.findElement(By.id("nav-link-yourAccount")).click();
	   Thread.sleep(2000);
	   driver.findElement(By.id("ap_email")).clear();
	   driver.findElement(By.id("ap_password")).clear();
	   Thread.sleep(2000);
	   driver.findElement(By.id("ap_email")).sendKeys("chandu.mankar444@gmail.com");
	   driver.findElement(By.id("ap_password")).sendKeys("Chandu@123");
	   driver.findElement(By.id("signInSubmit")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.linkText("Today's Deals")).click();
	   Thread.sleep(6000);
	   driver.findElement(By.id("a-autoid-1-announce")).click();
	   Thread.sleep(4000);
	   driver.findElement(By.xpath("//a[@title='American Tourister Crete Polyester 77cms Black Softsided Suitcase (49W (0) 09 003)']")).click();
	   Thread.sleep(2000);

	   
   }
   public void menu() throws InterruptedException
   {
	   open();
	   Thread.sleep(6000);
	   WebElement w=driver.findElement(By.xpath("/id('nav-link-shopall')/span[2]"));
	   new Actions(driver).moveToElement(w).click().perform();
	   driver.findElement(By.xpath("/id('nav-flyout-shopAll')/div[2]/span[1]/span[1]")).click();
	   Thread.sleep(3000);
   }
   public void clear()
   {
	   driver.findElement(By.xpath("//input[@id='ap_customer_name']")).clear();
	   driver.findElement(By.xpath("//input[@id='ap_phone_number']")).clear();
	   driver.findElement(By.xpath("//input[@id='ap_password']")).clear();
   }
}
