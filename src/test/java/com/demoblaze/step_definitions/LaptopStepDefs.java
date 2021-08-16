package com.demoblaze.step_definitions;

import com.demoblaze.pages.BasePage;
import com.demoblaze.pages.Laptops;
import com.demoblaze.pages.DENEMENDENEMDEEDEDE;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class LaptopStepDefs {
    Laptops laptops = new Laptops();

    @When("User navigates to laptops")
    public void userNavigatesToLaptops() {
        Driver.get().get(ConfigurationReader.get("url"));
        BasePage bp = new BasePage();
        bp.navigateTo("Laptops");
    }



    @And("Click on add to chart")
    public void clickOnAddToChart() {
        new DENEMENDENEMDEEDEDE().addToChart();
    }

    @Then("User clicks on a {string}")
    public void userClicksOnA(String model) {
//        new Laptops().writeAllElements();
        WebElement element = Driver.get().findElement(By.linkText(model));
        System.out.println("element.getText() = " + element.getText());
        element.click();


    }
}
