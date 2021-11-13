package selenium.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CampusLogin extends BasePage{

    @FindBy( css = "input[type='email']")
    private WebElement emailInput;

    @FindBy( css = "input[type='password']")
    private WebElement passwordInput;

    @FindBy( xpath = "//span[contains(text(), 'Login')]")
    private WebElement loginButton;

    public CampusLogin(WebDriver driver) {
        super(driver);
    }

    protected CampusLogin(BasePage page) {
        super(page);
    }

    public void loginCampus(String username, String password) {
        getActions().sendKeys(emailInput, username);
        getActions().sendKeys(passwordInput, password);
        getActions().clickElement(loginButton);
    }
}

