package barreragerman.carina.demo.homePage.iLogIn;

import barreragerman.carina.demo.homePage.HomePage;
import barreragerman.carina.demo.homePage.signInEnum.EnumSignIn;
import barreragerman.carina.demo.homePage.signInPage.BadCredentialMessage;
import barreragerman.carina.demo.homePage.signInPage.LoginPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.utils.R;
import org.testng.Assert;

import static barreragerman.carina.demo.homePage.signInEnum.EnumSignIn.PASSWORD;
import static barreragerman.carina.demo.homePage.signInEnum.EnumSignIn.USER;

public interface ILogIn extends IAbstractTest {

    default void login(){
        LoginPage loginPage = new LoginPage(getDriver());
        loginPage.typeInput(USER, R.TESTDATA.get("username"));
        loginPage.typeInput(PASSWORD,R.TESTDATA.get("password"));

    }
}
