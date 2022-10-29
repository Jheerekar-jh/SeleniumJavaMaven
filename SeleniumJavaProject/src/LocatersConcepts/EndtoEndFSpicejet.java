package LocatersConcepts;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class EndtoEndFSpicejet {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\Driver\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(6));
		driver.manage().window().maximize();
		driver.get("https://rahulshettyacademy.com/dropdownsPractise/");

		// Selecting Radio Buttons

		/*
		 * WebElement radioButton= driver.findElement(By.cssSelector(
		 * "input[name='ctl00$mainContent$rbtnl_Trip']"));
		 * 
		 * radioButton.findElement(By.cssSelector("label[text()=''"))
		 */
		//Auto Suggestive Dropdown
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
			//System.out.println(d.getText());

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
			//System.out.println(a.getText());
		}
		//Calender
		WebElement date= driver.findElement(By.cssSelector(".ui-state-default.ui-state-highlight.ui-state-hover"));
		date.click();


		//Passenger DropDown
		driver.findElement(By.id("divpaxinfo")).click();
		
		// Currency
		List<WebElement> selectDropdown=driver.findElements(By.id("ctl00_mainContent_DropDownListCurrency"));
		//System.out.println(selectDropdown.size());
		for(WebElement sd:selectDropdown)
		{
		
			if(sd.getText().equals("USD"))
			{
				sd.click();
				break;
			}
			System.out.println(sd.getText());
		}
		
		//Checkboxes
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
		
		
		//Search
		driver.findElement(By.id("ctl00_mainContent_btn_FindFlights")).click();
		
		//Closing Current browser		
		//driver.close();

	}
}
