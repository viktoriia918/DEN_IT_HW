package aqa_hw_4.task_3;


import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.Set;

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

            WebElement loyaltyLink = driver.findElement(By.cssSelector("a[title='Youtube']"));
            loyaltyLink.click();
            sleep(5000);

            Set<String> windowHandles = driver.getWindowHandles();
            String currentWindow = driver.getWindowHandle();


            for (String handle : windowHandles) {
                if (!handle.equals(currentWindow)) {
                    driver.switchTo().window(handle);
                    break;
                }
            }

            String url = driver.getCurrentUrl();
            if (url.contains("youtube.com")) {
                System.out.println("Switch YouTube: " + url);
            } else {
                throw new RuntimeException("YouTube was expected,but it is open: " + url);
            }

            sleep(5000);

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}