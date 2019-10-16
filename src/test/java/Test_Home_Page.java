import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_Home_Page {

    private WebDriver driver;
    public static Home_Page homePage;

    @Before
    public void setUp() throws Exception {
        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(50, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);

        homePage = new Home_Page(driver);
    }

    @Test
    public void canSelectSizeLForTShirt() {

        Assert.assertTrue(
                homePage.openMainPage()
                        .openTShirtTab()
                        .selectSizeL()
                        .isSizeL());
    }

    @After
    public void cleanup(){
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
