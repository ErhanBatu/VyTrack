package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.DashboardPage;
import VyTrack.pages.VehicleOdometer;
import VyTrack.utilities.BrowserUtils;
import VyTrack.utilities.ConfigurationReader;
import VyTrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.List;

public class Test3_Create_Positive extends TestBase {

    @Test
    public void Test3_Create(){

        VehicleOdometer vehicleOdometer = new VehicleOdometer(ConfigurationReader.get("tab"),ConfigurationReader.get("module"));
        VehicleOdometer vehicleOdometer1 = new VehicleOdometer();

        BrowserUtils.waitFor(5);
        vehicleOdometer1.createVehicleOdometer.click();

        BrowserUtils.waitFor(3);
        vehicleOdometer1.odometerValue.sendKeys("120,123");
        vehicleOdometer1.date.click();
        vehicleOdometer1.getDay("3").click();
        vehicleOdometer1.driver.sendKeys("Michael Owen");
        vehicleOdometer1.unit.click();
        vehicleOdometer1.km.click();
        vehicleOdometer1.create.click();
        BrowserUtils.waitForVisibility(vehicleOdometer1.flash,3);
        Assert.assertTrue(vehicleOdometer1.flash.getText().contains(vehicleOdometer1.expectedResult("flash")));

    }


}
