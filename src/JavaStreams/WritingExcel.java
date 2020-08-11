package JavaStreams;


import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class WritingExcel {

		public static void main(String[] args) throws IOException 
		{
				
		XSSFWorkbook workbook = new XSSFWorkbook();
		
		XSSFSheet sheet0 = workbook.createSheet("FirstSheet");
		
		for(int row=0;row<10;row++)
		{
			Row row0 = sheet0.createRow(row);
			
			for(int col=0;col<10;col++)
			{
				Cell cell = row0.createCell(col);
				cell.setCellValue((int)(Math.random()*100));
			}
		}
		/*Row row0 = sheet0.createRow(0);
		
		Cell cellA = row0.createCell(0);
		Cell cellB = row0.createCell(1);
		
		cellA.setCellValue("Firstcell");
		cellB.setCellValue("SecondCell");*/
		
		// connecting Stream
		
		File file = new File("E:\\Study\\Selenium Material\\MyWorkspace\\myExcel.xlsx");
		
		FileOutputStream writer = new FileOutputStream(file,true);
		
		workbook.write(writer);
		
		writer.close();
		
		System.out.println("Excel created...!!!!");
		
	}
}
