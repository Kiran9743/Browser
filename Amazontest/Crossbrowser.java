package Amazontest.Amazontest;

import org.testng.annotations.Test;
import org.testng.annotations.BeforeTest;
import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterTest;

public class Crossbrowser {
	WebDriver driver;
	@Parameters({"bname"})
	
  @Test
  public void BrowserTest(String bname) throws malformedURLException, InterruptedExecption
  {
		if(bname.equalaIgnoreCase("Chrome"))
		{
			ChromeOptions options=new ChromeOptions();
			driver=new RemoteWeDriver(new URL("htt://localhost:4444"),options);
		System.out.println("successful lunched the chrome browser");
		
		}
		if(bname.equalsIgnoreCase("firefox"))
		{
			
		firefoxOptions options=new firefoxOptions();
		driver=new RemoteWeDriver(new URL("htt://localhost:4444"),options);
	System.out.println("successful lunched the firefox browser");
		}
		if(bname.equalsIgnoreCase("edge"))
  {
			EdgeOptions options=new EdgeOptions();
			driver=new RemoteWeDriver(new URL("htt://localhost:4444"),options);
		System.out.println("successful lunched the edge browser");
  }
		
		Thread.sleep(5000)
		driver.get("https://www.amazon.in");
		Thread,sleep(3000);
		System.out.println("application executing parallelly!");
		driver.quit();

}
}