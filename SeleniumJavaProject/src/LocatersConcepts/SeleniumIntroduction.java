package LocatersConcepts;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class SeleniumIntroduction {

	public static void main(String[] args) throws InterruptedException {
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\61478\\Documents\\Selenium-CoreJava\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir")+"\\Driver\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		//Implicit wait
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.get("https://rahulshettyacademy.com/locatorspractice/");
		String title=driver.getTitle();
		System.out.println(title);
		//driver.close();// THis will close current window
		//driver.quit(); // This is suitable when multiple windows are open

		//System.out.println(System.getProperty("user.dir"));
		//System.getProperty("user.dir");		

		Thread.sleep(2000);

		//partial Text
		driver.findElement(By.linkText("Forgot your password?")).click();

		Thread.sleep(2000);

		driver.findElement(By.className("reset-pwd-btn")).click();

			
		String password=getPassword(driver);
		driver.findElement(By.xpath("//div[@class='forgot-pwd-btn-conainer']/button[1]")).click();
		driver.findElement(By.id("inputUsername")).sendKeys("rahulshettyacademy");
		driver.findElement(By.name("inputPassword")).sendKeys(password);

		Thread.sleep(2000);
		driver.findElement(By.className("signInBtn")).click();



		//driver.findElement(By.cssSelector("input[type='text']:nthg-child(2)")).sendKeys("1234");
		//[//form/H2/Input(3) This is Xpath
	}

	public static String getPassword(WebDriver driver)
	{
		String pwdText=driver.findElement(By.className("infoMsg")).getText();

		String[] text=pwdText.split("'");
		String password=text[1].split("'")[0];
		return password;	

	}


}
