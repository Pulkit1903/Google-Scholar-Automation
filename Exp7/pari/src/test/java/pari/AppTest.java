package pari;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.By;

public class AppTest {
    public static void main(String[] args) {

        WebDriver driver = new ChromeDriver();

        // Navigate to google scholar
        driver.get("https://scholar.google.com/");

        WebElement usernameField = driver.findElement(By.id("gs_hdr_tsi"));
        usernameField.sendKeys("Java");

        // Find the "Next" button and click it
        WebElement nextButton = driver.findElement(By.id("gs_hdr_tsb"));
        nextButton.click();
        
        // Click on the first link on suggestion
        WebElement nextButton1 = driver.findElement(By.id("5TZ6JaixIS4J"));
        nextButton1.click();
        
        //To close the pop-up
        WebElement nextButton2 = driver.findElement(By.id("gb-ogen-opt-in-banner-dismiss"));
        nextButton2.click();
        
        //To close Search pop-up
        WebElement nextButton3 = driver.findElement(By.className("search-bar-close-img"));
        nextButton3.click();
        
        //To print the text on website
        WebElement content = driver.findElement(By.className("ebook-promo-description"));
        System.out.println(content.getText());

    }
}