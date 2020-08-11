package JavaStreams;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.openxml4j.exceptions.InvalidFormatException;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.ss.usermodel.WorkbookFactory;


public class ReadingExcel {

	public static void main(String[] args) throws InvalidFormatException, IOException {

		File file = new File("E:\\Study\\Selenium Material\\MyWorkspace\\myExcel.xlsx");
		
		FileInputStream fs = new FileInputStream(file);
		
		Workbook workbook = WorkbookFactory.create(fs);
		
		Sheet sheet0 = workbook.getSheetAt(0);
		
		for (Row row : sheet0)
		{
			for(Cell cell:row)
			{
				switch(cell.getCellType())
				{
				case Cell.CELL_TYPE_STRING:
					System.out.print(cell.getStringCellValue()+"\t");
					break;
				
				case Cell.CELL_TYPE_NUMERIC:
					System.out.print(cell.getNumericCellValue()+"\t");
					break;
					
				case Cell.CELL_TYPE_BLANK:
					System.out.print("BLANK"+"\t");
					break;
				}
				
			}
			System.out.println();
		}
		/*
		Row row0= sheet0.getRow(0);
		
		Cell cell = row0.getCell(0);
		
		System.out.println(cell);
		*/
		fs.close();
		
		
	}

}
