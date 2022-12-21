package com.base;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.time.Duration;
import java.util.ArrayList;
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
	private static final int OutputType = 0;
	public static WebDriver driver;

	// 1 get URl/maximise
	public static void browserLaunch(String url) {
		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
		driver.get(url);
		driver.manage().window().maximize();
	}
	
	//Enter URL
	
	public static void enterAppUrl(String urll) {

		driver.get(urll);
		
		
	}

	
	public static void maxmizewindow() {

		driver.manage().window().maximize();
		
	}
	
	// 2 FINDELEMENT BY ID
	public static WebElement findElementID(String ID) {
		
		WebElement element = driver.findElement(By.id(ID));
		return element;
	}

	// 3 FIND ELEMENT BY PASSWORD
	public static WebElement findElemntName(String NAME) {
		WebElement element = driver.findElement(By.name(NAME));
		return element;
	}

	// 4 FIND ELEMENT BY CLASSNAME
	public static WebElement findElementClassName(String CLASSNAME) {
		WebElement element = driver.findElement(By.className(CLASSNAME));
		return element;
	}

	// 5 FIND ELEMENT BY XPATH
	public static WebElement findElementXpath(String XPATH) {
		WebElement element = driver.findElement(By.xpath(XPATH));
		return element;
	}

	// 6 SENDKEYS
	public static void sendKeysValue(WebElement element, String data) {
		elementVisibility(element);
		element.sendKeys(data);
	}

	// 7 CLICK
	public void click(WebElement element) {
		element.click();
	}

	// ENTER

	public static void enter() throws AWTException {

		Robot r = new Robot();
		r.keyPress(KeyEvent.VK_ENTER);
		r.keyRelease(KeyEvent.VK_ENTER);

	}

	// 8 GET TEXT
	public static String getTextt(WebElement element) {
		String text = element.getText();
		return text;

	}

	// 9 GET ATTRIBUTES
	public String getAttributes(WebElement element) {
		elementVisibility(element);
		String attribute = element.getAttribute("value");
		return attribute;
	}

	// 10 actions DoubleCLick
	public void doubleClick(WebElement element) {
		elementVisibility(element);
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 11 Actions RightCLick
	public void rightCliick(WebElement element) {
		elementVisibility(element);
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();
	}

	// 12 Select GetOptions
	public List<WebElement> getOptions(WebElement element) {
		elementVisibility(element);
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	// 13 selectByIndex
	public void selectByIndex(WebElement element, int index) {
		elementVisibility(element);
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	// 14 SelectByValue
	public void selectByValue(WebElement element, String value) {
		elementVisibility(element);
		Select select = new Select(element);
		select.selectByValue(value);
	}

	// 15 SelectByVisibleText
	public void selectByVisibleText(WebElement element, String text) {
		elementVisibility(element);
		Select select = new Select(element);
		select.selectByVisibleText(text);
	}

	// 16 DeselectAll
	public void deselectAll(WebElement element) {
		elementVisibility(element);
		Select select = new Select(element);
		select.deselectAll();
	}

	// 17 GetFirstSelectedOptions
	public void getFirstSelectedOption(WebElement element) {
		elementVisibility(element);
		Select select = new Select(element);
		select.getFirstSelectedOption();
	}

	// 18 get all selected options
	public List<WebElement> getAllSelectedOptions(WebElement element) {
		elementVisibility(element);
		Select select = new Select(element);
		List<WebElement> selectedoptons = select.getAllSelectedOptions();
		return selectedoptons;
	}

	// 19 drop down is multiple or not
	public boolean isMultiple(WebElement element) {
		elementVisibility(element);
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	// 20 deselect by index
	public void deselectByIndex(WebElement element, int index) {
		elementVisibility(element);
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	// 21 deselect by text
	public void deselectByText(WebElement element, String text) {
		elementVisibility(element);
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	// 22 Navigate
	public void navigate(String url) {
		driver.navigate().to(url);
	}

	// 23 navigate to
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	// 24 navigate back
	public void navigateBack() {
		driver.navigate().back();
	}

	// 25 navigate forward
	public void navigateForward() {
		driver.navigate().forward();
	}

	// 26 navigate refresh
	public void navigateRefresh() {
		driver.navigate().refresh();
	}

	// 27 close
	public void quit() {
		driver.quit();
	}

	// 28 close current window
	public void close() {
		driver.close();
	}

	// 29 clear textbox
	public void clear(WebElement element) {
		element.clear();
	}

	// 30 DoubleClick
	public void doubleclick(WebElement element) {
		elementVisibility(element);
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
	}

	// 31RightClick
	public void rightClick(WebElement element) {
		elementVisibility(element);
		Actions actions = new Actions(driver);
		actions.contextClick().perform();
	}

	// 32 MouseOver
	public void mouseOver(WebElement element) {
		elementVisibility(element);
		Actions actions = new Actions(driver);
		actions.moveToElement(element).perform();
	}

	// 33 drag and drop
	public void dragAndDrop(WebElement source, WebElement target) {
		elementVisibility(source);
		elementVisibility(target);
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, target);
	}

	// 34 AlertHandlingAccept
	public void alertHandlingAccept() {
		driver.switchTo().alert().accept();
	}

	// 35 AlertHandlingDismiss
	public void alertHandlingDismiss() {
		driver.switchTo().alert().dismiss();
	}

	// 36 get title
	public String getTitle() {
		String string = driver.getTitle();
		return string;
	}

	// 37 get the entered URL
	public String getCurrentUrl() {
		String string = driver.getCurrentUrl();
		return string;
	}

	// 38 get window handle
	public String getWindowHandle() {
		String string = driver.getWindowHandle();
		return string;
	}

	// 39 get windows handles
	public Set<String> getWindowsHandles() {
		Set<String> set = driver.getWindowHandles();
		return set;
	}

	// 40 switch to child windows
	public void switchWindow(int index) {
		Set<String> windowHandles = driver.getWindowHandles();
		List<String> list = new ArrayList<String>();
		list.addAll(windowHandles);
		driver.switchTo().window(list.get(index));
	}

	// 41 switch to frame by index
	public void switchToFrame(int index) {
		driver.switchTo().frame(index);
	}

	// 42 switch to frame by id
	public void switchToFrame(String name) {
		driver.switchTo().frame(name);
	}

	// 43 javaScriptExecutorClickButton
	public void elementClickButtonByJs(WebElement element) {
		elementVisibility(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguements[0].click()", element);
	}

	// 44 KEY DOWN
	public void keyDown(String key) {
		Actions actions = new Actions(driver);
		Actions keyDown = actions.keyDown(key);
		keyDown.perform();
	}

	// 45 key up
	public void keyUp(String key) {
		Actions actions = new Actions(driver);
		Actions keyUp = actions.keyUp(key);
		keyUp.perform();
	}

	// 46 scroll Down
	public void javaScriptScrollDown(WebElement element) {
		elementVisibility(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeAsyncScript("arguments[0].ScrollIntoView(true)", element);

	}

	// 47 sroll up
	public void javaScriptScrollUp(WebElement element) {
		elementVisibility(element);
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeAsyncScript("arguments[0].ScrollIntoView(false)", element);
	}

	// 48 DATA FROM EXCEL TO BROWSER
	public static String getDataFromExcel(String pathName, String sheetName, int rowNumber, int cellNumber)
			throws IOException {
		String data = null;
		File file = new File(pathName);
		FileInputStream stream = new FileInputStream(file);
		Workbook workbook = new XSSFWorkbook(stream);
		Sheet sheet = workbook.getSheet(sheetName);
		Row row = sheet.getRow(rowNumber);
		Cell cell = row.getCell(cellNumber);
		CellType cellType = cell.getCellType();
		if (cellType.toString().equals("STRING")) {
			data = cell.getStringCellValue();
		}
		if (cellType.toString().equals("NUMERIC")) {
			if (DateUtil.isCellDateFormatted(cell)) {
				Date dateCellValue = cell.getDateCellValue();
				SimpleDateFormat dateFormat = new SimpleDateFormat("dd-MM-YYYY");
				data = dateFormat.format(dateCellValue);
			} else {
				double db = cell.getNumericCellValue();
				Long l = (long) db;
				data = String.valueOf(l);
			}
		}

		return data;
	}

	// Get path of Currect work Project

	public static String getProjectPath() {

		String property = System.getProperty("user.dir");
		return property;
	}

	// Get path of Configuration

	public static String getPropertyFilevalue(String key) throws IOException {

			Properties properties = new Properties();
			
			properties.load(new FileInputStream(getProjectPath()+"\\config\\config.properties"));
			
			
			Object object = properties.get(key);
			String string=(String) object;
			
			return string;
			
	}
	
	public static void getWebDriver(String browserType) {

		switch (browserType) {
		case "chrome":
			
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
case "firefox":
	WebDriverManager.chromedriver().setup();
	driver = new FirefoxDriver();
			break;
			
case "ie":
	WebDriverManager.chromedriver().setup();
	driver = new InternetExplorerDriver();
	break;
	
case "edge":
	WebDriverManager.chromedriver().setup();
	driver = new EdgeDriver();
	break;

		default:
			break;
		}
		
		
		
		
		
		
	}


	
	//IMPLICIT WAITS
	
	public static void implicitWait() {

		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		
		
	}
	
	
	
	//EXPLICITwait
	
	public static void elementVisibility(WebElement element) {

		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(50));
		wait.until(ExpectedConditions.visibilityOf(element));
		
	}
	
	
	
}