package com.NegativeTest;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private RpmNegativeTestcase rn;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public RpmNegativeTestcase getRpmnegative() {

		if (rn == null) {

			rn = new RpmNegativeTestcase(driver);

		}
		return rn;

	}

}
