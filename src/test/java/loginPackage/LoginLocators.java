package loginPackage;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

/**
 * Created by student01 on 15.12.15.
 */
public class LoginLocators {

    @FindBy(how = How.ID, using = "LoginForm__username")
    public WebElement usernameInput;

    @FindBy(how = How.ID, using = "LoginForm__password")
    public WebElement passwordInput;

    @FindBy(how = How.ID, using = "LoginForm_save")
    public WebElement signInButton;

    @FindBy(how = How.XPATH, using = "(html/body/div[1]/div/div[1]/div/ul/li")
    public WebElement signInError;
}
