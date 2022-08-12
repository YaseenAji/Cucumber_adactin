package com.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Adult_Male {
	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Add to Cart']")
	private WebElement addto;

	public static WebDriver getDriver() {
	return driver;
	}

	public WebElement getAddto() {
	return addto;
	}

	public Adult_Male(WebDriver driver4) {
	this.driver = driver4;
	PageFactory.initElements(driver4, this);
	}

	}


