package com.Castor_Sprint2.step_definitions;

import com.Castor_Sprint2.pages.Ivan180_Pages;
import com.Castor_Sprint2.pages.LoginPage;
import com.Castor_Sprint2.utilities.Driver;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;

public class Ivan180_StepDefinitions extends LoginPage{
LoginPage loginPage = new LoginPage();
Ivan180_Pages ivan180Pages = new Ivan180_Pages();

    @Given("User is logged in as Driver and on home page")
    public void user_is_logged_in_as_driver_and_on_home_page() {
    loginPage.login("User20","UserUser123");
    }

    @When("User click on Learn how to use space")
    public void user_click_on_learn_how_to_use_space() {
    ivan180Pages.button_HowToUsePinbar.click();
    }
    @Then("User sees How To Use Pinbar")
    public void user_sees_how_to_use_pinbar() {

        String actualMessage1 = ivan180Pages.message_HowToUsePinbar.getText();
        String expectedMessage1 = "How To Use Pinbar";

        Assert.assertEquals(actualMessage1,expectedMessage1);

    }
    @Then("User sees")
    public void user_sees(String docString) {

        String actualMessage2 = ivan180Pages.message_Help.getText();
        String expectedMessage2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(actualMessage2,expectedMessage2);
    }


    @Given("User is logged in as Store manager and on home page")
    public void userIsLoggedInAsStoreManagerAndOnHomePage() {
        loginPage.login("storemanager55","UserUser123");
    }



    @When("Store manager click on Learn how to use space")
    public void storeManagerClickOnLearnHowToUseSpace() {

            ivan180Pages.button_HowToUsePinbar.click();
    }

    @Then("Store manager How To Use Pinbar")
    public void storeManagerHowToUsePinbar() {
        String actualMessage1 = ivan180Pages.message_HowToUsePinbar.getText();
        String expectedMessage1 = "How To Use Pinbar";

        Assert.assertEquals(actualMessage1,expectedMessage1);
    }

    @Then("Store manager sees")
    public void storeManagerSees() {
        String actualMessage2 = ivan180Pages.message_Help.getText();
        String expectedMessage2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(actualMessage2,expectedMessage2);
    }


    @Given("User is logged in as Sales manager and on home page")
    public void userIsLoggedInAsSalesManagerAndOnHomePage() {

        loginPage.login("salesmanager255","UserUser123");
    }

    @When("Sales manager click on Learn how to use space")
    public void salesManagerClickOnLearnHowToUseSpace() {

        ivan180Pages.button_HowToUsePinbar.click();

    }

    @Then("Sales manager sees How To Use Pinbar")
    public void salesManagerSeesHowToUsePinbar() {
        String actualMessage1 = ivan180Pages.message_HowToUsePinbar.getText();
        String expectedMessage1 = "How To Use Pinbar";

        Assert.assertEquals(actualMessage1,expectedMessage1);
    }

    @Then("Sales manager sees")
    public void salesManagerSees() {
        String actualMessage2 = ivan180Pages.message_Help.getText();
        String expectedMessage2 = "Use pin icon on the right top corner of page to create fast access link in the pinbar.";

        Assert.assertEquals(actualMessage2,expectedMessage2);

    }


    @Then("Driver sees an image")
    public void driverSeesAnImage() {
        String actualSrc = ivan180Pages.image1.getAttribute("src");
        String expectedSrc = "/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertEquals(expectedSrc,actualSrc);
    }

    @Then("Store manager sees an image")
    public void storeManagerSeesAnImage() {
        String actualSrc = ivan180Pages.image1.getAttribute("src");
        String expectedSrc = "/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertEquals(expectedSrc,actualSrc);
    }

    @Then("Sales manager sees an image")
    public void salesManagerSeesAnImage() {
        String actualSrc = ivan180Pages.image1.getAttribute("src");
        String expectedSrc = "/bundles/oronavigation/images/pinbar-location.jpg";
        Assert.assertEquals(expectedSrc,actualSrc);
    }
}
