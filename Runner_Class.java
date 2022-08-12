package com.Mini_Project;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class Runner_Class extends Base_Class {
	public static WebDriver driver;
	public static WebElement value;
	public static void main(String[] args) throws Throwable {
	driver = browser_Launch("chrome");

	get_Url("https://petstore.octoperf.com/actions/Catalog.action");
	waitimp();
	Login_Page a = new Login_Page(driver);
	click(a.getSingin());
	sendkeys(a.getUsername(), "Ajith");
	clear(a.getPassword());
	sendkeys(a.getPassword(), "Password");
	click(a.getLogin());

	Login_Page b = new Login_Page(driver);
	click(b.getDog());

	Product_Page c = new Product_Page(driver);
	click(c.getProductid());

	Male_Female d = new Male_Female(driver);
	click(d.getMale());

	Adult_Male e = new Adult_Male(driver);
	click(e.getAddto());

	Shopping f = new Shopping(driver);
	click(f.getProcess());

	Payments g = new Payments(driver);
	click(g.getPayment());

	Confirm h = new Confirm(driver);
	click(h.getConfirm());
	
	screenshot();
//	quit();
	}
	}
