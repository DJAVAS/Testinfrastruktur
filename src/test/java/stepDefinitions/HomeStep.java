package stepDefinitions;

import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.HomePage;

public class HomeStep {

    private WebDriver driver = Hooks.getDriver();

    private HomePage homePage = new HomePage(driver);

    @And("User click on Sort")
    public void user_click_on_sort() {
        homePage.clickOnSortDropdown();
    }

    @And("User click on Name Z to A")
    public void user_click_on_name_z_to_a() {
        homePage.clickOnValue("Name (Z to A)");
    }

    @And("User click on {string}")
    public void user_click_on_(String string) {
        homePage.clickOnValue(string);
    }

    @Then("User should be logged in")
    public void user_should_be_logged_in() {
        Assert.assertTrue(homePage.isLoginSuccessful());
    }

    @Then("The selected sort is applied")
    public void the_selected_sort_is_applied() {
        homePage.sortIsApplied("Name (Z to A)");
    }

    @And("User click on Menu")
    public void user_click_on_menu() {
        homePage.clickOnMenu();
    }

    @And("User click on Logout")
    public void user_click_on_logout() {
        homePage.clickOnValue("Logout");
    }
}
