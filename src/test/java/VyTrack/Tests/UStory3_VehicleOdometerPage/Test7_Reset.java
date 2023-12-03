package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.VehicleOdometer;
import VyTrack.utilities.BrowserUtils;
import VyTrack.utilities.ConfigurationReader;
import org.testng.annotations.Test;

public class Test7_Reset extends TestBase {

    @Test
    public void Test7_Reset(){

        VehicleOdometer vehicleOdometer = new VehicleOdometer(ConfigurationReader.get("tab"),ConfigurationReader.get("module"));
        VehicleOdometer vehicleOdometer1 = new VehicleOdometer();
        BrowserUtils.waitFor(5);
        vehicleOdometer1.gridSetting.click();


    }




}
