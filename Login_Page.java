package com.Mini_Project;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login_Page {

	public static WebDriver driver;

	@FindBy(xpath = "//a[text()='Sign In']")
	private WebElement singin;

	@FindBy(xpath = "//input[@name='username']")
	private WebElement username;

	@FindBy(xpath = "//input[@type='password']")
	private WebElement password;

	@FindBy(xpath = "//input[@name='signon']")
	private WebElement login;

	@FindBy(xpath = "//area[@alt='Dogs']")
	private WebElement dog;

	public static WebDriver getDriver() {
	return driver;
	}

	public WebElement getDog() {
	return dog;
	}

	public static WebDriver getDriver4() {
	return driver;
	}

	public WebElement getSingin() {
	return singin;
	}

	public WebElement getUsername() {
	return username;
	}

	public WebElement getPassword() {
	return password;
	}

	public WebElement getLogin() {
	return login;
	}


	public Login_Page(WebDriver driver) {
	this.driver = driver;
	PageFactory.initElements(driver, this);

	}

	}

