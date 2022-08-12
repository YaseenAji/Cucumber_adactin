package com.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Shopping {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Proceed to Checkout']")
	private WebElement process;

	public static WebDriver getDriver() {
	return driver;
	}

	public WebElement getProcess() {
	return process;
	}

	public Shopping(WebDriver driver5) {
	this.driver = driver5;
	PageFactory.initElements(driver5, this);
	}

	}

