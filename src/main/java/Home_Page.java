import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

class Home_Page {

    private static final String home_page_url ="http://automationpractice.com/index.php?controller=authentication&back=my-account#account-creation";

    @FindBy(xpath = "(.//*[(.)='Contact us'])[1]/preceding::img[1]")
    private WebElement header_image_1;

    @FindBy(className = "img-responsive")
    private WebElement header_image_2;

    @FindBy(css = ".shop-phone")
    private WebElement shop_phone_1;

    @FindBy(xpath = "//*[@class = 'shop-phone']")
    private WebElement shop_phone_2;

    @FindBy(css = "#contact-link > a")
    private WebElement contact_us_1;

    @FindBy(xpath = "//a[@title = 'Contact Us' and (text() = 'Contact us' or . = 'Contact us')]")
    private WebElement contact_us_2;

    @FindBy(className = "login")
    private WebElement sign_in_1;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    private WebElement sign_in_2;

    @FindBy(css = "img[class = 'logo img-responsive']")
    private WebElement your_logo_1;

    @FindBy(xpath = "//img[@alt = 'My Store']")
    private WebElement your_logo_2;

    @FindBy(id = "search_query_top")
    private WebElement search_field_1;

    @FindBy(xpath = "//input[@id='search_query_top']")
    private WebElement search_field_2;

    @FindBy(name = "submit_search")
    private WebElement search_button_1;

    @FindBy(xpath = "//button[@name='submit_search']")
    private WebElement search_button_2;

    @FindBy(xpath = "//b[(text() = 'Cart')]")
    private WebElement cart_1;

    @FindBy(xpath = "//header[@id='header']//b")
    private WebElement cart_2;

    @FindBy(xpath = "(.//*[(.)='Categories'])[1]/following::a[1]")
    private WebElement women_1;

    @FindBy(xpath = "//a[@title = 'Women']")
    private WebElement women_2;

    @FindBy(xpath = "(//a[contains(text(),'Dresses')])[5]")
    private WebElement dresses_1;

    @FindBy(xpath = "(.//*[(.)='Summer Dresses'])[1]/following::a[1]")
    private WebElement dresses_2;

    @FindBy(xpath = "(//a[contains(text(),'T-shirts')])[2]")
    private WebElement t_shirts_1;

    @FindBy(xpath = "(.//*[(.)='Summer Dresses'])[3]/following::a[1]")
    private WebElement t_shirts_2;

    @FindBy(className = "icon-home")
    private WebElement return_to_home_1;

    @FindBy(xpath = "//i[@class = 'icon-home']")
    private WebElement return_to_home_2;

    @FindBy(className = "navigation_page")
    private WebElement authentication_1;

    @FindBy(xpath = "//span[@class = 'navigation_page']")
    private WebElement authentication_2;

    @FindBy(xpath = "//h3[(text() = 'Create an account' or . = 'Create an account')]")
    private WebElement create_an_account_text_1;

    @FindBy(xpath = "(.//*[(.)='Email address'])[1]/preceding::h3[1]")
    private WebElement create_an_account_text_2;

    @FindBy(tagName = "h1")
    private WebElement authentication_text_1;

    @FindBy(xpath = "//h1")
    private WebElement authentication_text_2;

    @FindBy(xpath = "//p[text() = 'Please enter your email address to create an account.']")
    private WebElement enter_your_email_text_1;

    @FindBy(xpath = "(.//*[(.)='Email address'])[1]/preceding::p[1]")
    private WebElement enter_your_email_text_2;

    @FindBy(xpath = "//label[@for = 'email_create']")
    private WebElement email_address_text_1;

    @FindBy(xpath = "//form[@id='create-account_form']//label")
    private WebElement email_address_text_2;

    @FindBy(id = "email_create")
    private WebElement email_address_field_1;

    @FindBy(xpath = "//input[@id = 'email_create']")
    private WebElement email_address_field_2;

    @FindBy(css = "button[class = 'btn btn-default button button-medium exclusive']")
    private WebElement create_an_account_button_1;

    @FindBy(xpath = "//button[@id = 'SubmitCreate']")
    private WebElement create_an_account_button_2;

    @FindBy(xpath = "//h3[(text() = 'Already registered?')]")
    private WebElement already_registered_text_1;

    @FindBy(xpath = "//form[@id='login_form']/h3")
    private WebElement already_registered_text_2;

    @FindBy(xpath = "//label[@for = 'email']")
    private WebElement email_address_text_3;

    @FindBy(xpath = "(.//*[(.)='Already registered?'])[1]/following::label[1]")
    private WebElement email_address_text_4;

    @FindBy(id = "email")
    private WebElement email_address_field_3;

    @FindBy(xpath = "//input[@id = 'email']")
    private WebElement email_address_field_4;

    @FindBy(xpath = "//label[@for = 'passwd']")
    private WebElement password_text_1;

    @FindBy(xpath = "(.//*[(.)='Forgot your password?'])[1]/preceding::label[1]")
    private WebElement password_text_2;

    @FindBy(id = "passwd")
    private WebElement password_field_1;

    @FindBy(xpath = "//input[@name = 'passwd']")
    private WebElement password_field_2;

    @FindBy(xpath = "//a[(text() = 'Forgot your password?')]")
    private WebElement forgot_your_password_1;

    @FindBy(xpath = "(.//*[(.)='Password'])[1]/following::a[1]")
    private WebElement forgot_your_password_2;

    @FindBy(id = "SubmitLogin")
    private WebElement sign_in_button_1;

    @FindBy(xpath = "//button[@name = 'SubmitLogin']")
    private WebElement sign_in_button_2;

    Home_Page(WebDriver driver) throws Exception {
        PageFactory.initElements(driver, this);
    }

    Home_Page open_Home_Page() throws Exception {
        open(home_page_url);
        return this;
    }

    Home_Page is_header_image_1() throws Exception {
        $(header_image_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_header_image_2() throws Exception {
        $(header_image_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_shop_phone_1() throws Exception {
        $(shop_phone_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_shop_phone_2() throws Exception {
        $(shop_phone_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_contact_us_1() throws Exception {
        $(contact_us_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_contact_us_2() throws Exception {
        $(contact_us_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_sign_in_1() throws Exception {
        $(sign_in_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_sign_in_2() throws Exception {
        $(sign_in_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_your_logo_1() throws Exception {
        $(your_logo_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_your_logo_2() throws Exception {
        $(your_logo_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_search_field_1() throws Exception {
        $(search_field_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_search_field_2() throws Exception {
        $(search_field_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_search_button_1() throws Exception {
        $(search_button_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_search_button_2() throws Exception {
        $(search_button_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_cart_1() throws Exception {
        $(cart_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_cart_2() throws Exception {
        $(cart_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_women_1() throws Exception {
        $(women_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_women_2() throws Exception {
        $(women_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_dresses_1() throws Exception {
        $(dresses_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_dresses_2() throws Exception {
        $(dresses_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_t_shirts_1() throws Exception {
        $(t_shirts_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_t_shirts_2() throws Exception {
        $(t_shirts_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_return_to_home_1() throws Exception {
        $(return_to_home_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_return_to_home_2() throws Exception {
        $(return_to_home_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_authentication_1() throws Exception {
        $(authentication_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_authentication_2() throws Exception {
        $(authentication_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_create_an_account_text_1() throws Exception {
        $(create_an_account_text_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_create_an_account_text_2() throws Exception {
        $(create_an_account_text_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_authentication_text_1() throws Exception {
        $(authentication_text_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_authentication_text_2() throws Exception {
        $(authentication_text_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_text_1() throws Exception {
        $(email_address_text_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_text_2() throws Exception {
        $(email_address_text_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_field_1() throws Exception {
        $(email_address_field_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_field_2() throws Exception {
        $(email_address_field_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_create_an_account_button_1() throws Exception {
        $(create_an_account_button_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_create_an_account_button_2() throws Exception {
        $(create_an_account_button_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_already_registered_text_1() throws Exception {
        $(already_registered_text_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_already_registered_text_2() throws Exception {
        $(already_registered_text_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_text_3() throws Exception {
        $(email_address_text_3).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_text_4() throws Exception {
        $(email_address_text_4).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_field_3() throws Exception {
        $(email_address_field_3).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_email_address_field_4() throws Exception {
        $(email_address_field_4).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_password_text_1() throws Exception {
        $(password_text_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_password_text_2() throws Exception {
        $(password_text_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_password_field_1() throws Exception {
        $(password_field_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_password_field_2() throws Exception {
        $(password_field_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_forgot_your_password_1() throws Exception {
        $(forgot_your_password_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_forgot_your_password_2() throws Exception {
        $(forgot_your_password_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_sign_in_button_1() throws Exception {
        $(sign_in_button_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_sign_in_button_2() throws Exception {
        $(sign_in_button_2).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_enter_your_email_text_1() throws Exception {
        $(enter_your_email_text_1).waitUntil(enabled,10000).is(visible);
        return this;
    }

    Home_Page is_enter_your_email_text_2() throws Exception {
        $(enter_your_email_text_2).waitUntil(enabled,10000).is(visible);
        return this;
    }
}
