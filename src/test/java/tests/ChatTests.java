package tests;

import org.testng.annotations.Test;

public class ChatTests extends BaseTest {

    @Test
    public void sendMessage() {
        chatPage.openPage();
        chatPage.writeText("Test");
        chatPage.clickSend();
        chatPage.messageShouldExist(1, "Test");
    }

    @Test
    public void sendMessageByEnter() {
        chatPage.openPage();
        chatPage.writeText("Test");
        chatPage.clickEnter();
        chatPage.messageShouldExist(1, "Test");
    }

    @Test
    public void sendLongMessage() {
        chatPage.openPage();
        chatPage.writeText("Test");
        chatPage.clickEnter();
        chatPage.messageShouldExist(1, "Test");
    }

    @Test
    public void sendHTMLcode() {
        chatPage.openPage();
        chatPage.writeText("<html><body><p>test</p></body></html>");
        chatPage.clickEnter();
        chatPage.messageShouldExist(1, "<html><body><p>test</p></body></html>");
    }

    @Test
    public void sendURL() {
        chatPage.openPage();
        chatPage.writeText("http://tms-auto.tilda.ws/");
        chatPage.clickSend();
        chatPage.messageShouldExist(1, "http://tms-auto.tilda.ws/");
    }

    @Test
    public void formatMessage() {
        chatPage.openPage();
        chatPage.writeText("Test");
        chatPage.clickSend();
        chatPage.formatMessage("New text");
        chatPage.clickSend();
        chatPage.messageShouldExist(1, "New text");
    }

    @Test
    public void deleteMessage() {
        chatPage.openPage();
        chatPage.writeText("Test");
        chatPage.clickSend();
        chatPage.deleteMessage();
        chatPage.messageShouldExist(1, "removed...");
    }
}

