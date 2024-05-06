package com.NegativeTest;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RpmNegativeTestcase {

	public WebDriver driver;

	public RpmNegativeTestcase(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//button[normalize-space()='Login'])[1]")

	private WebElement clickloginbtn;

	public WebElement getclickloginbtn() {

		return clickloginbtn;
	}

	@FindBy(xpath = "(//label[normalize-space()='Please Enter the Username'])[1]")

	private WebElement loginusernameverify;

	public WebElement getloginusernameverify() {

		return loginusernameverify;
	}

	@FindBy(xpath = "(//label[normalize-space()='Please Enter the Password'])[1]")

	private WebElement loginpasswordverify;

	public WebElement getloginpasswordverify() {

		return loginpasswordverify;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter your username'])[1]")

	private WebElement enterusername;

	public WebElement getenterusername() {

		return enterusername;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter password'])[1]")

	private WebElement enterpassword;

	public WebElement getenterpassword() {

		return enterpassword;
	}

	@FindBy(xpath = "(//a[normalize-space()='Forgot Password?'])[1]")

	private WebElement forgotpassword;

	public WebElement getforgotpassword() {

		return forgotpassword;
	}

	@FindBy(xpath = "(//input[@placeholder='Enter your email'])[1]")

	private WebElement forgotpasswordemail;

	public WebElement getforgotpasswordemail() {

		return forgotpasswordemail;
	}

	@FindBy(xpath = "(//button[normalize-space()='Reset Password'])[1]")

	private WebElement resetpassword;

	public WebElement getresetpassword() {

		return resetpassword;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div/div[3]")

	private WebElement backtologin;

	public WebElement getbacktologin() {

		return backtologin;
	}

	@FindBy(xpath = "(//a[normalize-space()='sign Up'])[1]")

	private WebElement signupbtn;

	public WebElement getsignupbtn() {

		return signupbtn;
	}

	///////////////////// Patient ///////////////////////

	@FindBy(xpath = "(//button[normalize-space()='Login'])[1]")

	private WebElement ClickLogin;

	public WebElement getClickLogin() {

		return ClickLogin;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/div")

	private WebElement clickselect;

	public WebElement getclickselect() {

		return clickselect;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[1]/nav/ul/li[2]/a/p")

	private WebElement patientmenu;

	public WebElement getpatientmenu() {

		return patientmenu;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[1]/div[1]/input")

	private WebElement Searchpatient;

	public WebElement getSearchpatient() {

		return Searchpatient;
	}
	
	@FindBy(xpath = "//td[contains(text(),'maran dasd')]")

	private WebElement selectpatient;

	public WebElement getselectpatient() {

		return selectpatient;
	}
	
	@FindBy(xpath = "//td[contains(text(),'Cathenna Heera')]")

	private WebElement selectpatientnew;

	public WebElement getselectpatientnew() {

		return selectpatientnew;
	}

	@FindBy(xpath = "(//td[normalize-space()='ram d'])[1]")

	private WebElement selectpatient1;

	public WebElement getselectpatient1() {

		return selectpatient1;
	}
	// enrolment

	@FindBy(xpath = "(//a[normalize-space()='Patient Enrollment'])[1]")

	private WebElement patientenrolment;

	public WebElement getpatientenrolment() {

		return patientenrolment;
	}

	// clcik Patient

	// click list

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[3]/div/a[4]")

	private WebElement selectlsit;

	public WebElement getselectlsit() {

		return selectlsit;
	}

	// search patient

	// click The export csv

	@FindBy(xpath = "(//button[normalize-space()='Export csv'])[1]")

	private WebElement clickexportcsv;

	public WebElement getclickexportcsv() {

		return clickexportcsv;
	}

	/////////// patient demographics ///////////

	// select patient

	// click demographics

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[17]")

	private WebElement demograpicsbtn;

	public WebElement getdemograpicsbtn() {

		return demograpicsbtn;
	}

	// upload img

	@FindBy(xpath = "(//button[normalize-space()='Upload Photo'])[1]")

	private WebElement uploadimagebtn;

	public WebElement getuploadimagebtn() {

		return uploadimagebtn;
	}

	// choose send img

	@FindBy(xpath = "(//input[@type='file'])[1]")

	private WebElement choosefile;

	public WebElement getchoosefile() {

		return choosefile;
	}

	// cancel

	@FindBy(xpath = "//*[@id='patdemomodal']/div/div/div[4]/div/div/div[3]/button[1]")

	private WebElement canceloption;

	public WebElement getcanceloption() {

		return canceloption;
	}

	// dateofbirth

	@FindBy(xpath = "(//input[@id='date'])[1]")

	private WebElement senddateofbirth;

	public WebElement getsenddateofbirth() {

		return senddateofbirth;
	}

	// gender

	@FindBy(xpath = "//*[@id='patdemomodal']/div/div/div[2]/div[3]/div[2]/div/div")

	private WebElement genderdropdown;

	public WebElement getgenderdropdown() {

		return genderdropdown;
	}

	// wrong email

	// already enterd email

	@FindBy(xpath = "(//input[@name='emailId'])[1]")

	private WebElement enteremail;

	public WebElement getenteremail() {

		return enteremail;
	}

	// wrong phon numb

	@FindBy(xpath = "(//input[@name='phoneNumber'])[1]")

	private WebElement enterphonenumber;

	public WebElement getenterphonenumber() {

		return enterphonenumber;
	}

	// save demograhics

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")

	private WebElement savedemograpics;

	public WebElement getsavedemograpics() {

		return savedemograpics;
	}
	
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[19]")

	private WebElement canceldemograpics;

	public WebElement getcanceldemograpics() {

		return canceldemograpics;
	}

	////// Reading data ////////////

	/// heart rate
	// heart rate

	@FindBy(xpath = "(//button[normalize-space()='Heart Rate'])[1]")

	private WebElement heartrate;

	public WebElement getheartrate() {

		return heartrate;
	}

	// selct dropdown month

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[3]/div/div[2]/div/div[1]/div")

	private WebElement monthdropdown;

	public WebElement getmonthdropdown() {

		return monthdropdown;
	}

	// selct dropdown month

	@FindBy(xpath = "(//label[contains(text(),'October 2023')])[1]")

	private WebElement selectmonth;

	public WebElement getselectmonth() {

		return selectmonth;
	}

	// selct dropdown week

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Month'])[1]")

	private WebElement chooseweekdropdown;

	public WebElement getchooseweekdropdown() {

		return chooseweekdropdown;
	}

	// selct dropdown week

	@FindBy(xpath = "(//label[@value='week'][normalize-space()='Week'])[1]")

	private WebElement selectweek;

	public WebElement getselectweek() {

		return selectweek;
	}

	///// blood pressure ///////////

	// blood pressure ///////

	@FindBy(xpath = "(//button[normalize-space()='Blood Pressure'])[1]")

	private WebElement bloodpressure;

	public WebElement getbloodpressure() {

		return bloodpressure;
	}

	// selct dropdown month

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div")

	private WebElement monthdropdownbp;

	public WebElement getmonthdropdownbp() {

		return monthdropdownbp;
	}

	// selct dropdown month

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[3]/div/div[3]/div/div[1]/div[2]/label[1]")

	private WebElement selectmonthbp;

	public WebElement getselectmonthbp() {

		return selectmonthbp;
	}

	// selct dropdown week

	@FindBy(xpath = "(//div[contains(text(),'Week')])[2]")

	private WebElement chooseweekdropdownbp;

	public WebElement getchooseweekdropdownbp() {

		return chooseweekdropdown;
	}

	// selct dropdown week

	@FindBy(xpath = "(//label[@value='month'][normalize-space()='Month'])[2]")

	private WebElement selectweekbp;

	public WebElement getselectweekbp() {

		return selectweekbp;
	}

	// oxygen ///////////////

	@FindBy(xpath = "(//button[normalize-space()='Oxygen'])[1]")

	private WebElement oxygen;

	public WebElement getoxygen() {

		return oxygen;
	}

	// selct dropdown month

	@FindBy(xpath = "(//div[@name='view_drop'][normalize-space()='Week'])[3]")

	private WebElement monthdropdownoxy;

	public WebElement getmonthdropdownoxy() {

		return monthdropdownoxy;
	}

	// selct dropdown month

	@FindBy(xpath = "(//label[@value='month'][normalize-space()='Month'])[3]")

	private WebElement selectmonthoxy;

	public WebElement getselectmonthoxy() {

		return selectmonthoxy;
	}

	// selct dropdown week

	@FindBy(xpath = "(//div[@name='value_drop'][normalize-space()='October 2023'])[3]")

	private WebElement chooseweekdropdownoxy;

	public WebElement getchooseweekdropdownoxy() {

		return chooseweekdropdownoxy;
	}

	// selct dropdown week

	@FindBy(xpath = "(//label[@value='week'][normalize-space()='Week'])[1]")

	private WebElement selectweekoxy;

	public WebElement getselectweekoxy() {

		return selectweekoxy;
	}

	/////////////// Add Devices /////////////

	// selct dropdown week

	@FindBy(xpath = "(//*[name()='path'])[9]")

	private WebElement adddevice;

	public WebElement getadddevice() {

		return adddevice;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Devices'])[1]")

	private WebElement adddevicedate;

	public WebElement getadddevicedate() {

		return adddevicedate;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Devices'])[1]")

	private WebElement adddevicesave;

	public WebElement getadddevicesave() {

		return adddevicesave;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div/div[3]/div[2]/button[1]")

	private WebElement adddevicecancel;

	public WebElement getadddevicecancel() {

		return adddevicecancel;
	}

	/////////////////// Encounter ////////////

	@FindBy(xpath = "(//button[normalize-space()='Visit Encounter'])[1]")

	private WebElement visitencounter;

	public WebElement getvisitencounter() {

		return visitencounter;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[21]")

	private WebElement clicknotes;

	public WebElement getclicknotes() {

		return clicknotes;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[4]/div/div/div[2]/div[1]/div/label[2]")

	private WebElement addnotesdate;

	public WebElement getaddnotesdate() {

		return addnotesdate;
	}

	@FindBy(xpath = "(//button[normalize-space()='Phone Call'])[1]")

	private WebElement addnotesphonecall;

	public WebElement getaddnotesphonecall() {

		return addnotesphonecall;
	}

	@FindBy(xpath = "(//button[normalize-space()='Return Call'])[1]")

	private WebElement addnotesactivity;

	public WebElement getaddnotesactivity() {

		return addnotesactivity;
	}

	@FindBy(xpath = "(//input[@placeholder='Others'])[1]")

	private WebElement timespent;

	public WebElement gettimespent() {

		return timespent;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[4]/div/div/div[3]/div/div[1]/button[2]")

	private WebElement confirm;

	public WebElement getconfirm() {

		return confirm;
	}

	@FindBy(xpath = "(//*[name()='path'])[35]")

	private WebElement deleteencounter;

	public WebElement getdeleteencounter() {

		return deleteencounter;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Encounter'])[1]")

	private WebElement addencounter;

	public WebElement getaddencounter() {

		return addencounter;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/button")

	private WebElement encounterprovider;

	public WebElement getencounterprovider() {

		return encounterprovider;
	}

	@FindBy(xpath = "(//li[contains(text(),'Steve')])[1]")

	private WebElement encounterproviderselect;

	public WebElement getencounterproviderselect() {

		return encounterproviderselect;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[3]/div/button[2]/p")

	private WebElement saveencounter;

	public WebElement getsaveencounter() {

		return saveencounter;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[20]")

	private WebElement clickdropdown;

	public WebElement getclickdropdown() {

		return clickdropdown;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[1]/div[1]/div[2]/button[1]")

	private WebElement clickedit;

	public WebElement getclickedit() {

		return clickedit;
	}

	@FindBy(xpath = "(//button[normalize-space()='View Details'])[1]")

	private WebElement addnotesedit;

	public WebElement getaddnotesedit() {

		return addnotesedit;
	}

	// save

	@FindBy(xpath = "(//button[normalize-space()='Visit Encounter'])[1]")

	private WebElement visitencountermonth;

	public WebElement getvisitencountermonth() {

		return visitencountermonth;
	}

	@FindBy(xpath = "(//td[normalize-space()='1 Month'])[1]")

	private WebElement duration;

	public WebElement getduration() {

		return duration;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[22]")

	private WebElement lock;

	public WebElement getlock() {

		return lock;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[1]/button")

	private WebElement viewdetails;

	public WebElement getviewdetails() {

		return viewdetails;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div/div[3]/div[1]/div[1]/div/div")

	private WebElement selectactivity;

	public WebElement getselectactivity() {

		return selectactivity;
	}

	@FindBy(xpath = "(//input[@id='date'])[1]")

	private WebElement fromdate;

	public WebElement getfromdate() {

		return fromdate;
	}

	@FindBy(xpath = "(//input[@id='date'])[2]")

	private WebElement todate;

	public WebElement gettodate() {

		return todate;
	}

	@FindBy(xpath = "(//*[name()='path'])[3]")

	private WebElement clickdropdownvisithistory;

	public WebElement getclickdropdownvisithistory() {

		return clickdropdownvisithistory;
	}

	@FindBy(xpath = "(//*[name()='path'])[1]")

	private WebElement cancelvisithistory;

	public WebElement getcancelvisithistory() {

		return cancelvisithistory;
	}

	/////////////////////////////// Live ///////////////

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[3]")

	private WebElement clicklive;

	public WebElement getclicklive() {

		return clicklive;
	}

	@FindBy(xpath = "(//input[@placeholder='Search for Patient'])[1]")

	private WebElement searchpatient;

	public WebElement getsearchpatient() {

		return searchpatient;
	}

	@FindBy(xpath = "(//input[@placeholder='Select Vitals'])[1]")

	private WebElement selectvitals;

	public WebElement getselectvitals() {

		return selectvitals;
	}

	@FindBy(xpath = "(//p[normalize-space()='Respiration Rate'])[1]")

	private WebElement clickvitals;

	public WebElement getclickvitals() {

		return clickvitals;
	}

	@FindBy(xpath = "(//button[normalize-space()='Export csv'])[1]")

	private WebElement exportcsv;

	public WebElement getexportcsv() {

		return exportcsv;
	}
	
	////////////////////// roles and Permission /////////////////
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[7]")

	private WebElement clicksetting;

	public WebElement getclicksetting() {

		return clicksetting;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Roles & Permission'])[1]")

	private WebElement selectrolesandpermission;

	public WebElement getselectrolesandpermission() {

		return selectrolesandpermission;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Roles & Permission'])[1]")

	private WebElement rolesandpermssiontitle;

	public WebElement getrolesandpermssiontitle() {

		return rolesandpermssiontitle;
	}
	
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div/div[2]/div[1]/div[2]/table/tbody/tr[1]/td[3]/button[2]/p")

	private WebElement customizerole;

	public WebElement getcustomizerole() {

		return customizerole;
	}
	
	

	@FindBy(xpath = "(//input[@type='checkbox'])[9]")

	private WebElement checkbox;

	public WebElement getcheckbox() {

		return checkbox;
	}
	
	
	@FindBy(xpath = "(//p[@class='sc-kDDrLX dEygV'][normalize-space()='Cancel'])[3]")

	private WebElement cancelrole;

	public WebElement getcancelrole() {

		return cancelrole;
	}
	
	
	/////////////////////////// Documents Negatice ////////////////////
	
	
	@FindBy(xpath = "(//a[normalize-space()='Documents'])[1]")

	private WebElement documentsclick;

	public WebElement getdocumentsclick() {

		return documentsclick;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Upload Practice Logo'])[1]")

	private WebElement uploadlogo;

	public WebElement getuploadlogo() {

		return uploadlogo;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div/div/div[3]/button[1]")

	private WebElement fileupload;

	public WebElement getfileupload() {

		return fileupload;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Done'])[1]")

	private WebElement doneoption;

	public WebElement getdoneoption() {

		return doneoption;
	}
	
	///////////////////////// Users ////////////////////
	
	@FindBy(xpath = "(//a[normalize-space()='User'])[1]")

	private WebElement Usersoption;

	public WebElement getUsersoption() {

		return Usersoption;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Add User'])[1]")

	private WebElement adduser;

	public WebElement getadduser() {

		return adduser;
	}
	
	
	@FindBy(xpath = "(//input[@id='uname'])[1]")

	private WebElement sendusername;

	public WebElement getsendusername() {

		return sendusername;
	}
	
	
	@FindBy(xpath = "(//input[@type='checkbox'])[1]")

	private WebElement checkforprovider;

	public WebElement getcheckforprovider() {

		return checkforprovider;
	}
	
	@FindBy(xpath = "(//input[@id='date'])[1]")

	private WebElement expieationdate;

	public WebElement getexpieationdate() {

		return expieationdate;
	}
	
	@FindBy(xpath = "(//p[normalize-space()='Close'])[1]")

	private WebElement closeuser;

	public WebElement getcloseuser() {

		return closeuser;
	}
	
	////////////// Staff  ///////////////////
	
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div/div[2]/div[2]")

	private WebElement clickstaff;

	public WebElement getclickstaff() {

		return clickstaff;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Add Staff'])[1]")

	private WebElement addstaff;

	public WebElement getaddstaff() {

		return addstaff;
	}

	
	@FindBy(xpath = "//*[@id='modaldialog']/form/div[2]/div[2]/div[2]/div/button/p")

	private WebElement primaryrole;

	public WebElement getprimaryrole() {

		return primaryrole;
	}
	
	
	@FindBy(xpath = "(//input[@id='email'])[1]")

	private WebElement emaialaddress;

	public WebElement getemaialaddress() {

		return emaialaddress;
	}
	
	@FindBy(xpath = "(//input[@id='homephone'])[1]")

	private WebElement phonenumber;

	public WebElement getphonenumber() {

		return phonenumber;
	}
	
	
	@FindBy(xpath = "(//input[@id='uname'])[1]")

	private WebElement usernameenter;

	public WebElement getusernameenter() {

		return usernameenter;
	}
	
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[17]")

	private WebElement passwordeyesymbol;

	public WebElement getpasswordeyesymbol() {

		return passwordeyesymbol;
	}
	
	
	@FindBy(xpath = "(//p[normalize-space()='Close'])[1]")

	private WebElement closestaff;

	public WebElement getclosestaff() {

		return closestaff;
	}
	
	
	//////////////////////////////// Add Device ////////////////
	
	
	@FindBy(xpath = "(//*[name()='path'])[9]")

	private WebElement clickdevice;

	public WebElement getclickdevice() {

		return clickdevice;
	}
	
	
	@FindBy(xpath = "(//a[normalize-space()='2'])[1]")

	private WebElement clicksecondlist;

	public WebElement getclicksecondlist() {

		return clicksecondlist;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[1]/div[1]/div/div[1]/div/div/p")

	private WebElement clicksecondlist1;

	public WebElement getclicksecondlist1() {

		return clicksecondlist1;
	}

	
	@FindBy(xpath = "(//input[@placeholder='Search by Devices'])[1]")

	private WebElement searchdevice;

	public WebElement getsearchdevice() {

		return searchdevice;
	}
	
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[3]/div[1]/table/tbody/tr[1]/td[8]/span")

	private WebElement statusview;

	public WebElement getstatusview() {

		return statusview;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Add Devices'])[1]")

	private WebElement adddevices;

	public WebElement getadddevices() {

		return adddevices;
	}
	
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div/div[3]/div[2]/button[1]")

	private WebElement canceldevice;

	public WebElement getcanceldevice() {

		return canceldevice;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/div[2]")

	private WebElement clickactive;

	public WebElement getclickactive() {

		return clickactive;
	}
	
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[3]/div[1]/table/thead/tr/th[7]")

	private WebElement lastdatesync;

	public WebElement getlastdatesync() {

		return lastdatesync;
	}

}
