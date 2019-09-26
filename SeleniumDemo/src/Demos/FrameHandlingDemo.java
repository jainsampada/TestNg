package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class FrameHandlingDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		String path;
		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("http://172.16.10.77/hrm/login.php/");
		//driver.get("https://facebook.com");
		
		//Thread.sleep(5000);
//		driver.findElement(By.name("txtUserName")).sendKeys("admin");
//		driver.findElement(By.name("txtPassword")).sendKeys("admin");
//		driver.findElement(By.name("Submit")).submit();
//		
//		driver.findElement(By.xpath("//input[@value='0038']")).click();
	}

}
