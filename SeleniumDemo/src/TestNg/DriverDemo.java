package TestNg;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;

public class DriverDemo {
	String path;
	public static WebDriver driver;
@BeforeSuite
public void Launch()
{
	path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	
	driver=new ChromeDriver();

	driver.navigate().to("https://www.facebook.com");
	
}
@AfterSuite
public void Close_Browser()
{
	driver.close();
}
}
