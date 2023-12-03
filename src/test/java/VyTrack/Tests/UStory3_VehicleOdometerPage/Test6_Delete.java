package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.VehicleOdometer;
import VyTrack.utilities.BrowserUtils;
import VyTrack.utilities.ConfigurationReader;
import VyTrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test6_Delete extends TestBase {

    @Test
    public void Test6_Delete(){

        VehicleOdometer vehicleOdometer = new VehicleOdometer(ConfigurationReader.get("tab"),ConfigurationReader.get("module"));
        VehicleOdometer vehicleOdometer1 = new VehicleOdometer();

        BrowserUtils.waitFor(5);
        vehicleOdometer1.createVehicleOdometer.click();

        BrowserUtils.waitFor(3);
        vehicleOdometer1.odometerValue.sendKeys("234,567");
        vehicleOdometer1.date.click();
        vehicleOdometer1.getDay("5").click();
        vehicleOdometer1.driver.sendKeys("Michael Owen");
        vehicleOdometer1.unit.click();
        vehicleOdometer1.km.click();
        vehicleOdometer1.create.click();
        BrowserUtils.waitForClickablility(vehicleOdometer1.delete,5);
        vehicleOdometer1.delete.click();
        BrowserUtils.waitForClickablility(vehicleOdometer1.deleteConfirmation,2);
        vehicleOdometer1.deleteConfirmation.click();
        BrowserUtils.waitForVisibility(vehicleOdometer1.deleteFlash,2);
        Assert.assertTrue(vehicleOdometer1.deleteFlash.getText().contains(vehicleOdometer1.expectedResult("delete")));


    }
}
