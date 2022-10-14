package LocatersConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class DynamicDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		driver.findElement(By.id("ctl00_mainContent_ddl_originStation1_CTXT")).click();
		Thread.sleep(2000);
		List<WebElement> origin=driver.findElements(By.cssSelector("div[class='dropdownDiv'] ul li"));

		//int s=origin.size();
		//System.out.println(s);

		for( WebElement d:origin)
		{

			if(d.getText().equals("Srinagar (SXR)"))
			{
				d.click();
				break;
			}
			System.out.println(d.getText());

		}

		driver.findElement(By.id("ctl00_mainContent_ddl_destinationStation1_CTXT")).click();
		Thread.sleep(2000);
		List<WebElement> arr=driver.findElements(By.cssSelector("div[class='dropdownDiv'] ul li"));

		for(WebElement a: arr)
		{

			if(a.getText().equals("Surat (STV)"))
			{
				a.click();
				break;
			}
			System.out.println(a.getText());
		}
















	}

}
