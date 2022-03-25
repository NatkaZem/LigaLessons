package homeWorkMVideo;

import com.codeborne.selenide.Selenide;
import com.codeborne.selenide.SelenideElement;
import lesson_11.homework.pages.ProductCard;

public class MVideoProductCard {

    private SelenideElement titleLineContainer;
    private SelenideElement priceLabel;
    private SelenideElement addToCartButton;
    private SelenideElement addToFavoritesButton;
    private SelenideElement addToComparisonButton;
    private SelenideElement pictureOfProduct;
    private SelenideElement priceLabel_1;
    private SelenideElement ratingStars;
    private SelenideElement ratingReview;
    private SelenideElement amountOfBonus;
    private SelenideElement onlyOneThing;
    private SelenideElement addRadioButton;
    private SelenideElement addCheckBox;
    private SelenideElement addPagination;
    private SelenideElement addPaginationSing;

    private final String XPATH_TITLE_LINE_CONTAINER = "//div[contains(@class, 'product-card__title-line-container')]";
    private final String XPATH_NESTED_NAME_LINK = "[mvid-plp-product-title[.//a[text() = ' %s ']]]";


    private ProductCard(String productName) {
        //название и модель холодильника:
        String titleContainerPath = String.format(XPATH_TITLE_LINE_CONTAINER + XPATH_NESTED_NAME_LINK, productName);
        titleLineContainer = Selenide.$x(titleContainerPath);

        //актуальная цена холодильника:
        priceLabel = Selenide.$x(titleContainerPath +
                "/following-sibling::div[contains(@class, 'product-card__price-block-container')]" +
                "//span[@class = 'price__main-value']");

        //зачеркнутая цена холодильника:
        priceLabel_1 = Selenide.$x(titleContainerPath +
                "/following-sibling::div[contains(@class, 'product-card__price-block-container')]" +
                "//span[@class = 'price__sale-value']");

        //картинка с изображением холодильника (%s = productName):
        pictureOfProduct = Selenide.$x("//div[contains(@class,'product-picture-container')]//img[@alt = ' %s ']");


        //рейтинг холодильника:
        String followingSiblingProductRatingContainer = "//following-sibling::mvid-plp-product-rating";
        // рейтинг холодильника - звёзды:
        ratingStars = Selenide.$x(titleContainerPath + followingSiblingProductRatingContainer + "//child::mvid-star-rating");
        //рейтинг холодильника - количество отзывов (%s - например, 79 отзывов):
        ratingReview = Selenide.$x(titleContainerPath + followingSiblingProductRatingContainer + "[.//*[text() = ' %s ']]");


        //количество бонусных рублей:
        amountOfBonus = Selenide.$x(titleContainerPath +
                "/following-sibling::div[contains(@class, 'product-card__mbonus-block-container')]" +
                "//span[@class = 'mbonus-block__value']");


        //надпись "Осталась одна штука!"
        onlyOneThing = Selenide.$x("//div[contains(@class, 'product-card__notification-container')]//child::div");


        //кнопка "В корзину":
        String followingSiblingProductCheckoutButtonsContainer = "/following-sibling::mvid-plp-product-checkout";
        addToCartButton = Selenide.$x(titleContainerPath +
                followingSiblingProductCheckoutButtonsContainer + "//button[span[text() = 'В корзину']]");
        //кнопка "Сердечко":
        addToFavoritesButton = Selenide.$x(titleContainerPath +
                followingSiblingProductCheckoutButtonsContainer + "//div[contains(@class, 'wishlist-button-block')]//button");
        //кнопка "Сравнение":
        addToComparisonButton = Selenide.$x(titleContainerPath +
                followingSiblingProductCheckoutButtonsContainer + "//div[contains(@class, 'compare-button-block')]//button");

        //Радиобатон (%s = Текст радиобатона)
        addRadioButton = Selenide.$x("//div[contains(@class, 'switcher-block')][mvid-switcher[.//*[text() = ' %s ']]]");

        //Чекбокс (%s - Текст чекбокса)
        addCheckBox = Selenide.$x("//div[(@class = 'checkbox')][mvid-icon[@class = 'checkbox__icon']]//span[@class = 'checkbox__content'][.//*[text() = ' %s ']]");

        //Пагинация (%s - Номер страницы)
        String bottomControls = "//div[contains(@class, 'bottom-controls')]";
        addPagination = Selenide.$x(bottomControls + "//a[text() = '%s']");
        //Пагинация (знаки < >)
        addPaginationSing = Selenide.$x(bottomControls + "//mvid-icon");

    }

    static ProductCard getProductCard(String productName) {
        return new ProductCard(productName);
    }
}
