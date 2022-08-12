package com.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Confirm {

	public static WebDriver driver;

	@FindBy(xpath = "//a[@class='Button']")
	private WebElement confirm;

	public static WebDriver getDriver() {
	return driver;
	}

	public WebElement getConfirm() {
	return confirm;
	}

	public Confirm(WebDriver driver7) {
	this.driver = driver7;
	PageFactory.initElements(driver7, this);
	}

}
