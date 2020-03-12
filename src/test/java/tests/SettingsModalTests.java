package tests;

import org.testng.annotations.Test;

public class SettingsModalTests extends BaseTest {

    @Test
    public void checkSetting(){
        chatPage.openPage();
        chatPage.clickSetting();
        chatPage.checkName();
        chatPage.checkEmail();
        chatPage.checkPhotoURL();
        chatPage.clickSave();
    }
}




