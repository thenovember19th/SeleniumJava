package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import java.time.Duration;

public class DragAndDropExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://testautomationpractice.blogspot.com");
        driver.manage().window().maximize();

        WebElement elementToBeScroll = driver.findElement(By.xpath("//h2[text()='Drag me to my target']"));
        JavascriptExecutor dragNDrop = (JavascriptExecutor) driver;
        dragNDrop.executeScript("arguments[0].scrollIntoView()",elementToBeScroll);

        WebElement sourceElement = driver.findElement(By.xpath("//p[text()='Drop me to my target']"));
        WebElement destinationElement = driver.findElement(By.xpath("//p[text()='Drop here']"));

        Actions act = new Actions(driver);
        act.dragAndDrop(sourceElement,destinationElement).build().perform();
    }
}
