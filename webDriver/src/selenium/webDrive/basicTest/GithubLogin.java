package selenium.webDrive.basicTest;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class GithubLogin {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//y509137//eclipse//geckodriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.manage().window().maximize();
		driver.get("https://github.com/login");
		driver.findElement(By.name("login")).sendKeys("mukeshgorai21@gmail.com");
		driver.findElement(By.name("password")).sendKeys("Mukukumar123@");
		driver.findElement(By.name("commit")).click();

		String exp_title= "GitHub";
		String act_title= driver.getTitle();
		
		driver.findElement(By.xpath("/html/body/div[4]/div/aside[1]/div[2]/div/div/ul/li[1]/div/a")).click();
//		if(exp_title.equals(act_title)==true) {
//			System.out.println("tested is passed");
//		}
//		else {
//			System.out.println("tested is failed");
//		}
		//driver.close();
		
	}

}
