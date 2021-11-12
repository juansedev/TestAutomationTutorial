package selenium.core.base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeClass;
import selenium.core.Logging;


public class BaseTestsChromeDriver implements Logging {

    private static String url = "https://veterinaria-acme.herokuapp.com/";
    private WebDriver driver;


    @BeforeClass
    public void setUp() {
        System.setProperty("webdriver.chrome.driver",
                "src/test/resources/chromedriver_win32_95_4638_69/chromedriver.exe");
        getLogger().info("Generando un driver para Chrome");
        getLogger().debug("debug");
        getLogger().error("error");
        getLogger().info("info");
        getLogger().error("Estableciendo URL: " + url);
        driver = new ChromeDriver();
        driver.get(url);
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

    @AfterClass
    public void tearDown() {
        driver.quit();
    }

    public WebDriver getDriver() {
        return driver;
    }
}

