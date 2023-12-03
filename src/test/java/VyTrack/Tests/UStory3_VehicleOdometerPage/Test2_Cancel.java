package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.DashboardPage;
import VyTrack.pages.LoginPage;
import VyTrack.pages.VehicleOdometer;
import VyTrack.utilities.BrowserUtils;
import VyTrack.utilities.ConfigurationReader;
import VyTrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.Test;

public class Test2_Cancel extends TestBase {

    @Test
    public void Test2(){

        VehicleOdometer vehicleOdometer = new VehicleOdometer(ConfigurationReader.get("tab"),ConfigurationReader.get("module"));
        VehicleOdometer vehicleOdometer1 = new VehicleOdometer();


        WebElement eb = Driver.get().findElement(By.xpath("//button[@class=\"btn dropdown-toggle \"]"));
        BrowserUtils.waitFor(5);
        System.out.println("eb.getText() = " + eb.getText());





    }

}
