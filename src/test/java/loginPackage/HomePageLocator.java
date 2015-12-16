package loginPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student01 on 15.12.15.
 */
public class HomePageLocator {

    //driver.findElement(By.linkText("Zadanie 6")).click();
    @FindBy(how = How.LINK_TEXT, using = "Zadanie 6")
    public WebElement taskNumberButton;
}
