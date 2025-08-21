package aqa_hw_4.task_6;

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
            sleep(3000);

            WebElement catalogButton = driver.findElement(By.xpath("//div[contains(@class,'button-menu-main') and contains(., 'Каталог')]"));
            catalogButton.click();
            System.out.println("Каталог товарів");
            sleep(2000);

            WebElement dropdownMenu = driver.findElement(By.xpath("//a[@data-id='898' and contains(text(),'Авто і Мото')]"));
            if (dropdownMenu.isDisplayed()) {
                System.out.println("The menu opened!");
            } else {
                System.out.println("Menu did not open.");
            }

        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            driver.quit();
        }
    }
}