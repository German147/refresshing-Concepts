package barreragerman.carina.demo.homePage.registerAccount;

import com.zebrunner.carina.webdriver.decorator.ExtendedWebElement;
import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.FindBy;

public class RegisterAnAccountPage extends AbstractPage {

    @FindBy(css = "input[name='firstname']")
    private ExtendedWebElement nameField;
    @FindBy(css = "input[name='lastname']")
    private ExtendedWebElement surnamaneField;
    @FindBy(css = "input[name='reg_email__']")
    private ExtendedWebElement cellPhoneEmailField;
    public RegisterAnAccountPage(WebDriver driver) {
        super(driver);
    }

    public void setNameField(){
        nameField.type("German");
    }
    public void setSurnamaneField(){
        surnamaneField.type("Barrera");
    }
    public void setCellPhoneEmailField(){
        cellPhoneEmailField.type("123234");
    }
}
