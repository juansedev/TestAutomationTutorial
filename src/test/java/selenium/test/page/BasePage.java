package selenium.test.page;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;
import selenium.core.BrowserActions;
import selenium.core.Waits;

public class BasePage {

    private final WebDriver driver;
    private final Waits waits;
    private final BrowserActions actions;

    private BasePage(WebDriver driver, Waits waits, BrowserActions actions) {
        this.driver = driver;
        this.waits = waits;
        this.actions = actions;
        PageFactory.initElements(driver, this);
    }

    private BasePage(WebDriver driver, Waits waits) {
        this(driver, waits, new BrowserActions(driver, waits));
    }

    /**
     * Base constructor, used if you don't have another page already instantiated (otherwise, use {@link #BasePage(BasePage)}.
     *
     * @param driver {@link WebDriver} driver.
     */
    protected BasePage(WebDriver driver) {
        this(driver, new Waits(driver));
    }

    /**
     * Builds a page using the resources (driver, waits, actions) of another page that's already instantiated.
     *
     * @param page {@link BasePage} page already instantiated.
     */
    protected BasePage(BasePage page) {
        this(page.getDriver(), page.getWaits(), page.getActions());
    }

    public WebDriver getDriver() {
        return driver;
    }

    public Waits getWaits() {
        return waits;
    }

    public BrowserActions getActions() {
        return actions;
    }
}