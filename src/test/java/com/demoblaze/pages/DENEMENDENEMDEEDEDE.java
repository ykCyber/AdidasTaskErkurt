package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class DENEMENDENEMDEEDEDE {
    public DENEMENDENEMDEEDEDE() {
        PageFactory.initElements(Driver.get(), this);
    }
    @FindBy(linkText = "Add to cart")
    private WebElement addToChart;

    public void addToChart() {
        addToChart.click();
    }
}
