package com.Rpm_Treatmentplan;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private Treatmentplanrpm dr;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public Treatmentplanrpm gettreatmentplan() {

		if (dr == null) {

			dr = new Treatmentplanrpm(driver);

		}
		return dr;

	}

}
