package com.Rpm_Treatmentplan;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

public class Treatmentplan extends Base_Class {

	public static WebDriver driver = getbrowser("chrome");

	public static Pageobjectmanager pom = new Pageobjectmanager(driver);

	@Test(priority = 1)

	public void Treatmentplan() throws InterruptedException {

		// User launch The Browser

		geturl("https://mumbairpm.vozo.xyz/");

		// User Verify The Title
//						titleverify(pom.getdashboardrpm().getverifylogintitle(), "Welcome Back");

		sendkeys(pom.gettreatmentplan().getsendusername(), "admin");

		// User Enter Password
		sendkeys(pom.gettreatmentplan().getsendpassword(), "Capminds@03");

		// User Login Option

		Clickonelement(pom.gettreatmentplan().getclicklogin());

		Thread.sleep(5000);

		// User click treatment plan

		Clickonelement(pom.gettreatmentplan().getclicktreatment());

		// User click search created

		sendkeys(pom.gettreatmentplan().getsearchcreated(), "Stevehello Jobs12345");

		// User click search plan

		sendkeys(pom.gettreatmentplan().getsearchplan(), "test");

		// User click add treatment

		Clickonelement(pom.gettreatmentplan().getaddtreatmentplan());

		// User click add treatment title

		titleverify(pom.gettreatmentplan().gettreatmentplantitile(), "Treatment Plan");

		// User click add treatment edit name

		Clickonelement(pom.gettreatmentplan().gettreatmentplannameedit());

		// User click add treatment edit name

		sendkeys(pom.gettreatmentplan().gettreatmentplanname(), "Plan treat");

		// User click add treatment save name

		Thread.sleep(4000);

		Clickonelement(pom.gettreatmentplan().gettreatmentplannamesave());

		// User click add problems

		sendkeys(pom.gettreatmentplan().getproblemstatement(), "Hello New");

		// User click add diagnosis

		sendkeys(pom.gettreatmentplan().getDiagnosissend(), "a");

		// User click add diagnosis select

		Thread.sleep(4000);

		Clickonelement(pom.gettreatmentplan().getDiagnosisselect());

		// User click add goals

		sendkeys(pom.gettreatmentplan().getgoalssend(), "Hello");

		// User click add vitals

		Clickonelement(pom.gettreatmentplan().getvitalsselect());

		// User click add vitals select

		Clickonelement(pom.gettreatmentplan().getvitalsselect1());

		// User click add frequency

		sendkeys(pom.gettreatmentplan().getfrequency(), "new ");

		// User click add instruction

		sendkeys(pom.gettreatmentplan().getinstructions(), "new 123 ");

		// User click add medication

		sendkeys(pom.gettreatmentplan().getmedicationsearch(), "a");

		// User click add vitals select
		Thread.sleep(4000);

		Clickonelement(pom.gettreatmentplan().getmedicationselect());

		// User click add frequenchy

		Thread.sleep(3000);

		sendkeys(pom.gettreatmentplan().getfrequencysend(), "new Frequency");

		// User click add frequenchy

		Thread.sleep(3000);

		sendkeys(pom.gettreatmentplan().getinstructionsend(), "new instruction");

		// User click add proider

		sendkeys(pom.gettreatmentplan().getprovidersearch(), "a");

		// User click add proider
		Thread.sleep(4000);

		Clickonelement(pom.gettreatmentplan().getproviderselect());

		// User click add speciality

		Clickonelement(pom.gettreatmentplan().getspecialityclick());

		// User click add speciality

		Clickonelement(pom.gettreatmentplan().getspecialityselect());

		// save plan

		// User click add speciality

		Clickonelement(pom.gettreatmentplan().getsaveplan());

		// User click cancel

		try {
			Clickonelement(pom.gettreatmentplan().getcancelplan());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User click add to patient
		Thread.sleep(3000);

		Clickonelement(pom.gettreatmentplan().getaddpatient());

		// User click add to patient
		Thread.sleep(3000);

		sendkeys(pom.gettreatmentplan().getsearchpatient(), "maran");

		// User click add to patient
		Thread.sleep(3000);

		Clickonelement(pom.gettreatmentplan().getselectpatient());

		// User click add to patient

		Clickonelement(pom.gettreatmentplan().getaddplan());

		try {
			// User click add to patient cancel

			Clickonelement(pom.gettreatmentplan().getcancelplanpatient());
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User click add to patient

		Thread.sleep(5000);

		Clickonelement(pom.gettreatmentplan().geteditplan());

		try {
			// User click add to edit

			Thread.sleep(3000);

			sendkeys(pom.gettreatmentplan().getproblemstatementedit(), "1");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		// User click add to patient

		Thread.sleep(3000);

		Clickonelement(pom.gettreatmentplan().getsaveedit());

		// User click add to patient

		Thread.sleep(3000);

		gettext(pom.gettreatmentplan().getedittime());

	}

}
