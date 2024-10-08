package day10;

import org.junit.Assert;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import utilities.TestBase;

import javax.swing.*;

public class C01_Actions extends TestBase {
    @Test
    public void rightClick() {
        //https://the-internet.herokuapp.com/context_menu  sitesine gidin
        driver.get("https://the-internet.herokuapp.com/context_menu");
//        1.Actions Objesi oluşturulur
        Actions actions = new Actions(driver);

//                2.Elementi Locate Edelim
        WebElement kutu = findById("hot-spot");

//        Kutuya sağ tıklayalım
        actions.contextClick(kutu).perform();

//        Alert’te cikan yazinin “You selected a context menu” oldugunu test edin,Tamam diyerek alert’i kapatın
        driver.switchTo().alert();
        String expextedText="You selected a context menu";
        Assert.assertEquals("You selected a context menu",driver.switchTo().alert().getText());
        driver.switchTo().alert().accept();
    }


    //Class: Actions1
    //Method: rightClick



}
