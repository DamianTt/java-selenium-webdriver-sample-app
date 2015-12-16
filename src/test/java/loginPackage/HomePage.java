package loginPackage;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

/**
 * Created by student01 on 16.12.15.
 */
public class HomePage {

    private HomePageLocator locators;

    public HomePage(WebDriver driver) {
        locators = new HomePageLocator();
        PageFactory.initElements(driver, locators);
    }

    public void navigateTo() {
        locators.taskNumberButton.click();
    }
}
