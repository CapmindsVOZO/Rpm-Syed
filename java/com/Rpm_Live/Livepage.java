package com.Rpm_Live;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Livepage {

	public WebDriver driver;

	public Livepage(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[10]")
	private WebElement clicklive;

	public WebElement getclicklive() {

		return clicklive;
	}

	////////// Live Page //////////////////
	
	
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

	@FindBy(xpath = "(//h1[normalize-space()='Live'])[1]")
	private WebElement verifylivetitle;

	public WebElement getverifylivetitle() {

		return verifylivetitle;
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

	@FindBy(xpath = "(//input[@type='checkbox'])[1]")
	private WebElement selectheartrate;

	public WebElement getselectheartrate() {

		return selectheartrate;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[2]")
	private WebElement selectrespirationrate;

	public WebElement getselectrespirationrate() {

		return selectrespirationrate;
	}

	@FindBy(xpath = "(//input[@type='checkbox'])[3]")
	private WebElement selectbloodpressure;

	public WebElement getselectbloodpressure() {

		return selectbloodpressure;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Export csv'])[1]")
	private WebElement exportcsv;

	public WebElement getexportcsv() {

		return exportcsv;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Patient Name'])[1]")
	private WebElement patientnameclick;

	public WebElement getpatientnameclick() {

		return patientnameclick;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Provider'])[1]")
	private WebElement providernameclick;

	public WebElement getprovidernameclick() {

		return providernameclick;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='Heart'])[1]")
	private WebElement heartnameclick;

	public WebElement getheartnameclick() {

		return heartnameclick;
	}
	
	
	@FindBy(xpath = "(//span[normalize-space()='Respiration'])[1]")
	private WebElement respirationclick;

	public WebElement getrespirationclick() {

		return respirationclick;
	}
	
	@FindBy(xpath = "(//span[normalize-space()='BP'])[1]")
	private WebElement bloodpressureclick;

	public WebElement getbloodpressureclick() {

		return bloodpressureclick;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Export csv'])[1]")
	private WebElement clickcsv;

	public WebElement getclickcsv() {

		return clickcsv;
	}
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[18]")
	private WebElement addnoteslive;

	public WebElement getaddnoteslive() {

		return addnoteslive;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Phone Call'])[1]")
	private WebElement addnotesphonecall;

	public WebElement getaddnotesphonecall() {

		return addnotesphonecall;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Review PGHD'])[1]")
	private WebElement addnotesreviewpg;

	public WebElement getaddnotesreviewpg() {

		return addnotesreviewpg;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='2 min'])[1]")
	private WebElement addnotestimespent;

	public WebElement getaddnotestimespent() {

		return addnotestimespent;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='2 min'])[1]")
	private WebElement addnotesconfirm;

	public WebElement getaddnotesconfirm() {

		return addnotesconfirm;
	}
	
	
	@FindBy(xpath = "(//*[name()='path'])[32]")
	private WebElement clickchatbox;

	public WebElement getclickchatbox() {

		return clickchatbox;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Type your message here…'])[1]")
	private WebElement typemessage;

	public WebElement gettypemessage() {

		return typemessage;
	}
	

	@FindBy(xpath = "(//button[@class='sc-jSMfEi jcNJae'])[1]")
	private WebElement clicksendmessage;

	public WebElement getclicksendmessage() {

		return clicksendmessage;
	}

}
