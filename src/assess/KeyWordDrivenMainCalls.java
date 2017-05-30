package assess;

import java.io.File;
import java.io.IOException;

import jxl.Sheet;
import jxl.Workbook;
import jxl.read.biff.BiffException;

public class KeyWordDrivenMainCalls {

	public static void main(String[] args) throws BiffException, IOException, InterruptedException {
		
//		Creating object of method class to call methods in namesake method
		KeywordDrivenMethods kdm = new KeywordDrivenMethods();
		
		String booking;
		
//		Open the excel workbook
		File clear = new File("./InputSheet/Cleartrip.xls");
		Workbook clearw = Workbook.getWorkbook(clear);
		Sheet clears = clearw.getSheet("Keyword");
		
//		Identifying total number of rows with data in sheet
		int totalRows = clears.getRows();
		
//		Looping all rows in excel
		for (int i = 1 ; i < totalRows ; i++) {
			
//			Fetch browser details from Excel Workbook
			kdm.browserLaunch(clears.getCell(1, i).getContents());
			
//			To confirm if flight or train ticket to be booked
			booking = clears.getCell(2, i).getContents();
			if (booking.equalsIgnoreCase("flight")) {
				kdm.flightBooking();
			} else if (booking.equalsIgnoreCase("train")) {
				kdm.trainBooking();
			}
		}
		
	}

}
