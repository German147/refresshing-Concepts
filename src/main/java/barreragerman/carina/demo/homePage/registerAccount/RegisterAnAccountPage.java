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
    @FindBy(css = "select[name='birthday_day']")
    private ExtendedWebElement selectDay;
    @FindBy(xpath = "//option[text()='8']")
    private ExtendedWebElement pickerDay;
    @FindBy(id = "month")
    private ExtendedWebElement month;
    @FindBy(id = "year")
    private ExtendedWebElement year;
    @FindBy(xpath = "//option[text()='mar']")
    private ExtendedWebElement pickMonth;
    @FindBy(css = "input[type='password']")
    private ExtendedWebElement setPassword;

    @FindBy(css = "option[value='1984']")
    private ExtendedWebElement setYear;

    @FindBy(xpath = "(//input[@type='radio'])[1]")
    private ExtendedWebElement selectFemale;

    @FindBy(css = "button[name='websubmit']")
    private ExtendedWebElement registerButton;





    public RegisterAnAccountPage(WebDriver driver) {
        super(driver);
    }

    public RegisterAnAccountPage setNameField(){
        nameField.type("German");
        return this;
    }
    public RegisterAnAccountPage setSurnameField(){
        surnamaneField.type("Barrera");
        return this;
    }
    public RegisterAnAccountPage setCellPhoneEmailField(){
        cellPhoneEmailField.type("123234");
        return this;
    }
    public RegisterAnAccountPage clickOnDay(){
        selectDay.click();
        return this;
    }
    public RegisterAnAccountPage pickADay(){
        pickerDay.click();
        return this;
    }
    public RegisterAnAccountPage selectMonth(){
        month.click();
        return this;
    }
    public RegisterAnAccountPage pickMonth(){
        pickMonth.click();
        return this;
    }
    public RegisterAnAccountPage setPassword(){
        setPassword.type("myPAssword");
        return this;
    }
    public RegisterAnAccountPage ClickOnYear(){
       year.click();
        return this;
    }
    public RegisterAnAccountPage setYear(){
        setYear.click();
        return this;
    }
    public RegisterAnAccountPage selectFemale(){
      selectFemale.click();
        return this;
    }
    public AlertMessagePage clickOnRegisterButton(){
        registerButton.click();
        return new AlertMessagePage(getDriver());
    }

}
