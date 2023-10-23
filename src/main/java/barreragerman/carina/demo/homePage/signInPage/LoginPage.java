package barreragerman.carina.demo.homePage.signInPage;

import barreragerman.carina.demo.homePage.signInEnum.EnumSignIn;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class LoginPage extends AbstractPage {
    public LoginPage(WebDriver driver) {
        super(driver);
    }
    //here I make use of String format
    @FindBy(xpath = "//input[@id='%s']")
    private ExtendedWebElement input;
    @FindBy(xpath = "//button[@name='login']")
    private ExtendedWebElement loginButton;

    public void typeInput(EnumSignIn field, String text){
        input = input.format(field.getId());
        input.type(text);
    }

    public BadCredentialMessage clickOnLoginButton(){
        BadCredentialMessage credentialPage = new BadCredentialMessage(driver);
        loginButton.click();
        return credentialPage;
    }




}
