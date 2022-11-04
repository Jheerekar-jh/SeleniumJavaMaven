package TestNgpackage2;

import org.testng.annotations.Test;

public class APIAutomation {
	
	@Test(groups={"Smoke"})
	public void api()
	{
		System.out.println("this is api from API Automation");
	}
	
	@Test
	public void api1()
	{
		System.out.println("this is ap1 from API automation");
	}
	@Test
	public void api2()
	{
		System.out.println("this is ap2 from API automation");
	}
}
