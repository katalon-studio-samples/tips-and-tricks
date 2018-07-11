import org.apache.poi.xssf.usermodel.XSSFSheet
import org.apache.poi.xssf.usermodel.XSSFWorkbook

FileInputStream file = new FileInputStream (new File("E:\\Testdata.xlsx"))
XSSFWorkbook workbook = new XSSFWorkbook(file);
XSSFSheet sheet = workbook.getSheetAt(0);
 
'Read data from excel'
String Data_fromCell=sheet.getRow(1).getCell(1).getStringCellValue();
'Write data to excel'
sheet.getRow(1).createCell(1).setCellValue("Mahesh2");
 
file.close();
FileOutputStream outFile =new FileOutputStream(new File("E:\\Testdata.xlsx"));
workbook.write(outFile);
outFile.close();
