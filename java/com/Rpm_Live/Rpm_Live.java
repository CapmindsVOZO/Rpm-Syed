package com.Rpm_Live;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Rpm_Live extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 1)

	public void Live() throws InterruptedException {

		// User launch The Browser

		geturl("https://production.rpm.vozohealth.com/");

		// User Verify The Title
//						titleverify(pom.getdashboardrpm().getverifylogintitle(), "Welcome Back");

		sendkeys(pom.getlivepage().getsendusername(), "vishwa");

		// User Enter Password
		sendkeys(pom.getlivepage().getsendpassword(), "Test@1234");

		// User Login Option

		Clickonelement(pom.getlivepage().getclicklogin());

		// Click live button
		Thread.sleep(5000);

		Clickonelement(pom.getlivepage().getclicklive());

		// User Verify The Title

		Thread.sleep(5000);
		titleverify(pom.getlivepage().getverifylivetitle(), "Live");

		// user Search Patient

		sendkeys(pom.getlivepage().getsearchpatient(), "suba");

		// user select vitals

		Clickonelement(pom.getlivepage().getselectvitals());

		// user select heart Rate

		Clickonelement(pom.getlivepage().getselectheartrate());

		// user select vitals

		Thread.sleep(3000);

//		Clickonelement(pom.getlivepage().getselectvitals());

		// user select vitals respiration

		Clickonelement(pom.getlivepage().getselectrespirationrate());

		// user select vitals

		Thread.sleep(3000);

//		Clickonelement(pom.getlivepage().getselectvitals());

		// user select vitals blood pressure

		Clickonelement(pom.getlivepage().getselectbloodpressure());

		// user select patient name click

		Clickonelement(pom.getlivepage().getpatientnameclick());

		// user select provider name click

		Clickonelement(pom.getlivepage().getprovidernameclick());

		// user select heart rate click

		Clickonelement(pom.getlivepage().getheartnameclick());

		// user select Respiration click

		Clickonelement(pom.getlivepage().getrespirationclick());

		// user select Blood Pressure click

		Clickonelement(pom.getlivepage().getbloodpressureclick());

		// user select export csv

		Thread.sleep(3000);

		Clickonelement(pom.getlivepage().getexportcsv());

//		Clickonelement(pom.getlivepage().getclickcsv());

		// Actions

//		// user select add notes
//
//		Clickonelement(pom.getlivepage().getaddnoteslive());
//
//		// user select add notes phone call
//
//		Clickonelement(pom.getlivepage().getaddnotesphonecall());
//
//		// user select add notes review pg
//
//		Clickonelement(pom.getlivepage().getaddnotesreviewpg());
//
//		// user select add notes time
//
//		Clickonelement(pom.getlivepage().getaddnotestimespent());
//
//		// user select add notes confirm notes
//
//		Clickonelement(pom.getlivepage().getaddnotesconfirm());
//
//		// user select add notes chat box
//
//		Clickonelement(pom.getlivepage().getclickchatbox());
//
//		// user select Type message
//
//		Clickonelement(pom.getlivepage().gettypemessage());
//
//		// user select send message click
//
//		Clickonelement(pom.getlivepage().getclicksendmessage());

	}

}
