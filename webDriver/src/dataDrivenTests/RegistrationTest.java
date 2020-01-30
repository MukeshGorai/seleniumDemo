package dataDrivenTests;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class RegistrationTest {
	public static void main(String[] args) throws IOException {
		
		System.setProperty("webdriver.gecko.driver", "C://Users//y509137//eclipse//geckodriver//geckodriver.exe");
		
		WebDriver driver=new FirefoxDriver();
		driver.get("https://github.com/login");
		
		FileInputStream file=new FileInputStream("C://Users//y509137//eclipse//Book1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//XSSFSheet sheet=workbook.getSheet("Sheet1"); //providing sheet name
		XSSFSheet sheet=workbook.getSheetAt(0); //providing index of sheet
		
		int rowcount=sheet.getLastRowNum(); //returns the row count
		
		int colcount=sheet.getRow(0).getLastCellNum(); //returns column or cell count
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i); //focused on current row
			
			String First_name=currentrow.getCell(0).getStringCellValue();
			String Email=currentrow.getCell(1).getStringCellValue();
			String Address=currentrow.getCell(2).getStringCellValue();
			String Phone=currentrow.getCell(3).getStringCellValue();
			
			
			
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString(); //read the value from the cell
				System.out.print(" " +value);
			}
			System.out.println();
		}
	}
}
