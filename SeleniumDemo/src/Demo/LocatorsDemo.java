package Demo;

import java.sql.Driver;
import java.util.ArrayList;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

import okhttp3.Challenge;

public class LocatorsDemo {
	String path;
	WebElement uname,pass,sub;
public void Locate()
{
	path=System.getProperty("user.dir")+"\\Browser\\chromedriver.exe";
	System.setProperty("webdriver.chrome.driver", path);
	//ChromeOptions opt=new ChromeOptions();
	//opt.setHeadless(true);
	//WebDriver drive=new ChromeDriver(opt);
	
	WebDriver drive=new ChromeDriver();

	drive.navigate().to("https://www.facebook.com");
	//Locate elements by Id Locator/Selector
//	uname=drive.findElement(By.id("email"));
//	if(uname.isDisplayed())
//	{
//			uname.sendKeys("admin");
//	}
//	drive.findElement(By.id("pass")).sendKeys("admin");
//	drive.findElement(By.id("loginbutton")).click();
//	drive.navigate().back();
//	Select slt=new Select(drive.findElement(By.id("day")));
//	slt.selectByValue("4");
	//Locate elements by name Locator/Selector
//	drive.findElement(By.name("email")).sendKeys("admin");
//	drive.findElement(By.name("pass")).sendKeys("admin");
//	drive.findElement(By.id("loginbutton")).click();
	
	//Locate element by Classname
	//drive.findElement(By.className("inputtext")).sendKeys("admin");
	//drive.findElement(By.className("inputtext")).sendKeys("admin123");
	
	
	//Locate element by Linktext
//	drive.findElement(By.linkText("Forgotten account?")).click();
	String title=drive.getTitle();
	System.out.println(title);
	
	//Locate element by PartialLinktext
//	drive.findElement(By.partialLinkText("account?")).click();
//	String title=drive.getTitle();
	
	
	//By tag name
//	List<WebElement> al=drive.findElements(By.tagName("img"));
//	
//	System.out.println(al.size());
//	for(int i=0;i<al.size();i++)
//	{
//		System.out.println(al.get(i).getAttribute("src"));
//		//System.out.println(al.get(i).getText());
//	}
	//drive.navigate().back();
	
	//Xpath -- 1st Approach
	//drive.findElement(By.xpath("//input[@type='email']")).sendKeys("admin");
	//drive.findElement(By.xpath("//input[@class='inputtext']")).sendKeys("admin");

	
	//Xpath -- 2nd Approach
	//drive.findElement(By.xpath("//input[contains(@id,'u_0')]")).click();
	//XPATH -- 3rd Approach by using text() method
//	WebElement el=drive.findElement(By.xpath("//span[contains(text(),'Create')]"));
//	System.out.println(el.getText());
//	drive.findElement(By.xpath("//input[@id='email'or @name='email']")).sendKeys("admin");
	
	
	
	//Handling Radio Button
//	drive.findElement(By.xpath("//input[@value='1']")).click();
//	drive.findElement(By.xpath("//input[@id='pass']")).sendKeys("admin");
	
	//By CssSelector
//	drive.findElement(By.cssSelector("input#email")).sendKeys("admin");
//	drive.findElement(By.cssSelector("input.inputtext")).sendKeys("admin");
	drive.findElement(By.cssSelector("input#email[type='email']")).sendKeys("admins");
	drive.close();
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LocatorsDemo oo=new LocatorsDemo();
		oo.Locate();
	}

}
