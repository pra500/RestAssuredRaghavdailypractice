package alwayspracticehere;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;

public class NewfTest {
	
	
	WebDriver driver;
	
	
  @Test
  public void uTest() {
	  
	  
	 String title= driver.getTitle();
	 
	 System.out.println(title);
  }
  
  
  
  @Test(priority = 1)
  public void jTest() {
	  
	String s=  driver.getWindowHandle();
	System.out.println(s);
	  
  }
  
  

  @BeforeClass
  public void beforeClass() {
	  
	  
	  driver=new ChromeDriver();
	  driver.manage().window().maximize();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://practicetestautomation.com/practice-test-login/");
  }

  @AfterClass
  public void afterClass() {
	  
	  driver.close();
	  
  }
  
}
