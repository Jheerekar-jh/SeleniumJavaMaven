package LocatersConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Classname
		
		List<WebElement> FromList=driver.findElements(By.xpath("//input[@id='ctl00_mainContent_ddl_originStation1_CTXT'][1]"));
		for(WebElement from: FromList)
		{
			System.out.println(from);
			
		}
		

	}

}
