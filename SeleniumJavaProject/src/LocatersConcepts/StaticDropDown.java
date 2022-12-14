package LocatersConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StaticDropDown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		List<WebElement> selectDropdown=driver.findElements(By.id("ctl00_mainContent_DropDownListCurrency"));
		//System.out.println(selectDropdown.size());
		for(WebElement sd:selectDropdown)
		{
		
			if(sd.getText().equals("INR"))
			{
				sd.click();
				break;
			}
			System.out.println(sd.getText());
		}
		
	}

}
