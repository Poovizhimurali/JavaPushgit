package com.base.com;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

public class BaseClass {

	public static WebDriver driver;

	public static WebDriver BrowserLaunch(String browsername) {
		if (browsername == "chrome") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Poovizhi\\eclipse-newwork\\MavenProject\\Drivers\\chromedriver.exe");
			driver = new ChromeDriver();
		} else if (browsername == "firefox") {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Poovizhi\\eclipse-newwork\\MavenProject\\Drivers\\geckodriver.exe");
			driver = new FirefoxDriver();
		} else if (browsername == "edge") {
			System.setProperty("webdriver.edge.driver",
					"C:\\Users\\Poovizhi\\eclipse-newwork\\MavenProject\\Drivers\\msedgedriver.exe");

			driver = new EdgeDriver();
		} else {
			System.out.println("Invalid browser input");
		}
		driver.manage().window().maximize();
		return driver;

	}

	public static void launchurl(String url) {
		driver.get(url);

	}

	public static void closewindow() {
		driver.close();
	}

	public static void quitwindow() {
		driver.quit();

	}

	public static void sendkeys(WebElement element, String value) {
		element.sendKeys(value);

	}

	public static void dropdown(WebElement element, String value, String input) {
		Select s = new Select(element);
		if (value == "value") {
			s.selectByValue(input);
		} else if (value == "text") {
			s.selectByVisibleText(input);
		} else {
			s.selectByIndex(Integer.parseInt(input));
		}

	}

	public static void getoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> options = s.getOptions();

		ListIterator<WebElement> listIterator = options.listIterator();
		System.out.println("ALL OPTIONS ARE-----------");
		while (listIterator.hasNext()) {
			System.out.println(listIterator.next().getText()); // List iterator
		}

	}

	public static void getcurrenturl() {
		String currentUrl = driver.getCurrentUrl();
		System.out.println("current url is ------------");
		System.out.println(currentUrl);

	}

	public static void getallselectedoptions(WebElement element) {
		Select s = new Select(element);
		List<WebElement> allSelectedOptions = s.getAllSelectedOptions();
		Iterator<WebElement> iterator = allSelectedOptions.iterator();
		System.out.println("SELECTED OPTIONS ARE---------");
		while (iterator.hasNext()) {
			System.out.println(iterator.next().getText()); // Iterator
		}

	}

	public static void scrolldown1500() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,1500)", "");
	}

	public static void scrolldown800() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,800)", "");
	}
	public static void scrolldown300() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,300)", "");
	}
	public static void scrollup() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scrollBy(0,-8000)");
	}

	public static void scrollbyvisibleelements(WebElement element) {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("arguments[0].scrollIntoView();", element);
	}

	public static void getfirstselectedoption(WebElement element) {
		Select s = new Select(element);
		WebElement firstSelectedOption = s.getFirstSelectedOption();
		String firstselected = firstSelectedOption.getText();
		System.out.println("First selected option: \n" + firstselected);

	}

	public static void gettitles() {
		Set<String> windowHandles = driver.getWindowHandles();
		for (String id : windowHandles) {
			String title = driver.switchTo().window(id).getTitle();
			System.out.println("Titles are-----------");
			System.out.println(title);
		}
	}

	public static void windowhandles(String value) {
		Set<String> windowHandles = driver.getWindowHandles();
		String switchtitle = value;

		for (String id2 : windowHandles) {
			if (driver.switchTo().window(id2).getTitle().equals(switchtitle)) {
				break;
			}
		}

	}

	public static void gettext(WebElement element) {
		String text = element.getText();
		System.out.println("Get text is------");
		System.out.println(text);

	}

	public static void ismultiple(WebElement element) {
		Select s = new Select(element);
		boolean multiple = s.isMultiple();
		System.out.println(multiple);

	}

	public static void navigateTo(String url) {
		driver.navigate().to(url);
	}

	public static void clickonelement(WebElement element) {
		element.click();
	}

	public static void Alertacceptordismis(String value) {
		Alert alert = driver.switchTo().alert();

		if (value == "accept") {
			alert.accept();
		} else {
			alert.dismiss();
		}

	}

	public static void rightclick(WebElement element) {
		Actions sc = new Actions(driver);
		sc.contextClick(element).build().perform();

	}

	public static void movetoelement(WebElement element) {
		Actions sc = new Actions(driver);
		sc.moveToElement(element).build().perform();

	}

	public static void draganddrop(WebElement dragelement1, WebElement dropelement2) {
		Actions sc = new Actions(driver);
		sc.dragAndDrop(dragelement1, dropelement2).build().perform();

	}

	public static void clickandhold(WebElement element) {
		Actions sc = new Actions(driver);
		sc.clickAndHold(element).build().perform();

	}

	public static void release(WebElement element) {
		Actions sc = new Actions(driver);
		sc.release(element).build().perform();
	}

	public static void switchtoframe(String value) {
		driver.switchTo().frame(value);

	}

	public static void switchtodefault() {
		driver.switchTo().defaultContent();

	}

	public static void robotclass() throws AWTException {
		Robot demo = new Robot();
		demo.keyPress(KeyEvent.VK_DOWN);
		demo.keyRelease(KeyEvent.VK_DOWN);
		demo.keyPress(KeyEvent.VK_ENTER);
		demo.keyPress(KeyEvent.VK_ENTER);

	}

	public static void threadsleep(int value) throws InterruptedException {
		Thread.sleep(value);

	}

	public static void screenshot(String filepathandname) throws IOException {
		TakesScreenshot ts = (TakesScreenshot) driver;
		File source = ts.getScreenshotAs(OutputType.FILE);
		File destination = new File(filepathandname);
		FileUtils.copyFile(source, destination);

	}

	public static void navigateback() {
		driver.navigate().back();
	}

	public static void navigateforward() {
		driver.navigate().forward();
	}

	public static void refreshpage() {
		driver.navigate().refresh();

	}

	public static void isenabled(WebElement element) {
		boolean enabled = element.isEnabled();
		System.out.println(enabled);

	}

	public static void isdisplayed(WebElement element) {

		boolean displayed = element.isDisplayed();
		System.out.println(displayed);
	}

	public static void isselected(WebElement element) {
		boolean selected = element.isSelected();
		System.out.println(selected);

	}

}
