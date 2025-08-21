package aqa_hw_4.task_5;

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

            WebElement headphonesButton = driver.findElement(By.xpath("//button[contains(text(),'Навушники, гарнітури')]"));
            headphonesButton.click();
            System.out.println("Навушники, гарнітури");
            sleep(3000);

            WebElement firstPhoto = driver.findElement(By.xpath("//div[@class='ssr-slider__img-wrapper']/a[@href='/ua/av-naushniki-garnitury/apple-airpods-4-with-active-noise-cancellation-mxp93/']/img"));
            if (firstPhoto.isDisplayed()) {
                System.out.println("The product appeared on the page!");
            } else {
                System.out.println("The products not appear");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}