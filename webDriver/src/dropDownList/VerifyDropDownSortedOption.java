package dropDownList;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class VerifyDropDownSortedOption {

	public static void main(String[] args) {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//y509137//eclipse//geckodriver//geckodriver.exe");
		WebDriver driver=new FirefoxDriver();
		driver.get("https://signup.softwareag.cloud/#/?product=webmethodsioint");
		driver.manage().window().maximize();
		WebElement element=driver.findElement(By.id("inputCountry"));
		Select sc=new Select(element);
		
		List originalList=new ArrayList();
		List <WebElement>options=sc.getOptions();
		
		for(WebElement e:options)
		{
			originalList.add(e.getText());
		}
		
		System.out.println(originalList);
		
		List temList=new ArrayList();
		temList=originalList;
		
		System.out.println("Before sorting temp list:" +temList);
		
		Collections.sort(temList);
		System.out.println("After sorting temp list:" +temList);
		if(originalList==temList)
		{
			System.out.println("dropdown is sorted");
		}
		else
		{
			System.out.println("dropdown is not sorted");
		}
	}

}
