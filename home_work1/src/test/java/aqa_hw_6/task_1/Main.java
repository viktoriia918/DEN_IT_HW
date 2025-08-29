package aqa_hw_6.task_1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.Keys;

import java.time.Duration;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(15));
        driver.manage().window().maximize();

        try {
            driver.get("https://hotline.ua/");
            WebElement searchBox = driver.findElement(By.xpath("//input[@type='text']"));
            searchBox.sendKeys("LEGO");
            searchBox.sendKeys(Keys.ENTER);

            WebElement firstProduct = driver.findElement(By.xpath("(//div[contains(@class,'list-item__title-container')]//a[contains(@class,'item-title')])[1]"));
            String firstProductName = firstProduct.getText();
            System.out.println("First item found: " + firstProductName);

            if (!firstProductName.contains("LEGO Technic Суперкар Lamborghini Revuelto")) {
                System.out.println(" The first item does not match!Found: " + firstProductName);
            } else {
                System.out.println(" The first product matches the expected one LEGO");
            }
            firstProduct.click();

            WebElement title = driver.findElement(By.xpath("//h1"));
            System.out.println("Product title on page: " + title.getText());

        } catch (Exception e) {
            System.out.println("Error:" + e.getMessage());
        } finally {
            driver.quit();
        }
    }
}