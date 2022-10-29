package LocatersConcepts;

import java.time.Duration;
import java.util.Arrays;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CheckOutCart {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");
		String[] veggies= {"Brocolli","Cauliflower","Beetroot"};
		int j=0;
		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/seleniumPractise/#/");
		Thread.sleep(3000);
		List<WebElement> productName = driver.findElements(By.cssSelector("h4.product-name"));

		for (int i=0; i< productName.size(); i++)
		{
			String[] name=productName.get(i).getText().split("-");
			String formattedString=name[0].trim();

			//Thread.sleep(1000);
			List al=Arrays.asList(veggies);

			if(al.contains(formattedString)) 
			{
				driver.findElements(By.xpath("//div[@class='product-action']/button")).get(i).click();
				j++;
				if(j==veggies.length)
				{
					break;
				}
			} 
			else 
			{ 
				System.out.println("veggie not found");
			}

		}

	}

}
