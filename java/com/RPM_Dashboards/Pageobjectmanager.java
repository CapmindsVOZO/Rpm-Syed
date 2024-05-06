package com.RPM_Dashboards;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private Dashboardrpm dr;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public Dashboardrpm getdashboardrpm() {

		if (dr == null) {

			dr = new Dashboardrpm(driver);

		}
		return dr;

	}

}
