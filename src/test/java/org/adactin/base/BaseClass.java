package org.adactin.base;

	import java.io.File;
	import java.io.FileInputStream;
	import java.io.FileNotFoundException;
	import java.io.FileOutputStream;
	import java.io.IOException;
	import java.text.SimpleDateFormat;
	import java.util.ArrayList;
	import java.util.Date;
	import java.util.List;
	import java.util.Set;
	import java.util.concurrent.TimeUnit;

	import org.apache.poi.ss.usermodel.Cell;
	import org.apache.poi.ss.usermodel.DateUtil;
	import org.apache.poi.ss.usermodel.Row;
	import org.apache.poi.ss.usermodel.Sheet;
	import org.apache.poi.ss.usermodel.Workbook;
	import org.apache.poi.xssf.usermodel.XSSFWorkbook;
	import org.openqa.selenium.Alert;
	import org.openqa.selenium.JavascriptExecutor;
	import org.openqa.selenium.WebDriver;
	import org.openqa.selenium.WebElement;
	import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
	import org.openqa.selenium.support.ui.Select;

	import io.github.bonigarcia.wdm.WebDriverManager;

	public class BaseClass{

		public static WebDriver driver;
		public static Select s;
		public static Alert a;
		public static Actions a1;
		public static JavascriptExecutor js;
		public static File file;
		public static FileInputStream fin;
		public static  Workbook  workBook;
		public static   Sheet sheet;
		public static Row row;
		 public static Cell cell;
		public static FileOutputStream fOut;
		
		
		public static void launchChromeBrowser() {//1
			WebDriverManager.chromedriver().setup();
			driver =new ChromeDriver(); 
			
		}
		public static void launchEdgeBrowser() {//1
			WebDriverManager.edgedriver().setup();
			driver =new EdgeDriver(); 
		}
		public static void launchFirefoxBrowser() {//1
			WebDriverManager.firefoxdriver().setup();
			driver =new FirefoxDriver(); 
		}
			
	    public static void maxBrowser() {//2
		driver.manage().window().maximize();

	}
		
		public static void allWebElementWait(int time) {//3
			driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
			
		}
		
		public static void launchUrl(String url) {//4
			driver.get(url);
		}
		public static String pageTitle() {//5
			String title = driver.getTitle();
			return title;
		}
			public static String pageUrl() {//6
			String currentUrl = driver.getCurrentUrl();
	              return currentUrl;
		}
		
		public static void closeBrowser() {//7
			driver.close();
		}
		public static void quitBrowser() {//8
			driver.quit();
		}
		public static void sendText(WebElement element,String text) {//9
			element.sendKeys(text);
		}
		
		public static void clickBtn(WebElement element) {//10
			element.click();
			
			}
		public static String getValue(WebElement element) {//11
			
	          String text = element.getText();
	          return text;
		}
		public static String getAttributeValue(WebElement element) {//12
			String attribute = element.getAttribute("value");
			return attribute;
			
		}
		public static void acceptAlert() {//13
			 a = driver.switchTo().alert();
			a.accept();
		}
		public static void dismissAlert() {//14
			 a = driver.switchTo().alert();
			a.dismiss();
		}
		public static String getTextFromAlert() {//15
			 a= driver.switchTo().alert();
			String text = a.getText();
			return text;
		}
		public static void sendTextToAlert(String value) {//16
			 a = driver.switchTo().alert();
			a.sendKeys(value);
			
		}
		public static void switchFrameById(String id) {//17
			driver.switchTo().frame(id);
		}

		public static void switchFrameByName(String name) {//18
			driver.switchTo().frame(name);
	     }
		public static void switchFrameIndex(int index) {//19
			driver.switchTo().frame(index);
	      }
		public static void switchFrameByElement(WebElement element) {//20
			driver.switchTo().frame(element);
		}
		public static void forParentFrame() {//21
			driver.switchTo().parentFrame();

		}
		public static void forDefaultFrame() {//22
			driver.switchTo().defaultContent();
		}
		
		public static void isWebelementSelected(WebElement element) {//23
			element.isSelected();
			
		}
		public static void isWebelementEnabled(WebElement element) {//24
			element.isEnabled();
			
		}
		public static boolean isWebelementDisplayed(WebElement element) {//25
			return element.isDisplayed();
			
		}
		public static boolean isMultipleDropDown(WebElement element) {//26
			 s = new Select(element);
			boolean multiple = s.isMultiple();
			return multiple;
		}
		
		public static void dropDownSelectByValue(WebElement element,String value) {//27
			 s = new Select(element);
		s.selectByValue(value);
		
		}
		public static void dropDownSelectByIndex(WebElement element,int index) {//28
			 s = new Select(element);
		s.selectByIndex(index);
		
		}
		
		public static void dropDownSelectByVisibleText(WebElement element,String visibleText) {//29
			 s = new Select(element);
		s.selectByVisibleText(visibleText);
		
		}
		public static void dropDownDeselectByValue(WebElement element,String value) {//30
			 s = new Select(element);
		s.deselectByValue(value);
		
		}
		public static void dropDownDeselectByIndex(WebElement element,int index) {//31
			 s = new Select(element);
	s.deselectByIndex(index);
		
		}
		
		public static void dropDownDeselectByVisibleText(WebElement element,String visibleText) {//32
			 s = new Select(element);
		s.deselectByVisibleText(visibleText);
		}
		public static void dropDownDeselectAll(WebElement element) {//33
			 s = new Select(element);
			s.deselectAll();
		}
		public static void getAllInDropDown(WebElement element) {//34
			 s = new Select(element);
			s.getOptions();
		}
		public static void getFirstSelectedInDropDown(WebElement element) {//35
			 s = new Select(element);
			s.getFirstSelectedOption();
		}
		public static void getAllSelectedInDropDown(WebElement element) {//36
			 s = new Select(element);
			s.getAllSelectedOptions();
		}
		public static void switchWindowById(int index) {//37
			Set<String> set = driver.getWindowHandles();
			List<String> l = new ArrayList<String>();
			   l.addAll(set);
			   String window = l.get(index);
			   driver.switchTo().window(window);
		}
		public static void switchToParentWindow() {//38
			String window = driver.getWindowHandle();
			driver.switchTo().window(window);
		}
		public static void switchWindowByUrl(String url) {//39
			
			driver.switchTo().window(url);
		}
		public static void switchWindowByTitle(String title) {//40
			
			driver.switchTo().window(title);
		}
		public static void navigateToUrl(String url) {//41
			driver.navigate().to(url);
		}
		public static void navigateForward() {//42
			driver.navigate().forward();;
		}
		public static void navigateBackward() {//43
			driver.navigate().back();
		}
		public static void PageRefresh() {//44
			driver.navigate().refresh();
		}
		public static void mouseHoverTo(WebElement element) {//45
			a1.moveToElement(element);
		}
		public static void doubleSelect(WebElement element) {//46
			a1.doubleClick(element);
		}
		public static void rightClick(WebElement element) {//47
			a1.contextClick(element);
		}
		
		public static void doubleSelect() {//48
			a1.doubleClick();
		}
		public static void rightClick() {//49
			a1.contextClick();
		}
		
		public static void scrollUp(WebElement target) {//50
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", target);
		}
		public static void scrollDown(WebElement target) {//51
			js=(JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", target);
		}
		public static void pauseExecution(int millis) {//52
			try {
				Thread.sleep(millis);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}}
		
		public static String excelRead(int rowNo,int cellNo,String filepath,String sheetName)  {//53
			file=new File(filepath);
			try {
				fin=new FileInputStream(file);
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}
		    try {
				workBook= new XSSFWorkbook(fin);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		    sheet=workBook.getSheet(sheetName);
		   row=sheet.getRow(rowNo);
		   cell=row.getCell(cellNo);
		    int cellType= cell.getCellType();
		    String text="";
		    if(cellType==1) {
		    	text=cell.getStringCellValue();
		    }
		    else if(DateUtil.isCellDateFormatted(cell)) {
		    	Date dateCellValue=cell.getDateCellValue();
		    	SimpleDateFormat date=new SimpleDateFormat("dd-MM-yyyy");
		    	text=date.format(dateCellValue);
		    }
		    else {
		    	double numericalCellValue=cell.getNumericCellValue();
		    	long value=(long)numericalCellValue;
		    	text=String.valueOf(value);
		    	
		    }
		    return text;
		    }
		public static int excelRowCount(String fileName,String sheetName) {//54
			file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavent\\TestData\\"+fileName+".xlsx");
			try {
				fin=new FileInputStream(file);
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}
		    try {
				workBook= new XSSFWorkbook(fin);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		    sheet=workBook.getSheet(sheetName);
		    int numberOfRows = sheet.getPhysicalNumberOfRows();
		    return numberOfRows;
		}
		public static int excelCellCount(String fileName,String sheetName) {//55
			file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavent\\TestData\\"+fileName+".xlsx");
			try {
				fin=new FileInputStream(file);
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}
		    try {
				workBook= new XSSFWorkbook(fin);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		    sheet=workBook.getSheet(sheetName);
		   int numberOfRows = sheet.getPhysicalNumberOfRows();
		   int count=0;
		   for (int i = 0; i < numberOfRows; i++) {
			   Row row = sheet.getRow(i);
			   int numberOfCells = row.getPhysicalNumberOfCells();
			   for (int j = 0; j <numberOfCells ; j++) {
				count=count+1;
			}
			
		}
		    return count;
		}
		public static void readFullData(String fileName,String sheetName) {//56
			
			file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavent\\TestData\\"+fileName+".xlsx");
			try {
				fin=new FileInputStream(file);
			} catch (FileNotFoundException e1) {
				
				e1.printStackTrace();
			}
		    try {
				workBook= new XSSFWorkbook(fin);
			} catch (IOException e) {
				
				e.printStackTrace();
			}
		    sheet=workBook.getSheet(sheetName);
		   int numberOfRows = sheet.getPhysicalNumberOfRows();
		   String text="";
		   for (int i = 0; i < numberOfRows; i++) {
			   Row row = sheet.getRow(i);
			   int numberOfCells = row.getPhysicalNumberOfCells();
			   for (int j = 0; j <numberOfCells ; j++) {
				Cell cell = row.getCell(j);
				 int cellType= cell.getCellType();
				   
				    if(cellType==1) {
				    	text=cell.getStringCellValue();
				    }
				    else if(DateUtil.isCellDateFormatted(cell)) {
				    	Date dateCellValue=cell.getDateCellValue();
				    	SimpleDateFormat date=new SimpleDateFormat("dd-MM-YYYY");
				    	text=date.format(dateCellValue);
				    }
				    else {
				    	double numericalCellValue=cell.getNumericCellValue();
				    	long value=(long)numericalCellValue;
				    	text=String.valueOf(value);
				    	
				    }  System.out.println(text);    }}
				   
		   }
		
	       public static void createRow(String fileName,String sheetName,int rowNo) throws IOException {//57

	   		file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavent\\TestData\\"+fileName+".xlsx");
	   		try {
	   			fin=new FileInputStream(file);
	   		} catch (FileNotFoundException e1) {
	   			
	   			e1.printStackTrace();
	   		}
	   	    try {
	   			workBook= new XSSFWorkbook(fin);
	   		} catch (IOException e) {
	   			
	   			e.printStackTrace();
	   		}
	   	    sheet=workBook.getSheet(sheetName);
	   	    sheet.createRow(rowNo);
		try {
			fOut=new FileOutputStream(file);
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		workBook.write(fOut);
	}
	       public static void createCell(String fileName,String sheetName,int rowNo,int cellNo,String value) throws IOException {//58

	      		file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavent\\TestData\\"+fileName+".xlsx");
	      		try {
	      			fin=new FileInputStream(file);
	      		} catch (FileNotFoundException e1) {
	      			
	      			e1.printStackTrace();
	      		}
	      	    try {
	      			workBook= new XSSFWorkbook(fin);
	      		} catch (IOException e) {
	      			
	      			e.printStackTrace();
	      		}
	      	    sheet=workBook.getSheet(sheetName);
	      	     row = sheet.getRow(rowNo);
	      	     cell = row.createCell(cellNo);
	      	   cell.setCellValue(value);
	   	try {
	   		fOut=new FileOutputStream(file);
	   	} catch (FileNotFoundException e) {
	   		
	   		e.printStackTrace();
	   	}
	   	workBook.write(fOut);
	   }
	       public static void createExcel(String fileName,String sheetName) throws IOException {//59
	    		file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavent\\TestData\\"+fileName+".xlsx");
	      		
	      	    
	      		workBook= new XSSFWorkbook();
	      		
	      	    sheet=workBook.createSheet(sheetName);
	      	    fOut=new FileOutputStream(file);
	      	    workBook.write(fOut);
	       }
	       public static void updateExcel(String fileName,String sheetName,int rowNo,int cellNo,String oldValue,String newValue) throws IOException {
	    	   file=new File("C:\\Users\\LENOVO\\eclipse-workspace\\Mavent\\TestData\\"+fileName+".xlsx");
	     		try {
	     			fin=new FileInputStream(file);
	     		} catch (FileNotFoundException e1) {
	     			
	     			e1.printStackTrace();
	     		}
	     	    try {
	     			workBook= new XSSFWorkbook(fin);
	     		} catch (IOException e) {
	     			
	     			e.printStackTrace();
	     		}
	     	    sheet=workBook.getSheet(sheetName);
	     	     row = sheet.getRow(rowNo);
	     	     cell = row.createCell(cellNo);
	     	     String text = cell.getStringCellValue();
	     	     
	     	     if(text.equals(oldValue)) {
	     	   cell.setCellValue(newValue);
	     	     }
	     	    fOut=new FileOutputStream(file);
	      	    workBook.write(fOut);
		}
	       
	}

