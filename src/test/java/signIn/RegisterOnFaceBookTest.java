package signIn;

import barreragerman.carina.demo.homePage.HomePage;
import barreragerman.carina.demo.homePage.registerAccount.AlertMessagePage;
import barreragerman.carina.demo.homePage.registerAccount.RegisterAnAccountPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.agent.core.annotation.TestLabel;
import com.zebrunner.carina.core.registrar.ownership.MethodOwner;
import com.zebrunner.carina.core.registrar.tag.Priority;
import com.zebrunner.carina.core.registrar.tag.TestPriority;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class RegisterOnFaceBookTest implements IAbstractTest {

     static Logger logger = Logger.getLogger(RegisterOnFaceBookTest.class.getName());

     @Test
     @MethodOwner(owner = "germanBarrera")
     @TestLabel(name = "feature", value = {"web", "regression"})
     public void InvalidRegisterOnFaceBookTest(){
          HomePage homePage = new HomePage(getDriver());
          homePage.openFaceBook();
          homePage.clickOnRegister();
          RegisterAnAccountPage register = new RegisterAnAccountPage(getDriver());
          register.setNameField().setSurnameField().setCellPhoneEmailField()
                  .setPassword().clickOnDay().pickADay().clickOnDay()
                  .selectMonth().pickMonth().selectMonth()
                  .ClickOnYear().setYear().ClickOnYear()
                  .selectFemale();
          AlertMessagePage alertMessage = register.clickOnRegisterButton();
          Assert.assertTrue(alertMessage.isAlertMessagePresent(),"The assertion failed");

     }
}
