package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class NestedFrameExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://demo.automationtesting.in/Frames.html");

        WebElement nestedIframeButton = driver.findElement(By.linkText("Iframe with in an Iframe"));
        nestedIframeButton.click();

        WebElement firstFrame = driver.findElement(By.xpath("//div[@id='Multiple']/iframe"));
        driver.switchTo().frame(firstFrame);

        WebElement secondFrame = driver.findElement(By.xpath("//div[@class='iframe-container']/iframe"));
        driver.switchTo().frame(secondFrame);

        WebElement txtField = driver.findElement(By.xpath("//input[@type='text']"));
        txtField.sendKeys("MinRaj");

        driver.switchTo().defaultContent();

        WebElement firstIframeButton = driver.findElement(By.cssSelector("a.analystic"));
        firstIframeButton.click();

        driver.switchTo().frame("singleframe");

        WebElement txtFieldOfFirstFrame = driver.findElement(By.xpath("//input[@type='text']"));
        txtFieldOfFirstFrame.sendKeys("Bhatta");

    }
}
