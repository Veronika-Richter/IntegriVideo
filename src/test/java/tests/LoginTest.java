package tests;

import models.User;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        User user = new User("knfr@mail.ru", "rfofrpkr");
        loginPage
                .openPage()
                .login(user);

    }
}
