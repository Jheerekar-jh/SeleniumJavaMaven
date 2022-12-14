package LocatersConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class StringPasswordExtract {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		Thread.sleep(2000);
		
		//partial Text
		driver.findElement(By.linkText("Forgot your password?")).click();
		
		Thread.sleep(2000);
		
		driver.findElement(By.className("reset-pwd-btn")).click();
		
		WebElement pwdtText=driver.findElement(By.className("infoMsg"));
		
		String pwd1=pwdtText.getText();
		
		String[] ArrayPwd= pwd1.split("'");
		String password=ArrayPwd[1].split("'")[0];
		
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys(password);
		
		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();
		System.out.println("THis is sending into git repoistry");
		System.out.println("THis is sending into git repoistry");
		System.out.println("THis is sending into git repoistry");

		
		
		
		
		
		//Xpath
		//driver.findElement(By.xpath("//button[@type='submit']")).click();

	}

}
