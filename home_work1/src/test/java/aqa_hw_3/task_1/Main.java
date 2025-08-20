package aqa_hw_3.task_1;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.List;

import static java.lang.Thread.sleep;

public class Main {

    static String productHref = "lego-technic-superkar-lamborghini-revuelto-42214";

    public static void main(String[] args) throws InterruptedException {
         WebDriver driver = new ChromeDriver();
        try {
            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();

            WebElement searchField = driver.findElement(By.cssSelector("[type=text]"));
            searchField.sendKeys("LEGO");
            sleep(3000);

            WebElement searchButton = driver.findElement(By.cssSelector("[title=Поиск]"));
            searchButton.click();
            sleep(7000);

            WebElement heartButton = driver.findElement(By.cssSelector(".list-item:has(a[href*='" + productHref + "']) .bookmark-button__icon-wrapper"));
            heartButton.click();
            sleep(3000);

            String originalWindow = driver.getWindowHandle();

            WebElement arrowIcon = driver.findElement(By.cssSelector("a[href='/ua/profile/guest/lists/bookmarks/']"));
            arrowIcon.click();

            sleep(5000);

            for (String windowHandle : driver.getWindowHandles()) {
                if (!windowHandle.equals(originalWindow)) {
                    driver.switchTo().window(windowHandle);
                    break;
                }
            }

            sleep(7000);

            List<WebElement> favoriteItems = driver.findElements(By.cssSelector(".list-item a[href*='" + productHref + "']"));

            if (favoriteItems.size() > 0 && favoriteItems.get(0).isDisplayed()) {
                System.out.println("Вибрано товарів зі списку!");
            } else {
                System.out.println("Товар зі списку необраний!");
            }

        } finally {
            driver.quit();
        }
    }
}