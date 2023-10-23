package barreragerman.carina.demo.homePage.iLogIn;

import barreragerman.carina.demo.homePage.HomePage;
import barreragerman.carina.demo.homePage.signInEnum.EnumSignIn;
import barreragerman.carina.demo.homePage.signInPage.LoginPage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import com.zebrunner.carina.utils.R;

import static barreragerman.carina.demo.homePage.signInEnum.EnumSignIn.PASSWORD;
import static barreragerman.carina.demo.homePage.signInEnum.EnumSignIn.USER;

public interface ILogIn extends IAbstractTest {

    default void login(){
        HomePage homePage = new HomePage(getDriver());
        LoginPage loginPage = new LoginPage(getDriver());
        homePage.openFaceBook();
        loginPage.typeInput(USER, R.TESTDATA.get("username"));
        loginPage.typeInput(PASSWORD,R.TESTDATA.get("password"));
    }
}
