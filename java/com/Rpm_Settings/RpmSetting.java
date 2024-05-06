package com.Rpm_Settings;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class RpmSetting {

	public WebDriver driver;

	public RpmSetting(WebDriver driver2) {
		// TODO Auto-generated constructor stub

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	//////////////////////////////////////////////////////

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
	private WebElement clicklogin;

	public WebElement getclicklogin() {

		return clicklogin;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[7]")
	private WebElement clicksetting;

	public WebElement getclicksetting() {

		return clicksetting;
	}

	@FindBy(xpath = "(//a[normalize-space()='My Profile'])[1]")
	private WebElement selectmyprofile;

	public WebElement getselectmyprofile() {

		return selectmyprofile;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[1]/div[1]")
	private WebElement presonalclick;

	public WebElement getpresonalclick() {

		return presonalclick;
	}

	@FindBy(xpath = "(//label[normalize-space()='My Profile'])[1]")
	private WebElement myprofiletitle;

	public WebElement getmyprofiletitle() {

		return myprofiletitle;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[1]/img[2]")
	private WebElement selectimage;

	public WebElement getselectimage() {

		return selectimage;
	}

	@FindBy(xpath = "(//input[@type='file'])[1]")
	private WebElement uploadimage;

	public WebElement getuploadimage() {

		return uploadimage;
	}

	@FindBy(xpath = "(//button[normalize-space()='Done'])[1]")
	private WebElement clickdone;

	public WebElement getclickdone() {

		return clickdone;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[2]/div[1]/input")
	private WebElement Firstname;

	public WebElement getFirstname() {

		return Firstname;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[2]/div[2]/input")
	private WebElement lastname;

	public WebElement getlastname() {

		return lastname;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[3]/div[1]/input")
	private WebElement middlename;

	public WebElement getmiddlename() {

		return middlename;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[3]/div[2]/input")
	private WebElement suffix;

	public WebElement getsuffix() {

		return suffix;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[7]/input")
	private WebElement sendemail;

	public WebElement getsendemail() {

		return sendemail;
	}

	@FindBy(xpath = "(//input[@value='3123123'])[1]")
	private WebElement sendphone;

	public WebElement getsendphone() {

		return sendphone;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[10]/input")
	private WebElement sendnewpassword;

	public WebElement getsendnewpassword() {

		return sendnewpassword;
	}

	@FindBy(xpath = "(//input[@type='text'])[2]")
	private WebElement clearnewpassword;

	public WebElement getclearnewpassword() {

		return clearnewpassword;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div[11]/input")
	private WebElement sendconfirmnewpassword;

	public WebElement getsendconfirmnewpassword() {

		return sendconfirmnewpassword;
	}

	@FindBy(xpath = "(//input[@type='password'])[4]")
	private WebElement clearconfirmnewpassword;

	public WebElement getclearconfirmnewpassword() {

		return clearconfirmnewpassword;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement clicksave;

	public WebElement getclicksave() {

		return clicksave;
	}

	/////////////////// Clinical /////////////////////////
	
	@FindBy(xpath = "(//label[normalize-space()='My Profile'])[1]")
	private WebElement myprofile;

	public WebElement getmyprofile() {

		return myprofile;
	}

	@FindBy(xpath = "//div[contains(text(),'Clinical')]")
	private WebElement clickclinical;

	public WebElement getclickclinical() {

		return clickclinical;
	}

	@FindBy(xpath = "(//div[normalize-space()='SLP'])[1]")
	private WebElement licensetype;

	public WebElement getlicensetype() {

		return licensetype;
	}

	@FindBy(xpath = "(//label[normalize-space()='LMFT'])[1]")
	private WebElement licensetypeselect;

	public WebElement getlicensetypeselect() {

		return licensetypeselect;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div/div[1]/div[1]/div[1]/div[2]/input")
	private WebElement licensenumber;

	public WebElement getlicensenumber() {

		return licensenumber;
	}

	@FindBy(xpath = "(//*[@id='date'])[1]")
	private WebElement licenseexpires;

	public WebElement getlicenseexpires() {

		return licenseexpires;
	}

	@FindBy(xpath = "(//div[normalize-space()='AR'])[1]")
	private WebElement licensestate;

	public WebElement getlicensestate() {

		return licensestate;
	}

	@FindBy(xpath = "(//label[normalize-space()='AL'])[1]")
	private WebElement licensestateselect;

	public WebElement getlicensestateselect() {

		return licensestateselect;
	}

	@FindBy(xpath = "(//button[normalize-space()='+ Add Licenses'])[1]")
	private WebElement addlicense;

	public WebElement getaddlicense() {

		return addlicense;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[17]")
	private WebElement deletelisence;

	public WebElement getdeletelisence() {

		return deletelisence;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div/div[5]/div[1]/input")
	private WebElement npinumber;

	public WebElement getnpinumber() {

		return npinumber;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div/div[4]/div[2]/div")
	private WebElement Speciality;

	public WebElement getSpeciality() {

		return Speciality;
	}

	@FindBy(xpath = "(//label[normalize-space()='Behavioral health therapy'])[1]")
	private WebElement selectSpeciality;

	public WebElement getselectSpeciality() {

		return selectSpeciality;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[3]/div/div[2]/div/div[5]/input")
	private WebElement TaxonomyCode;

	public WebElement getTaxonomyCode() {

		return TaxonomyCode;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement saveclinical;

	public WebElement getsaveclinical() {

		return saveclinical;
	}

	/////////////// Roles and Permission ////////////

	@FindBy(xpath = "(//a[normalize-space()='Roles & Permission'])[1]")
	private WebElement clickrolesandpermission;

	public WebElement getclickrolesandpermission() {

		return clickrolesandpermission;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Roles And Permissions'])[1]")
	private WebElement rolesandpermissiontitle;

	public WebElement getrolesandpermissiontitle() {

		return rolesandpermissiontitle;
	}

	@FindBy(xpath = "(//p[contains(text(),'Edit')])[1]")
	private WebElement Editrolesandpermission;

	public WebElement getEditrolesandpermission() {

		return Editrolesandpermission;
	}

	@FindBy(xpath = "(//div[@name='status_View'])[1]")
	private WebElement Rolesdropdown;

	public WebElement getRolesdropdown() {

		return Rolesdropdown;
	}
	
	@FindBy(xpath = "(//div[@placeholder='Administrator'])[1]")
	private WebElement Rolesdropdown1;

	public WebElement getRolesdropdown1() {

		return Rolesdropdown1;
	}

	@FindBy(xpath = "(//label[@value='Administrator'][normalize-space()='Administrator'])[1]")
	private WebElement selectrole;

	public WebElement getselectrole() {

		return selectrole;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement selectpermission;

	public WebElement getselectpermission() {

		return selectpermission;
	}

	@FindBy(xpath = "(//p[normalize-space()='Save Permission'])[1]")
	private WebElement savepermission;

	public WebElement getsavepermission() {

		return savepermission;
	}

	@FindBy(xpath = "(//p[contains(text(),'Cancel')])[2]")
	private WebElement cancelpermission;

	public WebElement getcancelpermission() {

		return cancelpermission;
	}

	@FindBy(xpath = "(//p[contains(text(),'Customize role')])[1]")
	private WebElement clickcustomizerole;

	public WebElement getclickcustomizerole() {

		return clickcustomizerole;
	}

	@FindBy(xpath = "(//input[@placeholder='Name of the Role'])[1]")

	private WebElement sendname;

	public WebElement getsendname() {

		return sendname;
	}

	@FindBy(xpath = "(//input[@placeholder='Description of the role'])[1]")

	private WebElement senddescription;

	public WebElement getsenddescription() {

		return senddescription;
	}

	@FindBy(xpath = "(//p[normalize-space()='Save'])[1]")

	private WebElement saverole;

	public WebElement getsaverole() {

		return saverole;
	}

	@FindBy(xpath = "(//p[contains(text(),'Cancel')])[3]")

	private WebElement cancelrole;

	public WebElement getcancelrole() {

		return cancelrole;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div/div[1]/div[2]")
	private WebElement clcikstaff;

	public WebElement getclcikstaff() {

		return clcikstaff;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div/div[1]/div[3]")
	private WebElement clickroles;

	public WebElement getclickroles() {

		return clickroles;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div/div[2]/div[1]/div[1]/div/button/p")
	private WebElement Addroles;

	public WebElement getAddroles() {

		return Addroles;
	}

	@FindBy(xpath = "(//input[@placeholder='Name of the Role'])[1]")
	private WebElement Addnamerole;

	public WebElement getAddnamerole() {

		return Addnamerole;
	}

	@FindBy(xpath = "(//input[@placeholder='Description of the role'])[1]")
	private WebElement Adddescriptionrole;

	public WebElement getAdddescriptionrole() {

		return Adddescriptionrole;
	}

	@FindBy(xpath = "(//p[normalize-space()='Save'])[1]")
	private WebElement saveroles;

	public WebElement getsaveroles() {

		return saveroles;
	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX dEygV'][normalize-space()='Cancel'])[2]")
	private WebElement cancelroles;

	public WebElement getcancelroles() {

		return cancelroles;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[16]")
	private WebElement editrole;

	public WebElement geteditrole() {

		return editrole;
	}

	@FindBy(xpath = "(//p[contains(text(),'Cancel')])[2]")
	private WebElement closeedit;

	public WebElement getcloseedits() {

		return closeedit;
	}

	@FindBy(xpath = "(//div[contains(text(),'Permissions')])")
	private WebElement clickpermission;

	public WebElement getclickpermission() {

		return clickpermission;
	}
	////////////////// Security /////////////////

	@FindBy(xpath = "(//a[normalize-space()='Security'])[1]")

	private WebElement clicksecurity;

	public WebElement getclicksecurity() {

		return clicksecurity;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Security'])[1]")

	private WebElement securitytitle;

	public WebElement getsecuritytitle() {

		return securitytitle;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/form/div/div[1]/div[1]/input")

	private WebElement passwordexpire;

	public WebElement getpasswordexpire() {

		return passwordexpire;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/form/div/div[2]/div[1]/input")

	private WebElement passwordexpiregraceperiod;

	public WebElement getpasswordexpiregraceperiod() {

		return passwordexpiregraceperiod;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/form/div/div[5]/div[1]/input")

	private WebElement passwordlength;

	public WebElement getpasswordlength() {

		return passwordlength;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/form/div/div[6]/div[1]/input")

	private WebElement passwordidletime;

	public WebElement getpasswordidletime() {

		return passwordidletime;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/form/div/div[6]/div[1]/input")

	private WebElement savesecurity;

	public WebElement getsavesecurity() {

		return savesecurity;
	}

	/////////////////////////// Documents ///////////////

	@FindBy(xpath = "(//a[normalize-space()='Documents'])[1]")

	private WebElement clickdocuments;

	public WebElement getclickdocuments() {

		return clickdocuments;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Documents'])[1]")

	private WebElement documentstitle;

	public WebElement getdocumentstitles() {

		return documentstitle;
	}

	@FindBy(xpath = "(//button[normalize-space()='Upload Practice Logo'])[1]")

	private WebElement uploadlogo;

	public WebElement getuploadlogo() {

		return uploadlogo;
	}

	@FindBy(xpath = "(//input[@type='file'])[1]")

	private WebElement sendimage;

	public WebElement getsendimage() {

		return sendimage;
	}

	@FindBy(xpath = "(//button[normalize-space()='Done'])[1]")

	private WebElement clickdoneimage;

	public WebElement getclickdoneimage() {

		return clickdoneimage;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")

	private WebElement invoiceradio;

	public WebElement getinvoiceradio() {

		return invoiceradio;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[1]/div[2]/div[2]/textarea")

	private WebElement footerinvoice;

	public WebElement getfooterinvoice() {

		return footerinvoice;
	}

	@FindBy(xpath = "(//button[contains(text(),'Edit')])[2]")

	private WebElement editinvoice1;

	public WebElement geteditinvoice1() {

		return editinvoice1;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[1]/div[4]/div[5]/div[1]/button")

	private WebElement editinvoice2;

	public WebElement geteditinvoice2() {

		return editinvoice2;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[1]")

	private WebElement clinicianmacro1;

	public WebElement getclinicianmacro1() {

		return clinicianmacro1;
	}

	@FindBy(xpath = "(//label[normalize-space()='Clinician Full Name'])[1]")

	private WebElement selectclinicianmacro1;

	public WebElement getselectclinicianmacro1() {

		return selectclinicianmacro1;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[2]")

	private WebElement practicemacro1;

	public WebElement getpracticemacro1() {

		return practicemacro1;
	}

	@FindBy(xpath = "(//label[normalize-space()='Practice Name'])[1]")

	private WebElement selectpracticemacro1;

	public WebElement getselectpracticemacro1() {

		return selectpracticemacro1;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[3]")

	private WebElement clientmacro1;

	public WebElement getclientmacro1() {

		return clientmacro1;
	}

	@FindBy(xpath = "(//label[normalize-space()='Client Full Name'])[1]")

	private WebElement selectclientmacro1;

	public WebElement getselectclientmacro1() {

		return selectclientmacro1;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[4]")

	private WebElement linkmacro1;

	public WebElement getlinkmacro1() {

		return linkmacro1;
	}

	@FindBy(xpath = "(//label[normalize-space()='Client Portal Login Link'])[1]")

	private WebElement selectlinkmacro1;

	public WebElement getselectlinkmacro1() {

		return selectlinkmacro1;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/input")

	private WebElement sendsubject1;

	public WebElement getsendsubject1() {

		return sendsubject1;
	}

	@FindBy(xpath = "(//textarea[@id='mailmessage'])[1]")

	private WebElement sendmessage1;

	public WebElement getsendmessage1() {

		return sendmessage1;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div/div[3]/button[2]/p")

	private WebElement savemessage1;

	public WebElement getsavemessage1() {

		return savemessage1;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[6]")

	private WebElement documentradio;

	public WebElement getdocumentradio() {

		return documentradio;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Save Document'])[1]")

	private WebElement savedocument;

	public WebElement getsavedocument() {

		return savedocument;
	}
	
	@FindBy(xpath = "(//p[normalize-space()='Close'])[1]")

	private WebElement cancelmessage1;

	public WebElement getcancelmessage1() {

		return cancelmessage1;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")

	private WebElement statementradio;

	public WebElement getstatementradio() {

		return statementradio;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")

	private WebElement superbilllogo;

	public WebElement getsuperbilllogo() {

		return superbilllogo;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[4]")

	private WebElement signatureline;

	public WebElement getsignatureline() {

		return signatureline;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[5]")

	private WebElement Diagnosis;

	public WebElement getDiagnosis() {

		return Diagnosis;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[1]/div[2]/div[3]/div[1]/button")

	private WebElement editinvoice;

	public WebElement geteditinvoice() {

		return editinvoice;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[1]")

	private WebElement clinicianmacro;

	public WebElement getclinicianmacro() {

		return clinicianmacro;
	}

	@FindBy(xpath = "(//label[normalize-space()='Clinician Full Name'])[1]")

	private WebElement selectclinicianmacro;

	public WebElement getselectclinicianmacro() {

		return selectclinicianmacro;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[2]")

	private WebElement practicemacro;

	public WebElement getpracticemacro() {

		return practicemacro;
	}

	@FindBy(xpath = "(//label[normalize-space()='Practice Name'])[1]")

	private WebElement selectpracticemacro;

	public WebElement getselectpracticemacro() {

		return selectpracticemacro;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[3]")

	private WebElement clientmacro;

	public WebElement getclientmacro() {

		return clientmacro;
	}

	@FindBy(xpath = "(//label[normalize-space()='Client Full Name'])[1]")

	private WebElement selectclientmacro;

	public WebElement getselectclientmacro() {

		return selectclientmacro;
	}

	@FindBy(xpath = "(//div[@id='mypf_pat-mri_sta'])[4]")

	private WebElement linkmacro;

	public WebElement getlinkmacro() {

		return linkmacro;
	}

	@FindBy(xpath = "(//label[normalize-space()='Client Portal Login Link'])[1]")

	private WebElement selectlinkmacro;

	public WebElement getselectlinkmacro() {

		return selectlinkmacro;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div/div[2]/div[3]/input")

	private WebElement sendsubject;

	public WebElement getsendsubject() {

		return sendsubject;
	}

	@FindBy(xpath = "(//textarea[@id='mailmessage'])[1]")

	private WebElement sendmessage;

	public WebElement getsendmessage() {

		return sendmessage;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div/div[3]/button[2]/p")

	private WebElement savemessage;

	public WebElement getsavemessage() {

		return savemessage;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/div/div/div[3]/button[1]/p")

	private WebElement cancelmessage;

	public WebElement getcancelmessage() {

		return cancelmessage;
	}

	@FindBy(xpath = "(//button[normalize-space()='Save Document'])[1]")

	private WebElement savedocuments;

	public WebElement getsavedocuments() {

		return savedocuments;
	}

}
