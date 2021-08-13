package com.demoblaze.step_definitions;

import com.demoblaze.pages.BasePage;
import com.demoblaze.pages.Laptops;
import com.demoblaze.utilities.ConfigurationReader;
import com.demoblaze.utilities.Driver;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class LaptopStepDefs {

    @When("User navigates to laptops")
    public void userNavigatesToLaptops() {
        Driver.get().get(ConfigurationReader.get("url"));
        BasePage bp = new BasePage();
        bp.navigateTo("Laptops");
    }

    @Then("User selects an {string}")
    public void userSelectsAn(String model) throws InterruptedException {
        Laptops laptops = new Laptops();

    }

    @And("Click on add to chart")
    public void clickOnAddToChart() {
        Laptops laptops = new Laptops();
        laptops.addToChart();
    }
}
