package selenium.core;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import selenium.core.utils.Constants;

public class BrowserActions {

    private final WebDriver driver;
    private final Waits waits;

    public BrowserActions(WebDriver driver, Waits waits) {
        this.driver = driver;
        this.waits = waits;
    }

    /**
     *
     * @return
     */
    public WebDriver getDriver() {
        return driver;
    }

    /**
     *
     * @return
     */
    public Waits getWaits() {
        return waits;
    }

    /**
     *
     * @param element
     * @param msgLog
     */
    public void clickElement(WebElement element) {
        waits.waitForCondition(Constants.TIMEOUT_30_SEC, ExpectedConditions.visibilityOf(element));
        waits.waitForCondition(Constants.TIMEOUT_30_SEC,ExpectedConditions.elementToBeClickable(element));
        element.click();
    }

    /**
     *
     * @param element
     * @param content
     */
    public void sendKeys(WebElement element, String content) {
        waits.waitForCondition(Constants.TIMEOUT_30_SEC, ExpectedConditions.visibilityOf(element));
        element.sendKeys(content);
    }

}
