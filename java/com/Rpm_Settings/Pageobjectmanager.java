package com.Rpm_Settings;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private RpmSetting rs;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public RpmSetting getRpmSetting() {

		if (rs == null) {

			rs = new RpmSetting(driver);

		}
		return rs;

	}

}
