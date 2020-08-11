package JavaStreams;

import org.apache.log4j.Logger;

public class JavaExcelReading {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Logger log = Logger.getLogger("devpinoyLogger");
		
		String sheetName = "Trainer";
		ExcelReader excel = new ExcelReader("E:\\Study\\Selenium Material\\MyWorkspace\\myExcelRead.xlsx");
		log.debug("Getting Row count....");
		System.out.println(excel.getRowCount(sheetName));
		log.debug("Getting Column count...");
		System.out.println(excel.getColumnCount(sheetName));
		System.out.println(excel.getCellData(sheetName, 0, 2));
		log.debug("setting data in cell ..");
		excel.setCellData(sheetName, "username"	,4	,"Patel");
		
		
	}

}
