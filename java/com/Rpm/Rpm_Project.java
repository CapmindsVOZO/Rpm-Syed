package com.Rpm;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Ignore;
import org.testng.annotations.Test;

public class Rpm_Project extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 1)

	public void LoginPage() throws InterruptedException {

		// User Verify The Title
		titleverify(pom.getLogin().getverifylogintitle(), "Welcome Back");

		sendkeys(pom.getLogin().getsendusername(), "vishwa");

		// User Enter Password
		sendkeys(pom.getLogin().getsendpassword(), "Test@1234");

		// Click login button

		Clickonelement(pom.getLogin().getclickpassword());

//		// User Logout
//
//		Clickonelement(pom.getLogin().getclickonlogo());
//
//		// User Logout
//
//		Clickonelement(pom.getLogin().getclicklogout());

	}

	@Test(priority = 0)

	public void Loginforgetpassword() throws InterruptedException {

		// User launch The Browser

		geturl("https://production.rpm.vozohealth.com/");

		System.out.println("Browser Launched Successfully");

		// User Enter Username
		driver.manage().timeouts().implicitlyWait(50, TimeUnit.SECONDS);

		// User click forgot

		Clickonelement(pom.getLogin().getclickforgot());

		// User Verify The Title
		titleverify(pom.getLogin().getverifyforgotpasswordtitle(), "Forgot Password ?");

		// enter email

		sendkeys(pom.getLogin().getenteremail(), "abc@gmail.com");

		// User click Reset Password

		Clickonelement(pom.getLogin().getresetpassword());

		// User Click The back Login

		Clickonelement(pom.getLogin().getbacklogin());

	}

	@Ignore

	@Test(priority = 2)

	public void PatientList() throws InterruptedException {

		// User click Patient

		Clickonelement(pom.getLogin().getclickpatient());

		// User Verify The Title

		Thread.sleep(3000);
		titleverify(pom.getLogin().getpatienttitle(), "Patient List");

		// Search The Patient
		sendkeys(pom.getLogin().getsearchpatient(), "sa");

		// user click The patient name

		Clickonelement(pom.getLogin().getpatientnamealign());

		// user click The patient Id

		Clickonelement(pom.getLogin().getpatientidalign());

		// user click The patient DOB

		Clickonelement(pom.getLogin().getpatientdobalign());

		// user click The patient Phone Number

		Clickonelement(pom.getLogin().getpatientnumberalign());

		// user click The patient Email

		Clickonelement(pom.getLogin().getpatientemailalign());

		// user click The patient Program

		Clickonelement(pom.getLogin().getpatientprogramalign());

		// user click The patient enrolment status

		Clickonelement(pom.getLogin().getpatientenrolmentalignalign());

		// user click The patient export csv file

		Clickonelement(pom.getLogin().getclickexportcsv());

		// user click The patient import csv file
		Thread.sleep(5000);

		Clickonelement(pom.getLogin().getclickimportcsv());

		try {
			// user click The patient phone Icon
			Thread.sleep(5000);

			Clickonelement(pom.getLogin().getclickphoneicon());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// user click The patient video Icon
		Thread.sleep(3000);
		Clickonelement(pom.getLogin().getclickvideoicon());

		// user click The patient message Icon

		Clickonelement(pom.getLogin().getclickmessageicon());

		// user click The patient chat Icon

//		Clickonelement(pom.getLogin().getclickchaticon());
//
//		// user click The patient Type Msg
//
//		Clickonelement(pom.getLogin().gettypemsg());
//
//		// user click The patient send Msg
//
//		Clickonelement(pom.getLogin().getsendmsg());
//
//		// user click The patient cancel Msg
//
//		Clickonelement(pom.getLogin().getcancelmsg());

	}

	@Ignore

	@Test(priority = 3)

	public void patientdemographics() throws InterruptedException {

		// User click Patient

		Clickonelement(pom.getLogin().getclickpatient());

		// user click The patient
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getselectpatient());

		// Verify Patient Demographics
		titleverify(pom.getLogin().getpatienttitle(), "Patient Demographics");

		// user click The click demograhics

		Clickonelement(pom.getLogin().getclickeditdemograpics());

		// user upload Imgae

		Clickonelement(pom.getLogin().getclickupload());

		// user send file

		sendkeys(pom.getLogin().getfirstnameedit(), "C:\\Users\\Admin\\Downloads\\avv3.jpg");

		// user click done

		Clickonelement(pom.getLogin().getclickdone());

		// user click The click First name

		ClearText(pom.getLogin().getfirstnameedit());

		sendkeys(pom.getLogin().getfirstnameedit(), "Saheer");

		// user click The midddkle name

		ClearText(pom.getLogin().getmiddlename());

		sendkeys(pom.getLogin().getmiddlename(), "g");

		// user click The last name

		ClearText(pom.getLogin().getlastname());

		sendkeys(pom.getLogin().getlastname(), "Ahmed");

		// user click The dob

		sendkeys(pom.getLogin().getdateofbirthcalendar(), "2014-07-17");

		// user click The selectgender

		sendkeys(pom.getLogin().getselectgender(), "Female");

		// user click The ssnnumber

		ClearText(pom.getLogin().getssnnumber());

		sendkeys(pom.getLogin().getssnnumber(), "987654321");

		// user click The click email

		ClearText(pom.getLogin().getemailidenter());

		sendkeys(pom.getLogin().getemailidenter(), "smashsaheer@gmail.com");

		// user click The phonenumber

		ClearText(pom.getLogin().getenterphonenumber());

		sendkeys(pom.getLogin().getenterphonenumber(), "987654321");

		// user click The bloodgroup

		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getbloodgroup());

		// user click The selecttrace

		Clickonelement(pom.getLogin().getselectrace());

		// user click The ethnicity

		Clickonelement(pom.getLogin().getselectethnicity());

		// user click The language

		Clickonelement(pom.getLogin().getselectlanguage());

		// user click The enteraddress

		ClearText(pom.getLogin().getenteraddress());

		sendkeys(pom.getLogin().getenteraddress(), "vedaa St");

		// user click The entercity

		ClearText(pom.getLogin().getentercity());

		sendkeys(pom.getLogin().getentercity(), "fsdf");

		// user click The enterstate

		ClearText(pom.getLogin().getenterstate());

		sendkeys(pom.getLogin().getenterstate(), "dasd");

		// user click The enterzip

		ClearText(pom.getLogin().getenterzip());

		sendkeys(pom.getLogin().getenterzip(), "23423");

		// user click The savedemo

		Clickonelement(pom.getLogin().getclicksave());

	}

	@Ignore

	@Test(priority = 4)

	public void patientvitals() throws InterruptedException {
		// User click Patient

		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getclickpatient());

		// user click The patient
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getclickdrop());

		// user click The patient
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getclickdrop());

		// user click The patient
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getselectpatient());

		// Verify Patient Demographics

		titleverify(pom.getLogin().gettitlevitals(), "Vitals");

		try {
			// user click The refresh

			Thread.sleep(3000);

			Clickonelement(pom.getLogin().getclickrefresh());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// Verify Patient heart rate

		titleverify(pom.getLogin().gettitleheartrate(), "Heart Rate");

		// Verify Patient blood pressure

		titleverify(pom.getLogin().gettitlebloodpressure(), "Blood Pressure");

		// Verify Patient blood pressure

		titleverify(pom.getLogin().gettitlerespiratoryrate(), "Respiratory Rate");

		// Verify Patient blood pressure

		titleverify(pom.getLogin().gettitlebloodglucose(), "Blood Glucose level");

		// Verify Patient blood pressure

		titleverify(pom.getLogin().gettitleoxygensaturation(), "Oxygen Saturation");

		// Verify Patient blood pressure

		titleverify(pom.getLogin().gettitleweight(), "Weight");

	}

//	@Ignore

	@Test(priority = 5)

	public void Adddevices() throws InterruptedException {

		// User click Patient

		Clickonelement(pom.getLogin().getclickpatient());

		// Search The Patient
		sendkeys(pom.getLogin().getsearchpatient(), "suga");

		// user click The patient name

		Clickonelement(pom.getLogin().getpatientnamealign());

		// user click The patient
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getselectpatient());

		// Verify

		titleverify(pom.getLogin().getdevicetitle(), "Device Assigned");

		// user click add device

		Thread.sleep(5000);

		Clickonelement(pom.getLogin().getadddevice());

		// user click add device Title

		titleverify(pom.getLogin().getadddevicetitle(), "Add Device");

		// user click add blood Pressure

		Clickonelement(pom.getLogin().getclickbloodpressure());

		try {

			// user select add blood pressure

			Thread.sleep(4000);

			Clickonelement(pom.getLogin().getselectbloodpressuredevice());

			// user Fill blood pressure Serial No

			sendkeys(pom.getLogin().getfillserialnobp(), "654321123");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// user Fill blood Continous glucose

		Clickonelement(pom.getLogin().getclickcontinuousglucoses());

		try {
			// user select Continous glucose

			Thread.sleep(3000);

			Clickonelement(pom.getLogin().getselectcontinuousglucose());

			// user fill Continous glucose

			sendkeys(pom.getLogin().getfillserialnocontinuousglucose(), "42342244");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// user Click weight scale

		Clickonelement(pom.getLogin().getclickweightscale());

		try {
			// user select weight scale

			Clickonelement(pom.getLogin().getselectwightscale());

			// user Fill Serial Ni weight scale

			sendkeys(pom.getLogin().getfillserialnoweightscale(), "312312");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// user Fill Serial Heart rate

//		Clickonelement(pom.getLogin().getclickheartrate());
//
//		// user select Serial Heart rate
//
//		Clickonelement(pom.getLogin().getselectheartrate());

		// user fill Serial Heart rate

//		Clickonelement(pom.getLogin().getfillserialnoheartrate());

		try {
			// user click pulse oximeter

			Clickonelement(pom.getLogin().getclickpluseoximeter());

			// user click pulse oximeter

			Clickonelement(pom.getLogin().getselectpluseoximeter());

			// user click pulse oximeter

			sendkeys(pom.getLogin().getfillserialnoselectpluseoximeter(), "4234");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			// user click assignn

			Clickonelement(pom.getLogin().getclickassign());

			// user click Cancel

			Clickonelement(pom.getLogin().getclickcancel());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Ignore

	@Test(priority = 6)

	public void Addencounter() throws InterruptedException {

		// User click Patient

		Clickonelement(pom.getLogin().getclickpatient());

		// Search The Patient
		sendkeys(pom.getLogin().getsearchpatient(), "suba");

		// user click The patient name

		Clickonelement(pom.getLogin().getpatientnamealign());

		// user click The patient
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getselectpatient());

//		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
//
//		// move side nav
//
//		WebElement ele = driver.findElement(By.xpath("(//img[@alt='menu-icon'])[1]"));
//
//		Actions action = new Actions(driver);
//		Thread.sleep(6000);
//
//		action.moveToElement(ele).click().perform();

		// CLICK encounter

		Clickonelement(pom.getLogin().getclickaddencounter());

		// CLICK title verify

		titleverify(pom.getLogin().gettitleverify(), "Encounter Visit Details");

		// CLICK add encounter

		Thread.sleep(5000);

		Clickonelement(pom.getLogin().getclickencounterprovider());

		// User Select Encounter

		Thread.sleep(5000);
		Clickonelement(pom.getLogin().getselectencounterprovider());

		try {
			// User click add Notes

			sendkeys(pom.getLogin().getAddnotes(), "hello");
		} catch (Exception e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		// User click save Notes

		Clickonelement(pom.getLogin().getSavenotes());

		try {
			// User click cancel encounter Notes

			Clickonelement(pom.getLogin().getcancelencounter());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User click cancel encounter Notes

//				Clickonelement(pom.getLogin().getcancelencounter());

		// CLICK title verify

//		titleverify(pom.getLogin().getencountertitle(), "Device Assigned");

//		// User click encounter Notes Dropdowm
//		Thread.sleep(6000);
//
//		Clickonelement(pom.getLogin().getclickencounterdropdown());
//
//		// User edit encounter
//
//		Clickonelement(pom.getLogin().geteditencounter());
//
//		// User edit encounter notes
//
//		Clickonelement(pom.getLogin().geteditnotes());
//
//		// User edit encounter Save
//
////		Clickonelement(pom.getLogin().getsaveeditedencounter());
//
//		// User edit Cancel encounter
//
//		Clickonelement(pom.getLogin().getcanceleditedencounter());

		// User View encounter Details

		Thread.sleep(5000);
		Clickonelement(pom.getLogin().getviewencounterdetails());

		// User View Details title verify

//		titleverify(pom.getLogin().getencountertitle(), "Device Assigned");

		// User Click view details Dropdown

		Clickonelement(pom.getLogin().getviewdetailsdropdown());

		// User Click view details Edit

		Clickonelement(pom.getLogin().getviewdetailsedit());

		// User Click view details notes click

		Clickonelement(pom.getLogin().getviewdetailseditnotes());

		// User Click view details save

//		Clickonelement(pom.getLogin().getviewviewdetailssavenotes());

		// User Click view details Cancel

		Clickonelement(pom.getLogin().getviewdetailscancelnotes());

		// User Click view details Cancel one day encounter

//		Clickonelement(pom.getLogin().getcancelonedayencounter());

		/////////////////////// Visit Encounter ///////////////////

		// User Click visit encounter

		Clickonelement(pom.getLogin().getclickvisitencounter());

		// User Click visit encounter

		titleverify(pom.getLogin().getvisitencountertitle(), "Visit History for subash dasds");

		// User Click visit encounter add Notes

		Thread.sleep(3000);
		Clickonelement(pom.getLogin().getvisitencounteraddnotes());

		// User Click visit encounter click notes

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getclicknotephone());

		// User Click visit encounter click notes

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getcancelnotesphone());

		// User Click visit encounter click view pg

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getclickreviewpg());

		// User Click visit encounter time

//		Clickonelement(pom.getLogin().getclicktimespent());

		// User Click visit encounter Add Notes

		sendkeys(pom.getLogin().getaddnotes(), "hello");

		// User Click visit encounter click Confin

		try {
			Clickonelement(pom.getLogin().getclickconfirm());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User Click visit encounter click Confin

		Clickonelement(pom.getLogin().getclickcancelnotes());

		// User Click visit encounter dropdown

//		Clickonelement(pom.getLogin().getvisitencounterdropdown());

		// User Click visit encounter note summary

//		Clickonelement(pom.getLogin().getvisitencounternotesummary());

		// User Click visit encounter billing summary
		Thread.sleep(5000);

//		Clickonelement(pom.getLogin().getvisitencounterbillingsummary());

		// User Click visit encounter

		Clickonelement(pom.getLogin().getclickvisitencounter());

		// User Click visit encounter view details
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getclickviewdetails());

		// User Click visit encounter view details title

		titleverify(pom.getLogin().getviewdetailstitle(), "View Details");

		// User Click visit encounter click Activity

		Thread.sleep(5000);
		Clickonelement(pom.getLogin().getclickactivity());

		// User Click visit encounter select Activity

		Clickonelement(pom.getLogin().getselectactivity());

		// User Click visit encounter click codes

		Clickonelement(pom.getLogin().getclickcodes());

		// User Click visit encounter select codes

		Clickonelement(pom.getLogin().getselectcodes());

		// User Click visit encounter Send From date

		sendkeys(pom.getLogin().getsendfromdate(), "2024-01-03");

		// User Click visit encounter Send to date

		sendkeys(pom.getLogin().getsendtodate(), "2024-03-07");

		// User Click visit encounter update

		Clickonelement(pom.getLogin().getclickupdate());

		// User Click visit encounter add Notes

		Thread.sleep(5000);

//		Clickonelement(pom.getLogin().getclickaddnotes());
//
//		// User Click visit encounter cancel add Notes
//
//		Clickonelement(pom.getLogin().getcanceladdnotes());

		// User Click visit encounter Click Lock
//		Thread.sleep(4000);
//
//		Clickonelement(pom.getLogin().getclicklock());
//
//		// User Click visit encounter Click unLock
//
//		Thread.sleep(5000);
//
//		Clickonelement(pom.getLogin().getclicklock());

		// User Click visit encounter Click dropdown

		Thread.sleep(5000);

		Clickonelement(pom.getLogin().getclickdropdown());

		// User Click visit encounter Click note summary

		Clickonelement(pom.getLogin().getclicknotesummary());

		// User Click visit encounter Click billing summary

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getclickbillingsummary());

		// User Click visit encounter Click billing summary

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getcanceldetails());

		/////////////// Encounter Visit month//////////

		// month encounter dropdpwn

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getclickencounterdropdownmonth());

		// month encounter dropdpwn

		Thread.sleep(5000);

		Clickonelement(pom.getLogin().getselectencounterdropdownmonth());

		// User Click visit encounter

//		Clickonelement(pom.getLogin().getclickvisitencounter());
//
//		// User Click visit encounter
//
//		titleverify(pom.getLogin().getvisitencountertitle(), "");

		// User Click visit encounter add Notes
		Thread.sleep(4000);

		Clickonelement(pom.getLogin().getvisitencounteraddnotes());

		// User Click visit encounter click notes

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getclicknotephone());

		// User Click visit encounter click notes

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getclicknotephonecancel());

		// User Click visit encounter click view pg

		Thread.sleep(3000);
		Clickonelement(pom.getLogin().getclickreviewpg());

		// User Click visit encounter time

//		Clickonelement(pom.getLogin().getclicktimespent());

		// User Click visit encounter Add Notes

		sendkeys(pom.getLogin().getaddnotes(), "hello");

		try {
			// User Click visit encounter click Confin

			Clickonelement(pom.getLogin().getclickconfirm());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User Click visit encounter click Confin

		Clickonelement(pom.getLogin().getclickcancelnote());

		// User Click visit encounter dropdown

		Thread.sleep(6000);

		Clickonelement(pom.getLogin().getvisitencounterdropdown());

		// User Click visit encounter note summary

		Clickonelement(pom.getLogin().getvisitencounternotesummary());

		// User Click visit encounter billing summary

		Clickonelement(pom.getLogin().getvisitencounterbillingsummary());

		// User Click visit encounter view details

		Clickonelement(pom.getLogin().getclickviewdetails());

		// User Click visit encounter view details title

		titleverify(pom.getLogin().getviewdetailstitle(), "View Details");

//		// User Click visit encounter click Activity
//
//		Clickonelement(pom.getLogin().getclickactivity());
//
//		// User Click visit encounter select Activity
//
//		Clickonelement(pom.getLogin().getselectactivity());
//
//		// User Click visit encounter click codes
//
//		Clickonelement(pom.getLogin().getclickcodes());
//
//		// User Click visit encounter select codes
//
//		Clickonelement(pom.getLogin().getselectcodes());
//
//		// User Click visit encounter Send From date
//
//		sendkeys(pom.getLogin().getsendfromdate(), "");
//
//		// User Click visit encounter Send to date
//
//		sendkeys(pom.getLogin().getsendtodate(), "");
//
//		// User Click visit encounter update
//
//		Clickonelement(pom.getLogin().getclickupdate());

		// User Click visit encounter add Notes
		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getclickaddnotes());

		// User Click visit encounter cancel add Notes

		Thread.sleep(3000);

		Clickonelement(pom.getLogin().getcanceladdnotes());

		// User Click visit encounter Click Lock
		Thread.sleep(4000);

//		Clickonelement(pom.getLogin().getclicklock());
//
//		// User Click visit encounter Click unLock
//
//		Clickonelement(pom.getLogin().getclicklock());

		// User Click visit encounter Click dropdown

		Clickonelement(pom.getLogin().getclickdropdown());

		// User Click visit encounter Click note summary

		Clickonelement(pom.getLogin().getclicknotesummary());

		// User Click visit encounter Click billing summary

		Clickonelement(pom.getLogin().getclickbillingsummary());
	}

}
