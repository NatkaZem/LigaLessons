package homeWorkMVideo;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class Steps {
    private MvideoFridgePage mvideoFridgePage;

        public Steps() {
            mvideoFridgePage = MvideoFridgePage.getMvideoFridgePage();
        }

        public void checkThatProductImageIsEqualsTo(String expectedImage) {
            Object actualImage = mvideoFridgePage.getProductImage();
            Assert.assertEquals(actualImage, expectedImage);
        }

//        //степ установки радиобатона
//        WebElement elementRadioButton = driver.findElement(By.xpath("//div[contains(@class, 'switcher-block')][mvid-switcher[.//a[text() = ' %s ']]]"));
//            elementRadioButton.click();
//
//
//        //степ установки номера страницы в пагинации
//        WebElement elementPagination = driver.findElement(By.xpath("//div[contains(@class, 'bottom-controls')]//a[text() = '%s']"));
//    elementPagination.click();
//
//
//        //степ установки чекбокса
//        WebElement elementCheckbox = driver.findElement(By.xpath("//div[(@class = 'checkbox')][mvid-icon[@class = 'checkbox__icon']]//span[@class = 'checkbox__content'][.//a[text() = ' %s ']]"));
//    elementCheckbox.click();

    }

