package pages;

import org.openqa.selenium.*;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;

import java.util.List;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class ChatPage extends BasePage {
    public ChatPage(WebDriver driver) {
        super(driver);
    }

    public BasePage isPageOpened() {
        return null;
    }

    public ChatPage openPage() {
        driver.get("https://dev.integrivideo.com/demo/chat/new");
        return this;
    }

    public void writeText(String text) {
        driver.findElement(By.cssSelector("textarea")).sendKeys(text);
    }

    public void clickSend() {
        driver.findElement(By.cssSelector(".integri-chat-send-message")).click();
    }

    public void messageShouldExist(int messageIndex, String text) {
        List<WebElement> messages = driver.findElements(By.cssSelector(".integri-chat-message-text"));
        boolean isExist = messages.get(messageIndex - 1).getText().equals(text);
        assertTrue(isExist, "Message doesn't exist");
    }

    public void clickEnter() {
        WebElement enter = driver.findElement(By.cssSelector(".integri-chat-send-message"));
        enter.sendKeys(Keys.ENTER);
    }

    public void formatMessage(String text) {
        driver.findElement(By.cssSelector(".iv-icon.iv-icon-pencil")).click();
        driver.findElement(By.cssSelector("textarea")).clear();
        driver.findElement(By.cssSelector("textarea")).sendKeys(text);
    }

    public void deleteMessage() {
        driver.findElement(By.cssSelector(".integri-chat-remove-message")).click();
        Alert alert = driver.switchTo().alert();
        driver.switchTo().alert().accept();
    }

    public void clickButtonDragAndDrop() {
        driver.findElement(By.cssSelector(".integri-chat-manual-upload")).click();
    }

    public void clickSetting() {
        driver.findElement(By.cssSelector(".integri-chat-settings")).click();
    }

    public void checkName() {
        driver.findElement(By.name("userName")).clear();
        driver.findElement(By.name("userName")).sendKeys("Veronika");
        String name = driver.findElement(By.name("userName")).getAttribute("value");
        assertEquals(name, "Veronika", "Name doesn't exist");
    }

    public void checkEmail() {
        driver.findElement(By.name("userEmail")).clear();
        driver.findElement(By.name("userEmail")).sendKeys("email@gmail.com");
        String email =driver.findElement(By.name("userEmail")).getAttribute("value");
        assertEquals(email,"email@gmail.com","Email doesn't exist");
    }

    public void checkPhotoURL(){
        driver.findElement(By.name("userPic")).clear();
        driver.findElement(By.name("userPic")).sendKeys("https://sun9-23.userapi.com/c857620/v857620232/18421d/Tex0wW0ghys.jpg");
        String photoURL=driver.findElement(By.name("userPic")).getAttribute("value");
        assertEquals(photoURL,"https://sun9-23.userapi.com/c857620/v857620232/18421d/Tex0wW0ghys.jpg","PhotoURL doesn't exist");
    }

    public void clickSave(){
        driver.findElement(By.cssSelector(".integri-user-settings-save")).click();
    }

    public void clickDragAndDrop(){
        driver.findElement(By.cssSelector(".integri-chat-manual-upload")).click();
    }


}

