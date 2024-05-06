package com.Rpm;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {

	public WebDriver driver;

	public LoginPage(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	////////// Login Page //////////////////

	@FindBy(xpath = "(//input[@placeholder='Enter your username'])[1]")
	private WebElement sendusername;

	public WebElement getsendusername() {
		return sendusername;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter password'])[1]")
	private WebElement sendpassword;

	public WebElement getsendpassword() {
		return sendpassword;
	}

	@FindBy(xpath = "(//button[normalize-space()='Login'])[1]")
	private WebElement clickpassword;

	public WebElement getclickpassword() {

		return clickpassword;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Welcome Back'])[1]")
	private WebElement verifylogintitle;

	public WebElement getverifylogintitle() {

		return verifylogintitle;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Forgot Password ?'])[1]")
	private WebElement verifyforgotpasswordtitle;

	public WebElement getverifyforgotpasswordtitle() {

		return verifyforgotpasswordtitle;
	}

	@FindBy(xpath = "(//p[@class='sc-dkzDqf ioAQjc'])[1]")
	private WebElement clickonlogo;

	public WebElement getclickonlogo() {

		return clickonlogo;
	}

	@FindBy(xpath = "(//td[normalize-space()='Log Out'])[1]")
	private WebElement clicklogout;

	public WebElement getclicklogout() {

		return clicklogout;
	}

	@FindBy(xpath = "(//a[normalize-space()='Forgot Password?'])[1]")
	private WebElement clickforgot;

	public WebElement getclickforgot() {

		return clickforgot;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter your email'])[1]")
	private WebElement enteremail;

	public WebElement getenteremail() {

		return enteremail;
	}

	@FindBy(xpath = "(//button[normalize-space()='Reset Password'])[1]")
	private WebElement resetpassword;

	public WebElement getresetpassword() {

		return resetpassword;
	}

	@FindBy(xpath = "(//div[contains(text(),'Back to login')])[1]")
	private WebElement backlogin;

	public WebElement getbacklogin() {

		return backlogin;
	}

	///////////////////////// Patient List ////////////////////////

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[9]")
	private WebElement clickpatient;

	public WebElement getclickpatient() {

		return clickpatient;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[1]/div")
	private WebElement patienttitle;

	public WebElement getpatienttitle() {

		return patienttitle;
	}

	@FindBy(xpath = "(//input[@placeholder='Search for Patient'])[1]")
	private WebElement searchpatient;

	public WebElement getsearchpatient() {

		return searchpatient;
	}

	@FindBy(xpath = "(//span[contains(text(),'Patient Name')])[1]")
	private WebElement patientnamealign;

	public WebElement getpatientnamealign() {

		return patientnamealign;
	}

	@FindBy(xpath = "(//span[contains(text(),'Patient ID')])[1]")
	private WebElement patientidalign;

	public WebElement getpatientidalign() {

		return patientidalign;
	}

	@FindBy(xpath = "(//span[normalize-space()='DOB'])[1]")
	private WebElement patientdobalign;

	public WebElement getpatientdobalign() {

		return patientdobalign;
	}

	@FindBy(xpath = "(//span[contains(text(),'Phone Number')])[1]")
	private WebElement patientnumberalign;

	public WebElement getpatientnumberalign() {

		return patientnumberalign;
	}

	@FindBy(xpath = "(//span[contains(text(),'Email')])[1]")
	private WebElement patientemailalign;

	public WebElement getpatientemailalign() {

		return patientemailalign;
	}

	@FindBy(xpath = "(//span[contains(text(),'Program')])[1]")
	private WebElement patientprogramalign;

	public WebElement getpatientprogramalign() {

		return patientprogramalign;
	}

	@FindBy(xpath = "(//span[contains(text(),'Enrollment Status')])[1]")
	private WebElement patientenrolmentalign;

	public WebElement getpatientenrolmentalignalign() {

		return patientenrolmentalign;
	}

	@FindBy(xpath = "(//button[normalize-space()='Export csv'])[1]")
	private WebElement clickexportcsv;

	public WebElement getclickexportcsv() {

		return clickexportcsv;
	}

	@FindBy(xpath = "(//button[normalize-space()='Import csv'])[1]")
	private WebElement clickimportcsv;

	public WebElement getclickimportcsv() {

		return clickimportcsv;
	}

	@FindBy(xpath = "(//*[name()='path'][@fill-rule='evenodd'])[2]")
	private WebElement clickphoneicon;

	public WebElement getclickphoneicon() {

		return clickphoneicon;
	}

	@FindBy(xpath = "(//*[name()='path'][@fill-rule='evenodd'])[3]")
	private WebElement clickvideoicon;

	public WebElement getclickvideoicon() {

		return clickvideoicon;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[19]")
	private WebElement clickmessageicon;

	public WebElement getclickmessageicon() {

		return clickmessageicon;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[20]")
	private WebElement clickchaticon;

	public WebElement getclickchaticon() {

		return clickchaticon;
	}

	@FindBy(xpath = "(//input[@placeholder='Type your message here…'])[1]")
	private WebElement typemsg;

	public WebElement gettypemsg() {

		return typemsg;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div[3]/button")
	private WebElement sendmsg;

	public WebElement getsendmsg() {

		return sendmsg;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[19]")
	private WebElement cancelmsg;

	public WebElement getcancelmsg() {

		return cancelmsg;
	}

	////////////////////////////////// Patient Demographics /////////////////

	@FindBy(xpath = "(//td[contains(text(),'sugan das')])[1]")
	private WebElement selectpatient;

	public WebElement getselectpatient() {

		return selectpatient;
	}
	
	@FindBy(xpath = "//div[@class='sc-gSAPjG exVraM']")
	private WebElement clickdrop;

	public WebElement getclickdrop() {

		return clickdrop;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[17]")
	private WebElement clickeditdemograpics;

	public WebElement getclickeditdemograpics() {

		return clickeditdemograpics;
	}

	@FindBy(xpath = "(//button[normalize-space()='Upload Photo'])[1]")
	private WebElement clickupload;

	public WebElement getclickupload() {

		return clickupload;
	}

	@FindBy(xpath = "(//button[normalize-space()='Done'])[1]")
	private WebElement clickdone;

	public WebElement getclickdone() {

		return clickdone;
	}

	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement uploadimg;

	public WebElement getuploadimg() {

		return uploadimg;
	}

	@FindBy(xpath = "(//span[contains(text(),'Patient Demographics')])[1]")
	private WebElement patientdemographics;

	public WebElement getpatientdemographics() {

		return patientdemographics;
	}

	@FindBy(xpath = "(//input[@name='firstName'])[1]")
	private WebElement firstnameedit;

	public WebElement getfirstnameedit() {

		return firstnameedit;
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
	private WebElement dateofbirthcalendar;

	public WebElement getdateofbirthcalendar() {

		return dateofbirthcalendar;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement selectgender;

	public WebElement getselectgender() {

		return selectgender;
	}

	@FindBy(xpath = "(//input[@id='ssnInput'])[1]")
	private WebElement ssnnumber;

	public WebElement getssnnumber() {

		return ssnnumber;
	}

	@FindBy(xpath = "(//input[@name='emailId'])[1]")
	private WebElement emailidenter;

	public WebElement getemailidenter() {

		return emailidenter;
	}

	@FindBy(xpath = "(//input[@name='phoneNumber'])[1]")
	private WebElement enterphonenumber;

	public WebElement getenterphonenumber() {

		return enterphonenumber;
	}

	@FindBy(xpath = "//*[@id='patdemomodal']/div/div/div[2]/div[4]/div[3]/div/div")
	private WebElement bloodgroup;

	public WebElement getbloodgroup() {

		return bloodgroup;
	}
	
	@FindBy(xpath = "//*[@id='patdemomodal']/div/div/div[2]/div[4]/div[3]/div/div")
	private WebElement bloodgroup1;

	public WebElement getbloodgroup1() {

		return bloodgroup1;
	}

	@FindBy(xpath = "//*[@id='patdemomodal']/div/div/div[2]/div[5]/div[1]/div/div/div")
	private WebElement selectrace;

	public WebElement getselectrace() {

		return selectrace;
	}

	@FindBy(xpath = "//*[@id='patdemomodal']/div/div/div[2]/div[5]/div[2]/div/div")
	private WebElement selectethnicity;

	public WebElement getselectethnicity() {

		return selectethnicity;
	}

	@FindBy(xpath = "//*[@id='patdemomodal']/div/div/div[2]/div[5]/div[3]/div/div")
	private WebElement selectlanguage;

	public WebElement getselectlanguage() {

		return selectlanguage;
	}

	@FindBy(xpath = "(//input[@name='address'])[1]")
	private WebElement enteraddress;

	public WebElement getenteraddress() {

		return enteraddress;
	}

	@FindBy(xpath = "(//input[@name='city'])[1]")
	private WebElement entercity;

	public WebElement getentercity() {

		return entercity;
	}

	@FindBy(xpath = "(//input[@name='state'])[1]")
	private WebElement enterstate;

	public WebElement getenterstate() {

		return enterstate;
	}

	@FindBy(xpath = "(//input[@name='zipcode'])[1]")
	private WebElement enterzip;

	public WebElement getenterzip() {

		return enterzip;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement clicksave;

	public WebElement getclicksave() {

		return clicksave;
	}

	///////////////////////////// Vitals /////////////////////////////////

	@FindBy(xpath = "(//p[contains(text(),'Vitals')])[1]")
	private WebElement titlevitals;

	public WebElement gettitlevitals() {

		return titlevitals;
	}

	@FindBy(xpath = "//div[@class='sc-gsnTZi jbgeqn']//*[name()='svg']")
	private WebElement clickrefresh;

	public WebElement getclickrefresh() {

		return clickrefresh;
	}

	@FindBy(xpath = "(//p[normalize-space()='Heart Rate'])[1]")
	private WebElement titleheartrate;

	public WebElement gettitleheartrate() {

		return titleheartrate;
	}

	@FindBy(xpath = "(//p[contains(text(),'Blood Pressure')])[1]")
	private WebElement titlebloodpressure;

	public WebElement gettitlebloodpressure() {

		return titlebloodpressure;
	}

	@FindBy(xpath = "(//p[contains(text(),'Respiratory Rate')])[1]")
	private WebElement titlerespiratoryrate;

	public WebElement gettitlerespiratoryrate() {

		return titlerespiratoryrate;
	}

	@FindBy(xpath = "(//p[contains(text(),'Respiratory Rate')])[1]")
	private WebElement titlebloodglucose;

	public WebElement gettitlebloodglucose() {

		return titlebloodglucose;
	}

	@FindBy(xpath = "(//p[contains(text(),'Oxygen Saturation')])[1]")
	private WebElement titleoxygensaturation;

	public WebElement gettitleoxygensaturation() {

		return titleoxygensaturation;
	}

	@FindBy(xpath = "(//p[contains(text(),'Weight')])[1]")
	private WebElement titleweight;

	public WebElement gettitleweight() {

		return titleweight;
	}

	////////////////////////////////// Add Devices ///////////////////////////

	@FindBy(xpath = "(//h1[normalize-space()='Device Assigned'])[1]")
	private WebElement devicetitle;

	public WebElement getdevicetitle() {

		return devicetitle;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Devices'])[1]")
	private WebElement adddevice;

	public WebElement getadddevice() {

		return adddevice;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Add Devices'])[1]")
	private WebElement adddevicetitle;

	public WebElement getadddevicetitle() {

		return adddevicetitle;
	}

	@FindBy(xpath = "(//p[contains(text(),'Select Device')])[1]")
	private WebElement clickbloodpressure;

	public WebElement getclickbloodpressure() {

		return clickbloodpressure;
	}

	@FindBy(xpath = "(//li[normalize-space()='Bodytrace Blood Pressure Monitor'])[1]")
	private WebElement selectbloodpressuredevice;

	public WebElement getselectbloodpressuredevice() {

		return selectbloodpressuredevice;
	}

	@FindBy(xpath = "(//input[@id='BP20'])[1]")
	private WebElement fillserialnobp;

	public WebElement getfillserialnobp() {

		return fillserialnobp;
	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX iGZiao'])[2]")
	private WebElement clickcontinuousglucose;

	public WebElement getclickcontinuousglucoses() {

		return clickcontinuousglucose;
	}

	@FindBy(xpath = "(//li[normalize-space()='iGlucose'])[1]")
	private WebElement selectcontinuousglucose;

	public WebElement getselectcontinuousglucose() {

		return selectcontinuousglucose;
	}

	@FindBy(xpath = "(//input[@id='CG10'])[1]")
	private WebElement fillserialnocontinuousglucose;

	public WebElement getfillserialnocontinuousglucose() {

		return fillserialnocontinuousglucose;
	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX iGZiao'][normalize-space()='Select Device'])[3]")
	private WebElement clickweightscale;

	public WebElement getclickweightscale() {

		return clickweightscale;
	}

	@FindBy(xpath = "(//li[normalize-space()='Bodytrace Weight Scale'])[1]")
	private WebElement selectwightscale;

	public WebElement getselectwightscale() {

		return selectwightscale;
	}

	@FindBy(xpath = "(//input[@id='WS20'])[1]")
	private WebElement fillserialnoweightscale;

	public WebElement getfillserialnoweightscale() {

		return fillserialnoweightscale;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/div/p")
	private WebElement clickheartrate;

	public WebElement getclickheartrate() {

		return clickheartrate;
	}

	@FindBy(xpath = "(//li[normalize-space()='Omron ECG'])[1]")
	private WebElement selectheartrate;

	public WebElement getselectheartrate() {

		return selectheartrate;
	}

	@FindBy(xpath = "(//li[contains(text(),'Omron Digital Blood Pressure Monitor')])[1]")
	private WebElement fillserialnoheartrate;

	public WebElement getfillserialnoheartrate() {

		return fillserialnoheartrate;
	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX iGZiao'][normalize-space()='Select Device'])[5]")
	private WebElement clickpluseoximeter;

	public WebElement getclickpluseoximeter() {

		return clickpluseoximeter;
	}

	@FindBy(xpath = "(//li[normalize-space()='iPlulse Ox'])[1]")
	private WebElement selectpluseoximeter;

	public WebElement getselectpluseoximeter() {

		return selectpluseoximeter;
	}

	@FindBy(xpath = "(//input[@placeholder='Serial No'])[3]")
	private WebElement fillserialnoselectpluseoximeter;

	public WebElement getfillserialnoselectpluseoximeter() {

		return fillserialnoselectpluseoximeter;
	}

	@FindBy(xpath = "(//button[normalize-space()='Assign'])[1]")
	private WebElement clickassign;

	public WebElement getclickassign() {

		return clickassign;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/div[2]/div/div/div[3]/div[2]/button[1]")
	private WebElement clickcancel;

	public WebElement getclickcancel() {

		return clickcancel;

	}

	////////////////////////////// Add Encounter ////////////////////

	@FindBy(xpath = "(//button[normalize-space()='Add Encounter'])[1]")
	private WebElement clickaddencounter;

	public WebElement getclickaddencounter() {

		return clickaddencounter;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Encounter Visit Details'])[1]")
	private WebElement titleverify;

	public WebElement gettitleverify() {

		return titleverify;

	}

	@FindBy(xpath = "(//button[@class='sc-hrzOVh bPmdor'])[1]")
	private WebElement clickencounterprovider;

	public WebElement getclickencounterprovider() {

		return clickencounterprovider;

	}

	@FindBy(xpath = "(//li[contains(text(),'Steve')])[1]")
	private WebElement selectencounterprovider;

	public WebElement getselectencounterprovider() {

		return selectencounterprovider;

	}

	@FindBy(xpath = "(//textarea[@class='sc-eZMymg gXvaAS'])[1]")
	private WebElement Addnotes;

	public WebElement getAddnotes() {

		return Addnotes;

	}

	@FindBy(xpath = "(//button[@cursor='pointer'])[16]")
	private WebElement Savenotes;

	public WebElement getSavenotes() {

		return Savenotes;

	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[3]/div/button[1]/p")
	private WebElement cancelencounter;

	public WebElement getcancelencounter() {

		return cancelencounter;

	}

	@FindBy(xpath = "(//div[@class='sc-gsnTZi dmwitf'])[1]")
	private WebElement encountertitle;

	public WebElement getencountertitle() {

		return encountertitle;

	}

	@FindBy(xpath = "//tbody/tr[1]/td[5]/span[1]/*[1]")
	private WebElement clickencounterdropdown;

	public WebElement getclickencounterdropdown() {

		return clickencounterdropdown;

	}

	@FindBy(xpath = "(//span[@class='sc-efBctP kFpfyB']//*[name()='svg'])[1]")
	private WebElement editencounter;

	public WebElement geteditencounter() {

		return editencounter;

	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[3]/textarea")
	private WebElement editnotes;

	public WebElement geteditnotes() {

		return editnotes;

	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX jrvMdl'])[1]")
	private WebElement saveeditedencounter;

	public WebElement getsaveeditedencounter() {

		return saveeditedencounter;

	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[3]/div/button[1]/p")
	private WebElement canceleditedencounter;

	public WebElement getcanceleditedencounter() {

		return canceleditedencounter;

	}

	@FindBy(xpath = "(//tbody/tr[1]/td[5]/span[1]/*[1])[1]")
	private WebElement viewencounterdetails;

	public WebElement getviewencounterdetails() {

		return viewencounterdetails;

	}

	@FindBy(xpath = "(//div[@class='sc-gsnTZi False'])[1]")
	private WebElement viewdetailstitleverify;

	public WebElement getviewdetailstitleverify() {

		return viewdetailstitleverify;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[20]")
	private WebElement viewdetailsdropdown;

	public WebElement getviewdetailsdropdown() {

		return viewdetailsdropdown;

	}

	@FindBy(xpath = "(//button[normalize-space()='View Details'])[1]")
	private WebElement viewdetailsedit;

	public WebElement getviewdetailsedit() {

		return viewdetailsedit;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[2]")
	private WebElement viewdetailseditnotes;

	public WebElement getviewdetailseditnotes() {

		return viewdetailseditnotes;

	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX jrvMdl'])[1]")
	private WebElement viewdetailssavenotes;

	public WebElement getviewviewdetailssavenotes() {

		return viewdetailssavenotes;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[1]")
	private WebElement viewdetailscancelnotes;

	public WebElement getviewdetailscancelnotes() {

		return viewdetailscancelnotes;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[1]")
	private WebElement cancelonedayencounter;

	public WebElement getcancelonedayencounter() {

		return cancelonedayencounter;

	}

	/////////////////////// Visit Encounter ///////////////////

	@FindBy(xpath = "(//button[normalize-space()='Visit Encounter'])[1]")
	private WebElement clickvisitencounter;

	public WebElement getclickvisitencounter() {

		return clickvisitencounter;

	}

	@FindBy(xpath = "(//div[@class='sc-gsnTZi hvaPUa'])[1]")
	private WebElement visitencountertitle;

	public WebElement getvisitencountertitle() {

		return visitencountertitle;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[21]")
	private WebElement visitencounteraddnotes;

	public WebElement getvisitencounteraddnotes() {

		return visitencounteraddnotes;

	}

	@FindBy(xpath = "(//button[normalize-space()='Phone Call'])[1]")
	private WebElement clicknotephone;

	public WebElement getclicknotephone() {

		return clicknotephone;

	}
	
	@FindBy(xpath = "(//*[name()='svg'][@id='dbrd_ad-crd_cls'])[2]")
	private WebElement clicknotephonecancel;

	public WebElement getclicknotephonecancel() {

		return clicknotephonecancel;

	}
	
	@FindBy(xpath = "(//*[name()='svg'][@id='dbrd_ad-crd_cls'])[2]")
	private WebElement cancelnotesphone;

	public WebElement getcancelnotesphone() {

		return cancelnotesphone;

	}

	@FindBy(xpath = "(//button[normalize-space()='Review PGHD'])[1]")
	private WebElement clickreviewpg;

	public WebElement getclickreviewpg() {

		return clickreviewpg;

	}

	@FindBy(xpath = "(//button[normalize-space()='2 min'])[1]")
	private WebElement clicktimespent;

	public WebElement getclicktimespent() {

		return clicktimespent;

	}

	@FindBy(xpath = "(//textarea[@placeholder='Type your Notes here!'])[1]")
	private WebElement addnotes;

	public WebElement getaddnotes() {

		return addnotes;

	}

	@FindBy(xpath = "(//button[@id='bil_ad-btn_crdSv'])[1]")
	private WebElement clickconfirm;

	public WebElement getclickconfirm() {

		return clickconfirm;

	}
	
	@FindBy(xpath = "(//button[@class='sc-jSMfEi fqvAYt'])[1]")
	private WebElement clickcancelnote;

	public WebElement getclickcancelnote() {

		return clickcancelnote;

	}
	
	@FindBy(xpath = "(//*[name()='svg'][@id='dbrd_ad-crd_cls'])[1]")
	private WebElement clickcancelnotes;

	public WebElement getclickcancelnotes() {

		return clickcancelnotes;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[20]")
	private WebElement visitencounterdropdown;

	public WebElement getvisitencounterdropdown() {

		return visitencounterdropdown;

	}

	@FindBy(xpath = "//th[contains(text(),'Note Summary')]")
	private WebElement visitencounternotesummary;

	public WebElement getvisitencounternotesummary() {

		return visitencounternotesummary;

	}

	@FindBy(xpath = "//th[contains(text(),'Billing Summary')]")
	private WebElement visitencounterbillingsummary;

	public WebElement getvisitencounterbillingsummary() {

		return visitencounterbillingsummary;

	}

	@FindBy(xpath = "(//button[normalize-space()='View Details'])[1]")
	private WebElement clickviewdetails;

	public WebElement getclickviewdetails() {

		return clickviewdetails;

	}

	@FindBy(xpath = "//div[contains(text(),'View Details')]")
	private WebElement viewdetailstitle;

	public WebElement getviewdetailstitle() {

		return viewdetailstitle;

	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div/div[3]/div[1]/div[1]/div/div")
	private WebElement clickactivity;

	public WebElement getclickactivity() {

		return clickactivity;

	}

	@FindBy(xpath = "(//label[normalize-space()='Device Assigned'])[1]")
	private WebElement selectactivity;

	public WebElement getselectactivity() {

		return selectactivity;

	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div/div[3]/div[1]/div[2]/div/div")
	private WebElement clickcodes;

	public WebElement getclickcodes() {

		return clickcodes;

	}

	@FindBy(xpath = "(//label[normalize-space()='CPT4-99453'])[1]")
	private WebElement selectcodes;

	public WebElement getselectcodes() {

		return selectcodes;

	}

	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement sendfromdate;

	public WebElement getsendfromdate() {

		return sendfromdate;

	}

	@FindBy(xpath = "(//input[@id='date'])[2]")
	private WebElement sendtodate;

	public WebElement getsendtodate() {

		return sendtodate;

	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div/div[3]/div[1]/button")
	private WebElement clickupdate;

	public WebElement getclickupdate() {

		return clickupdate;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[3]")
	private WebElement clickaddnotes;

	public WebElement getclickaddnotes() {

		return clickaddnotes;

	}

	@FindBy(xpath = "(//button[contains(text(),'Cancel')])[1]")
	private WebElement canceladdnotes;

	public WebElement getcanceladdnotes() {

		return canceladdnotes;

	}

	@FindBy(xpath = "(//*[name()='path'])[6]")
	private WebElement clicklock;

	public WebElement getclicklock() {

		return clicklock;

	}

	@FindBy(xpath = "(//*[name()='svg'][@id='dbrd_ad-crd_cls'])[1]	")
	private WebElement clickunlock;

	public WebElement getclickunlock() {

		return clickunlock;

	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[2]")
	private WebElement clickdropdown;

	public WebElement getclickdropdown() {

		return clickdropdown;

	}

	@FindBy(xpath = "//th[contains(text(),'Note Summary')]")
	private WebElement clicknotesummary;

	public WebElement getclicknotesummary() {

		return clicknotesummary;

	}

	@FindBy(xpath = "//th[contains(text(),'Billing Summary')]")
	private WebElement clickbillingsummary;

	public WebElement getclickbillingsummary() {

		return clickbillingsummary;

	}
	
	
	@FindBy(xpath = "(//*[name()='path'])[1]")
	private WebElement canceldetails;

	public WebElement getcanceldetails() {

		return canceldetails;

	}

	/////////////// Month Encounter Visit //////////
	
	
	@FindBy(xpath = "(//button[@class='sc-jSMfEi gepcxt'])[1]")
	private WebElement clickencounterdropdownmonth;

	public WebElement getclickencounterdropdownmonth() {

		return clickencounterdropdownmonth;

	}
	
	
	
	@FindBy(xpath = "(//div[normalize-space()='03-03-2024 to 02-04-2024'])[1]")
	private WebElement selectencounterdropdownmonth;

	public WebElement getselectencounterdropdownmonth() {

		return selectencounterdropdownmonth;

	}
	
	
}
