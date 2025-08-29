package aqa_hw_6.task_4;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.FluentWait;

import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;
import java.util.function.Function;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://hotline.ua/");

        WebElement searchField = driver.findElement(By.cssSelector("input[type='text']"));
        String searchQuery = "LEGO";
        searchField.sendKeys(searchQuery);
        searchField.sendKeys(Keys.ENTER);

        FluentWait<WebDriver> wait = new FluentWait<>(driver)
                .withTimeout(Duration.ofSeconds(20))
                .pollingEvery(Duration.ofSeconds(1))
                .ignoring(NoSuchElementException.class);

        List<WebElement> products = wait.until(new Function<WebDriver, List<WebElement>>() {
            @Override
            public List<WebElement> apply(WebDriver driver) {
                List<WebElement> elems = driver.findElements(By.cssSelector("div.list-item__title-container a.item-title"));
                if (elems.size() >= 5) {
                    return elems;
                }
                return null;
            }
        });

        System.out.println("Products found:" + products.size());
        for (WebElement p : products) {
            System.out.println(p.getText());
        }

        driver.quit();
    }
}