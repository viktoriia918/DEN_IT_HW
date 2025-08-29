package aqa_hw_6.task_3;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        String searchQuery = "LEGO Botanicals Букет польових квітів";
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();

        try {
            driver.get("https://hotline.ua/");

            WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(15));

            WebElement searchField = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("input[type='text']")));
            searchField.sendKeys(searchQuery);
            searchField.sendKeys(Keys.ENTER);

            WebElement firstProduct = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("div.list-item__title-container a.item-title")));
            System.out.println("Product found: " + firstProduct.getText());
            firstProduct.click();

            WebElement productTitle = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector("h1")));
            System.out.println("product title: " + productTitle.getText());

            WebElement priceElement = wait.until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".many__price-container .many__price-sum")));

            String priceText = priceElement.getText();
            System.out.println("Price: " + priceText);

        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}