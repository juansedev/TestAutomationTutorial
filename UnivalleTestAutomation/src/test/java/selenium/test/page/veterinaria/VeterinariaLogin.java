package selenium.test.page.veterinaria;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import selenium.test.page.BasePage;

public class VeterinariaLogin extends BasePage {

    @FindBy( css = "input[type='email']")
    private WebElement emailInput;

    @FindBy( css = "input[type='password']")
    private WebElement passwordInput;

    @FindBy( xpath = "//span[contains(text(), 'Login')]")
    private WebElement loginButton;

    public VeterinariaLogin(WebDriver driver) {
        super(driver);
    }

    protected VeterinariaLogin(BasePage page) {
        super(page);
    }

    public void loginCampus(String username, String password) {
        getActions().sendKeys(emailInput, username);
        getActions().sendKeys(passwordInput, password);
        getActions().clickElement(loginButton);
    }
}

