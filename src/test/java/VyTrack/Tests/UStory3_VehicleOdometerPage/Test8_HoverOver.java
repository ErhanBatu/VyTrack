package VyTrack.Tests.UStory3_VehicleOdometerPage;

import VyTrack.Tests.TestBase;
import VyTrack.pages.LoginPage;
import VyTrack.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.testng.annotations.Test;

import java.util.ArrayList;
import java.util.List;

public class Test8_HoverOver extends TestBase {

    @Test
    public void test() throws InterruptedException {

        LoginPage loginPage = new LoginPage();
        loginPage.loginAsStoreManager();

        List<WebElement> list1 = Driver.get().findElements(By.xpath("//li[contains(@class,\"dropdown dropdown-level-1\")]"));
        ArrayList<WebElement> first = new ArrayList<>(list1);
        for (WebElement value : list1) {
            first.add(value);
        }

        WebElement vehicle = Driver.get().findElement(By.xpath("//span[text()=\"Vehicle Costs\"]"));

        Thread.sleep(2000);
        Actions actions = new Actions(Driver.get());
        actions.moveToElement(first.get(1)).perform();










    }
}
