package selenium;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Excelcompare {

	public static void main(String[] args) throws IOException {
		String filepath="D:\\Eclipse_Programs\\Exceldata\\schooldetails.xlsx";
		FileInputStream file=new FileInputStream(filepath);
		XSSFWorkbook workbook=new XSSFWorkbook(file);
		XSSFSheet sheet1=workbook.getSheetAt(0);
		int rowcount=sheet1.getLastRowNum();
		
		String filepath1="D:\\Eclipse_Programs\\Exceldata\\collegedetailss.xlsx";
		FileInputStream file1=new FileInputStream(filepath1);
		XSSFWorkbook workbook1=new XSSFWorkbook(file1);
		XSSFSheet college=workbook1.getSheetAt(0);
		int noofrows=college.getLastRowNum();
		
		
		System.out.println("Total rows is:"+rowcount);
		List<String> school=new ArrayList<>();
		for(int i=1;i<=rowcount;i++)
		{
			/*
			 * String data0=sheet1.getRow(i).getCell(1).getStringCellValue();
			 * System.out.println(data0);
			 */
			/*
			 * XSSFCell names=sheet1.getRow(i).getCell(0); System.out.println(names);
			 */
			String Schoolnames=sheet1.getRow(i).getCell(1).getStringCellValue();
			//System.out.println(Schoolnames);
			school.add(Schoolnames);
			/*
			 * XSSFCell Ids=sheet1.getRow(i).getCell(1);
			 * System.out.println("The Associate id is: "+Ids); XSSFCell
			 * adress=sheet1.getRow(i).getCell(2);
			 * System.out.println("The address is: "+adress); XSSFCell
			 * emails=sheet1.getRow(i).getCell(3);
			 * System.out.println("The emails are: "+emails);
			 */
         }
		System.out.println(school);
		/*
		 * for(String schlnams:school) { System.out.println(schlnams); }
		 */
		List<String> College=new ArrayList<>();
		for(int i=1;i<=noofrows;i++) {
			String collegenames=college.getRow(i).getCell(1).getStringCellValue();
			
			//System.out.println(collegenames);
			College.add(collegenames);
		}
		   System.out.println(College);
		   
			/*
			 * for(String clgnames:College) {
			 * 
			 * System.out.println(clgnames); }S
			 */
		   
		if(school.equals(College)) {
			System.out.println("The school and college names are equal:");
		}
		else {
			System.out.println("Not equal");
		}
		

	}

}
