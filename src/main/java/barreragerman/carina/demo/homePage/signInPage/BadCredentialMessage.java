package barreragerman.carina.demo.homePage.signInPage;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class BadCredentialMessage extends AbstractPage {
    public BadCredentialMessage(WebDriver driver) {
        super(driver);
    }
    @FindBy(xpath = "//div[@class='_9ay7']")
    private ExtendedWebElement wrongCredentials;

    public boolean isWrongCredentialsMessagePresent(){
        return wrongCredentials.isElementPresent();
    }
}
