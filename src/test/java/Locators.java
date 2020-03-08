import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Locators {

    @Test
    public void findLocators(){
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://dev.integrivideo.com/demo/5e650a1c44add33a9e47cb0e");

        driver.findElement(By.id("invite-users-to-chat"));
        driver.findElement(By.cssSelector(".integri-chat-send-message"));
        driver.findElement(By.cssSelector(".integri-chat-start-video "));
        driver.findElement(By.cssSelector(".integri-chat-message-meta"));
        driver.findElement(By.cssSelector(".integri-chat-message-text"));
        driver.findElement(By.cssSelector(".integri-chat-settings")).click();
        driver.findElement(By.name("userName"));
        driver.findElement(By.name("userEmail"));
        driver.findElement(By.name("userPic"));
        driver.findElement(By.cssSelector(".integri-user-settings-save"));
        driver.findElement(By.cssSelector(".integri-user-settings-reset"));
        driver.findElement(By.cssSelector(".close-integri-modal")).click();
        driver.findElement(By.cssSelector(".integri-chat-message-container"));
//        driver.findElement(By.cssSelector(".integri-chat-edit-message"));
//        driver.findElement(By.cssSelector(".integri-chat-remove-message"));
        driver.findElement(By.cssSelector(".integri-chat-manual-upload")).click();
        driver.findElement(By.cssSelector(".integri-file-upload-manual-init"));
        driver.findElement(By.cssSelector(".integri-file-upload-start"));
        driver.findElement(By.cssSelector(".integri-file-upload-cancel")).click();

    }
}