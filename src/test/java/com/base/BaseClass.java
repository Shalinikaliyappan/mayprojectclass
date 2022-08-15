package com.base;
/**
 * 
 */



import java.awt.AWTException;

import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.math.BigDecimal;
import java.net.MalformedURLException;
import java.net.URL;

import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.Set;
import java.util.Date;
import java.util.List;

import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellType;
import org.apache.poi.ss.usermodel.DateUtil;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.ss.usermodel.Sheet;
import org.apache.poi.ss.usermodel.Workbook;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;

import org.openqa.selenium.support.ui.Select;


import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
	public static WebDriver driver;
	public static void getDriver(String browserType) {
		switch(browserType) {
		case"chrome":
			WebDriverManager.chromedriver().setup();
			driver=new ChromeDriver();
			break;
		case"Firefox":
			WebDriverManager.firefoxdriver().setup();
			driver=new FirefoxDriver();
			break;
		case"Ie":
			WebDriverManager.iedriver().setup();
			driver=new InternetExplorerDriver();
			break;
		case"edge":
			WebDriverManager.edgedriver().setup();
			driver=new EdgeDriver();
			break;    

		}


	}


	public static void loadUrl(String url) {  //1
		driver.get(url);

	}
	public  static void maximize() {           //2
		driver.manage().window().maximize();
	}
	public void type(WebElement element,String datas) {   //3
		element.sendKeys(datas);
	}
	public void click(WebElement element) {   //4
		element.click();
	}
	public WebElement findElementById(String attributevalue) {   //5
		WebElement element =driver.findElement(By.id(attributevalue));
		return element;
	}
	public WebElement findElementByName(String attributevalue) {   //6
		WebElement element =driver.findElement(By.name(attributevalue));
		return element;
	}
	public WebElement findElementByXpath(String xpath) {     //7
		WebElement element =driver.findElement(By.xpath(xpath));
		return element;
	} 
	public WebElement findElementByClass(String attributevalue) { //8
		WebElement element=driver.findElement(By.className(attributevalue));
		return element;
	}
	public static void closeCurntWin() {    //9
		driver.close();
	}
	public static void closeAll() {        //10
		driver.quit();
	}
	public void clear(WebElement element) {
		element.clear();


	}
	public String getTitle() {      //11
		String s=driver.getTitle();
		return s;

	}
	public String geturl() {       //12
		String s=driver.getCurrentUrl();
		return s;
	}
	public String findAttValue(WebElement element) {        //13.
		String s= element.getAttribute("value");
		return s;
	}
	public String findAttributeValue(WebElement element,String attributename) { //14
		String s =element.getAttribute("attribute Name");    //14
		return s;
	}
	public void selectOptionByText(WebElement element,String text) {   //15
		Select select=new Select(element);
		select.selectByVisibleText(text);	

	}
	public void selectOptionByIndex(WebElement element,int index) {    //16
		Select select=new Select(element);
		select.selectByIndex(index);	

	}
	public void swelectOptionByAttribute(WebElement element,String value) {    //17
		Select select=new Select(element);
		select.selectByValue(value);	
	}
	public  void deselectAll(WebElement element) {          //18
		Select select=new Select(element);
		select.deselectAll();
	}
	public void deselectByIndex(WebElement element,int index) {     //19
		Select select=new Select(element);
		select.deselectByIndex(index);
	}
	public void deselectByText(WebElement element,String text) {         //20
		Select select=new Select(element);
		select.deselectByVisibleText(text);

	}
	public void deselectByValue(WebElement element,String value) {        //21
		Select select=new Select(element);
		select.deselectByValue(value);
	}
	public boolean isMultiuple(WebElement element) {     //22
		Select select=new Select(element);
		boolean b=	select.isMultiple();
		return b;
	}
	public void refresh() {             //23
		driver.navigate().refresh();
	}
	public void back() {                //24
		driver.navigate().back();

	} 
	public void forward() {              //25    
		driver.navigate().forward();

	}
	public String title() {              //26     
		String s  =	driver.getTitle();
		return s;

	}

	public void typeJs(WebElement element, String testdata) {       //27
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].setAttribute('value','"+testdata+"')", element);


	}
	public Object getAttributeValueJs(WebElement element, String testdata) {       //28
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		Object o=javascriptExecutor.executeScript("return.arguments[0].getAttribute('value')", element);
		return o;
	}
	public void clickJs(WebElement element) {       //29
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].click()", element);

	}
	public void ScrollupJs(WebElement element) {       //30
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].scrollInToView(false)", element);

	}
	public void ScrolldownJs(WebElement element) {       //31
		JavascriptExecutor javascriptExecutor =(JavascriptExecutor) driver;
		javascriptExecutor.executeScript("arguments[0].scrollInToView(true)", element);

	}

	public void rightClick(WebElement element) {       //33
		Actions actions=new Actions(driver);
		actions.contextClick(element).perform();

	}
	public void doubleClick(WebElement element) {       //34
		Actions actions=new Actions(driver);
		actions.doubleClick(element).perform();

	}
	public void mouseActions(WebElement element) {       //35
		Actions actions=new Actions(driver);
		actions.moveToElement(element).perform();

	}
	public void dragAndDrop(WebElement element,WebElement source) {       //36
		Actions actions=new Actions(driver);
		actions.dragAndDrop(source, element).perform();

	}
	public WebElement getFirstSelectedOption(WebElement element) {        //37
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption ;
	} 
	public String getText1(WebElement webElement) {                    //38
		Alert alert = driver.switchTo().alert();
		String text = alert.getText();
		return text;
	}
	public String getText(WebElement element) {
		String text=element.getText();
		return text;

	}
	public void frameById(String id) {          //39
		driver.switchTo().frame(id);

	}
	public void frameByname(String name) {          //40
		driver.switchTo().frame(name);

	}
	public void frameByElement(WebElement frameElement) {          //41
		driver.switchTo().frame(frameElement);

	}
	public void frameByindex(int index) {          //42
		driver.switchTo().frame(index);

	}
	public String prntWin() {                      //43
		String windowHandle = driver.getWindowHandle();
		return windowHandle;

	}
	public Set<String> allWin() {                      //44
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	public void defaultContent() {                        //45
		driver.switchTo().defaultContent();
	}
	public void alertSendKeys(String datas) {              //46
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(datas);
	} 
	public void navigateString(String url) {             //47
		driver.navigate().to(url);
	}
	public void navigateUrl(String url) throws MalformedURLException {      //48
		URL url2=new URL(url);
		driver.navigate().to(url2);
	}
	public void actionSndKeys(String datas) {                 //49
		Actions actions =new Actions(driver);
		actions.sendKeys(datas);
	}
	public void pressRelease() {                   //50
		Actions actions =new Actions(driver);
		actions.keyDown(Keys.SHIFT);
		actions.keyDown(Keys.SHIFT);
	}

	public List<WebElement> findElements(String name) {         //51
		List<WebElement> findElements = driver.findElements(By.tagName(name));
		return findElements;

	}
	public List<WebElement>getOptions(WebElement element) {   //52
		Select select =new Select(element);
		List<WebElement> options = select.getOptions();
		return options;

	} 
	public List<WebElement>getAllOptions (WebElement element) {   //53
		Select select =new Select(element);
		List<WebElement> options = select.getAllSelectedOptions();
		return options;
	} 
	public void wndwHandleId(String id) {         //54
		driver.switchTo().window(id);

	}
	public void wndwHandleTitle(String title) {       //55
		driver.switchTo().window(title);
	}
	public void wndwHandleUrl( String url) {        //56
		driver.switchTo().window(url);
	}
	public void robortClass(int VK) throws AWTException {              //57
		Robot robot =new Robot();
		robot.keyPress(KeyEvent.VK_0);
		robot.keyRelease(KeyEvent.VK_0);
	}
	public void implicitWait(int i) {      //58
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	}
	public File screenShot() {            //59
		TakesScreenshot ts=(TakesScreenshot) driver;
		File screenshotAs = ts.getScreenshotAs(OutputType.FILE);
		return  screenshotAs;
	}


	public void clikhld(WebElement element) { //60
		Actions a=new Actions(driver);
		a.clickAndHold().perform();
	}


	public String getData(String url,String sheetname,int rownum,int cellnum) throws IOException {
		String res = null;
		File file= new File(url);
		FileInputStream stream =new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		CellType cellType = cell.getCellType();
		switch (cellType) {
		case STRING:
			res = cell.getStringCellValue();
			break;
		case NUMERIC:
			if(DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat=new SimpleDateFormat("dd/MM/YYYY");
				res = dateFormat.format(dateCellValue);
			}
			else {
				double d = cell.getNumericCellValue();
				BigDecimal b = BigDecimal.valueOf(d);
				res = b.toString();


			}
			break;
		default:
			break;
		}
		return res;   
	}
	public void updateData(String url,String name ,int rownum ,int cellnum,String old,String newdata ) throws IOException{
		File file= new File(url);
		FileInputStream stream =new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(name);
		Row row = sheet.getRow(rownum);
		Cell cell = row.getCell(cellnum);
		String value = cell.getStringCellValue();
		if(value.equals(old)) {
			cell.setCellValue(newdata);
		}
		FileOutputStream o=new FileOutputStream(file);
		workbook.write(o);
	}
	public void writeData(String url,String sheetname,int rowno,int cellno,String data) throws IOException {
		File file= new File(url);
		FileInputStream stream =new FileInputStream(file);
		Workbook workbook=new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.createCell(cellno);
		cell.setCellValue(data);
		FileOutputStream o=new FileOutputStream(file);
		workbook.write(o);
	}
	public void createWorkbook(String sheetname,int rowno,int cellno,String data) throws IOException {
		File file= new File("C:\\Users\\rajvi\\eclipse-workspace\\FrameworkMaven\\Excel\\AdactinTask.xlsx");
		Workbook workbook=new XSSFWorkbook();
		Sheet sheet = workbook.getSheet(sheetname);
		Row row = sheet.getRow(rowno);
		Cell cell = row.getCell(cellno);
		cell.setCellValue(data);
		FileOutputStream o=new FileOutputStream(file);
		workbook.write(o);
	}








}
