package test.java.Utilities;


import java.io.FileInputStream;
import java.io.FileOutputStream;
import org.apache.poi.ss.usermodel.DataFormatter;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.testng.annotations.Test;





public class Write extends Base {
    public static XSSFWorkbook workbook;
    public static XSSFSheet worksheet;
    public String ColName = "Result";
    public int col_num;

    @Test
    public void WriteResult(String Ress, int DR) throws Exception {
        FileInputStream file_input_stream = new FileInputStream("src/main/resources/Credentials.xlsx");
        workbook = new XSSFWorkbook(file_input_stream);
        worksheet = workbook.getSheet(SheetName);
        XSSFRow Row = worksheet.getRow(0);

        int sheetIndex = workbook.getSheetIndex(SheetName);
        DataFormatter formatter = new DataFormatter();
        if (sheetIndex == -1) {
            System.out.println("No such sheet in file exists");
        } else {
            col_num = -1;
            for (int i = 0; i < Row.getLastCellNum(); i++) {
                XSSFCell cols = Row.getCell(i);
                String colsval = formatter.formatCellValue(cols);
                if (colsval.trim().equalsIgnoreCase(ColName.trim())) {
                    col_num = i;
                    break;
                }
            }
//
            Row = worksheet.getRow(DR);
            try {
                //get my Row which is equal to Data  Result and that colNum
                XSSFCell cell = worksheet.getRow(DR).getCell(col_num);
                // if no cell found then it create cell
                if (cell == null) {
                    cell = Row.createCell(col_num);
                }
                //Set Result is pass in that cell number
                cell.setCellValue(Ress);


            } catch (Exception e) {
                System.out.println(e.getMessage());
            }

        }
        FileOutputStream file_output_stream = new FileOutputStream("src/main/resources/Credentials.xlsx");
        workbook.write(file_output_stream);
        file_output_stream.close();
        if (col_num == -1) {
            System.out.println("Column you are searching for does not exist");
        }
    }
}