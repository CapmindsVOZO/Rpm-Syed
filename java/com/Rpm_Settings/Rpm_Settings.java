package com.Rpm_Settings;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Rpm_Settings extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

//	@Ignore

	@Test(priority = 0)

	public void Login() throws InterruptedException {

		// User launch The Browser

		geturl("https://mumbairpm.vozo.xyz/");

		// User Verify The Title
//						titleverify(pom.getdashboardrpm().getverifylogintitle(), "Welcome Back");

		sendkeys(pom.getRpmSetting().getsendusername(), "admin");

		// User Enter Password
		sendkeys(pom.getRpmSetting().getsendpassword(), "Capminds@03");

		// User Login Option

		Clickonelement(pom.getRpmSetting().getclicklogin());

		// Enter Username
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

	}

	@Ignore

	@Test(priority = 1)

	public void Myprofile() throws InterruptedException {

		Thread.sleep(5000);

		// User click setting option

		Clickonelement(pom.getRpmSetting().getclicksetting());

		// User click setting My Profile option

		Clickonelement(pom.getRpmSetting().getselectmyprofile());

		// User click setting My Profile option

		Clickonelement(pom.getRpmSetting().getpresonalclick());

		// User click setting My Profile title verify

		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getmyprofiletitle());

		try {
			// User click setting My Profile Select Image

			Clickonelement(pom.getRpmSetting().getselectimage());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// User click setting My Profile upload image

		sendkeys(pom.getRpmSetting().getuploadimage(),
				"C:\\Users\\Admin\\Documents\\Test Image\\481648-562569-dasdddasd.jpg");

		// User click setting My Profile upload Click Done

		Clickonelement(pom.getRpmSetting().getclickdone());

		// User click setting My Profile First Name

		ClearText(pom.getRpmSetting().getFirstname());

		sendkeys(pom.getRpmSetting().getFirstname(), "Stevehello");

		// User click setting My Profile Last Name

		ClearText(pom.getRpmSetting().getlastname());

		sendkeys(pom.getRpmSetting().getlastname(), "h");

		// User click setting My Profile middle Name

		ClearText(pom.getRpmSetting().getmiddlename());

		sendkeys(pom.getRpmSetting().getmiddlename(), "g");

		// User click setting My Profile siffix Name

		ClearText(pom.getRpmSetting().getsuffix());

		sendkeys(pom.getRpmSetting().getsuffix(), "f");

		// User click setting My Profile send Email

		ClearText(pom.getRpmSetting().getsendemail());

//		sendkeys(pom.getRpmSetting().getsendemail(), "christina@capminds.com");

		// User click setting My Profile send phone

		ClearText(pom.getRpmSetting().getsendphone());

		sendkeys(pom.getRpmSetting().getsendphone(), "7654321");

		// User click setting My Profile send new Password

		sendkeys(pom.getRpmSetting().getsendnewpassword(), "Capminds@03");

		ClearText(pom.getRpmSetting().getsendnewpassword());

		// User click setting My Profile clear new Password

//		Clickonelement(pom.getRpmSetting().getclearnewpassword());

		// User click setting My Profile send Confirm new Password

		sendkeys(pom.getRpmSetting().getsendconfirmnewpassword(), "Capminds@03");

		ClearText(pom.getRpmSetting().getsendnewpassword());

		// User click setting My Profile clear Confirm new Password

//		Clickonelement(pom.getRpmSetting().getclearconfirmnewpassword());

		// User click setting My Profile Save The Personal Data

//		Clickonelement(pom.getRpmSetting().getclicksave());

		////////////////// Clinical //////////

		// User click setting My Profile clinical

		try {
			Thread.sleep(5000);

			Clickonelement(pom.getRpmSetting().getmyprofile());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getclickclinical());

		// User click setting My Profile clinical licensen type

		Thread.sleep(3000);

		Clickonelement(pom.getRpmSetting().getlicensetype());

		// User click setting My Profile clinical license type Select

		Clickonelement(pom.getRpmSetting().getlicensetypeselect());

		// User click setting My Profile clinical license number

		ClearText(pom.getRpmSetting().getlicensenumber());

		sendkeys(pom.getRpmSetting().getlicensenumber(), "54321");

		// User click setting My Profile clinical license expie

		sendkeys(pom.getRpmSetting().getlicenseexpires(), "2024-12-14");

		// User click setting My Profile clinical license state

		Clickonelement(pom.getRpmSetting().getlicensestate());

		// User click setting My Profile clinical license state select

		Clickonelement(pom.getRpmSetting().getlicensestateselect());

		// User click setting My Profile clinical add license

		Clickonelement(pom.getRpmSetting().getaddlicense());

		// User click setting My Profile clinical delete license

		Clickonelement(pom.getRpmSetting().getdeletelisence());

		// User click setting My Profile clinical npi Number
		Thread.sleep(2000);

		ClearText(pom.getRpmSetting().getnpinumber());

		sendkeys(pom.getRpmSetting().getnpinumber(), "654321");

		// User click setting My Profile clinical speciality

		Clickonelement(pom.getRpmSetting().getSpeciality());

		// User click setting My Profile clinical speciality

		Clickonelement(pom.getRpmSetting().getselectSpeciality());

		// User click setting My Profile clinical taxomony

		ClearText(pom.getRpmSetting().getTaxonomyCode());

		sendkeys(pom.getRpmSetting().getTaxonomyCode(), "765432");

		// User click setting My Profile clinical taxomony

//		Clickonelement(pom.getRpmSetting().getsaveclinical());

	}

	@Ignore

	/////////////////////// Roles and Permission /////////////////

	@Test(priority = 2)

	public void Rolesandpermission() throws InterruptedException {

		// User launch The Browser

		// User click setting Roles and Permission

		Clickonelement(pom.getRpmSetting().getclickrolesandpermission());

		// User Verify The Title

		titleverify(pom.getRpmSetting().getrolesandpermissiontitle(), "Rolesandpermission");

		// User click setting Roles and Permission Edit provider Roles

		Clickonelement(pom.getRpmSetting().getEditrolesandpermission());

		// User click setting Roles and Permission roles dropdown

		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getRolesdropdown1());

		// User click setting Roles and Permission Select Roles

		Thread.sleep(3000);

		Clickonelement(pom.getRpmSetting().getselectrole());

		// User click setting Roles and Permission Select permission

		Clickonelement(pom.getRpmSetting().getselectpermission());

		// User click setting Roles and Permission savepermission

		Clickonelement(pom.getRpmSetting().getsavepermission());

		// User click setting Roles and Permission cancel permission

		try {
			Clickonelement(pom.getRpmSetting().getcancelpermission());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User click setting Roles and Permission click customize role

		Thread.sleep(3000);

		Clickonelement(pom.getRpmSetting().getclickcustomizerole());

		// User click setting Roles and Permission send name

		sendkeys(pom.getRpmSetting().getsendname(), "hello");

		// User click setting Roles and Permission send description

		sendkeys(pom.getRpmSetting().getsenddescription(), "test");

		// User click setting Roles and Permission saverole

		Clickonelement(pom.getRpmSetting().getsaverole());

		// User click setting Roles and Permission cancel role

		try {
			Clickonelement(pom.getRpmSetting().getcancelrole());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User click setting Roles and Permission cancel role

		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getclcikstaff());

		// User click setting Roles and Permission Edit provider Roles

		Clickonelement(pom.getRpmSetting().getEditrolesandpermission());

		// User click setting Roles and Permission roles dropdown

		Thread.sleep(3000);

		Clickonelement(pom.getRpmSetting().getRolesdropdown());

		// User click setting Roles and Permission Select Roles

		Clickonelement(pom.getRpmSetting().getselectrole());

		// User click setting Roles and Permission Select permission

		Clickonelement(pom.getRpmSetting().getselectpermission());

		// User click setting Roles and Permission savepermission

		Clickonelement(pom.getRpmSetting().getsavepermission());

		// User click setting Roles and Permission cancel permission

		try {
			Clickonelement(pom.getRpmSetting().getcancelpermission());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User click setting Roles and Permission click customize role

		Clickonelement(pom.getRpmSetting().getclickcustomizerole());

		// User click setting Roles and Permission send name
		Thread.sleep(3000);

		sendkeys(pom.getRpmSetting().getsendname(), "Hello");

		// User click setting Roles and Permission send description

		sendkeys(pom.getRpmSetting().getsenddescription(), "test");

		// User click setting Roles and Permission saverole

		Clickonelement(pom.getRpmSetting().getsaverole());

		// User click setting Roles and Permission cancel role

		Clickonelement(pom.getRpmSetting().getcancelrole());

		// User click setting Roles and Permission click roles

		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getclickroles());

		// User click setting Roles and Permission add Roles

		Clickonelement(pom.getRpmSetting().getAddroles());

		// User click setting Roles and Permission add name Roles

		Clickonelement(pom.getRpmSetting().getAddnamerole());

		// User click setting Roles and Permission add description Roles

		Clickonelement(pom.getRpmSetting().getAdddescriptionrole());

		// User click setting Roles and Permission save roles

		Clickonelement(pom.getRpmSetting().getsaveroles());

		// User click setting Roles and Permission cancel roles

		Clickonelement(pom.getRpmSetting().getcancelroles());

		// User click setting Roles and Permission edit roles
		Thread.sleep(4000);

		Clickonelement(pom.getRpmSetting().geteditrole());

		// User click setting Roles and Permission close edits

		Clickonelement(pom.getRpmSetting().getcloseedits());

		// User click setting Roles and Permission click permission

		Clickonelement(pom.getRpmSetting().getclickpermission());
	}

	@Ignore

	/////////////////////// Roles and Permission /////////////////

	@Test(priority = 3)

	public void Security() throws InterruptedException {

//		geturl("https://mumbairpm.vozo.xyz/");
//
//		// User Verify The Title
////								titleverify(pom.getdashboardrpm().getverifylogintitle(), "Welcome Back");
//
//		sendkeys(pom.getRpmSetting().getsendusername(), "admin");
//
//		// User Enter Password
//		sendkeys(pom.getRpmSetting().getsendpassword(), "Capminds@03");
//
//		// User Login Option
//
//		Clickonelement(pom.getRpmSetting().getclicklogin());
//
//		Thread.sleep(5000);
//
//		// User click setting options
//
//		Clickonelement(pom.getRpmSetting().getclicksetting());

		// User click setting Security Option

		Clickonelement(pom.getRpmSetting().getclicksecurity());

		// User Verify The Title

//		ClearText(pom.getRpmSetting().getsecuritytitle());

		titleverify(pom.getRpmSetting().getsecuritytitle(), "Security");

		// User click setting Security Option

		ClearText(pom.getRpmSetting().getpasswordexpire());

		sendkeys(pom.getRpmSetting().getpasswordexpire(), "150");

		// User click setting Security Option pASSWord grace

		ClearText(pom.getRpmSetting().getpasswordexpiregraceperiod());

		sendkeys(pom.getRpmSetting().getpasswordexpiregraceperiod(), "40");

		// User click setting Security Option pASSWord length

		ClearText(pom.getRpmSetting().getpasswordlength());

		sendkeys(pom.getRpmSetting().getpasswordlength(), "10");

		// User click setting Security Option pASSWord idle Time

		ClearText(pom.getRpmSetting().getpasswordidletime());

		sendkeys(pom.getRpmSetting().getpasswordidletime(), "140");

		// User click setting Security Option pASSWord save Security

//		Clickonelement(pom.getRpmSetting().getsavesecurity());

	}

//	@Ignore

	@Test(priority = 4)

	public void Documents() throws InterruptedException {

		Thread.sleep(5000);

		// User click setting option

		Clickonelement(pom.getRpmSetting().getclicksetting());

		// User click setting Documents

		Clickonelement(pom.getRpmSetting().getclickdocuments());

		// User click setting Documents title

		Clickonelement(pom.getRpmSetting().getdocumentstitles());

		// User click setting Documents click upload Document

		Clickonelement(pom.getRpmSetting().getuploadlogo());

		// User click setting Documents upload logo

		sendkeys(pom.getRpmSetting().getsendimage(),
				"C:\\Users\\Admin\\Documents\\Test Image\\481648-562569-dasdddasd.jpg");

		// User click setting Documents upload logo done

		Clickonelement(pom.getRpmSetting().getclickdoneimage());

		// User click setting Documents clinic radio

		Clickonelement(pom.getRpmSetting().getinvoiceradio());

		// footer information

		sendkeys(pom.getRpmSetting().getfooterinvoice(), "a");
		
		//////////////////Invoice //////////////////

		// User click setting Documents clcik edit invoice

		Clickonelement(pom.getRpmSetting().geteditinvoice());

		// User click setting Documents'=

		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getclinicianmacro());

		// User click setting Documents Select Clinician Macro

		Clickonelement(pom.getRpmSetting().getselectclinicianmacro());

		// User click setting Documents Select pratice Macro

		Clickonelement(pom.getRpmSetting().getpracticemacro());

		// User click setting Documents Select pratice Macro

		Clickonelement(pom.getRpmSetting().getselectpracticemacro());

		// User click setting Documents Select Client Macro

		Clickonelement(pom.getRpmSetting().getclientmacro());

		// User click setting Documents Select Client Macro

		Clickonelement(pom.getRpmSetting().getselectclientmacro());

		// User click setting Documents Select link Macro

		Clickonelement(pom.getRpmSetting().getlinkmacro());

		// User click setting Documents Select link Macro

		Clickonelement(pom.getRpmSetting().getselectlinkmacro());

		// User click setting Documents send subject

		sendkeys(pom.getRpmSetting().getsendsubject(), "Hello");

		// User click setting Documents send message

//		Clickonelement(pom.getRpmSetting().getsendmessage());

		// User click setting Documents save message

		Clickonelement(pom.getRpmSetting().getsavemessage());

		try {
			// User click setting Documents cancel message

			Clickonelement(pom.getRpmSetting().getcancelmessage());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/// statement ////////////////////////////
		Thread.sleep(5000);

		// User click setting Documents statement radio

		Clickonelement(pom.getRpmSetting().getstatementradio());

		// User click setting Documents clcik edit invoice

		Clickonelement(pom.getRpmSetting().geteditinvoice1());

		// User click setting Documents clcik edit invoice
		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().geteditinvoice1());

		// User click setting Documents
		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getclinicianmacro1());

		// User click setting Documents Select Clinician Macro

		Clickonelement(pom.getRpmSetting().getselectclinicianmacro1());

		// User click setting Documents Select pratice Macro
		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getpracticemacro1());

		// User click setting Documents Select pratice Macro

		Clickonelement(pom.getRpmSetting().getselectpracticemacro1());

		// User click setting Documents Select Client Macro

		Clickonelement(pom.getRpmSetting().getclientmacro1());

		// User click setting Documents Select Client Macro

		Clickonelement(pom.getRpmSetting().getselectclientmacro1());

		// User click setting Documents Select link Macro

		Clickonelement(pom.getRpmSetting().getlinkmacro1());

		// User click setting Documents Select link Macro

		Clickonelement(pom.getRpmSetting().getselectlinkmacro1());

		// User click setting Documents send subject

		sendkeys(pom.getRpmSetting().getsendsubject1(), "a");

		// User click setting Documents send message

//		Clickonelement(pom.getRpmSetting().getsendmessage1());

		// User click setting Documents save message

		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().getsavemessage1());

		try {
			// User click setting Documents cancel message

			Clickonelement(pom.getRpmSetting().getcancelmessage1());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		///// superbilll //////

		// User click setting Documents statement radio

		Clickonelement(pom.getRpmSetting().getsuperbilllogo());

		// User click setting Documents superbill

		Clickonelement(pom.getRpmSetting().getsignatureline());

		// User click setting Documents superbill

		Clickonelement(pom.getRpmSetting().getDiagnosis());

		// User click setting Documents clcik edit invoice
		
		Thread.sleep(5000);

		Clickonelement(pom.getRpmSetting().geteditinvoice2());

		// User click setting Documents

		Thread.sleep(5000);
		Clickonelement(pom.getRpmSetting().getclinicianmacro1());

		// User click setting Documents Select Clinician Macro

		Clickonelement(pom.getRpmSetting().getselectclinicianmacro1());

		// User click setting Documents Select pratice Macro

		Clickonelement(pom.getRpmSetting().getpracticemacro1());

		// User click setting Documents Select pratice Macro

		Clickonelement(pom.getRpmSetting().getselectpracticemacro1());

		// User click setting Documents Select Client Macro

		Clickonelement(pom.getRpmSetting().getclientmacro1());

		// User click setting Documents Select Client Macro

		Clickonelement(pom.getRpmSetting().getselectclientmacro1());

		// User click setting Documents Select link Macro

		Clickonelement(pom.getRpmSetting().getlinkmacro1());

		// User click setting Documents Select link Macro

		Clickonelement(pom.getRpmSetting().getselectlinkmacro1());

		// User click setting Documents send subject

		sendkeys(pom.getRpmSetting().getsendsubject1(), "a");

		// User click setting Documents send message

//		Clickonelement(pom.getRpmSetting().getsendmessage1());

		// User click setting Documents save message

		try {
			Thread.sleep(5000);

			Clickonelement(pom.getRpmSetting().getsavemessage1());
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// User click setting Documents cancel message

		try {
			Clickonelement(pom.getRpmSetting().getcancelmessage1());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Documentation
		Clickonelement(pom.getRpmSetting().getdocumentradio());

		// Documentation Save

//		Clickonelement(pom.getRpmSetting().getsavedocument());

	}

}
