package barreragerman.carina.demo.homePage;

import barreragerman.carina.demo.homePage.registerAccount.RegisterAnAccountPage;
import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class HomePage extends AbstractPage {

    @FindBy(className = "_97w5")
    private ExtendedWebElement registerButton;
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openFaceBook() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
    }

    public RegisterAnAccountPage clickOnRegister(){
        registerButton.click();
        return new RegisterAnAccountPage(getDriver());
    }
}
