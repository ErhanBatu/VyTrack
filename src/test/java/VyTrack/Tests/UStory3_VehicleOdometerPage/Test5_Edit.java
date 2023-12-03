package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.VehicleOdometer;
import VyTrack.utilities.BrowserUtils;
import VyTrack.utilities.ConfigurationReader;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test5_Edit extends TestBase {

    @Test
    public void Test4_Edit(){

        VehicleOdometer vehicleOdometer = new VehicleOdometer(ConfigurationReader.get("tab"),ConfigurationReader.get("module"));
        VehicleOdometer vehicleOdometer1 = new VehicleOdometer();

        BrowserUtils.waitFor(5);
        vehicleOdometer1.createVehicleOdometer.click();

        //Create new Vehicle Odometer
        BrowserUtils.waitFor(3);
        vehicleOdometer1.odometerValue.sendKeys("75,000");
        vehicleOdometer1.date.click();
        vehicleOdometer1.getDay("11").click();
        vehicleOdometer1.driver.sendKeys("Michael Owen");
        vehicleOdometer1.unit.click();
        vehicleOdometer1.km.click();
        vehicleOdometer1.create.click();

        //Edit
        BrowserUtils.waitFor(3);
        vehicleOdometer1.edit.click();

        vehicleOdometer1.odometerValue.clear();
        vehicleOdometer1.odometerValue.sendKeys("100,000");
        vehicleOdometer1.date.click();
        BrowserUtils.waitForVisibility(vehicleOdometer1.month,2);
        Select selectMonth = vehicleOdometer1.monthList();
        selectMonth.selectByVisibleText("Nov");
        BrowserUtils.waitForVisibility(vehicleOdometer1.year,2);
        Select selectYear = vehicleOdometer1.yearList();
        selectYear.selectByVisibleText("2021");
        vehicleOdometer1.getDay("15").click();
        vehicleOdometer1.driver.clear();
        vehicleOdometer1.driver.sendKeys("Michael Oven");
        vehicleOdometer1.unit.click();
        vehicleOdometer1.miles.click();
        BrowserUtils.waitFor(3);
        vehicleOdometer1.create.click();

//        //Control the values
//        BrowserUtils.waitForVisibility(vehicleOdometer1.flash,3);
//        Assert.assertTrue(vehicleOdometer1.flash.getText().contains(vehicleOdometer1.expectedResult("flash")));
//        Assert.assertEquals(vehicleOdometer1.getControlDriver.getText(),vehicleOdometer1.expectedResult("driver"));
//        Assert.assertEquals(vehicleOdometer1.getControlDate.getText(),vehicleOdometer1.expectedResult("date"));

    }
}
