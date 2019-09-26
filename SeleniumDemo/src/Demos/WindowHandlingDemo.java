package Demos;

import java.util.Iterator;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowHandlingDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path;
		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://www.popuptest.com/goodpopups.html");
		driver.findElement(By.linkText("Good PopUp #3")).click();
		Set<String> handler=driver.getWindowHandles();
		Iterator<String> it=handler.iterator();
		String parentid=it.next();
		System.out.println("Parent Window Id"+parentid);
		
		String childid=it.next();
		System.out.println("Child Window id is:"+childid);
		
		driver.switchTo().window(childid);
		String childTitle=driver.getTitle();
		System.out.println("Child Window Title is:"+childTitle);
		driver.close();
		
		driver.switchTo().window(parentid);
		driver.close();
	}

}
