package com.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Payments {
	public static WebDriver driver;

	@FindBy(xpath = "(//input[@type='submit'])[2]")
	private WebElement payment;


	public static WebDriver getDriver() {
	return driver;
	}


	public WebElement getPayment() {
	return payment;
	}


	public Payments(WebDriver driver6) {
	this.driver = driver6;
	PageFactory.initElements(driver6, this);
	}


}
