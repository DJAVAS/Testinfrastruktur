package stepDefinitions;

import Pages.LoginPage;
import hooks.Hooks;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import Pages.HomePage;

public class LoginStep {

    private WebDriver driver = Hooks.getDriver();
    private LoginPage loginPage = new LoginPage(driver);

    @Given("User is on the login page")
    public void user_is_on_login_page() {
        driver.get("https://www.saucedemo.com");
    }

    @When("User logs in with valid credentials")
    public void user_logs_in_with_valid_credentials() {
        loginPage.Login("standard_user", "secret_sauce");
    }

    @Then("User should be logged out")
    public void user_should_be_logged_out() {
        Assert.assertTrue(loginPage.isLoggedOut());
    }

}
