package com.Rpm_Patientportal;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patientportalrpm {

	public WebDriver driver;

	public Patientportalrpm(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//h2[@class='sc-iIPllB hspBOb'])[1]")
	private WebElement Rpmlogintitle;

	public WebElement getRpmlogintitle() {

		return Rpmlogintitle;
	}

	@FindBy(xpath = "(//h5[contains(text(),'I’M A NEW CLIENT')])[1]")
	private WebElement iamnewclient;

	public WebElement getiamnewclient() {

		return iamnewclient;
	}

	@FindBy(xpath = "(//input[@id='sig_emil-inp_ent'])[1]")
	private WebElement enteremailnew;

	public WebElement getenteremailnew() {

		return enteremailnew;
	}

	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	private WebElement continue1;

	public WebElement getcontinue1() {

		return continue1;
	}

	@FindBy(xpath = "(//h2[normalize-space()='Verify your Account'])[1]")
	private WebElement verifyaccounttitle;

	public WebElement getverifyaccounttitle() {

		return verifyaccounttitle;
	}

	@FindBy(xpath = "(//span[@class='sc-iqcoie kOkWhX'])[1]")
	private WebElement resendcode;

	public WebElement getresendcode() {

		return resendcode;
	}

	@FindBy(xpath = "(//img[@id='wel_img-ext'])[1]")
	private WebElement clickexistingclient;

	public WebElement getclickexistingclient() {

		return clickexistingclient;
	}

	@FindBy(xpath = "(//input[@id='sig_emil-inp_ent'])[1]")
	private WebElement enteremail;

	public WebElement getenteremail() {

		return enteremail;
	}

	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	private WebElement clickcontinue;

	public WebElement getclickcontinue() {

		return clickcontinue;
	}

	@FindBy(xpath = "(//label[normalize-space()='Login'])[1]")
	private WebElement logintitle;

	public WebElement getlogintitle() {

		return logintitle;
	}

	@FindBy(xpath = "(//a[normalize-space()='Forgot Password?'])[1]")
	private WebElement forgotpassword;

	public WebElement getforgotpassword() {

		return forgotpassword;
	}

	@FindBy(xpath = "(//h2[normalize-space()='Forget Password'])[1]")
	private WebElement forgotpasswordtitle;

	public WebElement getforgotpasswordtitle() {

		return forgotpasswordtitle;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	private WebElement enteremailforgot;

	public WebElement getenteremailforgot() {

		return enteremailforgot;
	}

	@FindBy(xpath = "(//button[normalize-space()='Send Verification Code'])[1]")
	private WebElement sendverificationcode;

	public WebElement getsendverificationcode() {

		return sendverificationcode;
	}

	@FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
	private WebElement backlogin;

	public WebElement getbacklogin() {

		return backlogin;
	}

	@FindBy(xpath = "(//input[@id='log_mail-inp_adr'])[1]")
	private WebElement enteremaillogin;

	public WebElement getenteremaillogin() {

		return enteremaillogin;
	}

	@FindBy(xpath = "(//input[@id='log_psw-inp_adr'])[1]")
	private WebElement enterpasslogin;

	public WebElement getenterpasslogin() {

		return enterpasslogin;
	}

	@FindBy(xpath = "(//button[normalize-space()='Log in'])[1]")
	private WebElement loginbutton;

	public WebElement getloginbutton() {

		return loginbutton;
	}

	/////////////////// Vitals //////////////////////////

	@FindBy(xpath = "(//span[normalize-space()='Vitals'])[1]")
	private WebElement clickvitals;

	public WebElement getclickvitals() {

		return clickvitals;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Vitals'])[1]")
	private WebElement vitalstitle;

	public WebElement getvitalstitle() {

		return vitalstitle;
	}

	@FindBy(xpath = "(//p[@class='sc-gsnTZi flVwRz'])[1]")
	private WebElement mostrecentvitals;

	public WebElement getmostrecentvitals() {

		return mostrecentvitals;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Device Assigned'])[1]")
	private WebElement deviceassignedtitle;

	public WebElement getdeviceassignedtitle() {

		return deviceassignedtitle;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Patient Data'])[1]")
	private WebElement patientdetails;

	public WebElement getpatientdetails() {

		return patientdetails;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Heart Rate (BPM)'])[1]")
	private WebElement heartratetitle;

	public WebElement getheartratetitle() {

		return heartratetitle;
	}

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Month'])[1]")
	private WebElement monthdropdownhr;

	public WebElement getmonthdropdownhr() {

		return monthdropdownhr;
	}

	@FindBy(xpath = "(//label[@value='week'][normalize-space()='Week'])[1]")
	private WebElement weekdropdownhr;

	public WebElement getweekdropdownhr() {

		return weekdropdownhr;
	}

	@FindBy(xpath = "(//button[normalize-space()='Blood Pressure'])[1]")
	private WebElement bloodpressure;

	public WebElement getbloodpressure() {

		return bloodpressure;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Blood Pressure (mm/Hg)'])[1]")
	private WebElement bloodpressuretitle;

	public WebElement getbloodpressuretitle() {

		return bloodpressuretitle;
	}

	@FindBy(xpath = "(//label[@value='month'][normalize-space()='Month'])[2]")
	private WebElement monthdropdownbp;

	public WebElement getmonthdropdownbp() {

		return monthdropdownbp;
	}

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Week'])[2]")
	private WebElement weekdropdownbp;

	public WebElement getweekdropdownbp() {

		return weekdropdownbp;
	}

	@FindBy(xpath = "(//button[normalize-space()='Oxygen'])[1]")
	private WebElement oxygen;

	public WebElement getoxygen() {

		return oxygen;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Oxygen (%)'])[1]")
	private WebElement oxygentitle;

	public WebElement getoxygentitle() {

		return oxygentitle;
	}

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Month'])[3]")
	private WebElement monthdropdownox;

	public WebElement getmonthdropdownox() {

		return monthdropdownox;
	}

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Month'])[3]")
	private WebElement weekdropdownox;

	public WebElement getweekdropdownox() {

		return weekdropdownox;
	}

	@FindBy(xpath = "(//button[normalize-space()='Glucose'])[1]")
	private WebElement glucose;

	public WebElement getglucose() {

		return glucose;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Glucose (mg/dL)'])[1]")
	private WebElement glucosetitle;

	public WebElement getglucosetitle() {

		return glucosetitle;
	}

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Month'])[4]")
	private WebElement monthdropdownglu;

	public WebElement getmonthdropdownglu() {

		return monthdropdownglu;
	}

	@FindBy(xpath = "(//label[@value='week'][normalize-space()='Week'])[4]")
	private WebElement weekdropdownglu;

	public WebElement getweekdropdownglu() {

		return weekdropdownglu;
	}

	@FindBy(xpath = "(//button[normalize-space()='Respiratory Rate'])[1]")
	private WebElement respirationrate;

	public WebElement getrespirationrate() {

		return respirationrate;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Glucose (mg/dL)'])[1]")
	private WebElement respirationratetitle;

	public WebElement getrespirationratetitle() {

		return respirationratetitle;
	}

	@FindBy(xpath = "//*[@id='RPM_Patient_Portal']/div/div[2]/div/div[4]/div/div[6]/div/div[1]/div/div")
	private WebElement monthdropdowngrr;

	public WebElement getmonthdropdowngrr() {

		return monthdropdowngrr;
	}

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Month'])[5]")
	private WebElement weekdropdownrr;

	public WebElement getweekdropdownrr() {

		return weekdropdownrr;
	}

	@FindBy(xpath = "(//button[normalize-space()='Weight'])[1]")
	private WebElement weight;

	public WebElement getweight() {

		return weight;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Weight (Kg)'])[1]")
	private WebElement weighttitle;

	public WebElement getweighttitle() {

		return weighttitle;
	}

	@FindBy(xpath = "//*[@id='RPM_Patient_Portal']/div/div[2]/div/div[4]/div/div[7]/div/div[1]/div/div")
	private WebElement monthdropdownweig;

	public WebElement getmonthdropdownweig() {

		return monthdropdownweig;
	}

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Month'])[6]")
	private WebElement weekdropdownweig;

	public WebElement getweekdropdownweig() {

		return weekdropdownweig;
	}

	//////////////////////////////// My Profile ////////////////////

	@FindBy(xpath = "(//div[@class='sc-hiMGwR iikMEy'])[1]")
	private WebElement clickmyprofile;

	public WebElement getclickmyprofile() {

		return clickmyprofile;
	}

	@FindBy(xpath = "(//div[@class='sc-lbOyJj dDHdyh'])[1]")
	private WebElement selectmyprofile;

	public WebElement getselectmyprofile() {

		return selectmyprofile;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Edit Profile'])[1]")
	private WebElement myprofiletitle;

	public WebElement getmyprofiletitle() {

		return myprofiletitle;
	}

	@FindBy(xpath = "(//img[@class='sc-eCYdqJ eeAZvR'])[1]")
	private WebElement uploadimage;

	public WebElement getuploadimage() {

		return uploadimage;
	}

	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement senduploadimage;

	public WebElement getsenduploadimage() {

		return senduploadimage;
	}

	@FindBy(xpath = "(//button[normalize-space()='Done'])[1]")
	private WebElement pressdone;

	public WebElement getpressdone() {

		return pressdone;
	}
	

	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[2]")
	private WebElement presscancel;

	public WebElement getpresscancel() {

		return presscancel;
	}

	@FindBy(xpath = "(//input[@name='firstName'])[1]")
	private WebElement firstname;

	public WebElement getfirstname() {

		return firstname;
	}

	@FindBy(xpath = "(//input[@name='middleName'])[1]")
	private WebElement middlename;

	public WebElement getmiddlename() {

		return middlename;
	}

	@FindBy(xpath = "(//input[@name='lastName'])[1]")
	private WebElement lastname;

	public WebElement getlastname() {

		return lastname;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement dateofbirth;

	public WebElement getdateofbirth() {

		return dateofbirth;
	}

	@FindBy(xpath = "(//div[@class='sc-bczRLJ ckyvFH'])[1]")
	private WebElement genderdrop;

	public WebElement getgenderdrop() {

		return genderdrop;
	}
	
	@FindBy(xpath = "(//label[normalize-space()='Female'])[1]")
	private WebElement changegenderdrop;

	public WebElement getchangegenderdrop() {

		return changegenderdrop;
	}

	@FindBy(xpath = "(//input[@name='ssnNum'])[1]")
	private WebElement ssnnumber;

	public WebElement getssnnumber() {

		return ssnnumber;
	}

	@FindBy(xpath = "(//input[@name='email'])[1]")
	private WebElement emailaddress;

	public WebElement getemailaddress() {

		return emailaddress;
	}

	@FindBy(xpath = "(//input[@name='phone'])[1]")
	private WebElement phonenumber;

	public WebElement getphonenumber() {

		return phonenumber;
	}

	@FindBy(xpath = "(//div[@class='sc-bczRLJ dcvEFB'])[1]")

	private WebElement bloodgroup;

	public WebElement getbloodgroup() {

		return bloodgroup;
	}
	
	@FindBy(xpath = "(//label[normalize-space()='A +'])[1]")

	private WebElement bloodgroupselect;

	public WebElement getbloodgroupselect() {

		return bloodgroupselect;
	}
	
	@FindBy(xpath = "(//div[@class='sc-bczRLJ dcvEFB'])[2]")

	private WebElement race;

	public WebElement getrace() {

		return race;
	}
	
	
	@FindBy(xpath = "(//label[normalize-space()='American Indian'])[1]")

	private WebElement raceselect;

	public WebElement getraceselect() {

		return raceselect;
	}
	
	@FindBy(xpath = "(//div[@class='sc-bczRLJ dcvEFB'])[3]")

	private WebElement ethinicity;

	public WebElement getethinicity() {

		return ethinicity;
	}
	
	@FindBy(xpath = "(//label[normalize-space()='Not Hispanic or Latino'])[1]")

	private WebElement ethinicityselect;

	public WebElement getethinicityselect() {

		return ethinicityselect;
	}
	
	@FindBy(xpath = "(//div[@class='sc-bczRLJ dcvEFB'])[4]")

	private WebElement language;

	public WebElement getlanguage() {

		return language;
	}
	
	@FindBy(xpath = "(//label[normalize-space()='Afar'])[1]")

	private WebElement languageselect;

	public WebElement getlanguageselect() {

		return languageselect;
	}
	
	@FindBy(xpath = "(//input[@name='address'])[1]")

	private WebElement address;

	public WebElement getaddress() {

		return address;
	}
	

	@FindBy(xpath = "(//input[@name='city'])[1]")

	private WebElement city;

	public WebElement getcity() {

		return city;
	}
	
	@FindBy(xpath = "(//input[@name='state'])[1]")

	private WebElement state;

	public WebElement getstate() {

		return state;
	}
	
	@FindBy(xpath = "(//input[@name='zip'])[1]")

	private WebElement zipcode;

	public WebElement getzipcode() {

		return zipcode;
	}

	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement savemyprofile;

	public WebElement getsavemyprofile() {

		return savemyprofile;
	}
	
	@FindBy(xpath = "(//button[@class='sc-jSMfEi bivLPZ close_active'])[1]")

	private WebElement cancelmyprofile;

	public WebElement getcancelmyprofile() {

		return cancelmyprofile;
	}

}
