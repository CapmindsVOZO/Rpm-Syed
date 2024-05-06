package com.RPM_Dashboards;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class dashboards_Rpm extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 1)

	public void Dashboard() throws InterruptedException {

		// User launch The Browser

		geturl("https://production.rpm.vozohealth.com/");

		// User Verify The Title
//				titleverify(pom.getdashboardrpm().getverifylogintitle(), "Welcome Back");

		sendkeys(pom.getdashboardrpm().getsendusername(), "vishwa");

		// User Enter Password
		sendkeys(pom.getdashboardrpm().getsendpassword(), "Test@1234");

		// User Login Option

		Clickonelement(pom.getdashboardrpm().getclicklogin());

		Thread.sleep(5000);

		driver.navigate().refresh();

		Thread.sleep(5000);

		try {
			// User verify title

			titleverify(pom.getdashboardrpm().gettitleverify(), "Welcome back, Test Account");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User verify title overview

		titleverify(pom.getdashboardrpm().getoverviewverify(), "Overview");

		// User verify title overview

		titleverify(pom.getdashboardrpm().getliveverify(), "Live");

		// User click View all live
		Thread.sleep(4000);

		Clickonelement(pom.getdashboardrpm().getviewalllive());

		// User click dashboard

		Clickonelement(pom.getdashboardrpm().getclickdashboard());

		// User verify title Vital Summary

		Thread.sleep(4000);

		titleverify(pom.getdashboardrpm().getvitalssummary(), "Vital Summary");

		// User verify title treatmentplan

		Thread.sleep(2000);
		titleverify(pom.getdashboardrpm().gettreatmentplan(), "Treatment Plan");

		// User Click View all

		Clickonelement(pom.getdashboardrpm().gettreatmentplanviewall());

		// User click dashboard

		Clickonelement(pom.getdashboardrpm().getclickdashboard());

		// User verify title My Patient
		Thread.sleep(3000);

		titleverify(pom.getdashboardrpm().getmypatienttitle(), "My Patient");

		// User click add Patient

		Clickonelement(pom.getdashboardrpm().getaddpatient());

		// User click dashboard

		Clickonelement(pom.getdashboardrpm().getclickdashboard());

		// User click View all Patient

		Thread.sleep(5000);

		Clickonelement(pom.getdashboardrpm().getviewallmypatient());

		// User click View click My patient dropdown
		Thread.sleep(5000);

		Clickonelement(pom.getdashboardrpm().getclickmypatient());

		// User click View click My patient dropdown

		Clickonelement(pom.getdashboardrpm().getselectmypatient());

		// User click dashboard

		Clickonelement(pom.getdashboardrpm().getclickdashboard());

		try {
			// User click notification
			Thread.sleep(5000);

			Clickonelement(pom.getdashboardrpm().getclicknotification());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	
	@Ignore

	@Test(priority = 2)

	public void Dashboardnegative() throws InterruptedException {

		// User click notification

		Clickonelement(pom.getdashboardrpm().getclickdashboard1());

		// User click notification

		Clickonelement(pom.getdashboardrpm().getclickaddpatients());

	}

}
