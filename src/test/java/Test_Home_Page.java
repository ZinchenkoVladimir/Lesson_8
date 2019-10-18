import com.codeborne.selenide.WebDriverRunner;
import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Test_Home_Page {

    public static WebDriver driver;

    public Test_Home_Page(){
    }

    @Before
    public void setUp() throws Exception {

        System.setProperty("webdriver.chrome.driver", "src/main/resources/chromedriver.exe");
        driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().pageLoadTimeout(60, TimeUnit.SECONDS);
        driver.manage().timeouts().implicitlyWait(15, TimeUnit.SECONDS);
        WebDriverRunner.setWebDriver(driver);
        WebDriverRunner.supportsJavascript();
        WebDriverRunner.supportsModalDialogs();
    }

    @Test
    public void check_elements_presence() throws Exception {

        Home_Page home_page = new Home_Page(driver);
        home_page
                .open_Home_Page()
                .is_header_image_1()
                .is_header_image_2()
                .is_shop_phone_1()
                .is_shop_phone_2()
                .is_contact_us_1()
                .is_contact_us_2()
                .is_sign_in_1()
                .is_sign_in_2()
                .is_your_logo_1()
                .is_your_logo_2()
                .is_search_field_1()
                .is_search_field_2()
                .is_search_button_1()
                .is_search_button_2()
                .is_cart_1()
                .is_cart_2()
                .is_women_1()
                .is_women_2()
                .is_dresses_1()
                .is_dresses_2()
                .is_t_shirts_1()
                .is_t_shirts_2()
                .is_return_to_home_1()
                .is_return_to_home_2()
                .is_authentication_1()
                .is_authentication_2()
                .is_create_an_account_text_1()
                .is_create_an_account_text_2()
                .is_authentication_text_1()
                .is_authentication_text_2()
                .is_email_address_text_1()
                .is_email_address_text_2()
                .is_email_address_field_1()
                .is_email_address_field_2()
                .is_create_an_account_button_1()
                .is_create_an_account_button_2()
                .is_already_registered_text_1()
                .is_already_registered_text_2()
                .is_email_address_text_3()
                .is_email_address_text_4()
                .is_email_address_field_3()
                .is_email_address_field_4()
                .is_password_text_1()
                .is_password_text_2()
                .is_password_field_1()
                .is_password_field_2()
                .is_forgot_your_password_1()
                .is_forgot_your_password_2()
                .is_sign_in_button_1()
                .is_sign_in_button_2()
                .is_enter_your_email_text_1()
                .is_enter_your_email_text_2();
    }

    @After
    public void tearDown() throws Exception {
        driver.manage().deleteAllCookies();
        driver.quit();
    }
}
