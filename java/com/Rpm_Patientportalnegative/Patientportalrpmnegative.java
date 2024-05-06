package com.Rpm_Patientportalnegative;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Patientportalrpmnegative {
	public WebDriver driver;


	public Patientportalrpmnegative(WebDriver driver2) {
		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}
	///////// Negative Patient portal //////////
	
	
	
	@FindBy(xpath = "(//img[@alt='Sign-Up Image'])[1]")
	private WebElement iamnewclient;

	public WebElement getiamnewclient() {

		return iamnewclient;
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
	
	
	@FindBy(xpath = "(//input[@class='sc-kLLXSd jPrSuI'])[1]")
	private WebElement enterotp;

	public WebElement getenterotp() {

		return enterotp;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Verify Account'])[1]")
	private WebElement verifyaccount;

	public WebElement getverifyaccount() {

		return verifyaccount;
	}
	
	
	@FindBy(xpath = "(//label[normalize-space()='otp is inValid'])[1]")
	private WebElement otpinvalid;

	public WebElement getotpinvalid() {

		return otpinvalid;
	}
	
	
	/////  Press Back ///
	
	
	@FindBy(xpath = "(//img[@id='wel_img-ext'])[1]")
	private WebElement existingclient;

	public WebElement getexistingclient() {

		return existingclient;
	}
	
	@FindBy(xpath = "(//input[@id='sig_emil-inp_ent'])[1]")
	private WebElement enteremail1;

	public WebElement getenteremail1() {

		return enteremail1;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Continue'])[1]")
	private WebElement continue1;

	public WebElement getcontinue1() {

		return continue1;
	}
	
	@FindBy(xpath = "(//input[@id='log_mail-inp_adr'])[1]")
	private WebElement enteremailsigin;

	public WebElement getenteremailsigin() {

		return enteremailsigin;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Log in'])[1]")
	private WebElement presslogin;

	public WebElement getpresslogin() {

		return presslogin;
	}

	@FindBy(xpath = "(//label[normalize-space()='Please enter the password'])[1]")
	private WebElement enterpasswordvalidation;

	public WebElement getenterpasswordvalidation() {

		return enterpasswordvalidation;
	}
	
	
	@FindBy(xpath = "(//label[normalize-space()='Please enter the password'])[1]")
	private WebElement forgotpassword;

	public WebElement getforgotpassword() {

		return forgotpassword;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Enter Email'])[1]")
	private WebElement forgotpasswordemail;

	public WebElement getforgotpasswordemail() {

		return forgotpasswordemail;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Send Verification Code'])[1]")
	private WebElement sendverficationcode;

	public WebElement getsendverficationcode() {

		return sendverficationcode;
	}
	
	@FindBy(xpath = "(//a[normalize-space()='Login'])[1]")
	private WebElement loginbtn;

	public WebElement getloginbtn() {

		return loginbtn;
	}
	
	@FindBy(xpath = "(//input[@id='log_mail-inp_adr'])[1]")
	private WebElement enteremailsigin1;

	public WebElement getenteremailsigin1() {

		return enteremailsigin1;
	}
	
	@FindBy(xpath = "(//input[@id='log_psw-inp_adr'])[1]")
	private WebElement enterpassword1;

	public WebElement getenterpassword1() {

		return enterpassword1;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Log in'])[1]")
	private WebElement presslogin1;

	public WebElement getpresslogin1() {

		return presslogin1;
	}
	
	@FindBy(xpath = "(//div[@class='sc-olbas bslkVH'])[1]")
	private WebElement pressmyprofile;

	public WebElement getpressmyprofile() {

		return pressmyprofile;
	}
	
	@FindBy(xpath = "(//div[@class='sc-olbas bslkVH'])[1]")
	private WebElement selectmyprofile;

	public WebElement getselectmyprofile() {

		return selectmyprofile;
	}
	
	@FindBy(xpath = "(//input[@id='date'])[1]")
	private WebElement dateofbirth;

	public WebElement getdateofbirth() {

		return dateofbirth;
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
	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement savemyprofile;

	public WebElement getsavemyprofile() {

		return savemyprofile;
	}
	

}
