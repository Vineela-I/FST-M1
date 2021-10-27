package com.ibm.Java_Maven;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Activity15 {

	private static String File = "test.xlsx";
	public static void main(String[] args){
		XSSFWorkbook workbook = new XSSFWorkbook();
		XSSFSheet sheet = workbook.createSheet("DataTypes in Java");
		
		Object[][] datatypes = {
				{"DataTypes", "Type", "Size"},
				{"Int", "Primitive", 5 },
				{"Char", "Primitive", 20 },
				{"String", "Primitive", 28 },
				{"String", "Non-Primitive", "No Size"}
		};
		System.out.println("Excel created");
		
		int rownum = 0;
		
		for(Object[] datatype: datatypes) {
			Row row = sheet.createRow(rownum++);
			
			int colnum = 0;
			for(Object field: datatype) {
				Cell cell = row.createCell(colnum++);
				
				if(field instanceof String) {
					cell.setCellValue((String) field);
				}else if(field instanceof Integer) {
					cell.setCellValue((Integer) field);
				}
			}
		}
		
	try {	
		FileOutputStream fout = new FileOutputStream(File);
		workbook.write(fout);
		workbook.close();
	} catch (FileNotFoundException e) {
        e.printStackTrace();
    } catch (IOException e) {
        e.printStackTrace();
    }
	//}
	System.out.println("Done");
}
}