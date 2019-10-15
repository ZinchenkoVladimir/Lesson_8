import com.codeborne.selenide.Selenide;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class MainPageTest {

    public static WebDriver driver;
    public static MainPage mainPage;
    public static Selenide selenide;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        // win mac linux
        driver = new ChromeDriver();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);

        mainPage = new MainPage(driver);
    }

    @Test
    public void canSelectSizeLForTShirt() {
        Assert.assertTrue(
                mainPage.openMainPage()
                        .openTShirtTab()
                        .selectSizeL()
                        .isSizeL());
    }

    @After
    public void cleanup(){
        driver.manage().deleteAllCookies();
        driver.close();
    }
}
