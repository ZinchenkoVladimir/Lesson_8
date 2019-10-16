import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class Home_Page {

    private static final String home_page_url ="http://automationpractice.com";

    @FindBy(xpath = "(.//*[(.)='Contact us'])[1]/preceding::img[1]")
    public WebElement header_image_1;

    @FindBy(xpath = "//img[@class = 'img-responsive']")
    public WebElement header_image_2;

    @FindBy(css = ".shop-phone")
    public WebElement shop_phone_1;

    @FindBy(xpath = "//*[@class = 'shop-phone']")
    public WebElement shop_phone_2;

    @FindBy(css = "#contact-link > a")
    public WebElement contact_us_1;

    @FindBy(xpath = "//a[@title = 'Contact Us' and (text() = 'Contact us' or . = 'Contact us')]")
    public WebElement contact_us_2;

    @FindBy(className = "login")
    public WebElement sign_in_1;

    @FindBy(xpath = "//a[contains(text(),'Sign in')]")
    public WebElement sign_in_2;

    @FindBy(className = "logo img-responsive")
    public WebElement your_logo_1;

    @FindBy(xpath = "//*[@alt = 'My Store']")
    public WebElement your_logo_2;


    public Home_Page(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public Home_Page open_Home_Page(){
        open(home_page_url);
        return this;
    }

    public boolean header_image(){
        return ($(header_image_1).waitUntil(enabled,10000) &&
                $(header_image_2).waitUntil(enabled,10000) &&
                $(shop_phone_1).waitUntil(enabled,10000) &&
                $(shop_phone_2).waitUntil(enabled,10000) &&
                $(contact_us_1).waitUntil(enabled,10000) &&
                $(contact_us_2).waitUntil(enabled,10000) &&
                $(sign_in_1).waitUntil(enabled,10000) &&
                $(sign_in_2).waitUntil(enabled,10000) &&
                $(your_logo_1).waitUntil(enabled,10000) &&
                $(your_logo_2).waitUntil(enabled,10000) &&
                ;
    }

    public Home_Page selectSizeL(){
        $(sizeLcheckbox).waitUntil(enabled,10000).click();
        return this;
    }

    public boolean isSizeL(){
        return $(sizeLcheckbox).isSelected();
    }
}
