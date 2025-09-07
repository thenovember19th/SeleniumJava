package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class CheckBoxesExample {
    public void checkBox(){
        WebDriver driver = new ChromeDriver();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        driver.manage().window().maximize();

        driver.get("https://practice-automation.com/form-fields/");
//        WebElement desiredCheckBox = driver.findElement(By.id("drink2"));  for clicking on single checkbox
//        desiredCheckBox.click();
        List<WebElement> checkBoxes = driver.findElements(By.xpath("//input[@type='checkbox']"));
        System.out.println(checkBoxes.size());

        for(int i=0; i<checkBoxes.size(); i++){
            checkBoxes.get(i).click();
        }
    }

    public static void main(String[] args) {
        CheckBoxesExample cbx = new CheckBoxesExample();
        cbx.checkBox();

    }
}
