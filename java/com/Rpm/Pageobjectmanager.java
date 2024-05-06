package com.Rpm;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private LoginPage lp;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public LoginPage getLogin() {

		if (lp == null) {

			lp = new LoginPage(driver);

		}
		return lp;

	}

}
