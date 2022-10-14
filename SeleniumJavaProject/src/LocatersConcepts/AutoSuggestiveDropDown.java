package LocatersConcepts;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class AutoSuggestiveDropDown {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();		
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");
		
		//Classname
		
		driver.findElement(By.id("autosuggest")).sendKeys("Ind");
		Thread.sleep(2000);
		List<WebElement> auto=driver.findElements(By.xpath("//ul[@id='ui-id-1']/li/a"));
		
		for(WebElement a:auto)
		{
			if(a.getText().equals("India"))
			{
				a.click();
				break;
			}
			System.out.println(a.getText());
		}
		
		
		
	
		
		

	}

}
