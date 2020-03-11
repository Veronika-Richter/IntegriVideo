package tests;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import pages.ChatPage;

import java.util.concurrent.TimeUnit;

public class BaseTest {
   private WebDriver driver;
   ChatPage chatPage;

   @BeforeMethod
    public void setUpDriver(){
       System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
       driver = new ChromeDriver();
       driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
       driver.manage().window().maximize();
       chatPage = new ChatPage(driver);
   }

   @AfterMethod(alwaysRun = true)
    public void closeDriver(){
       driver.quit();
   }

}
