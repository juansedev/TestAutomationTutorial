package selenium.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.Wait;

public class CampusLogin extends BasePage{


    public CampusLogin(WebDriver driver) {
        super(driver);
    }

    protected CampusLogin(BasePage page) {
        super(page);
    }
}
