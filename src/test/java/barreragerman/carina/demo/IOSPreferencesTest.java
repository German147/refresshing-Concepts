package barreragerman.carina.demo;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;

import com.qaprosoft.carina.core.foundation.IAbstractTest;
import barreragerman.carina.demo.mobile.gui.pages.ios.PreferencesPage;
import barreragerman.carina.demo.utils.MobileContextUtils;
import com.zebrunner.carina.utils.mobile.IMobileUtils;

import io.appium.java_client.InteractsWithApps;

public class IOSPreferencesTest implements IAbstractTest, IMobileUtils {
    
    @Test
    public void nativePreferencesTest() {
        WebDriver driver = getDriver();
        MobileContextUtils contextUtils = new MobileContextUtils();
        ((InteractsWithApps) contextUtils.getPureDriver(driver)).activateApp("com.apple.Preferences");
        PreferencesPage preferencesPage = new PreferencesPage(driver);
        preferencesPage.clickGeneralBtn();
        driver.navigate().back();
    }

}
