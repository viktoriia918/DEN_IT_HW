package aqa_hw_7.task_3;

import org.openqa.selenium.*;
import org.openqa.selenium.By;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

public class HotlineSamsungTests extends BaseTest {

    @Test
    public void searchSamsungTest() {
        driver.get("https://hotline.ua/");

        WebElement searchBox = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("input[type='text']")));
        searchBox.sendKeys("Samsung");
        searchBox.sendKeys(Keys.ENTER);

        WebElement firstProduct = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("a.item-title")));

        Assert.assertTrue(firstProduct.getText().contains("Samsung Galaxy"),
                "The first product does not match the expected result");
    }

    @Test
    public void feedbackButtonTest() {
        driver.get("https://hotline.ua/");

        WebElement feedbackButton = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("a[href='/ua/feedback/']")));

        ((JavascriptExecutor) driver).executeScript("arguments[0].scrollIntoView(true);", feedbackButton);

        wait.until(ExpectedConditions.elementToBeClickable(feedbackButton)).click();

        WebElement feedbackHeading = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("h1.feedback__title")));

        wait.until(ExpectedConditions.textToBePresentInElement(feedbackHeading, "Зворотний зв'язок для користувачів"));
        Assert.assertTrue(feedbackHeading.getText().contains("Зворотний зв'язок для користувачів"),
                "The title of the feedback page does not match what you expect");
    }
}