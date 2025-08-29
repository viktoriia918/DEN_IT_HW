package aqa_hw_6.task_5;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://hotline.ua/ua/brands/lego/");

            FluentWait<WebDriver> wait = new FluentWait<>(driver)
                    .withTimeout(Duration.ofSeconds(15))
                    .pollingEvery(Duration.ofSeconds(1))
                    .ignoring(NoSuchElementException.class);

            wait.until(d -> !d.findElements(By.cssSelector("div.list-item__title-container a.item-title")).isEmpty());

            int previousCount = 0;
            boolean loadMore = true;

            while (loadMore) {

                ((JavascriptExecutor) driver).executeScript("window.scrollTo(0, document.body.scrollHeight);");
                sleep(1000);

                List<WebElement> products = driver.findElements(By.cssSelector("div.list-item__title-container a.item-title"));

                if (products.size() > previousCount) {
                    previousCount = products.size();
                    System.out.println("Products found: " + previousCount);
                    for (WebElement p : products) {
                        System.out.println(p.getText());
                    }
                } else {
                    loadMore = false;
                }
            }

            System.out.println("quantity of goods: " + previousCount);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}