package SeleniumDemos;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropdownExample {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\O365GRS\\Desktop\\Automation\\chorme v89\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.browserstack.com");
		driver.manage().window().maximize();

//		Select objSelect = new Select(driver.findElement(By.id("developers-menu-toggle")));
		Select objSelect = new Select(driver.findElement(By.xpath("//*[@class='developers-menu-toggle']")));
		objSelect.selectByIndex(2);
		Thread.sleep(3000);
		
		
/*		driver.navigate("https://www.browserstack.com/");
		Select solutions = new Select(driver.findElement(By.id("solutions-menu-dropdown")));
		solutions.selectByValue("4000");
		Thread.sleep(3000);

		Select s1 = new Select(driver.findElement(By.id("solutions-menu-dropdown")));
		s1.selectByVisibleText("Geolocation Testing");
*/
		driver.quit();
	}

}
