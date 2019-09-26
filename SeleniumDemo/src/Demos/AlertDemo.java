package Demos;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AlertDemo {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
String path;
		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.name("proceed")).click();
		
		Alert alt=driver.switchTo().alert();
		String str=alt.getText();	
		System.out.println(str);
		Thread.sleep(5000);
		alt.accept();
	
		}
}
