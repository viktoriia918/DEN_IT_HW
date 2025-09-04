package aqa_hw_7.task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.testng.Assert;
import org.testng.annotations.Test;

import java.time.Instant;

public class NegativeSearchTest extends BaseTest {
    @Test
    public void searchInvalidProduct() {
        driver.get("https://hotline.ua/");

        WebElement searchBox = wait.until(ExpectedConditions
                .elementToBeClickable(By.cssSelector("input[type='text']")));
        searchBox.click();
        searchBox.clear();

        String invalidText = "cmghhknklnlkmhouh;";
        searchBox.sendKeys(invalidText);
        wait.until(ExpectedConditions.textToBePresentInElementValue(searchBox, invalidText));
        searchBox.sendKeys(Keys.ENTER);

        WebElement noResults = wait.until(ExpectedConditions
                .visibilityOfElementLocated(By.cssSelector("div.search__no-items > div.search__no-items-title")));
        wait.until(ExpectedConditions.textToBePresentInElement(noResults, invalidText));

        Assert.assertTrue(noResults.isDisplayed(), "No message about no results is displayed!");
        Assert.assertTrue(noResults.getText().contains(invalidText),
                "The message about no results does not contain the entered query!");
    }
}