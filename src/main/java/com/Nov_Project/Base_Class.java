package com.Nov_Project;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;

public class Base_Class {

	public static WebDriver driver;

	public static WebDriver getBrowser(String types) {

		if (types.equalsIgnoreCase("chrome")) {

			System.setProperty("webdriver.chrome.driver",
					System.getProperty("user.dir") + "//driver//chromedriver.exe");

			driver = new ChromeDriver();

		} else if (types.equalsIgnoreCase("firefox")) {

			System.setProperty("webdriver.gecko.driver", System.getProperty("user.dir") + "//driver//geckodriver.exe");

			driver = new FirefoxDriver();
		}

		return driver;

	}

	public static void getURL(String url) {

		driver.get(url);
	}

	public static void max() {

		driver.manage().window().maximize();

	}

	public static void moveToElement(WebElement element) {

		Actions a = new Actions(driver);

		a.moveToElement(element).build().perform();
	}

	public static void clickOnElement(WebElement element) {
		element.click();

	}

	public static void javaScriptExecutor() {
		JavascriptExecutor js = (JavascriptExecutor) driver;
		js.executeScript("window.scroll(0,500)", " ");
	}

	public static void timeOut(int time) {
		driver.manage().timeouts().implicitlyWait(time, TimeUnit.SECONDS);
	}

	public static void clear(WebElement element) {
		element.clear();
	}

	public static void inputValueElement(WebElement element, CharSequence[] i) {
		element.sendKeys(i);
	}

	public static void inputValueElement(WebElement element, String value) {
		element.sendKeys(value);
	}

	public static void sleep(int milliseconds) throws InterruptedException {
		Thread.sleep(milliseconds);
	}

	public static void screenshots() throws IOException {

		TakesScreenshot ts = (TakesScreenshot) driver;
		File s = ts.getScreenshotAs(OutputType.FILE);
		File d = new File("C:\\Users\\srilekhaa\\eclipse-workspace\\Nov_Project\\Screenshot\\snap.png");
		FileUtils.copyFile(s, d);

	}
}
