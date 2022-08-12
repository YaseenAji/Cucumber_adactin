package com.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Product_Page {
	public static WebDriver driver;

	// product page
	@FindBy(xpath = "//a[text()='K9-BD-01']")
	private WebElement productid;

	@FindBy(xpath = "(//a[text()='EST-6']")
	private WebElement addto;


	public WebElement getAddto() {
	return addto;
	}

	public static WebDriver getDriver() {
	return driver;
	}

	public WebElement getProductid() {
	return productid;
	}

	public Product_Page(WebDriver driver2) {
	this.driver = driver2;
	PageFactory.initElements(driver2, this);
	}


}
