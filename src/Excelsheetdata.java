import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbookType;


public class Excelsheetdata {

	public static  void main(String[] args) throws IOException {
    
		String con="D:\\workspace\\LMNproject\\Data\\Book1.xlsx";	
	File f=new File(con);
	FileInputStream fp=new FileInputStream(f);
	
	XSSFWorkbook wb=new XSSFWorkbook(fp);
	XSSFSheet sh=wb.getSheet("sheet1");
	XSSFCell userCell=sh.getRow(3).getCell(1);
	
	//sheet1.getRow(0).createCell(3).setCellValue("pass");
	//sheet1.getRow(0).createCell(4).setCellValue("fail");
	//FileOutputStream fout=new FileOutputStream(con);
	//wb.write(fout);
	//wb.close();
	String stdname=userCell.getStringCellValue();
	System.out.println(stdname);
	}

}
