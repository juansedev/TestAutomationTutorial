package selenium.core.base;

import org.openqa.selenium.WebDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;


import selenium.core.driver.DriverFactory;

public class BaseTestsWebDriverManager {

    private WebDriver driver;

    @Parameters("browser")
    @BeforeMethod
    public void setUp(String browser) {
        //String url = "https://campusvirtual.univalle.edu.co/moodle/";
        String url = "https://veterinaria-acme.herokuapp.com/";
        driver = DriverFactory.getDriver(browser);
        driver.get(url);
    }

    @AfterMethod
    public void afterMethod(){
        driver.close();
    }

    public WebDriver getDriver() {
        return driver;
    }
}