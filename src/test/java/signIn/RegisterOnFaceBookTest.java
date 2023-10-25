package signIn;

import barreragerman.carina.demo.homePage.HomePage;
import com.qaprosoft.carina.core.foundation.IAbstractTest;
import org.testng.annotations.Test;

import java.util.logging.Logger;

public class RegisterOnFaceBookTest implements IAbstractTest {

     static Logger logger = Logger.getLogger(RegisterOnFaceBookTest.class.getName());

     @Test
     public void registerOnFaceBookTest(){
          HomePage homePage = new HomePage(getDriver());
          homePage.openFaceBook();
          homePage.clickOnRegister();

     }
}
