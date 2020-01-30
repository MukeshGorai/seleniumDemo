package dataDrivenTests;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.*;

public class ReadingDataFromExcel {

	public static void main(String[] args) throws IOException {
		
		FileInputStream file=new FileInputStream("C://Users//y509137//eclipse//Book1.xlsx");
		
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		//XSSFSheet sheet=workbook.getSheet("Sheet1"); //providing sheet name
		XSSFSheet sheet=workbook.getSheetAt(0); //providing index of sheet
		
		int rowcount=sheet.getLastRowNum(); //returns the row count
		
		int colcount=sheet.getRow(0).getLastCellNum(); //returns column or cell count
		
		for(int i=0;i<rowcount;i++)
		{
			XSSFRow currentrow=sheet.getRow(i); //focused on current row
			
			for(int j=0;j<colcount;j++)
			{
				String value=currentrow.getCell(j).toString(); //read the value from the cell
				System.out.print(" " +value);
			}
			System.out.println();
		}
	}

}
