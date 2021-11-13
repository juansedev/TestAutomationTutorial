package selenium.test.test.login;

import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import selenium.test.page.veterinaria.VeterinariaLogin;
import selenium.core.base.BaseTestsChromeDriver;


public class PruebaDriverTest extends BaseTestsChromeDriver {


    @DataProvider(name = "dataProvider")
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
        getLogger().info("Iniciando session");
        VeterinariaLogin veterinariaLogin = new VeterinariaLogin(getDriver());
        veterinariaLogin.loginCampus(user,password );
    }
}
