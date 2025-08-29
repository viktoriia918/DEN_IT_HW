package aqa_hw_6.task_2;

import org.openqa.selenium.By;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.time.Duration;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();
        try {
            driver.get("https://hotline.ua/");
            WebElement searchBox = driver.findElement(By.cssSelector("input[type='text']"));
            searchBox.sendKeys("Gucci");
            searchBox.sendKeys(Keys.ENTER);

            WebElement gucciBamboo = driver.findElement(
                    By.cssSelector("a.item-title[href*='gucci-bamboo']")
            );
            String productName = gucciBamboo.getText();
            System.out.println("Product found: " + productName);

            List<WebElement> prices = driver.findElements(By.cssSelector(".list-item__price .price__value"));
            if (!prices.isEmpty()) {
                System.out.println("Price in issue: " + prices.get(0).getText());
            } else {
                System.out.println("Price in issue is missing tester or no offers.");
            }
            gucciBamboo.click();

            WebElement title = driver.findElement(By.cssSelector("h1"));
            System.out.println("Card title:" + title.getText());

            WebElement comparePricesButton = driver.findElement(By.cssSelector("button.many__price-btn"));
            comparePricesButton.click();


            List<WebElement> allPrices = driver.findElements(By.cssSelector(".price__value"));
            if (!allPrices.isEmpty()) {
                System.out.println("Offers found: " + allPrices.size());
                for (WebElement p : allPrices) {
                    System.out.println("Price in the store: " + p.getText());
                }
            } else {
                System.out.println("There are no offers on the price comparison page.");
            }
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}