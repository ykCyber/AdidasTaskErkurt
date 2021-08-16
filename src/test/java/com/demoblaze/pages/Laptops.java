package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import java.util.List;

public class Laptops extends BasePage {
    public Laptops() {
        PageFactory.initElements(Driver.get(), this);
    }



    @FindBy(linkText = "Sony vaio i5")
    private WebElement sonyVaioI5;

    @FindBy(linkText = "Dell i7 8gb")
    private WebElement dellI7;

    public static void click(String model) {

    }
    public void writeAllElements(){
        List<WebElement> webEleList = Driver.get().findElements(By.xpath(".//*"));

//For above given HTML it will print 5. As there are 5 elements inside div
        System.out.println(webEleList.size());
    }
}
