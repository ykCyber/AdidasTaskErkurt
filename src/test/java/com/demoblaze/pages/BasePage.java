package com.demoblaze.pages;

import com.demoblaze.utilities.Driver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BasePage {
    public BasePage() {
        PageFactory.initElements(Driver.get(), this);
    }

    @FindBy(linkText = "Phones")
    private WebElement phones;

    @FindBy(linkText = "Laptops")
    private WebElement laptops;
    @FindBy(linkText = "Monitors")
    private WebElement monitors;

    public void navigateTo(String categoryName) {
        if (categoryName.contentEquals("Phones")) {
            phones.click();
        } else if (categoryName.contentEquals("Laptops")) {
            laptops.click();
        } else if (categoryName.contentEquals("Monitors")) {
            monitors.click();
        }
    }
}
