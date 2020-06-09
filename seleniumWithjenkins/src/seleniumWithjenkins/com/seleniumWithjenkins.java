package seleniumWithjenkins.com;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class seleniumWithjenkins {
	WebDriver driver;
	
	// Launching thr firefox browser
	public void LaunchBrowser() {
		System.setProperty("webdriver.chrome.driver", "drivers/chromedriver.exe");
		driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
	}
	
	// Search Mobile
	public void Search() throws InterruptedException {
		driver.findElement(By.id("twotabsearchtextbox")).sendKeys("Mobile");
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='nav-input']")).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//*[@class='a-size-medium a-color-base a-text-normal']")).click();
		System.out.println("The page Title is: " + driver.getTitle());
		System.out.println("Hello World");
		
	}
	
	// close the browser
	public void CloseBrowser() {
		driver.quit();
	}

	public static void main(String[] args) throws InterruptedException {
		seleniumWithjenkins obj = new seleniumWithjenkins();
		obj.LaunchBrowser();
		obj.Search();
		obj.CloseBrowser();
		

	}

}
