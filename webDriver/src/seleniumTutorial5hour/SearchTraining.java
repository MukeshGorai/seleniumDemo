package seleniumTutorial5hour;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;


public class SearchTraining {

	WebDriver driver;
	
	//Launching the Firefox browser
	
	public void LaunchBrowser() {
		System.setProperty("webdriver.gecko.driver", "drivers/geckodriver.exe");
		
		driver=new FirefoxDriver();
		//driver.get("https://www.simplilearn.com/");
	}
	
	//Searching selenium training and clicking on it
	
//	public void search() throws InterruptedException {
//		driver.findElement(By.id("header_srch")).sendKeys("Selenium");
//		Thread.sleep(3000);
//		driver.findElement(By.className("input-search-btn")).click();
//		Thread.sleep(3000);
//		driver.findElement(By.xpath("/html/body/div[3]/div[3]/div[1]/div[4]/div[2]/div[4]/div[2]/div/ul/li[2]/a/div[1]/h2")).click();
//		System.out.println("The page title is :" +driver.getTitle());
//	}
//	public void ScrollDown() throws InterruptedException {
//		driver.findElement(By.id("header_srch")).sendKeys("Selenium");
//		Thread.sleep(3000);
//		driver.findElement(By.className("input-search-btn")).click();
//		Thread.sleep(3000);
//		JavascriptExecutor js=(JavascriptExecutor) driver;
//		js.executeScript("window.scrollBy(0,600)");
//	}
	
	public void mouseHover() {
		driver.get("https://www.amazon.in/");
		WebElement ele= driver.findElement(By.xpath("/html/body/div[1]/header/div/div[1]/div[2]/div/a[2]/span[2]"));
		Actions act=new Actions(driver);
		act.moveToElement(ele).perform();
	}
	
	public void closebrowser() {
		driver.close();
	}
	
	public static void main(String[] args) throws InterruptedException {
		SearchTraining obj=new SearchTraining();
		obj.LaunchBrowser();
		//obj.search();
		//obj.ScrollDown();
		//obj.closebrowser();
		obj.mouseHover();

	}

}
