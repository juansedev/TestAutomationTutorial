package selenium.test.page.campus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.page.BasePage;

public class CampusDashboard extends BasePage {

    @FindBy( css = "#userfullname_header_dashboard h4")
    private WebElement studentName;

    public CampusDashboard(WebDriver driver) {
        super(driver);
    }

    public CampusDashboard(BasePage page) {
        super(page);
    }

    public String getStudentName() {
        return getActions().getText(studentName);
    }
}
