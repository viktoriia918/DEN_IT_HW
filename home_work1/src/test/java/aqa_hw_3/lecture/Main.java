package aqa_hw_3.lecture;

import junit.framework.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static java.lang.Thread.sleep;

public class Main {


    public static void main(String[] args) throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        try {
            String wordToFind = "iPhon";

            driver.get("https://hotline.ua/");
            driver.manage().window().maximize();
            WebElement searchField = driver.findElement(By.cssSelector("[type=text]"));
            searchField.sendKeys("iPhone");
            sleep(3000);
            WebElement searchButton = driver.findElement(By.cssSelector("[title=Поиск]"));
            searchButton.click();
            sleep(7000);
            WebElement titleElement = driver.findElement(By.cssSelector("[class= catalog-title__main]"));

            String pageTitleString = titleElement.getText();
            System.out.println("Page title is:" + pageTitleString);


            Assert.assertTrue(pageTitleString.contains(wordToFind));
        } catch (AssertionError ex) {
            ex.printStackTrace();
        } finally {

            driver.quit();

        }
    }
}