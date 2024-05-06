package com.Rpm_Patientportalnegative;

import org.openqa.selenium.WebDriver;

public class Pageobjectmanager {

	public static WebDriver driver;

	private Patientportalrpmnegative rn;

	public Pageobjectmanager(WebDriver driver2) {
		// TODO Auto-generated constructor stub
		this.driver = driver2;

	}

	public Patientportalrpmnegative getPatientportalrpmnegative() {

		if (rn == null) {

			rn = new Patientportalrpmnegative(driver);

		}
		return rn;

	}

}
