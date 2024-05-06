package com.Rpm_Treatmentplan;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Treatmentplanrpm {
	
	public WebDriver driver;

	public Treatmentplanrpm(WebDriver driver2) {
		

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
	
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[5]")
	private WebElement clicktreatment;

	public WebElement getclicktreatment() {

		return clicktreatment;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Search Created by'])[1]")
	private WebElement searchcreated;

	public WebElement getsearchcreated() {

		return searchcreated;
	}
	
	
	@FindBy(xpath = "(//input[@placeholder='Search Plan'])[1]")
	private WebElement searchplan;

	public WebElement getsearchplan() {

		return searchplan;
	}
	
	
	@FindBy(xpath = "(//button[normalize-space()='Add Treatment Plan'])[1]")
	private WebElement addtreatmentplan;

	public WebElement getaddtreatmentplan() {

		return addtreatmentplan;
	}
	
	
	@FindBy(xpath = "(//h1[normalize-space()='Treatment Plan'])[1]")
	private WebElement treatmentplantitile;

	public WebElement gettreatmentplantitile() {

		return treatmentplantitile;
	}
	
	
	@FindBy(xpath = "//*[name()='path' and contains(@d,'M9.243 19H')]")
	private WebElement treatmentplannameedit;

	public WebElement gettreatmentplannameedit() {

		return treatmentplannameedit;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Treatment Plan'])[1]")
	private WebElement treatmentplanname;

	public WebElement gettreatmentplanname() {

		return treatmentplanname;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[1]/div/button[1]")
	private WebElement treatmentplannamesave;

	public WebElement gettreatmentplannamesave() {

		return treatmentplannamesave;
	}

	
	@FindBy(xpath = "(//textarea[@placeholder='Write patient problem'])[1]")
	private WebElement problemstatement;

	public WebElement getproblemstatement() {

		return problemstatement;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Mention Diagnosis'])[1]")
	private WebElement Diagnosissend;

	public WebElement getDiagnosissend() {

		return Diagnosissend;
	}
	
	@FindBy(xpath = "//label[contains(text(),'E67.0 -- Hypervitaminosis A')]")
	private WebElement Diagnosisselect;

	public WebElement getDiagnosisselect() {

		return Diagnosisselect;
	}
	
	@FindBy(xpath = "(//textarea[@placeholder='Mention patient goal'])[1]")
	private WebElement goalssend;

	public WebElement getgoalssend() {

		return goalssend;
	}
	
	@FindBy(xpath = "//*[@id='vitality']/div/div[1]")
	private WebElement vitalsselect;

	public WebElement getvitalsselect() {

		return vitalsselect;
	}
	
	@FindBy(xpath = "(//label[normalize-space()='Blood pressure'])[1]")
	private WebElement vitalsselect1;

	public WebElement getvitalsselect1() {

		return vitalsselect1;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[1]")
	private WebElement frequency;

	public WebElement getfrequency() {

		return frequency;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/div[1]/div[2]/div[1]/input[2]")
	private WebElement instructions;

	public WebElement getinstructions() {

		return instructions;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Medication'])[1]")
	private WebElement medicationsearch;

	public WebElement getmedicationsearch() {

		return medicationsearch;
	}
	
	@FindBy(xpath = "//label[contains(text(),'RETIN-A (Topical)')]")
	private WebElement medicationselect;

	public WebElement getmedicationselect() {

		return medicationselect;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/div/div[2]/input")
	private WebElement frequencysend;

	public WebElement getfrequencysend() {

		return frequencysend;
	}
	
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/div[2]/div[2]/div[1]/input")
	private WebElement instructionsend;

	public WebElement getinstructionsend() {

		return instructionsend;
	}
	
	@FindBy(xpath = "(//input[@placeholder='Provider'])[1]")
	private WebElement providersearch;

	public WebElement getprovidersearch() {

		return providersearch;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Vanitha')]")
	private WebElement providerselect;

	public WebElement getproviderselect() {

		return providerselect;
	}
	
	@FindBy(xpath = "//label[contains(text(),'Primary physician')]")
	private WebElement specialityselect;

	public WebElement getspecialityselect() {

		return specialityselect;
	}

	@FindBy(xpath = "//*[@id='specility']/div/div")
	private WebElement specialityclick;

	public WebElement getspecialityclick() {

		return specialityclick;
	}
	
	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement saveplan;

	public WebElement getsaveplan() {

		return saveplan;
	}
	
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[3]/button")
	private WebElement cancelplan;

	public WebElement getcancelplan() {

		return cancelplan;
	}
	
	@FindBy(xpath = "//tbody/tr[1]/td[4]/div[1]/button[1]")
	private WebElement addpatient;

	public WebElement getaddpatient() {

		return addpatient;
	}
	
	
	@FindBy(xpath = "(//input[@placeholder='Search Patient'])[1]")
	private WebElement searchpatient;

	public WebElement getsearchpatient() {

		return searchpatient;
	}
	
	
	@FindBy(xpath = "(//input[@placeholder='Search Patient'])[1]")
	private WebElement selectpatient;

	public WebElement getselectpatient() {

		return selectpatient;
	}
	
	
	@FindBy(xpath = "//p[contains(text(),'Add Plan')]")
	private WebElement addplan;

	public WebElement getaddplan() {

		return addplan;
	}
	
	@FindBy(xpath = "(//p[contains(text(),'Cancel')])[2]")
	private WebElement cancelplanpatient;

	public WebElement getcancelplanpatient() {

		return cancelplanpatient;
	}
	
	
	@FindBy(xpath = "(//*[name()='svg'][@stroke='currentColor'])[18]")
	private WebElement editplan;

	public WebElement geteditplan() {

		return editplan;
	}
	
	
	@FindBy(xpath = "(//textarea[@placeholder='Write patient problem'])[1]")
	private WebElement problemstatementedit;

	public WebElement getproblemstatementedit() {

		return problemstatementedit;
	}


	@FindBy(xpath = "(//button[normalize-space()='Save'])[1]")
	private WebElement saveedit;

	public WebElement getsaveedit() {

		return saveedit;
	}
	
	@FindBy(xpath = "//*[@id='vozo_rpm']/div/div[2]/div[2]/div[2]/div[2]/table/tbody/tr[1]/td[3]")
	private WebElement edittime;

	public WebElement getedittime() {

		return edittime;
	}
	
	
}
