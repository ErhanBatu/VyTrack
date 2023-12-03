package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.LoginPage;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test1 extends TestBase {

    @Test
    public void Test1(){

        LoginPage loginPage = new LoginPage();

        loginPage.loginAsTruckDriver();
        wait.until(ExpectedConditions.visibilityOf(loginPage.fleet));
        actions.moveToElement(loginPage.fleet).perform();
        loginPage.vehicleodometer.click();

        Assert.assertEquals(driver.getCurrentUrl(),"https://qa1.vytrack.com/entity/Extend_Entity_VehiclesOdometer");

    }

}
