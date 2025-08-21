package aqa_hw_4.task_1;

import org.openqa.selenium.By;
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
            sleep(5000);

            WebElement icon = driver.findElement(By.cssSelector("a.categories-section__link[href='/ua/dom/']"));
            icon.click();
            sleep(5000);

            WebElement header = driver.findElement(By.tagName("h1"));
            String expectedHeader = "Все для дому";
            String actualHeader = header.getText();

            if (!expectedHeader.equals(actualHeader)) {
                throw new RuntimeException("Error: section does not match!Expected: " + expectedHeader + " | Received: " + actualHeader);
            } else {
                System.out.println(" Section matches: " + actualHeader);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}