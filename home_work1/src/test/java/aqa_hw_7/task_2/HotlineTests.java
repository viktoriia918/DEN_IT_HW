package aqa_hw_7.task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;
import org.testng.annotations.Listeners;
import org.testng.annotations.Test;

import java.time.Duration;
import java.util.Set;

@Listeners(TestListener.class)
public class HotlineTests extends BaseTest {

    @Test(dataProvider = "bonusSection", dataProviderClass = TestDataProvider.class)
    public void checkBonusSection(String expectedHeader) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement loyaltyLink = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a[href='/ua/loyalty/']")));
        loyaltyLink.click();

        WebElement header = wait.until(ExpectedConditions.visibilityOfElementLocated(By.tagName("h1")));
        String actualHeader = header.getText();
        Assert.assertEquals(actualHeader, expectedHeader, "Section title does not match");

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
    }

    @Test(dataProvider = "youtubeIcon", dataProviderClass = TestDataProvider.class)
    public void checkYouTubeIcon(String expectedUrlPart) {
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));

        ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");

        WebElement youtube = wait.until(ExpectedConditions.elementToBeClickable(
                By.cssSelector("a.footer__social-item--youtube")));
        youtube.click();

        Set<String> windowHandles = driver.getWindowHandles();
        String currentWindow = driver.getWindowHandle();
        for (String handle : windowHandles) {
            if (!handle.equals(currentWindow)) {
                driver.switchTo().window(handle);
                break;
            }
        }

        String actualUrl = driver.getCurrentUrl();
        Assert.assertTrue(actualUrl.contains(expectedUrlPart), "Wrong page opened: " + actualUrl);
    }
}