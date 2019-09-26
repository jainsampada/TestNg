package TestNg;

import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
import org.testng.annotations.Test;

public class HomeTest extends DriverDemo{
	@BeforeTest
	public void acc()
	{
		System.out.println("Home page Before Test");
	}
	@AfterTest
	public void acc1()
	{
		System.out.println("Home Page After TEST");
	}
@Test
public void HomePage()
{
	System.out.println("Home Page Check Title");
}
@Test
public void CheckImages()
{
	System.out.println("Home Page Check Images");
}
}
