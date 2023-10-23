package signIn;

import barreragerman.carina.demo.homePage.HomePage;
import barreragerman.carina.demo.homePage.iLogIn.ILogIn;
import barreragerman.carina.demo.homePage.signInPage.BadCredentialMessage;
import barreragerman.carina.demo.homePage.signInPage.LoginPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class LoginTest implements IAbstractTest, ILogIn {

    static Logger logger = Logger.getLogger(LoginTest.class.getName());

    @Test
    public void testLogin() {
        HomePage homePage = new HomePage(getDriver());
        homePage.openFaceBook();
        login();
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.clickOnLoginButton();
        BadCredentialMessage badMessage = new BadCredentialMessage(getDriver());
        Assert.assertTrue(badMessage.isWrongCredentialsMessagePresent(), "Invalid Credentials");

        if (badMessage.isWrongCredentialsMessagePresent()) {
            logger.info("The Credentials are invalid");
        }

    }
}
