import org.apache.poi.ss.usermodel.*;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import java.io.FileOutputStream;
import java.io.IOException;

public class KanbanBoardCreator {
    public static void main(String[] args) {
        Workbook workbook = new XSSFWorkbook();

        // Create the Kanban board sheet
        Sheet kanbanSheet = workbook.createSheet("Kanban Board");

        // Create column headers for the Kanban board
        String[] columnHeaders = {"To-Do", "In-Progress", "Done"};
        for (int i = 0; i < columnHeaders.length; i++) {
            Row headerRow = kanbanSheet.createRow(0);
            Cell headerCell = headerRow.createCell(i);
            headerCell.setCellValue(columnHeaders[i]);

            CellStyle style = workbook.createCellStyle();
            Font font = workbook.createFont();
            font.setBold(true);
            font.setColor(IndexedColors.WHITE.getIndex());
            style.setFont(font);
            style.setAlignment(HorizontalAlignment.CENTER);
            style.setVerticalAlignment(VerticalAlignment.CENTER);

            if (i == 0) {
                style.setFillForegroundColor(IndexedColors.WHITE.getIndex());
            } else if (i == 1) {
                style.setFillForegroundColor(IndexedColors.YELLOW.getIndex());
            } else if (i == 2) {
                style.setFillForegroundColor(IndexedColors.GREEN.getIndex());
            }
            style.setFillPattern(FillPatternType.SOLID_FOREGROUND);
            headerCell.setCellStyle(style);

            // Adjust column width to fit the header text
            kanbanSheet.autoSizeColumn(i);
        }

        // Save the Excel file
        String filePath = "C:\\Users\\Clicker\\Documents\\Apurva 2023\\KB.xlsx";
        try (FileOutputStream outputStream = new FileOutputStream(filePath)) {
            workbook.write(outputStream);
        } catch (IOException e) {
            e.printStackTrace();
        }

        System.out.println("Excel file created successfully.");
    }
}
