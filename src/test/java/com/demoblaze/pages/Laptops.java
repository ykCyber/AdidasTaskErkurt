package com.demoblaze.pages;

import com.demoblaze.utilities.BrowserUtils;
import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Laptops extends BasePage {
    public Laptops() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Phones")
    private WebElement phones;


    @FindBy(linkText = "Sony vaio i5")
    private WebElement sonyVaioI5;

    @FindBy(linkText = "Dell i7 8gb")
    private WebElement dellI7;

    @FindBy(linkText = "Add to cart")
    private WebElement addToChart;

    public void clickModel(String model) {
        BrowserUtils.waitForClickablility(sonyVaioI5,5000);
        BrowserUtils.waitForClickablility(dellI7,5000);

        if (model.contentEquals("Sony vaio i5")) {
            sonyVaioI5.click();
        }
        if (model.contentEquals("Dell i7 8gb")) {
            dellI7.click();
        }
    }

    public void addToChart() {
        addToChart.click();
    }
}
