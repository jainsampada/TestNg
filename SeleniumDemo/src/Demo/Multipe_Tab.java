package Demo;

import java.util.ArrayList;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.JavascriptExecutor;
public class Multipe_Tab {
	String path;
	public void Open_Browser()
	{
		path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
		System.out.println(path);
		System.setProperty("webdriver.chrome.driver", path);
		
		
//		//Launch Chrome Browser
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.facebook.com");
		
		((JavascriptExecutor)driver).executeScript("window.open()");
	    ArrayList<String> tabs = new ArrayList<String>(driver.getWindowHandles());
	    driver.switchTo().window(tabs.get(1));
	    driver.get("http://google.com");
	    
//	    Set <String> ids = driver.getWindowHandles();
//	    Iterator <String> it = ids.iterator();
//	    String parentid = it.next();
//	    String newWindow = it.next();
//	    driver.switchTo().window(newWindow);
//	    driver.get("https://www.google.com");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Multipe_Tab oo=new Multipe_Tab();
		oo.Open_Browser();
		

	}
}
