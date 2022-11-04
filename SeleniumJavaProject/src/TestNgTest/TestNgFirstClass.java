package TestNgTest;

import org.testng.annotations.Test;

public class TestNgFirstClass {
	@Test
	public void demo()
	{
		System.out.println("This is TestNg First Class");
	}
	

	@Test(groups={"Smoke"})
	public void secondMethod()
	{
		System.out.println("This is second method");
	}
	
	
	
	

}
