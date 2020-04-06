package pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class ProjectPage extends BasePage {

    public ProjectPage isPageOpened() {
        return null;
    }

    public ProjectPage openPage() {
        return null;
    }
    public ProjectPage(WebDriver driver) {
        super(driver);
    }

    public ProjectPage openProjectPage() {
        driver.findElement(By.xpath("//a[contains(text(), 'Projects')]")).click();
        return this;
    }
    public ProjectPage addNewProject() {
        return this;
    }
}
