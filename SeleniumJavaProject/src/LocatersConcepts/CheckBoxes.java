package LocatersConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckBoxes {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");

		WebDriver driver= new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		List<WebElement> checkboxeslist=driver.findElements(By.cssSelector("div#discount-checkbox div"));
		for(WebElement options:checkboxeslist)
		{

			if(options.getText().equals("Indian Armed Forces"))
			{
				options.click();
				break;
				
				//System.out.println("");

			}

			System.out.println(options.getText());
		}

	}

}
