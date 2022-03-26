package homeWorkMVideo;

import com.codeborne.selenide.SelenideElement;

public class Steps {

    private MVideoProductCard mVideoProductCard;

    public Steps(String productName) {
        this.mVideoProductCard = MVideoProductCard.getMvideoProductCard(productName);
    }

    //степ установки радиобаттона
    public void clickOnRadiobutton(String expectRadioButton) {
        SelenideElement radioButton = mVideoProductCard.getAddRadioButton();
        radioButton.click();
    }

    //степ установки чекбокса
    public void clickOnCheckbox(String expectCheckBox) {
        SelenideElement checkBox = mVideoProductCard.getAddCheckBox();
        checkBox.click();
    }

    //степ переключения страницы пагинации
    public void clickOnPagination(String expectPagination) {
        SelenideElement paginationPage = mVideoProductCard.getAddPagination();
        paginationPage.click();
    }

    //степ поиска товара по имени
    public void findElement(String productName) {
        mVideoProductCard = MVideoProductCard.getMvideoProductCard(productName);
    }
}
