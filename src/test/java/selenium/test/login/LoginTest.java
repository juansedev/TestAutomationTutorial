package selenium.test.login;

import org.testng.annotations.Test;
import selenium.page.CampusLogin;
import selenium.test.BaseTests;

public class LoginTest extends BaseTests {

    @Test
    public void loginTest() {
        CampusLogin campusLogin = new CampusLogin(getDriver());
        campusLogin.loginCampus("andres.celis@correounivalle.edu.co", "superusuario");
        System.out.println("Abriendo navegador");
    }
}
