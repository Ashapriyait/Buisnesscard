package com.base;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Date;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
public static WebDriver driver;
	
	
	
	
	/**
	 * 
	 * @paramkey
	 * @return String
	 * @throws FileNotFoundException
	 * @throws IOException
	 * @Description Create the Property File value
	 * 
	 * 
	 */
	//	getPropertiesFileValue
	public static String getPropertyFileValue(String key) throws FileNotFoundException, IOException {
		Properties properties=new Properties();
		properties.load(new FileInputStream(System.getProperty("user.dir")+"\\config\\config.properties"));
		String value =(String)properties.get(key);
		return value;
	}	
	/**
	 * 
	 * @Description Webdriver wait using visibilityOfElementLocated by Id
	 * @param text
	 */
	
//	public void waitVisibilityOfElementLocatedById(int seconds, String text) {



	/**
	 *  
	 * @return byte[]
	 * @Description Taking the Screenshot Page view 
	 * 
	 */

	//element clear
	public static void elementClear(WebElement element) {
	element.clear();
	
	}
	//Screenshot
	public  byte[] Screenshot() {
		TakesScreenshot screenshot=(TakesScreenshot) driver;
		byte[] b = screenshot.getScreenshotAs(OutputType.BYTES);
		return b;

	}
	/**
	 * 
	 * @return String
	 * @Description Create the Project Path
	 * 
	 */

	//	getProjectpath
	public static String getProjectPath() {
		String path = System.getProperty("user.dir");
		return path;
	}

	/**
	 * 
	 * @param browserType
	 * @Description Create the Browser Type
	 * 
	 * 
	 */
	//	BrowserType
	
	/**
	 * @Description Get the Driver
	 */

	//1.Get the Driver
	public static void GetDriver() {
		WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
	}

	/**
	 * @Description Load the url launch
	 */
	//2. URL Launch
	public static void enterUrl(String Url) {
		driver.get(Url);
	}

	/**
	 * @Description To Maximixze the Window
	 */
	//3. Maximize the window
	public static void maximizeWindow() {
		driver.manage().window().maximize();
	}
	/**
	 * @Description To Insert the value in textbox
	 */

	//4. SendKeys 
	public void elementSendkeys(WebElement element, String Data) {
		element.sendKeys(Data);
	}
	/**
	 * @Description To Insert the value in the text box using java script executor
	 */

	//5.SendKeys Using JS
	public void elementsendkeysJS(WebElement element, String Data) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].SetAttribute('value','Data')",element);
	}	
	/**
	 * @Description To Click the element
	 */

	//6.Element Click
	public void elementClick(WebElement element) {
		element.click();
	}
	/**
	 * 
	 * @return String
	 * @Description To Get the Title form the webpage
	 */
	//7. Get Window Title
	public String windowTitle() {
		String title = driver.getTitle();
		return title;
	}
	/**
	 * 
	 * @return String
	 * @Description To Get the Current window Title from the WebPage
	 */
	//8.Get the Current URL
	public String currentWindowTitle() {
		String currentUrl = driver.getCurrentUrl();
		return currentUrl;
	}
	/**
	 * 
	 * @param AttributeValue
	 * @return WebElement
	 * @Description To Find the loctor by using Id
	 */

	//9.Find the locator by ID
	public  WebElement findLocatorById(String AttributeValue ) {
		WebElement element = driver.findElement(By.id(AttributeValue));
		return element;
	}
	/**
	 * 
	 * @param AttributeValue
	 * @return WebElement
	 * @Description To Find the loctor by using Name
	 */
	//10. Find the locator by Name
	public WebElement findLocatorByName(String AttributeValue) {
		WebElement element = driver.findElement(By.name(AttributeValue));
		return element;
	}
	//11. Find the locator by ClassName
	public WebElement  findLocatorByClassName(String AttributeValue) {
		WebElement element = driver.findElement(By.className(AttributeValue));
		return element;
	}

	/**
	 * 
	 * @param AttributeValue
	 * @return WebElement
	 * @Description To Find the loctor by using Xpath
	 */
	//12. Find the locator by XPath
	public WebElement findLocatorByXpath(String AttributeValue) {
		WebElement element = driver.findElement(By.xpath(AttributeValue));
		return element;
	}
	/**
	 * 
	 * @param AttributeValue
	 * @return WebElement
	 * @Description To Find the loctor by using TagName
	 */
	// 13.Find the locator by TagName 
	public WebElement findLocatorBytagName(String tagName) {
		WebElement element = driver.findElement(By.tagName(tagName));
		return element;
	}
	/**
	 * 
	 * @param AttributeValue
	 * @return WebElement
	 * @Description To Find the loctor by using CssSelector
	 */
	//14. Find the locator by cssSelector
	public WebElement findLocatorBycssSelector(String cssSelector) {
		WebElement element = driver.findElement(By.cssSelector(cssSelector));
		return element;
	}
	/**
	 * 
	 * @param AttributeValue
	 * @return WebElement
	 * @Description To Find the loctor by using LinkText
	 */
	//15. Find the locators by linkText
	public WebElement findLocatorBylinkText(String linkText) {
		WebElement element = driver.findElement(By.linkText(linkText));
		return element;
	}
	/**
	 * 
	 * @param AttributeValue
	 * @return WebElement
	 * @Description To Find the loctor by using PartialLinkText
	 */
	// 16.Find the locators by partialText
	public WebElement findLocatorBypartialText(String partialLinkText) {
		WebElement element = driver.findElement(By.partialLinkText(partialLinkText));
		return element;
	}
	/**
	 *@Description To Navigate the previous page
	 */
	//17.Navigate back
	public void elementNavigateBack() {
		driver.navigate().back();
	}
	/**
	 *@Description To Navigate the forward page
	 */
	//18.Navigate Forward
	public void elementNavigateForward() {
		driver.navigate().forward();
	}
	/**
	 *@Description To Refresh the current page
	 */
	//19.Navigate Refresh
	public void elementNavigateRefresh() {
		driver.navigate().refresh();
	}
	/**
	 *@Description To Navigate to new URl 
	 */
	//20.Navigate To
	public void elementNavigateTo(String Url) {
		driver.navigate().to(Url);
	}
	/**
	 * 
	 * @param element 
	 * @return Actions
	 * @Description To move the element using MouseOver action 
	 */

	//21.MouseOver Move to Element
	public Actions MoveToElement(WebElement element) {
		Actions action=new Actions(driver);	
		action.moveToElement(element).perform();
		return action;
	}
	/**
	 * 
	 * @param element 
	 * @return Actions
	 * @Description To move the element using Move to XandY offset 
	 */
	//22.MouseOver Move to Element using X Y Offset
	public Actions MoveToXandYoffset(WebElement element) {
		Actions action=new Actions(driver);	
		action.moveToElement(element, 0, 0).perform();
		return action;
	}
	/**
	 * 
	 * @param element 
	 * @return Actions
	 * @Description To darg the element using DragAndDrop action
	 */
	//23.DragAndDrop
	public Actions dragAndDrop(WebElement source ) {
		Actions action=new Actions(driver);
		action.dragAndDrop(source, source).perform();
		return action;
	}
	/**
	 * 
	 * @param element 
	 * @return Actions
	 * @Description To Right Click the element using ContentClick 
	 */
	//24.Right Click
	public Actions getContentClick() {
		Actions action=new Actions(driver);
		action.contextClick().perform();
		return action;
	}
	/**
	 * 
	 * @param element 
	 * @return Actions
	 * @Description To Double click the element using DoubleClick
	 */
	//25.Double Click
	public Actions getDoubleClick() {
		Actions action=new Actions(driver);
		action.doubleClick().perform();
		return action;
	}
	/**
	 * @param element 
	 * @return Actions
	 * @Description To keyDown
	 */
	//26.keyDown
	public Actions keyDown(WebElement element,String value) {
		Actions action=new Actions(driver);
		Actions down = action.keyDown(value);
		return action;
	}
	/**
	 * 
	 * @param element 
	 * @return Actions
	 * @Description KeyUp
	 */
	//27.KeyUp
	public Actions KeyUp(WebElement element,String value) {
		Actions action=new Actions(driver);
		Actions keyUp = action.keyUp(value);
		return action;
	}
	/**
	 * 
	 * @param element 
	 * @return Actions
	 * @Description 
	 */

	//27.KeyUp
	public Actions sendKeys(String value) {
		Actions action=new Actions(driver);
		action.sendKeys(value);
		return action;
	}
	/**
	 * 
	 * @param element
	 * @Description To click element Using JS
	 */

	//28.Click Using JS
	public void elementClickJs(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].click()",element);		
	}			
	/**
	 * 
	 * @param element
	 * @Description To Scroll Down the element  Using JS
	 */

	//29.Scroll Down Using JS
	public void scrollDownJs(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].ScrollIntoView(true)",element);		
	}	
	/**
	 * 
	 * @param element
	 * @Description To Scroll Up the element using JS
	 */
	//30.Scroll Up JS
	public void scrollUpJs(WebElement element) {
		JavascriptExecutor executor=(JavascriptExecutor) driver;
		executor.executeScript("argument[0].ScrollIntoView(false)",element);		
	}		
	/**
	 * @Description Switch to Alert accept
	 */

	//31.Switch to Alert accept
	public void accept() {
		driver.switchTo().alert().accept();
	}

	/**
	 * @Description Switch to Alert Dismiss
	 */
	//32.Switch to Alert Dismiss
	public void dismiss() {
		driver.switchTo().alert().dismiss();
	}
	/**
	 * @Description Insert value using Alert
	 */

	//33.Insert value using Alert
	public void alertSendKey(String value) {
		driver.switchTo().alert().sendKeys(value);
	}
	/**
	 * @Description Switch to the Parent farme
	 */
	//34. Parent farme
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}

	/**
	 * @Description Switch to Default Frame
	 */
	// 35.Default Frame
	public void defaultContext() {
		driver.switchTo().defaultContent();
	}

	/**
	 * @Description Switch to frame by id
	 */
	//36..Switch to frame by id
	public void frameById(String id) {
		driver.switchTo().frame(id);
	}

	/**
	 * @Description Switch to frame by Index
	 */
	//37.Switch to frame by Index
	public void frameByIndex(int index) {
		driver.switchTo().frame(index);
	}

	/**
	 * @Description Switch to frame by id
	 */
	//38.Switch to frame by id
	public void frameByname(WebElement reff) {
		driver.switchTo().frame(reff );
	}

	/**
	 * 
	 * @param element
	 * @return String
	 * @Description Get The text from the Webpage 
	 */
	// 39.Get The text 
	public String  elementGetText(WebElement element) {
		String text = element.getText();
		return text;
	}
	/**
	 * @Description To close the current window from the webpage
	 */
	//40.close the current window
	public void closeWindow() {
		driver.close();
	}
	/**
	 * @Description Close all the windows from the webpage  
	 */
	//41. Close all the windows
	public static void quitWindow() {
		driver.quit();
	}
	/**
	 * 
	 * @param element
	 * @return String
	 * @Description Get the attribute value from the element
	 */
	//42. Get the attribute 
	public String elementGetAttributeValue(WebElement element) {
		String attribute = element.getAttribute("value");
		return attribute;

	}

	/**
	 * 	
	 * @param element
	 * @param AttributeName
	 * @return String
	 * @Description select By value from the webpage using getAttibute  
	 */

	//43.Get the Attribute
	public String elementGetAttributeValue(WebElement element,String AttributeName) {
		String attribute = element.getAttribute(AttributeName);
		return AttributeName;

	}
	/**
	 * 
	 * @param element
	 * @param text
	 * @Description select By value from the webpage using selectOptionByValue
	 */


	//44.Select By value from the webpage
	public void selectOptionByvalue(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByValue(text);
	}
	/**
	 * 
	 * @param element
	 * @param text
	 * @Description select By VisibleText from the webpage
	 */

	//45.select By VisibleText
	public void selectOptionBy(WebElement element,String text) {
		Select select=new Select(element);
		select.selectByVisibleText(text);
	}
	/**
	 * 
	 * @param element
	 * @param num
	 * @Description select the option By using selectByIndex 
	 */
	//46. select By Index
	public void selectOptionById(WebElement element,int num ) {
		Select select=new Select(element);
		select.selectByIndex(num);
	}
	/**
	 * 
	 * @param element
	 * @return List
	 * @Description Get Selected Option by using getOption
	 */
	//47. Get Selected Option
	public List selectOption(WebElement element) {
		Select select=new Select(element);		
		List<WebElement> options = select.getOptions();
		return options;
	}
	/**
	 * 
	 * @param element
	 * @return List
	 * @Description Get the selected all Option by using getAllSelectedOptions 
	 */
	//48.Get All selected Option
	public List getAllSelectedOption(WebElement element) {
		Select select=new Select(element);
		List<WebElement> options = select.getAllSelectedOptions();
		return options;
	}
	/**
	 * 
	 * @param element
	 * @return WebElement
	 * @Description Get the first selected option  by using getFirstSelectedOption 
	 */
	//49.Get first selected option
	public WebElement getFirstselectedOption(WebElement element) {
		Select select=new Select(element);
		WebElement option = select.getFirstSelectedOption();
		return option;
	}
	/**
	 * 
	 * @param element
	 * @return boolean
	 * @Description To Select multiple option by using isMultiple
	 */

	//50. Select by using is multiple
	public boolean selectIsMultiple(WebElement element) {
		Select select=new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	/**
	 * 
	 * @param element
	 * @param value
	 * @Description To deSelect the value by using deSelectByValue
	 */
	// 51. deselctByvalue
	public void selectIsMultiple(WebElement element,String value) {
		Select select=new Select(element);
		select.deselectByValue(value);
	}

	/**
	 * 
	 * @param element
	 * @param index
	 * @Description To deSelect the index by using deSelectByIndex
	 */
	//52.deselectbyIndex
	public void deSelectByIndex(WebElement element,int index) {
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	/**
	 * 
	 * @param element
	 * @param text
	 * @Description To deSelect the visible text  by using deSelectByVisibletext
	 */
	//53.deSelect by visible text
	public void deSelectByVisibleText(WebElement element,String text) {
		Select select=new Select(element);
		select.deselectByVisibleText(text);;
	}

	/**
	 * 
	 * @param element
	 * @Description To deSelect all the element by using deSelectAll 
	 */
	//54.deSelect all
	public void deSelectAll(WebElement element) {
		Select select=new Select(element);
		select.deselectAll();
	}
	/**
	 * 
	 * @return String
	 * @Description Get the Parent Window id by using getWindowHandle
	 */
	//55.Get the Parent Window id
	public String getParentWindow() {
		String windowHandle = driver.getWindowHandle();		
		return  windowHandle;
	}
	/**
	 * 
	 * @param nameOrHandle
	 * @Description To Switch the control to parent window 
	 */
	//56.Switch the control to parent window 
	public void swtichToParentWindow(String nameOrHandle) {
		driver.switchTo().window(nameOrHandle);
	}
	/**
	 * 
	 * @return Set
	 * @Description  To Get the all windows Id by using getAllWindows
	 */
	//57. Get the all windows Id
	public Set getAllWindows() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}
	/**
	 * 
	 * @param element
	 * @return List
	 * @Description Get the row count in the table
	 */
	//58.Get the row count in the table
	public List rowCount(WebElement element) { 
		List<WebElement> rowCount = element.findElements(By.tagName("tr"));	
		return rowCount;
	}
	/**
	 * 
	 * @param element
	 * @return List
	 * @Description To count the Heading Counts
	 */
	//59.Heading Count
	public List hedingsCount(WebElement element) {
		List<WebElement> hedingCount = element.findElements(By.tagName("th"));
		return hedingCount;
	}
	/**
	 * 
	 * @param element
	 * @return List
	 * @Description Get the total test Data
	 */
	//60.Get the total test Data
	public List testDataCount(WebElement element) {
		List<WebElement> testData = element.findElements(By.tagName("td"));
		return testData;
	}

	/**
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @return String
	 * @throws IOException
	 * @Description Get the Data from the excel
	 */
	//61.Get the value from excel
	public static String  getData(String SheetName, int rowNum, int cellNum) throws IOException {
		String data="";
		File file=new File("C:\\Users\\Ashapriya_PTS\\Desktop\\TestDatas.xlsx");
		FileInputStream stream=new  FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		CellType type = cell.getCellType();
		switch (type) {
		case STRING:
			data = cell.getStringCellValue();
			break;

		case NUMERIC:
			if (DateUtil.isCellDateFormatted(cell)) {
				Date value = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MMM/YYYY");
				dateFormat.format(value);

				//			Date date=new Date();
				//			System.out.println(date);	
				//			SimpleDateFormat format=new SimpleDateFormat("dd/MMM/YYYY");
				//			String string = format.format(date);
				//			System.out.println(string);

			} else {
				double cellValue = cell.getNumericCellValue();
				BigDecimal valueOf = BigDecimal.valueOf(cellValue);
				data = valueOf.toString();
			}

			break;

		default:
			break;
		}
		return data;
	}
	/**
	 * 
	 * @param SheetName
	 * @param rowNum
	 * @param cellNum
	 * @param oldData
	 * @param newData
	 * @throws IOException
	 * @Description Update the Data from the excel
	 */
	//62.Update the date from the excel
	public void updateData(String SheetName, int rowNum, int cellNum, String oldData, String newData) throws IOException {
		File file=new File("");
		FileInputStream stream=new  FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(SheetName);
		Row row = sheet.getRow(rowNum);
		Cell cell = row.getCell(cellNum);
		String value = cell.getStringCellValue();
		if (  value.equals(oldData)) {
			cell.setCellValue(newData);
		}
		FileOutputStream stream2=new FileOutputStream(file);
		workbook.write(stream2);
	}
	/**
	 * 
	 * 
	 * @Description Create the Excel and Insert the Data
	 */
	//63. create the value in cell
	public class Create {		
		public void InsertData(String sheetName, int rowNum,int cellNum,String data) throws IOException {
			File file=new File("");
			Workbook workbook=new XSSFWorkbook();
			Sheet sheet = workbook.createSheet(sheetName);
			Row row = sheet.createRow(rowNum);
			Cell cell = row.createCell(cellNum);
			cell.setCellValue(data);
			FileOutputStream stream=new FileOutputStream(file);
			workbook.write(stream);

		}

	}
	
	

}
