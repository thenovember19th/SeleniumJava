package locators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHrm {
    public static void main(String[] args) throws InterruptedException {
        WebDriver dr = new ChromeDriver();
        dr.manage().window().maximize();

        dr.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        Thread.sleep(5000);

        //Title
        String titleOfPage = dr.getTitle();
        System.out.println(titleOfPage);

        dr.findElement(By.linkText("OrangeHRM, Inc")).click(); //for full text of the link
//
//      dr.findElement(By.partialLinkText("OrangeHRM")).click(); //for partial text of the link
    }
}

