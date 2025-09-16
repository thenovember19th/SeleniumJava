package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class FileUploadExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com/");

        WebElement uploadFileText = driver.findElement(By.xpath("//h2[text()='Upload Files']"));
        WebElement uploadFile = driver.findElement(By.id("singleFileInput"));
        WebElement uploadButton = driver.findElement(By.xpath("//button[text()='Upload Single File]"));

        JavascriptExecutor jse = (JavascriptExecutor) driver;
        jse.executeScript("arguments[0].scrollIntoView()",uploadFileText);

        uploadFile.sendKeys("/home/");

        Actions act = new Actions(driver);
        act.click(uploadButton);
    }
}
