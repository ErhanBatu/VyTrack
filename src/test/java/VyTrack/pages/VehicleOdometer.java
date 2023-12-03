package VyTrack.pages;

import VyTrack.Tests.TestBase;
import VyTrack.pages.LoginPage;
import VyTrack.utilities.BrowserUtils;
import VyTrack.utilities.ConfigurationReader;
import VyTrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class VehicleOdometer extends BasePage {

    public VehicleOdometer(String tab, String module){

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsTruckDriver();

        DashboardPage dashboardPage = new DashboardPage();
        dashboardPage.navigateToModule(tab,module);

    }

    public VehicleOdometer(){ PageFactory.initElements(Driver.get(), this); }

    @FindBy(xpath = "//a[@title='Create Vehicle Odometer']")
    public WebElement createVehicleOdometer;

    @FindBy(xpath = "//a[@title='Cancel']")
    public WebElement close;

    @FindBy(xpath = "//input[starts-with(@id,'custom_entity_type_OdometerValue')]")
    public WebElement odometerValue;

    @FindBy(xpath = "//input[starts-with(@name, 'dat')]")
    public WebElement date;

    @FindBy(className = "ui-datepicker-month")
    public WebElement month;

    @FindBy(className = "ui-datepicker-year")
    public WebElement year;

    @FindBy(xpath = "//input[@name='custom_entity_type[Driver]']")
    public WebElement driver;

    @FindBy(xpath = "(//*[@class='select2-chosen'])[1]")
    public WebElement unit;

    @FindBy(xpath = "//div[text()='km']")
    public WebElement km;

    @FindBy(xpath = "//div[text()='miles']")
    public WebElement miles;

    @FindBy(xpath = "(//span[@class='select2-chosen'])[2]")
    public WebElement model;

    @FindBy(xpath = "(//button[@type='submit'])[1]")
    public WebElement create;

    @FindBy(xpath = "//div[@class='flash-messages-holder']")
    public WebElement flash;

    @FindBy(xpath = "//a[starts-with(@class,'btn back')]")
    public WebElement edit;

    @FindBy(xpath = "(//div[@class='control-label'])[1]")
    public WebElement getControlOdometerValue;

    @FindBy(xpath = "(//div[@class='control-label'])[2]")
    public WebElement getControlDate;

    @FindBy(xpath = "(//div[@class='control-label'])[3]")
    public WebElement getControlDriver;

    @FindBy(xpath = "(//div[@class='control-label'])[4]")
    public WebElement getControlUnit;

    @FindBy(xpath = "(//div[@class='control-label'])[5]")
    public WebElement getControlModel;

    @FindBy(xpath = "(//div[@class='control-label'])[6]")
    public WebElement getControlLicensePlate;

    @FindBy(xpath = "//*[@*='Vehicle Odometer deleted']")
    public WebElement delete;

    @FindBy(xpath = "//a[@class='btn ok btn-danger']")
    public  WebElement deleteConfirmation;

    @FindBy(xpath = "//*[@*='Vehicle Odometer deleted']")
    public WebElement deleteFlash;

    @FindBy(xpath = "//a[@title='Grid Settings']")
    public WebElement gridSetting;

    public Select monthList(){ return new Select(month); }

    public Select yearList(){
        return new Select(year);
    }

    public WebElement getDay(String day){
        String xpath ="//a[text()='"+day+"']";
        return Driver.get().findElement(By.xpath(xpath));
    }


    public String expectedResult(String result) {

        if (result.toLowerCase().equals("odometer value")) {
            String odometerValue = "100";
            result=odometerValue;
        }else if(result.toLowerCase().equals("date")){
            String date = "Nov 17, 2021";
            result=date;
        }else if(result.toLowerCase().equals("driver")) {
            String driver = "Michael Oven";
            result = driver;
        }else if(result.toLowerCase().equals("unit")) {
            String unit = "miles";
            result = unit;
        }else if(result.toLowerCase().equals("flash")) {
            String flash = "Entity saved";
            result = flash;
        }else if(result.toLowerCase().equals("delete")){
            String delete = "Delete";
            result = delete;
        }

        return result;
    }





}
