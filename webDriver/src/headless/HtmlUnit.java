package headless;

import org.openqa.selenium.htmlunit.HtmlUnitDriver;

public class HtmlUnit {
	public static void main(String[] args) {
		HtmlUnitDriver driver=new HtmlUnitDriver();
		
		driver.get("https://github.com/login");
		System.out.println("Title of the page: "+driver.getTitle());
		System.out.println("Current Url: "+driver.getCurrentUrl());
	}
}
