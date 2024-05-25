import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class CreateExcel {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	    // Create Workbook and Sheet
        Workbook workbook = new XSSFWorkbook();
        Sheet sheet = workbook.createSheet("MySheet");

        // Sample data
        Object[][] data = {
                {"Name", "Age", "Country"},
                {"John", 28, "USA"},
                {"Alice", 24, "Canada"},
                {"Bob", 30, "UK"}
        };

        // Write data to the sheet
        int rowNum = 0;
        for (Object[] rowData : data) {
            Row row = sheet.createRow(rowNum++);
            int colNum = 0;
            for (Object field : rowData) {
                Cell cell = row.createCell(colNum++);
                if (field instanceof String) {
                    cell.setCellValue((String) field);
                } else if (field instanceof Integer) {
                    cell.setCellValue((Integer) field);
                }
            }
        }

        // Save the Excel file
        String filePath = "C:\\Users\\Clicker\\Documents\\Apurva 2023\\MyExcelFile.xlsx";
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel file created successfully.");
    }
}