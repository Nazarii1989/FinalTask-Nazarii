package Example;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.FluentWait;
import org.openqa.selenium.support.ui.Wait;

import java.time.Duration;

public class Main_Page {

    private WebDriver driver;

    @FindBy(xpath = "//input[@name=\"username\"]")
    private WebElement Username;

    @FindBy(xpath = "//input[@name=\"password\"]")
    private WebElement Password;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Login;

    @FindBy(xpath = "//a[@href=\"/web/index.php/admin/viewAdminModule\"]")
    private WebElement Admin;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[1]/header/div[2]/nav/ul/li[2]")
    private WebElement Job;

    @FindBy(xpath = "//a[text()=\"Job Titles\"]")
    private WebElement JobTitles;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement Add;

    @FindBy(xpath = "//*[@id=\"app\"]/div[1]/div[2]/div[2]/div/div/form/div[1]/div/div[2]/input")
    private WebElement AddJobTittle;

    @FindBy(xpath = "//textarea[@placeholder=\"Type description here\"]")
    private WebElement AddJobDescription;

    @FindBy(xpath = "//div[@class=\"oxd-file-button\"]")
    private WebElement File;

    @FindBy(xpath = "//textarea[@placeholder=\"Add note\"]")
    private WebElement Note;

    @FindBy(xpath = "//button[@type=\"submit\"]")
    private WebElement Save;

    @FindBy(xpath = "//div[text()=\"WorkerQANazar\"]")
    private WebElement Check;

    @FindBy(xpath = "//div[29]/div/div/div[1]/div[2]/div/div/button[2]")
    private WebElement Check1;

    @FindBy(xpath = "//a[@href=\"/web/index.php/pim/viewPimModule\"]")
    private WebElement PIM;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary\"]")
    private WebElement ADDButton;

    @FindBy(xpath = "//input[@name=\"firstName\"]")
    private WebElement FirstName;

    @FindBy(xpath = "//input[@name=\"middleName\"]")
    private WebElement MidlName;

    @FindBy(xpath = "//input[@name=\"lastName\"]")
    private WebElement LastName;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--secondary orangehrm-left-space\"]")
    private WebElement SaveButton;

    @FindBy(xpath = "//form/div[1]/div[2]/div/div/div[2]/input")
    private WebElement NickName;

    @FindBy(xpath = "//form/div[2]/div[1]/div[2]/div/div[2]/input")
    private WebElement OtherID;

    @FindBy(xpath = "//form/div[2]/div[2]/div[1]/div/div[2]/input")
    private WebElement DriverButton;

    @FindBy(xpath = "//form/div[2]/div[2]/div[2]/div/div[2]/div/div/i")
    private WebElement DateButton;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[1]")
    private WebElement MountsMenu;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[2]")
    private WebElement Mounts;

    @FindBy(xpath = "//li[@class=\"oxd-calendar-selector-year\"]")
    private WebElement YearMenu;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[55]")
    private WebElement Years;

    @FindBy(xpath = "//div[@class=\"oxd-calendar-dates-grid\"]/div[22]")
    private WebElement DaysFeb;

    @FindBy(xpath = "//div[@class=\"oxd-calendar-dates-grid\"]/div[20]")
    private WebElement DaysMar;

    @FindBy(xpath = "//form/div[3]/div[1]/div[1]/div/div[2]/div/div")
    private WebElement Nationality;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[186]")
    private WebElement NationalityList;

    @FindBy(xpath = "//form/div[3]/div[1]/div[2]/div/div[2]/div/div/div[2]/i")
    private WebElement MaritalStatus;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[3]")
    private WebElement MaritalStatusList;

    @FindBy(xpath = "//input[@value=\"2\"]")
    private WebElement RadioButton;

    @FindBy(xpath = "//form/div[1]/div/div[1]/div/div[2]/div/div/div[2]/i")
    private WebElement BloodTapeButton;

    @FindBy(xpath = "//div[@role=\"listbox\"]/div[4]")
    private WebElement BloodTapeList;

    @FindBy(xpath = "//form/div[1]/div/div[2]/div/div[2]/input")
    private WebElement Test_Field;

    @FindBy(xpath = "//form/div[3]/div[2]/div[1]/div/div[2]/div/div/i")
    private WebElement DateOfBirthday;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[1]")
    private WebElement MountsMenuOFBirthday;

    @FindBy(xpath = "//ul[@role=\"menu\"]/li[10]")
    private WebElement MountsOfBirthday;

    @FindBy(xpath = "//li[@class=\"oxd-calendar-selector-year\"]")
    private WebElement YearMenuOfBirthday;

    @FindBy(xpath = "//ul[@role=\"menu\"]/li[20]")
    private WebElement YearsOfBirthday;

    @FindBy(xpath = "//div[@class=\"oxd-calendar-dates-grid\"]/div[30]")
    private WebElement DaysOct;

    @FindBy(xpath = "//button[@class=\"oxd-button oxd-button--medium oxd-button--text\"]")
    private WebElement AddAttachments;

    @FindBy(xpath = "//div[3]/div/form/div[1]/div/div/div/div[2]/div")
    private WebElement FileSelect;

    @FindBy(xpath = "//form/div[4]/button")
    private WebElement SaveButton1;

    @FindBy(xpath = "//form/div[2]/button")
    private WebElement SaveButton2;

    @FindBy(xpath = "//div/div/div[1]/div[2]/div[6]/a")
    private WebElement JobMenu;

    @FindBy(xpath = "//i[@class=\"oxd-icon bi-calendar oxd-date-input-icon\"]")
    private WebElement JobMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[1]")
    private WebElement JobMountsMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[1]")
    private WebElement JobDaysMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-selector\"]/li[2]")
    private WebElement JobYearMenuJoinedDate;

    @FindBy(xpath = "//ul[@class=\"oxd-calendar-dropdown\"]/li[55]")
    private WebElement JobYearListMenuJoinedDate;


    public Main_Page (WebDriver driver){
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }


    public void Click_Button () throws InterruptedException {

        Wait<WebDriver> fluentWait = new FluentWait<>(driver).withTimeout(Duration.ofSeconds(10)).
                pollingEvery(Duration.ofMillis(500)).ignoring(Exception.class);
        fluentWait.until(ExpectedConditions.elementToBeClickable(Username)).sendKeys("Admin");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Password)).sendKeys("admin123");
        fluentWait.until(ExpectedConditions.elementToBeClickable(Login)).click();

         fluentWait.until(ExpectedConditions.elementToBeClickable(Admin)).click();

         fluentWait.until(ExpectedConditions.elementToBeClickable(Job)).click();
          fluentWait.until(ExpectedConditions.elementToBeClickable(JobTitles)).click();
          fluentWait.until(ExpectedConditions.elementToBeClickable(Add)).click();
          fluentWait.until(ExpectedConditions.elementToBeClickable(AddJobTittle)).sendKeys("WorkerQANazar");
         fluentWait.until(ExpectedConditions.elementToBeClickable(AddJobDescription)).sendKeys("Good Worker QA");
          fluentWait.until(ExpectedConditions.elementToBeClickable(Note)).sendKeys("Staff");
          fluentWait.until(ExpectedConditions.elementToBeClickable(Save)).click();

       fluentWait.until(ExpectedConditions.elementToBeClickable(Check)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Check1)).click();
//        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", Check1);

        String NameBeforeSaveJobTittle = "WorkerQANazar";
        String NameAfterSaveJobTittle = "WorkerQANazar";
        System.out.println(NameBeforeSaveJobTittle.equals(NameAfterSaveJobTittle));

        fluentWait.until(ExpectedConditions.elementToBeClickable(PIM)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(ADDButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(FirstName)).sendKeys("Nazarii");
        fluentWait.until(ExpectedConditions.elementToBeClickable(MidlName)).sendKeys("QA");
        fluentWait.until(ExpectedConditions.elementToBeClickable(LastName)).sendKeys("Simson");
        fluentWait.until(ExpectedConditions.elementToBeClickable(SaveButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(OtherID)).sendKeys("1715");
        fluentWait.until(ExpectedConditions.elementToBeClickable(DriverButton)).sendKeys("1133557");



        fluentWait.until(ExpectedConditions.elementToBeClickable(Nationality)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(NationalityList)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(MaritalStatus)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(MaritalStatusList)).click();
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", RadioButton);

        fluentWait.until(ExpectedConditions.elementToBeClickable(DateButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(MountsMenu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Mounts)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(YearMenu)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Years)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(DaysFeb)).click();

        fluentWait.until(ExpectedConditions.elementToBeClickable(BloodTapeButton)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(BloodTapeList)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(Test_Field)).sendKeys("Good Blood");
        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SaveButton2);

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", DateOfBirthday);
        fluentWait.until(ExpectedConditions.elementToBeClickable(MountsMenuOFBirthday)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(MountsOfBirthday)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(YearMenuOfBirthday)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(YearsOfBirthday)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(DaysOct)).click();

        ((JavascriptExecutor) driver).executeScript("arguments[0].click();", SaveButton1);



//        fluentWait.until(ExpectedConditions.elementToBeClickable(JobMenu)).click();

         ((JavascriptExecutor) driver).executeScript("arguments[0].click();", JobMenu);


        fluentWait.until(ExpectedConditions.elementToBeClickable(JobMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobMountsMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobDaysMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobYearMenuJoinedDate)).click();
        fluentWait.until(ExpectedConditions.elementToBeClickable(JobYearListMenuJoinedDate)).click();


















    }


    }

