package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class FrameExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://practice-automation.com/iframes/");
        WebElement frameOne = driver.findElement(By.xpath("//iframe[@title='Playwright']"));
        WebElement frameTwo = driver.findElement(By.xpath("//iframe[@title='Selenium']"));
//
//
//        driver.switchTo().frame("iframe-1");        //driver will point to the playwright frame
//        driver.switchTo().frame("top-iframe");
          driver.switchTo().frame(frameOne);

            WebElement elem = driver.findElement(By.linkText("API"));
            elem.click();
        driver.switchTo().defaultContent();         //driver will point towards practice-automation site.

//        driver.switchTo().frame("iframe-2");        //driver will point to the playwright frame
//        driver.switchTo().frame("bottom-iframe");
          driver.switchTo().frame(frameTwo);

            WebElement elem2 = driver.findElement(By.xpath("//span[text()='Projects']"));
            elem2.click();
    }
}
