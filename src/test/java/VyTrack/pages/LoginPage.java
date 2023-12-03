package VyTrack.pages;

import VyTrack.Tests.TestBase;
import VyTrack.utilities.ConfigurationReader;
import VyTrack.utilities.Driver;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class LoginPage{

    public LoginPage(){
        PageFactory.initElements(Driver.get(),this);//it provides the connection between @FindBy and WebElement below
    }

    //driver.findElement(By.id("prependedInput"));
    @FindBy(id = "prependedInput")//@FindBy is coming from selenium and you put your locater. Before you were using the Testng
    public WebElement usernameInput;

    @FindBy(id = "prependedInput2")
    public WebElement passwordInput;

    @FindBy(id = "_submit")
    public WebElement loginBtn;

    @FindBy(xpath = "//*[@id=\"main-menu\"]/ul/li[1]/a/span")
    public WebElement fleet;

    @FindBy(xpath = "//*[@id='main-menu']//*[contains(text(),'Odometer')]")
    public WebElement vehicleodometer;

    public void login(String username, String password) {

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsStoreManager(){

        String username = ConfigurationReader.get("storemanager_username");
        String password = ConfigurationReader.get("storemanager_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }

    public void loginAsTruckDriver() {

        String username = ConfigurationReader.get("truckdriver_username");
        String password = ConfigurationReader.get("truckdriver_password");

        usernameInput.sendKeys(username);
        passwordInput.sendKeys(password);
        loginBtn.click();

    }
}