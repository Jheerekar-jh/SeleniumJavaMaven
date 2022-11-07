package TestNgpackage2;

import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class APIAutomation {
	@Parameters({"APIautomationURL"})
	@Test(groups={"Smoke"},dependsOnMethods= {"api2"})
	public void api(String uname)
	{
		System.out.println("this is API from API Automation");
		System.out.println("This is API URL" + " " +uname);
	}
	
	@Test(enabled=false)
	public void api1()
	{
		System.out.println("this is ap1 from API automation");
	}
	@Test
	public void api2()
	{
		System.out.println("this is ap2 from API automation");
	}
	@Test(groups={"Smoke"})
	public void selenium()
	{
		System.out.println("this is selenium from selenium Automation");
	}
	@Test
	public void selenium1()
	{
		System.out.println("this is selenium1 from selenium automation");
	}
	@Test
	public void selenium2()
	{
		System.out.println("this is selenium2 from selenium automation");
	}
	@Test(groups={"Smoke"})
	public void mobile()
	{
		System.out.println("this is mobile from mobile Automation");
	}
	@Test
	public void mobile1()
	{
		System.out.println("this is mobile1 from mobile automation");
	}
	@Test
	public void mobile2()
	{
		System.out.println("this is mobile2 from mobile automation");
	}

}
