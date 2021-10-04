package ExcelTest;

import java.io.File;
import java.io.FileInputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class ExcelRead {

	public static void main(String[] args) 
	{
		try
		{
			//create a file object to open a file 
			File file = new File("D:\\ALL Files\\ExcelProject.xlsx");
			
			//Create a FileInputStream object to read from file
			FileInputStream fis = new FileInputStream(file);
			
			//XSSFWorkbook - will open the Excel workbook of type xlsx which implements Workbook interface
			XSSFWorkbook wb = new XSSFWorkbook(fis);
			
			//XSSFSheet object will open a sheet at 0th index
			XSSFSheet sh = wb.getSheetAt(0);
			
			
			//create a for loop to iterate through rows
			for (int i=0; i<sh.getLastRowNum();i++)
			{
				//XSSFRow object will access the given row
				XSSFRow row = sh.getRow(i);
				
				//create a for loop to iterate through columns
				for (int j=0; j<2;j++)
				{
					//XSSFCell object will access the first cell and read data 
					XSSFCell cellValue = row.getCell(j);
					
					//print the data on console
					System.out.print(cellValue +" | ");
				}
				//add new line
				System.out.println();
				
			}
			
			//close inputstream and workbook
			wb.close();			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
