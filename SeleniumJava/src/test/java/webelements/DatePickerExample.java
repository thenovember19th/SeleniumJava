package webelements;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import java.time.Duration;
import java.util.List;

public class DatePickerExample {
    public static void main(String[] args) {
        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));

        driver.get("https://jqueryui.com/datepicker/");

        WebElement newFrame = driver.findElement(By.xpath("//iframe[@class='demo-frame']"));
        driver.switchTo().frame(newFrame);
//
//        WebElement datePicker = driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
//        datePicker.sendKeys("08/19/2026");

        String year = "2025";
        String month = "September";
        String day = "8";

        WebElement datepicker = driver.findElement(By.xpath("//input[@class='hasDatepicker']"));
        datepicker.click();

        while(true){
            WebElement monthField = driver.findElement(By.xpath("//span[@class='ui-datepicker-month']"));
            String mont = monthField.getText();

            WebElement dayField = driver.findElement(By.xpath("//span[@class='ui-datepicker-year']"));
            String yr = dayField.getText();

            if(mont.equals(month) && yr.equals(year)){
                break;
            }else{
                WebElement nxtButton = driver.findElement(By.xpath("//span[@class='ui-icon ui-icon-circle-triangle-e']"));
                nxtButton.click();
            }
        }
    List<WebElement> dates = driver.findElements(By.xpath("//table[@class='ui-datepicker-calendar']/tbody/tr/td/a"));
        for(WebElement data:dates){
            String singleData = data.getText();
            if(singleData.equals(day)){
                data.click();
                break;
            }
        }
    }
}
