package com.RPM_Dashboards;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Dashboardrpm {
	public WebDriver driver;

	public Dashboardrpm(WebDriver driver2) {

		this.driver = driver2;

		PageFactory.initElements(driver2, this);

	}

	public WebDriver getDriver() {
		return driver;
	}

//////////Login Page //////////////////

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

	@FindBy(xpath = "(//p[@class='sc-dkzDqf hGyvhT'])[1]")
	private WebElement titleverify;

	public WebElement gettitleverify() {

		return titleverify;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Overview'])[1]")
	private WebElement overviewverify;

	public WebElement getoverviewverify() {

		return overviewverify;
	}

	@FindBy(xpath = "(//h1[normalize-space()='Live'])[1]")
	private WebElement liveverify;

	public WebElement getliveverify() {

		return liveverify;
	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX gZLgSO'][normalize-space()='View All'])[1]")
	private WebElement viewalllive;

	public WebElement getviewalllive() {

		return viewalllive;
	}

	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[8]")
	private WebElement clickdashboard;

	public WebElement getclickdashboard() {

		return clickdashboard;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Vital Summary'])[1]")
	private WebElement vitalssummary;

	public WebElement getvitalssummary() {

		return vitalssummary;
	}

	@FindBy(xpath = "(//h4[normalize-space()='Treatment Plan'])[1]")
	private WebElement treatmentplan;

	public WebElement gettreatmentplan() {

		return treatmentplan;
	}

	@FindBy(xpath = "(//p[@class='sc-kDDrLX bbysow'])[1]")
	private WebElement treatmentplanviewall;

	public WebElement gettreatmentplanviewall() {

		return treatmentplanviewall;
	}

	@FindBy(xpath = "(//h4[normalize-space()='My Patients'])[1]")
	private WebElement mypatienttitle;

	public WebElement getmypatienttitle() {

		return mypatienttitle;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Patient'])[1]")
	private WebElement addpatient;

	public WebElement getaddpatient() {

		return addpatient;
	}

	@FindBy(xpath = "(//p[contains(text(),' View All')])[3]")
	private WebElement viewallmypatient;

	public WebElement getviewallmypatient() {

		return viewallmypatient;
	}

	@FindBy(xpath = "//div[@class='sc-gSAPjG exVraM']")
	private WebElement clickmypatient;

	public WebElement getclickmypatient() {

		return clickmypatient;
	}

	@FindBy(xpath = "//label[contains(text(),'My patients')]")
	private WebElement selectmypatient;

	public WebElement getselectmypatient() {

		return selectmypatient;
	}

	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[1]/div[2]/div[1]/button")
	private WebElement clicknotification;

	public WebElement getclicknotification() {

		return clicknotification;
	}

	////////////////////////////////////////

	@FindBy(xpath = "(//span[@class='sc-dmRaPn hrZBxb'])[1]")
	private WebElement clickdashboard1;

	public WebElement getclickdashboard1() {

		return clickdashboard1;
	}

	@FindBy(xpath = "(//button[normalize-space()='Add Patient'])[1]")
	private WebElement clickaddpatients;

	public WebElement getclickaddpatients() {

		return clickaddpatients;
	}

}
