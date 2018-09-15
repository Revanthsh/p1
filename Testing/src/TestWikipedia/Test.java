package TestWikipedia;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\eclipse work space\\Testing\\exefiles\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("http://www.wikipedia.org");
	WebElement link;
	link=driver.findElement(By.linkText("English"));
	link.click();
	Thread.sleep(5000);
		WebElement searchBox;
		searchBox=driver.findElement(By.id("searchInput"));
		searchBox.sendKeys("software");
		Thread.sleep(5000);
		driver.quit();
		


	}

}
