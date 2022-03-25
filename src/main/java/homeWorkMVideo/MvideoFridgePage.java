package homeWorkMVideo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import org.openqa.selenium.support.FindBy;

import java.util.Objects;

public class MvideoFridgePage {

    private static MvideoFridgePage mvideoFridgePage;

    private final String XPATH_FRIDGE_LIST = "";

    @FindBy(xpath = XPATH_FRIDGE_LIST + "//div[contains(@class,'product-picture-container')]//img[@alt = ' %s ']")
    private SelenideElement productImage;

    @FindBy(xpath = XPATH_FRIDGE_LIST + "//div[(@class = 'checkbox')][mvid-icon[@class = 'checkbox__icon']]//span[@class = 'checkbox__content'][.//a[text() = ' %s ']]")
    private SelenideElement checkBoxWithFridgeDownBox;

    @FindBy(xpath = XPATH_FRIDGE_LIST + "//div[@class = 'input__container']//input[@id = %s]")
    private SelenideElement searchValue;

    @FindBy(xpath = XPATH_FRIDGE_LIST + "//div[@class = 'input__container']/child::div")
    private SelenideElement glassInSearchValue;

    @FindBy(xpath = "//div[(@class = 'checkbox')][mvid-icon[@class = 'checkbox__icon']]//span[@class = 'checkbox__content'][.//a[text() = ' %s']]//span[@class = 'count']")
    private SelenideElement stars;

    @FindBy(xpath = XPATH_FRIDGE_LIST + "//div[contains(@class, 'bottom-controls')]//li[contains(@class,'active')]")
    private SelenideElement windowsWithDigital;

    @FindBy(xpath = XPATH_FRIDGE_LIST + "//div[contains(@class, 'bottom-controls')]//a[text() = '%s']")
    private SelenideElement windowsWithDigitalWithoutPut;


    private MvideoFridgePage() {
    }

    public static MvideoFridgePage getMvideoFridgePage() {
        if (Objects.isNull(mvideoFridgePage)) mvideoFridgePage = Selenide.page(new MvideoFridgePage());
        return mvideoFridgePage;
    }

    public SelenideElement getProductImage() {
        return Selenide.$x(XPATH_FRIDGE_LIST + "//div[contains(@class,'product-picture-container')]//img[@alt = ' %s ']");
    }

    public SelenideElement checkBoxWithFridgeDownBox() {
        return Selenide.$x(XPATH_FRIDGE_LIST + "//div[(@class = 'checkbox')][mvid-icon[@class = 'checkbox__icon']]//span[@class = 'checkbox__content'][.//a[text() = ' %s ']]");
    }

    public SelenideElement getSearchValue() {
        return Selenide.$x(XPATH_FRIDGE_LIST + "//div[@class = 'input__container']//input[@id = %s]");
    }

    public SelenideElement getGlassInSearchValue() {
        return Selenide.$x(XPATH_FRIDGE_LIST + "//div[@class = 'input__container']/child::div");
    }

    public SelenideElement getStars() {
        return Selenide.$x(XPATH_FRIDGE_LIST + "//div[(@class = 'checkbox')][mvid-icon[@class = 'checkbox__icon']]//span[@class = 'checkbox__content'][.//a[text() = ' %s']]//span[@class = 'count']");
    }

    public SelenideElement getWindowsWithDigital() {
        return Selenide.$x(XPATH_FRIDGE_LIST + "//div[contains(@class, 'bottom-controls')]//li[contains(@class,'active')]");
    }

    public SelenideElement getWindowsWithDigitalWithoutPut() {
        return Selenide.$x(XPATH_FRIDGE_LIST + "//div[contains(@class, 'bottom-controls')]//a[text() = '%s']");
    }
}
