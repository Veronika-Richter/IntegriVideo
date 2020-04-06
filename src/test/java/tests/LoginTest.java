package tests;

import models.User;
import org.testng.annotations.Test;

public class LoginTest extends BaseTest {

    @Test
    public void login(){
        User user = new User("integritest2.0@mailinator.com", "qwerty-21");
        loginPage
                .openPage()
                .login(user);

    }
}
