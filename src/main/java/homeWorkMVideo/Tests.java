package homeWorkMVideo;

import com.codeborne.selenide.Selenide;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class Tests {
    private Steps steps = new Steps();

    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
    }

    @Test
    public void test() {
        Selenide.open("https://www.mvideo.ru/product-list-page?q=%D1%85%D0%BE%D0%BB%D0%BE%D0%B4%D0%B8%D0%BB%D1%8C%D0%BD%D0%B8%D0%BA&category=holodilniki-i-morozilnye-kamery-159");
        steps.checkThatProductImageIsEqualsTo("Тостер Haier LE65U6900UG");
        Selenide.sleep(1000);
    }

}
