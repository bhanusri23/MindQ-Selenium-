package Module_1;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class fileOperations {
	public static Workbook wb;
	public static Sheet sh;
	public static Row rw;
	public static Cell cell;

	public static void main(String[] args) throws IOException {

		String filePath = "//home//bhanu//Desktop//Joveo.xlsx";
		File f = new File(filePath);
		f.createNewFile();

		FileOutputStream os = new FileOutputStream(f);
		String fileType = filePath.substring(filePath.indexOf("."));

		if (fileType.equals(".xlx")) {
			wb = new HSSFWorkbook();
		}

		else if (fileType.equals(".xlsx")) {
			wb = new XSSFWorkbook();

		}

		sh = wb.createSheet("Data");

		rw = sh.createRow(0);

		cell = rw.createCell(0);
		cell.setCellValue("SAP Testing");

		wb.write(os);
		wb.close();

	}

}

