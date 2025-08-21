package aqa_hw_4.task_2;

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

            JavascriptExecutor js = (JavascriptExecutor) driver;
            js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
            System.out.println("main page scroll down");
            sleep(3000);

            WebElement loyaltyLink = driver.findElement(By.cssSelector("a[href='/ua/loyalty/']"));
            loyaltyLink.click();
            sleep(5000);

            WebElement header = driver.findElement(By.tagName("h1"));
            String expectedHeader = "Бонусна програма";
            String actualHeader = header.getText();

            if (!expectedHeader.equals(actualHeader)) {
                throw new RuntimeException(
                        "Error: section does not match! Expected: " + expectedHeader + " | Received: " + actualHeader);
            } else {
                System.out.println("Section matches: " + actualHeader);

                js.executeScript("window.scrollTo(0, document.body.scrollHeight);");
                System.out.println("Page scrolled down");
                sleep(3000);
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}