package com.Rpm_Patientportal;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private Patientportalrpm rp;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public Patientportalrpm getPatientportalrpm() {

		if (rp == null) {

			rp = new Patientportalrpm(driver);

		}
		return rp;

	}

}
