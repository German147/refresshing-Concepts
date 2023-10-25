package barreragerman.carina.demo.homePage.registerAccount;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class AlertMessagePage extends AbstractPage {
    protected AlertMessagePage(WebDriver driver) {
        super(driver);
    }

    @FindBy(xpath = "(//div[@class='_5v-0 _53im']//div)[2]")
    private ExtendedWebElement alertMessage;

    public boolean isAlertMessagePresent(){
        return alertMessage.isElementPresent();
    }
}
