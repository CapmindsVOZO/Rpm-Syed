package com.Rpm_Patientportal;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Patientportal_Rpm extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Ignore

	@Test(priority = 0)

	public void PatientportalLogin() throws InterruptedException {

		// User launch The Browser

		geturl("https://production.rpm.clientx.me/");

		// User Verify The Title
		Thread.sleep(5000);
		titleverify(pom.getPatientportalrpm().getRpmlogintitle(), "Welcome back! ");

		// Click iam New clients

		Clickonelement(pom.getPatientportalrpm().getiamnewclient());

		// User enter email

		sendkeys(pom.getPatientportalrpm().getenteremailnew(), "kumar12@spambog.com");

		// User click continue

		Clickonelement(pom.getPatientportalrpm().getcontinue1());

		// user verify otp page

		titleverify(pom.getPatientportalrpm().getverifyaccounttitle(), "Welcome Back");

		// user mail Resend

		Clickonelement(pom.getPatientportalrpm().getresendcode());

		driver.navigate().back();

		driver.navigate().back();
////////////////////////////////////////////Existing client //////////////////////////////////////////////////////
		// User click the existing client

		Clickonelement(pom.getPatientportalrpm().getclickexistingclient());

		// User enter email

		sendkeys(pom.getPatientportalrpm().getenteremail(), "kumar12@spambog.com");

		// User click the continue

		Clickonelement(pom.getPatientportalrpm().getclickcontinue());

		// Login Title

		titleverify(pom.getPatientportalrpm().getlogintitle(), "Welcome Back");

		/// User click forgot password

		Clickonelement(pom.getPatientportalrpm().getforgotpassword());

		/// User click forgot password

		titleverify(pom.getPatientportalrpm().getforgotpasswordtitle(), "Welcome Back");

		// User enter email forgot password

		sendkeys(pom.getPatientportalrpm().getenteremailforgot(), "kumar12@spambog.com");

		/// User click forgot password verification button

		Clickonelement(pom.getPatientportalrpm().getsendverificationcode());

		/// User click forgot password back button

		Clickonelement(pom.getPatientportalrpm().getbacklogin());

		/// User send enter email

		sendkeys(pom.getPatientportalrpm().getenteremaillogin(), "kumar12@spambog.com");

		/// User send Password

		sendkeys(pom.getPatientportalrpm().getenterpasslogin(), "Test@1234");

		/// User click login Option

		Clickonelement(pom.getPatientportalrpm().getloginbutton());

	}

//	@Ignore

	@Test(priority = 2)

	public void Patientportalvitals() throws InterruptedException {

		// User launch The Browser

		geturl("https://production.rpm.clientx.me/");

		// User click the existing client

		Clickonelement(pom.getPatientportalrpm().getclickexistingclient());

		// User enter email

		sendkeys(pom.getPatientportalrpm().getenteremail(), "gojeg89884@mnsaf.com");

		// User click the continue

		Clickonelement(pom.getPatientportalrpm().getclickcontinue());

		// Login Title

//		titleverify(pom.getPatientportalrpm().getlogintitle(), "Welcome Back");

		/// User click forgot password

		Thread.sleep(4000);

		Clickonelement(pom.getPatientportalrpm().getforgotpassword());

		/// User click forgot password

		Thread.sleep(4000);

		titleverify(pom.getPatientportalrpm().getforgotpasswordtitle(), "Forget Password");

		// User enter email forgot password

		sendkeys(pom.getPatientportalrpm().getenteremailforgot(), "gojeg89884@mnsaf.com	");

		/// User click forgot password verification button

		Clickonelement(pom.getPatientportalrpm().getsendverificationcode());

		/// User click forgot password back button

		Clickonelement(pom.getPatientportalrpm().getbacklogin());

		/// User send enter email
		Thread.sleep(3000);

		sendkeys(pom.getPatientportalrpm().getenteremaillogin(), "gojeg89884@mnsaf.com");

		/// User send Password

		sendkeys(pom.getPatientportalrpm().getenterpasslogin(), "Test@1234");

		/// User click login Option

		Clickonelement(pom.getPatientportalrpm().getloginbutton());

		Thread.sleep(4000);

		/// User click vitals Option

		Clickonelement(pom.getPatientportalrpm().getclickvitals());

		/// User click vitals Option vitals title
		Thread.sleep(5000);

		titleverify(pom.getPatientportalrpm().getvitalstitle(), "Vitals");

		/// User click vitals Option most recent vitals

//		titleverify(pom.getPatientportalrpm().getmostrecentvitals(), "Most recent vitals from : 10/10/2023 10:41:43");

		Thread.sleep(5000);
		/// User click vitals Option vitals device assigned title

		titleverify(pom.getPatientportalrpm().getdeviceassignedtitle(), "Device Assigned");

		/// User click vitals Option vitals patient details title

		titleverify(pom.getPatientportalrpm().getpatientdetails(), "Patient Data");

		/// User click vitals Option heart Rate

		titleverify(pom.getPatientportalrpm().getheartratetitle(), "Heart Rate (BPM)");

		/// User click vitals Option patient Month dropdown
		Thread.sleep(5000);
		Clickonelement(pom.getPatientportalrpm().getmonthdropdownhr());

		// User Click Week dropdpwm

		Clickonelement(pom.getPatientportalrpm().getweekdropdownhr());

		/// User click vitals Option vitals Blood Pressure

		Thread.sleep(5000);

		Clickonelement(pom.getPatientportalrpm().getbloodpressure());

		/// User click vitals Option heart Rate

		titleverify(pom.getPatientportalrpm().getbloodpressuretitle(), "Blood Pressure (mm/Hg)");

		// User Click Week dropdpwm
		Thread.sleep(5000);

		Clickonelement(pom.getPatientportalrpm().getweekdropdownbp());

		/// User click vitals Option patient Month dropdown

		Clickonelement(pom.getPatientportalrpm().getmonthdropdownbp());

		/// User click vitals Option vitals Blood Pressure

		Thread.sleep(5000);

		Clickonelement(pom.getPatientportalrpm().getoxygen());

		/// User click vitals Optionblood pressure title

		titleverify(pom.getPatientportalrpm().getoxygentitle(), "Oxygen (%)");

		/// User click vitals Option patient Month dropdown

		Clickonelement(pom.getPatientportalrpm().getmonthdropdownox());

		// User Click Week blood pressure dropdpwm

		Clickonelement(pom.getPatientportalrpm().getweekdropdownox());

		/// User click vitals Option vitals Blood Pressure

		Clickonelement(pom.getPatientportalrpm().getglucose());

		/// User click vitals Optionblood pressure title

		titleverify(pom.getPatientportalrpm().getglucosetitle(), "Glucose (mg/dL)");

		/// User click vitals Option patient Month dropdown

		Thread.sleep(5000);

		Clickonelement(pom.getPatientportalrpm().getmonthdropdownglu());

		// User Click Week blood pressure dropdpwm

		Clickonelement(pom.getPatientportalrpm().getweekdropdownglu());

		/// User click vitals Option vitals Oxygen

//		Clickonelement(pom.getPatientportalrpm().getoxygen());

		/*
		 * /// User click vitals Optionblood pressure title
		 * 
		 * titleverify(pom.getPatientportalrpm().getoxygentitle(), "Oxygen");
		 * 
		 * /// User click vitals Option Oxygen Month dropdown
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getmonthdropdownox());
		 * 
		 * // User Click Week Oxygen Week dropdpwm
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getweekdropdownox());
		 * 
		 * /// User click vitals Option vitals glucose
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getglucose());
		 * 
		 * /// User click vitals Option glucose pressure title
		 * 
		 * titleverify(pom.getPatientportalrpm().getglucosetitle(), "Oxygen");
		 * 
		 * /// User click vitals Option glucose Month dropdown
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getmonthdropdownglu());
		 * 
		 * // User Click Week glucose Week dropdpwm
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getweekdropdownglu());
		 * 
		 * /// User click vitals Option vitals respiration
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getrespirationrate());
		 * 
		 * /// User click vitals Option respiration title
		 * 
		 * titleverify(pom.getPatientportalrpm().getrespirationratetitle(), "Oxygen");
		 * 
		 * /// User click vitals Option respiration Month dropdown
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getmonthdropdowngrr());
		 * 
		 * // User Click Week respiration Week dropdpwm
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getweekdropdownrr());
		 * 
		 * /// User click vitals Option vitals weight
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getweight());
		 * 
		 * /// User click vitals Option respiration title
		 * 
		 * titleverify(pom.getPatientportalrpm().getweighttitle(), "Oxygen");
		 * 
		 * /// User click vitals Option weight Month dropdown
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getmonthdropdownweig());
		 * 
		 * // User Click Week weight Week dropdpwm
		 * 
		 * Clickonelement(pom.getPatientportalrpm().getweekdropdownweig());
		 */

	}

	@Ignore

	@Test(priority = 1)

	public void PatientportalMyprofile() throws InterruptedException {

		////////////////////////////////////////////////////////

		// User Click My profile

		Thread.sleep(5000);

		Clickonelement(pom.getPatientportalrpm().getclickmyprofile());

		// User Click My profile

		Clickonelement(pom.getPatientportalrpm().getselectmyprofile());

		// User Click My profile

		titleverify(pom.getPatientportalrpm().getmyprofiletitle(), "Edit Profile");

		// User Click My profile upload Image

		Clickonelement(pom.getPatientportalrpm().getuploadimage());

//		// User Click My profile upload Image
//
		sendkeys(pom.getPatientportalrpm().getsenduploadimage(),
				"C:\\Users\\Admin\\Documents\\Test Image\\hfjfjjhgdf.JPG");

		try {

			// User Click My profile upload Image done

			Clickonelement(pom.getPatientportalrpm().getpressdone());

		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// user click cancel option

		Clickonelement(pom.getPatientportalrpm().getpresscancel());

		// User Click My profile first name

		ClearText(pom.getPatientportalrpm().getfirstname());

		sendkeys(pom.getPatientportalrpm().getfirstname(), "Sam");

		// User Click My profile middle name

		ClearText(pom.getPatientportalrpm().getmiddlename());

		sendkeys(pom.getPatientportalrpm().getmiddlename(), "Vel");

		// User Click My profile last name

		ClearText(pom.getPatientportalrpm().getlastname());

		sendkeys(pom.getPatientportalrpm().getlastname(), "d");

		// User Click My profile dateof birth

		ClearText(pom.getPatientportalrpm().getdateofbirth());

		sendkeys(pom.getPatientportalrpm().getdateofbirth(), "2011-01-11");

		// User Click My profile gender

		Clickonelement(pom.getPatientportalrpm().getgenderdrop());

		Clickonelement(pom.getPatientportalrpm().getchangegenderdrop());

		// User Click My profile ssn

		sendkeys(pom.getPatientportalrpm().getssnnumber(), "987654321");

		// User Click My profile email address
		ClearText(pom.getPatientportalrpm().getemailaddress());
		sendkeys(pom.getPatientportalrpm().getemailaddress(), "dasdasd@fafds.das");

		// User Click My profile phone address
		ClearText(pom.getPatientportalrpm().getphonenumber());
		sendkeys(pom.getPatientportalrpm().getphonenumber(), "56576566567");

		// User Click My profile blood grop
		Clickonelement(pom.getPatientportalrpm().getbloodgroup());
		Clickonelement(pom.getPatientportalrpm().getbloodgroupselect());

		// User Click My profile race
		Clickonelement(pom.getPatientportalrpm().getrace());
		Clickonelement(pom.getPatientportalrpm().getraceselect());

		// User Click My profile ethinicity

		Clickonelement(pom.getPatientportalrpm().getethinicity());
		Clickonelement(pom.getPatientportalrpm().getethinicityselect());

		// User Click My profile language

		Clickonelement(pom.getPatientportalrpm().getlanguage());
		Clickonelement(pom.getPatientportalrpm().getlanguageselect());

		// User Click My profile address

		ClearText(pom.getPatientportalrpm().getaddress());

		sendkeys(pom.getPatientportalrpm().getaddress(), "dsadad");

		// User Click My profile city
		Thread.sleep(4000);

		ClearText(pom.getPatientportalrpm().getcity());

		sendkeys(pom.getPatientportalrpm().getcity(), "ddasda");

		// User Click My profile state
		Thread.sleep(4000);

		ClearText(pom.getPatientportalrpm().getstate());

		sendkeys(pom.getPatientportalrpm().getstate(), "dsadd");

		// User Click My profile zip code

		ClearText(pom.getPatientportalrpm().getzipcode());

		sendkeys(pom.getPatientportalrpm().getzipcode(), "dsad");

//		// User Click My profile save
//
		Clickonelement(pom.getPatientportalrpm().getsavemyprofile());

		// User Click My profile cancel

//		Clickonelement(pom.getPatientportalrpm().getcancelmyprofile());

	}

}
