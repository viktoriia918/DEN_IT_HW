package aqa_hw_4.task_4;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();
            sleep(3000);

            WebElement beautyLink = driver.findElement(By.xpath("//a[span[text()=\"Краса і здоров'я\"]]"));
            beautyLink.click();
            sleep(5000);

            WebElement shampooLink = driver.findElement(By.xpath("//a[img[@src='/img/uploads/clients/862=5e745f6a87f66.jpg']]"));
            shampooLink.click();
            sleep(5000);

            WebElement header = driver.findElement(By.tagName("h1"));
            String expectedHeader = "Шампунь для волосся";
            String actualHeader = header.getText();

            if (!expectedHeader.equals(actualHeader)) {
                throw new RuntimeException(
                        "Error: section does not match! Expected: " + expectedHeader + " | Received: " + actualHeader);
            } else {
                System.out.println("Section matches: " + actualHeader);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}