package barreragerman.carina.demo.homePage;

import com.zebrunner.carina.webdriver.gui.AbstractPage;
import org.openqa.selenium.WebDriver;

public class HomePage extends AbstractPage {
    public HomePage(WebDriver driver) {
        super(driver);
    }
    public void openFaceBook() {
        HomePage homePage = new HomePage(driver);
        homePage.open();
    }
}
