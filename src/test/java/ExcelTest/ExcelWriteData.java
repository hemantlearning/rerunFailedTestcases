package ExcelTest;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
public class ExcelWriteData {

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
				
			//rowcount will give us the last line from where we want to start writing to the file 
			int rowcount = sh.getLastRowNum() +1;
			
			//value - contains data to be written to file
			String[] value = {"1","One"};
			
			//XSSFRow object will access the given row
			XSSFRow row = sh.createRow(rowcount);
			
			//As we have 2 columns we will create a for loop to add the data
			for(int i=0; i<2; i++)
			{
				//XSSFCell object will access the first cell where data need to be added
				XSSFCell cell = row.createCell(i);
				
				//here we will select which data to be added to the cell
				cell.setCellValue(value[i]);
			}
			
			//FileOutputStream object will collect and prepare data to write to the file
			FileOutputStream fos = new FileOutputStream(file);
			
			//Actually writing the data that is collected in fos to Excel sheet
			wb.write(fos);
			
			//close FileInputStream, FileOutputStream, and Workbook
			fis.close();
			fos.close();
			wb.close();
			
		
			
			
		}
		catch(Exception e)
		{
			System.out.println(e.getMessage());
		}

	}

}
