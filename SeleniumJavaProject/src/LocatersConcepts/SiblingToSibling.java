package LocatersConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SiblingToSibling {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/AutomationPractice");
		driver.findElement(By.xpath("//Header/div/button[1]/following-sibling::button[1]")).click();
		

	}

}
