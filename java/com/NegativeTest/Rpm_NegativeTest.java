package com.NegativeTest;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Rpm_NegativeTest extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 0)

	public void loginnegative() throws InterruptedException {

		// User Want to get The validation In Username is Empty

		geturl("https://mumbairpm.vozo.xyz/");

		// Click login button

		Clickonelement(pom.getRpmnegative().getclickloginbtn());

		// Click login button verify validation

		titleverify(pom.getRpmnegative().getloginusernameverify(), "Please Enter the Username");

		// Click password button verify validation

		titleverify(pom.getRpmnegative().getloginpasswordverify(), "Please Enter the Password");

		// User Enter username

		sendkeys(pom.getRpmnegative().getenterusername(), "Capminds@03");

		// User Enter Password

		sendkeys(pom.getRpmnegative().getenterpassword(), "Capminds@03");

		// Click forgot password

		Clickonelement(pom.getRpmnegative().getforgotpassword());

		// User Enter forgot email

		sendkeys(pom.getRpmnegative().getforgotpasswordemail(), "smashsaheer1@gmail.com");

		// Click forgot password

		Clickonelement(pom.getRpmnegative().getresetpassword());

		// Click back logink

		Clickonelement(pom.getRpmnegative().getbacktologin());

		// Click back signin btn

		Clickonelement(pom.getRpmnegative().getsignupbtn());

	}

	///////////////////// Patient ///////////////////////
//	@Ignore

	@Test(priority = 1)

	public void patientlsitnegative() throws InterruptedException {

		// User Enter username

		sendkeys(pom.getRpmnegative().getenterusername(), "admin");

		// User Enter Password

		sendkeys(pom.getRpmnegative().getenterpassword(), "Capminds@03");

		// Click login

		Clickonelement(pom.getRpmnegative().getClickLogin());

		Thread.sleep(5000);

		Clickonelement(pom.getRpmnegative().getpatientmenu());

		// search patient menu

		// Click patient menu

		Clickonelement(pom.getRpmnegative().getclickselect());

		// Click patient menu

		Clickonelement(pom.getRpmnegative().getclickselect());

		sendkeys(pom.getRpmnegative().getSearchpatient(), "maran");

		// select patient

		Thread.sleep(8000);

		Clickonelement(pom.getRpmnegative().getselectpatient());

		try {
			// click enrolment

			Clickonelement(pom.getRpmnegative().getpatientenrolment());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Click patient menu

		Clickonelement(pom.getRpmnegative().getpatientmenu());

		// Click list

		Thread.sleep(5000);

		Clickonelement(pom.getRpmnegative().getselectlsit());

		// search patient menu

		sendkeys(pom.getRpmnegative().getSearchpatient(), "ram");

		// export csv

//		Clickonelement(pom.getRpmnegative().getclickexportcsv());
	}

	@Ignore

	@Test(priority = 2)

	public void patientdemograhics() throws InterruptedException {

		Thread.sleep(5000);

		// select patient

		Clickonelement(pom.getRpmnegative().getselectpatient1());

		// select patient demograhics

		Clickonelement(pom.getRpmnegative().getdemograpicsbtn());

		// demograhics upload image

		Clickonelement(pom.getRpmnegative().getuploadimagebtn());

		// choose file

		sendkeys(pom.getRpmnegative().getchoosefile(),
				"C:\\Users\\Admin\\Documents\\Test Image\\481648-562569-dasdddasd.jpg");

		// cancel
		Thread.sleep(3000);

		Clickonelement(pom.getRpmnegative().getcanceloption());

		// date of birth

		sendkeys(pom.getRpmnegative().getsenddateofbirth(), "2025-01-04");

		// gender drop down

		Clickonelement(pom.getRpmnegative().getgenderdropdown());

		// enter already email

		sendkeys(pom.getRpmnegative().getenteremail(), "sdasdg.dasda,dasd");

		// enter already phone number

		sendkeys(pom.getRpmnegative().getenterphonenumber(), "43243423");

		// save demographics

		Clickonelement(pom.getRpmnegative().getsavedemograpics());

		// cancel demographics

		try {
			Thread.sleep(4000);

			Clickonelement(pom.getRpmnegative().getcanceldemograpics());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Ignore

	@Test(priority = 3)

	public void Readingdatanegative() throws InterruptedException {

		/// Heart rate

		Thread.sleep(5000);

		// heart rate

		Clickonelement(pom.getRpmnegative().getheartrate());

		/// month dropdown

		Clickonelement(pom.getRpmnegative().getmonthdropdown());

		/// month dropdown

		Clickonelement(pom.getRpmnegative().getselectmonth());

		/// week dropdown

		Clickonelement(pom.getRpmnegative().getchooseweekdropdown());

		/// week dropdown

		Clickonelement(pom.getRpmnegative().getselectweek());

		/// blood pressure

		// bp

		Thread.sleep(4000);

		Clickonelement(pom.getRpmnegative().getbloodpressure());

		/// month dropdown

		Clickonelement(pom.getRpmnegative().getmonthdropdownbp());

		/// month dropdown

		Clickonelement(pom.getRpmnegative().getselectmonthbp());

		/// week dropdown
		Thread.sleep(3000);

//		Clickonelement(pom.getRpmnegative().getchooseweekdropdownbp());
//
//		/// week dropdown
//
//		Clickonelement(pom.getRpmnegative().getselectweekbp());

		/// oxygen

		// oxy

		Clickonelement(pom.getRpmnegative().getoxygen());

		/// month dropdown

		Clickonelement(pom.getRpmnegative().getmonthdropdownoxy());

		/// month dropdown

		Clickonelement(pom.getRpmnegative().getselectmonthoxy());

		try {
			/// week dropdown

			Clickonelement(pom.getRpmnegative().getchooseweekdropdownoxy());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/// week dropdown

//		Clickonelement(pom.getRpmnegative().getselectweekoxy());

	}

//	@Ignore

	@Test(priority = 4)

	public void AddDevices() throws InterruptedException {

		Thread.sleep(5000);

		/// add Device

		Clickonelement(pom.getRpmnegative().getadddevice());

		/// add Device date

		titleverify(pom.getRpmnegative().getadddevicedate(), "Devices");

		/// add Device Save

		Clickonelement(pom.getRpmnegative().getadddevicesave());

		/// add Device cancel

		Clickonelement(pom.getRpmnegative().getadddevicecancel());

	}

	@Ignore

	@Test(priority = 5)

	public void Addencounter() throws InterruptedException {

		Thread.sleep(5000);

		Clickonelement(pom.getRpmnegative().getpatientmenu());

		// search patient menu

		// Click patient menu

		Clickonelement(pom.getRpmnegative().getclickselect());

		// Click patient menu

		Clickonelement(pom.getRpmnegative().getclickselect());

		sendkeys(pom.getRpmnegative().getSearchpatient(), "Cathenna");

		// select patient

		Thread.sleep(8000);

		Clickonelement(pom.getRpmnegative().getselectpatientnew());

		/// Encounter

		Clickonelement(pom.getRpmnegative().getvisitencounter());

		/// Encounter

		Thread.sleep(5000);

		Clickonelement(pom.getRpmnegative().getclicknotes());

		/// add Note date

		Clickonelement(pom.getRpmnegative().getaddnotesdate());

		/// add Note date phone calll

		Clickonelement(pom.getRpmnegative().getaddnotesphonecall());

		/// add Note date phone calll

		Clickonelement(pom.getRpmnegative().getaddnotesactivity());

		/// add Note date time

		Clickonelement(pom.getRpmnegative().gettimespent());

		/// add Note date time conform

		Clickonelement(pom.getRpmnegative().getconfirm());

//		try {
//			/// add Note date delete encounter
//
//			Clickonelement(pom.getRpmnegative().getdeleteencounter());
//		} catch (Exception e) {
//			// TODO Auto-generated catch block
//			e.printStackTrace();
//		}

		Thread.sleep(5000);

		/// add Note date delete encounter

		Clickonelement(pom.getRpmnegative().getaddencounter());

		/// add Note date encounterprovider

		Thread.sleep(5000);

		Clickonelement(pom.getRpmnegative().getencounterprovider());

		/// add Note date encounterprovider

		Clickonelement(pom.getRpmnegative().getencounterproviderselect());

		/// add Note date encounter save encounter

		Clickonelement(pom.getRpmnegative().getsaveencounter());

		try {
			/// add Note date encounter save encounter

			Clickonelement(pom.getRpmnegative().getclickdropdown());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		Thread.sleep(4000);
		/// add Note date encounter save encounter

		Clickonelement(pom.getRpmnegative().getclickedit());

		/// add Note date encounter add Notes edit

//		Clickonelement(pom.getRpmnegative().getaddnotesedit());
//
//		/// add Note date encounter add Notes edit
//
//		Clickonelement(pom.getRpmnegative().getvisitencountermonth());
//
//		/// add Note date encounter add Notes edit
//
//		Clickonelement(pom.getRpmnegative().getduration());
//
//		/// add Note date encounter add Notes edit
//
//		Clickonelement(pom.getRpmnegative().getlock());

		/// add Note date encounter add Notes edit

		Thread.sleep(4000);

		Clickonelement(pom.getRpmnegative().getviewdetails());

		/// add Note date encounter add Notes edit

		Clickonelement(pom.getRpmnegative().getselectactivity());

		/// add Note date encounter add Notes edit from date

		Clickonelement(pom.getRpmnegative().getfromdate());

		/// add Note date encounter add Notes edit to date

		Clickonelement(pom.getRpmnegative().gettodate());

		/// add Note date encounter add Notes edit to date

		try {

			Thread.sleep(4000);
			Clickonelement(pom.getRpmnegative().getclickdropdownvisithistory());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		/// add Note date encounter add Notes edit to date

		Clickonelement(pom.getRpmnegative().getcancelvisithistory());

	}

//	@Ignore

	@Test(priority = 6)

	public void livenegative() throws InterruptedException {

		/// Select Live option

		Thread.sleep(7000);

		Clickonelement(pom.getRpmnegative().getclicklive());

		/// Select Live option search

		Clickonelement(pom.getRpmnegative().getsearchpatient());

		/// Select Live option search select vitals

		Clickonelement(pom.getRpmnegative().getselectvitals());

		/// Select Live option search click votals

		Clickonelement(pom.getRpmnegative().getclickvitals());

		/// Select Live option search export csv

		Clickonelement(pom.getRpmnegative().getexportcsv());

	}

//	@Ignore

	@Test(priority = 7)

	public void rolesandpermission() throws InterruptedException {

		Thread.sleep(5000);

		// Setting roles and Permission setting

		Clickonelement(pom.getRpmnegative().getclicksetting());

		// Setting roles and Permission

		Clickonelement(pom.getRpmnegative().getselectrolesandpermission());

		// Setting roles and Permission title

		Clickonelement(pom.getRpmnegative().getrolesandpermssiontitle());

		// Setting roles and Permission customize

		Clickonelement(pom.getRpmnegative().getcustomizerole());

		// Setting roles and Permission checkbox

		Clickonelement(pom.getRpmnegative().getcheckbox());

		// Setting roles and Permission cancel

		Clickonelement(pom.getRpmnegative().getcancelrole());

	}

//	@Ignore

	@Test(priority = 8)

	public void documentsnegative() throws InterruptedException {

		// Setting documents

		Clickonelement(pom.getRpmnegative().getdocumentsclick());

		// Setting documents logo

		Clickonelement(pom.getRpmnegative().getuploadlogo());

		// Setting documents logo

		Clickonelement(pom.getRpmnegative().getfileupload());

		// Setting documents logo done

//		Clickonelement(pom.getRpmnegative().getdoneoption());

	}

//	@Ignore

	@Test(priority = 9)

	public void Users() throws InterruptedException {

		// Setting Users

		Clickonelement(pom.getRpmnegative().getUsersoption());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getadduser());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getsendusername());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getcheckforprovider());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getexpieationdate());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getcloseuser());

		// Setting Users

		Thread.sleep(4000);

		Clickonelement(pom.getRpmnegative().getclickstaff());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getaddstaff());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getprimaryrole());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getemaialaddress());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getphonenumber());

		// Setting Users

		Clickonelement(pom.getRpmnegative().getusernameenter());

		// Setting Users

		try {
			Clickonelement(pom.getRpmnegative().getpasswordeyesymbol());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Setting Users

		Clickonelement(pom.getRpmnegative().getclosestaff());

	}

//	@Ignore

	@Test(priority = 10)

	public void devices() throws InterruptedException {

		// Setting device

		Clickonelement(pom.getRpmnegative().getclickdevice());

		// Setting device

		Clickonelement(pom.getRpmnegative().getclicksecondlist1());

		// Setting device

		Clickonelement(pom.getRpmnegative().getclicksecondlist());

		// Setting device

		sendkeys(pom.getRpmnegative().getsearchdevice(), "iscale");

		try {
			// Setting device

			gettext(pom.getRpmnegative().getstatusview());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Setting device

		Clickonelement(pom.getRpmnegative().getadddevices());

		// Setting device

		Thread.sleep(4000);
		Clickonelement(pom.getRpmnegative().getcanceldevice());

		// Setting device

		Clickonelement(pom.getRpmnegative().getclickactive());

		try {
			// Setting device

			gettext(pom.getRpmnegative().getlastdatesync());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
