package day13;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import utilities.TestBase;

public class C01_NoSuchElementException extends TestBase {

    @Test
    public void noSuchElement() {
        driver.get("https://www.techproeducation.com");
        driver.findElement(By.xpath("//input[@type='search']")).sendKeys("QA"+ Keys.ENTER);
//        searchh yaptığımızda noSuchElement exception aldık

    }
}
