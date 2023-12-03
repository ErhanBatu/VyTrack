package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.VehicleOdometer;
import VyTrack.utilities.BrowserUtils;
import VyTrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test4_Create_Negative extends TestBase {

    @Test
    public void Test4_Create_Positive(){

        VehicleOdometer vehicleOdometer = new VehicleOdometer(ConfigurationReader.get("tab"),ConfigurationReader.get("module"));
        VehicleOdometer vehicleOdometer1 = new VehicleOdometer();

        BrowserUtils.waitFor(5);
        vehicleOdometer1.createVehicleOdometer.click();

        BrowserUtils.waitFor(3);
        vehicleOdometer1.odometerValue.sendKeys("-387,000");
        vehicleOdometer1.date.click();
        BrowserUtils.waitForVisibility(vehicleOdometer1.month,2);
        Select selectMonth = vehicleOdometer1.monthList();
        selectMonth.selectByVisibleText("Nov");
        BrowserUtils.waitForVisibility(vehicleOdometer1.year,2);
        Select selectYear = vehicleOdometer1.yearList();
        selectYear.selectByVisibleText("1945");
        vehicleOdometer1.getDay("23").click();
        vehicleOdometer1.create.click();
        BrowserUtils.waitForVisibility(vehicleOdometer1.flash,3);

        Assert.assertFalse(vehicleOdometer1.flash.getText().contains(vehicleOdometer1.expectedResult("flash")));


    }
}
