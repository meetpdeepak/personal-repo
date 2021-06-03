package SeleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class BrowserOpen {

	public void chromebrowse() {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\O365GRS\\Desktop\\Automation\\chorme v89\\chromedriver.exe");
        
		WebDriver driver = new ChromeDriver();
		String baseurl = "https:\\google.com";
		driver.get(baseurl);

		driver.manage().window().maximize();

		//Delay execution for 5 seconds to view the maximize operation
		try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
		driver.quit();

	}

}
