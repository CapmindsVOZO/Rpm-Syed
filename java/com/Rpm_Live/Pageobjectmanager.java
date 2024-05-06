package com.Rpm_Live;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private Livepage lp;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public Livepage getlivepage() {

		if (lp == null) {

			lp = new Livepage(driver);

		}
		return lp;

	}

}
