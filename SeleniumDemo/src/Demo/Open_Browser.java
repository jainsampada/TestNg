package Demo;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Open_Browser {
	String title,exptitle="Facebook",path;
public void Launch()
{
	
	//Setting path of Chrome Driver
	//System.setProperty("webdriver.chrome.driver", "D:\\Sel_Softwares\\chromedriver_win32 (3)\\chromedriver.exe");
	
	
	//Getting path of Chrome Driver
	path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
	System.out.println(path);
	System.setProperty("webdriver.chrome.driver", path);
	
	
//	//Launch Chrome Browser
	WebDriver driver =new ChromeDriver();
//	
//	//Lauching Application on Chrome Driver
driver.get("https://www.facebook.com");
//	driver.navigate().to("https://www.facebook.com");
//	
//	//gettitle method will fetch the actual title of the page
//	title=driver.getTitle();
//	
//	if(exptitle.equals(title))
//	{
//		System.out.println("You are on correct page");
//	}
//	else
//	{
//		System.out.println("Not landing on correct page");
//	}
//	//To maximize the browser window
//	driver.manage().window().maximize();
//	
//	//To delete cookies
//	driver.manage().deleteAllCookies();
//	
//	//driver.navigate().back();
//	//driver.navigate().to("https://www.google.com");
//	//driver.navigate().forward();
//	//driver.navigate().refresh();
//	//driver.close();
//	//driver.quit();
	
}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Open_Browser oo=new Open_Browser();
		oo.Launch();
	}

}
