package com.Mini_Project;

import java.io.File;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Base_Class {

	public static WebDriver driver;

	// browser_Launch
	public static WebDriver browser_Launch(String browser) {
	WebDriverManager.chromedriver().setup();
	return driver = new ChromeDriver();
	}

	// get_url
	public static void get_Url(String link) {
	driver.get(link);
	driver.manage().window().maximize();
	}

	// sendkeys
	public static void sendkeys(WebElement name, String username) {
	name.sendKeys(username);
	}

	// click
	public static void click(WebElement clickin) {
	clickin.click();
	}

	// move_element
	public static void Movein(WebElement move) {
	Actions act = new Actions(driver);
	act.moveToElement(move).build().perform();
	}

	// clear
	public static void clear(WebElement element) {
	element.clear();
	}
	// wait
	public static void waitimp() {
	driver.manage().timeouts().implicitlyWait(10000, TimeUnit.MILLISECONDS);
	}

	// screen_shot
	public static void screenshot() throws Throwable {
	TakesScreenshot ts = (TakesScreenshot) driver;
	File from = ts.getScreenshotAs(OutputType.FILE);
	File to = new File("G:\\Selenium\\Screenshots\\Doggy.png");
	FileUtils.copyFile(from, to);
	}

	// quit

//	public static void quit() {
//	driver.quit();
//	}

}
