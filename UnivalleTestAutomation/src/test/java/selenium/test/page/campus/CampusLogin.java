package selenium.test.page.campus;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.core.utils.Constants;
import selenium.test.page.BasePage;

import java.util.List;

public class CampusLogin extends BasePage {

    @FindBy( id = "loginbox-uv")
    private WebElement loginForm;

    @FindBy( css = "#username")
    private WebElement usernameInput;

    @FindBy( css = "#password")
    private WebElement passwordInput;

    @FindBy( xpath = "//button[contains(@class,'btn-login')]")
    private WebElement loginButton;

    @FindBy( css = ".card-img-top")
    List<WebElement> cardImages;

    public CampusLogin(WebDriver driver) {
        super(driver);
        loadPage();
    }

    protected CampusLogin(BasePage page) {
        super(page);
        loadPage();
    }

    public CampusDashboard loginCampus(String username, String password) {
        getLogger().info("Logueando al usuario " + username);
        getActions().sendKeys(usernameInput, username);
        getActions().sendKeys(passwordInput, password);
        getActions().clickElement(loginButton);
        return new CampusDashboard(this);
    }

    /**
     *
     */
    protected void loadPage() {
        getLogger().info("Esperando a que carguen los card WebElements");
        getWaits().waitForCondition(Constants.TIMEOUT_30_SEC, ExpectedConditions.visibilityOfAllElements(cardImages));
    }
}