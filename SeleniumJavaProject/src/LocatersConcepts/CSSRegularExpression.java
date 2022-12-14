package LocatersConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;


public class CSSRegularExpression {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();	
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		
		
		driver.findElement(By.linkText("Forgot your password?")).click();
		Thread.sleep(2000);
		driver.findElement(By.className("go-to-login-btn")).click();
		String password = getPassword(driver);
		driver.findElement(By.xpath("//input[@id='inputUsername']")).sendKeys("rahulshettyacademy");
		driver.findElement(By.cssSelector("input[name='inputPassword']")).sendKeys(password);
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[contains(@class,'submit ')]")).click();
		Thread.sleep(2000);
		Assert.assertEquals(driver.findElement(By.tagName("p")).getText(), "You are successfully logged in.");
		
		//String loginSuccessful=driver.findElement(By.xpath("//div[contains(@class,'login-container')]/p")).getText();
		//Assert.assertEquals(loginSuccessful, "You are successfully logged in.");
				
		
		// ("//button[text()='Log Out']")
		driver.findElement(By.xpath("//*[text()='Log Out']")).click();
		
		
		
		
		

	}
	
	public static String  getPassword(WebDriver driver)
	{
		driver.findElement(By.className("reset-pwd-btn")).click();
		String Text=driver.findElement(By.className("infoMsg")).getText();
		System.out.println(Text);
		
		String[] passText1=Text.split("'");
		
		String passText2=passText1[1].split("'")[0];
		
		System.out.println(passText1[1]);
		//String passText2=passText1[1].split("'")[0];
		//System.out.println(passText2);
		return passText2;
		
		
		
		
	}

}
