package selenium.test.test.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.test.page.CampusLogin;
import selenium.core.base.BaseTestsWebDriverManager;

public class PruebaTest extends BaseTestsWebDriverManager {

    @DataProvider(name = "dataProvider", parallel = true)
    public Object[][] usersProvider() {

        return new Object[][] {
                {"andres.celis@correounivalle.edu.co", "superusuario"}
        };
    }


    @Test(
        description = "As a TE, I want the ability to create custom lessons for my classroom",
        dataProvider = "dataProvider"
    )
    public void loginTest(String user, String password) {
        CampusLogin campusLogin = new CampusLogin(getDriver());
        campusLogin.loginCampus(user,password );
        System.out.println("Abriendo navegador");
    }
}
