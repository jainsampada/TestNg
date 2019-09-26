package Demos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class DragAndDropDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String path;
		path=System.getProperty("user.dir")+"//Browser//chromedriver.exe";
		System.setProperty("webdriver.chrome.driver", path);
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://jqueryui.com/droppable/");
		driver.switchTo().frame(0);
		
		Actions act=new Actions(driver);
		act.clickAndHold(driver.findElement(By.id("draggable")))
		.moveToElement(driver.findElement(By.id("droppable")))
		.release().build().perform();
	}

}
