package uk.co.library.pages;

import com.aventstack.extentreports.Status;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.testng.Reporter;
import uk.co.library.customlisteners.CustomListeners;
import uk.co.library.utility.Utility;

public class HomePage extends Utility {
    public HomePage() {
        PageFactory.initElements(driver, this);
    }

    @CacheLookup
    @FindBy(xpath = "//button[@id='save']")
    WebElement acceptAllCookies;
    @CacheLookup
    @FindBy(xpath = "(//input[@id='keywords'])[1]")
    WebElement jobTitle;
    @CacheLookup
    @FindBy(xpath = "//input[@id='location']")
    WebElement location;
    @CacheLookup
    @FindBy(xpath = "//select[@id='distance']")
    WebElement distanceDropDown;
    @CacheLookup
    @FindBy(xpath = "//button[@id='toggle-hp-search']")
    WebElement moreSearchOptions;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymin']")
    WebElement salaryMin;
    @CacheLookup
    @FindBy(xpath = "//input[@id='salarymax']")
    WebElement salaryMax;
    @CacheLookup
    @FindBy(xpath = "//select[@id='salarytype']")
    WebElement salaryTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//select[@id='tempperm']")
    WebElement jobTypeDropDown;
    @CacheLookup
    @FindBy(xpath = "//input[@id='hp-search-btn']")
    WebElement findJobs;

    public void acceptCookies() throws InterruptedException {
        Thread.sleep(1000);
        driver.switchTo().frame("gdpr-consent-notice");
        clickOnElement(acceptAllCookies);
        Reporter.log("Accept All Cookies : ");
        CustomListeners.test.log(Status.PASS, "Accept All Cookies.");
    }

    public void enterJobTitle(String jobTitle) {
        Reporter.log("Entering Job Title : " + jobTitle.toString());
        sendTextToElement(this.jobTitle, jobTitle);
        CustomListeners.test.log(Status.PASS, "Enter Job Tile: " + jobTitle);
    }

    public void enterLocation(String location) {
        Reporter.log("Enter Location : " + location.toString());
        sendTextToElement(this.location, location);
        CustomListeners.test.log(Status.PASS, "Enter Location: " + location);
    }

    public void selectDistance(String distance) {
        Reporter.log("Select Distance: " + distanceDropDown.toString());
        sendTextToElement(distanceDropDown, distance);
        CustomListeners.test.log(Status.PASS, "Select Distance: " + distance);
    }

    public void clickMoreSearchOptions() {
        Reporter.log("Click on More Search Options : " + moreSearchOptions.toString());
        clickOnElement(moreSearchOptions);
        CustomListeners.test.log(Status.PASS, "Click on More Search Options.");
    }

    public void enterMinSalary(String minSalary) {
        Reporter.log("Enter Minimum Salary: " + salaryMin.toString());
        sendTextToElement(salaryMin, minSalary);
        CustomListeners.test.log(Status.PASS, "Enter Minimum Salary: " + minSalary);
    }

    public void enterMaxSalary(String maxSalary) {
        Reporter.log("Enter Maximum Salary: " + salaryMax.toString());
        sendTextToElement(salaryMax, maxSalary);
        CustomListeners.test.log(Status.PASS, "Enter Maximum Salary: " + maxSalary);
    }

    public void selectSalaryType(String salaryType) {
        Reporter.log("Select Salary Type: " + salaryTypeDropDown.toString());
        selectByVisibleTextFromDropDown(salaryTypeDropDown, salaryType);
        CustomListeners.test.log(Status.PASS, "Select Salary Type: " + salaryType);
    }

    public void selectJobType(String jType) {
        Reporter.log("Select Job Type: " + jType);
        selectByVisibleTextFromDropDown(jobTypeDropDown, jType);
        CustomListeners.test.log(Status.PASS, "Select Job Type: " + jType);
    }

    public void clickOnFindJobs() {
        Reporter.log("Click Find Jobs Button: " + findJobs);
        clickOnElement(findJobs);
        CustomListeners.test.log(Status.PASS, "Click Find Jobs Button: ");
    }
}
