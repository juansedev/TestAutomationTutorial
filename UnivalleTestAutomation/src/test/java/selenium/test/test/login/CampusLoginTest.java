package selenium.test.test.login;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.core.base.BaseTestsChromeDriver;
import selenium.test.page.campus.CampusDashboard;
import selenium.test.page.campus.CampusLogin;


public class CampusLoginTest extends BaseTestsChromeDriver {

    private static final String URL = "https://campusvirtual.univalle.edu.co/moodle/";
    private static final String URL_DASHBOARD = "https://campusvirtual.univalle.edu.co/moodle/my/";


    @DataProvider(name = "dataProvider")
    public Object[][] usersProvider() {

        return new Object[][] {
                {"campus_user", "password", "nombre_completo_mayus"}
        };
    }

    @Test(
        description = "As a TE, I want the ability to create custom lessons for my classroom",
        dataProvider = "dataProvider"
    )
    public void loginTest(String username, String password, String studentName) {
        getLogger().info("Iniciando session");
        CampusLogin campusLogin = new CampusLogin(getDriver());
        Assert.assertEquals(URL, getDriver().getCurrentUrl());
        CampusDashboard campusDashboard = campusLogin.loginCampus(username,password);
        Assert.assertEquals(URL_DASHBOARD, getDriver().getCurrentUrl());
        Assert.assertEquals(campusDashboard.getStudentName(), studentName);
        getLogger().info("*****");
    }
}
