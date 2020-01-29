package selenium.webDrive.basicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class LoginTest {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//y509137//eclipse//geckodriver//geckodriver.exe");
		WebDriver driver= new FirefoxDriver();
		
		driver.get("http://newtours.demoaut.com/");
		
		driver.manage().window().maximize();//maximise the browser window
		
		driver.findElement(By.name("userName")).sendKeys("muku");
		driver.findElement(By.name("password")).sendKeys("Mukukumar123@");
		driver.findElement(By.name("login")).click();
		
		String exp_title="Find a Flight: Mercury Tours:";
		String act_title=driver.getTitle();
		
		if(exp_title.equals(act_title)==true) {
			System.out.println("test is passed");
		}
		else {
			System.out.println("test is failed");
		}
		driver.close(); //close the browser

	}

}
