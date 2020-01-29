package headless;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.firefox.FirefoxOptions;

public class headlessCrome {
	public static void main(String[] args) {
		
		//System.setProperty("webdriver.chrome.driver", "C:\\Users\\y509137\\eclipse\\cromeDriver\\chromedriver.exe");
		
		//WebDriver driver = new ChromeDriver();
		
System.setProperty("webdriver.gecko.driver", "C://Users//y509137//eclipse//geckodriver//geckodriver.exe");
		
		FirefoxOptions option=new FirefoxOptions();
		//option.setHeadless(true);
		option.addArguments("--headless");
		
		WebDriver driver=new FirefoxDriver(option);
		driver.get("http://www.facebook.com");
		System.out.println("Title of the page: "+driver.getTitle());
	}

}
