package tests;

import org.testng.annotations.Test;

public class ChatTests extends BaseTest {

    @Test(invocationCount = 2)
    public void sendMessage(){
        chatPage.openPage();
        chatPage.writeText("Test");
        chatPage.clickSend();
        chatPage.messageShouldExist(1, "Test");
    }
}
