package com.Rpm_Patientportalnegative;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Patientportal_negative extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 0)

	public void PatientportalLogin() throws InterruptedException {

		// User launch The Browser

		geturl("https://mumbairpm.vozo.xyz/");

		// User click new client

		Clickonelement(pom.getPatientportalrpmnegative().getiamnewclient());

		// User click new client enter email

		sendkeys(pom.getPatientportalrpmnegative().getenteremail(), "sam321@spambog.com");

		// User click new client click continue

		Clickonelement(pom.getPatientportalrpmnegative().getclickcontinue());

		// User click new client enter otp

		sendkeys(pom.getPatientportalrpmnegative().getenterotp(), "3211");

		// User click new client click continue

		Clickonelement(pom.getPatientportalrpmnegative().getverifyaccount());

		// User click new client enter otp

		gettext(pom.getPatientportalrpmnegative().getotpinvalid());

		driver.navigate().back();

		driver.navigate().back();

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getexistingclient());

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getenteremail1(), "dasd@das.dasd");

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getcontinue1());

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getenteremailsigin(), "");

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getpresslogin());

		// User click new client click existing client

		gettext(pom.getPatientportalrpmnegative().getenterpasswordvalidation());

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getforgotpassword());

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getforgotpasswordemail(), "");

		// User click new client click existing client

		gettext(pom.getPatientportalrpmnegative().getsendverficationcode());

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getloginbtn());

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getenteremailsigin1(), "");

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getenterpassword1(), "");

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getpresslogin1());

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getpressmyprofile());

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getselectmyprofile());

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getdateofbirth(), "");

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getssnnumber(), "");

		// User click new client click existing client

		sendkeys(pom.getPatientportalrpmnegative().getemailaddress(), "");

		// User click new client click existing client

		Clickonelement(pom.getPatientportalrpmnegative().getsavemyprofile());

	}

}
