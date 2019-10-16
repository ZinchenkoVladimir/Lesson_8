import com.codeborne.selenide.Condition;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import static com.codeborne.selenide.Selenide.*;
import static com.codeborne.selenide.Condition.*;

public class HomePage {

    private static final String home_page_url ="http://automationpractice.com";

    @FindBy(xpath = "//*[@id='block_top_menu']/ul/li[3]/a")
    public WebElement tshirtsTab;

    @FindBy(xpath = "//input[@id='layered_id_attribute_group_3']")
    public WebElement sizeLcheckbox;

    public HomePage(WebDriver driver) {
        PageFactory.initElements(driver, this);
    }

    public HomePage openMainPage(){
        open(home_page_url);
        return this;
    }

    public HomePage openTShirtTab(){
        $(tshirtsTab).waitUntil(visible,10000).click();
        return this;
    }

    public HomePage selectSizeL(){
        $(sizeLcheckbox).waitUntil(enabled,10000).click();
        return this;
    }

    public boolean isSizeL(){
        return $(sizeLcheckbox).isSelected();
    }
}
