package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;

public class RadioButtonExample {
    public void clickOnRadioButton(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/form-fields/");

//        WebElement desiredElem = driver.findElement(By.id("color4"));
        WebElement desiredElem = driver.findElement(By.xpath("//label[text()='Green']"));
//        desiredElem.click();
        desiredElem.click();

    }

    public static void main(String[] args) {
        RadioButtonExample radio = new RadioButtonExample();
        radio.clickOnRadioButton();
    }
}
