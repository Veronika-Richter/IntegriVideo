package tests;

import models.User;
import org.testng.annotations.Test;
import pages.LoginPage;
import pages.ProjectPage;

public class ProjectTest extends BaseTest {
    LoginPage login;
    ProjectPage project;

    @Test
    public void addProject() {
        User user = new User("integritest2.0@mailinator.com", "qwerty-21");
        new LoginPage(driver)
                .openPage()
                .login(user);
        project = new ProjectPage(driver)
                .openProjectPage()
                .addNewProject();



    }
}
