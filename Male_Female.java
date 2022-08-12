package com.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Male_Female {
	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='EST-6']")
	private WebElement male;

	public static WebDriver getDriver() {
	return driver;
	}

	public WebElement getMale() {
	return male;
	}

	public Male_Female(WebDriver driver3) {
	this.driver = driver3;
	PageFactory.initElements(driver3, this);
	}

}
