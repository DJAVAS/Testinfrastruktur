package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import java.time.Duration;

public class HomePage {

    private WebDriver driver;

    @FindBy(className = "shopping_cart_link")
    private WebElement welcomeMessageLocator;

    @FindBy(className = "product_sort_container")
    private WebElement sortDropdown;

    @FindBy(id = "react-burger-menu-btn")
    private WebElement menuButton;


    public HomePage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver, this);
    }
    public boolean isLoginSuccessful() {
        return welcomeMessageLocator.isDisplayed();
    }

    public void clickOnSortDropdown(){
        sortDropdown.click();
    }

    public void checkSauceLabsBackpackDisplayed(){
        WebElement webElement = driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Backpack')]"));
        webElement.isDisplayed();
    }

    public void checkSauceLabsBikeLightDisplayed(){
        WebElement webElement = driver.findElement(By.xpath("//*[contains(text(), 'Sauce Labs Bike Light')]"));
        webElement.isDisplayed();
    }

    public void isTextDisplayed(String string){
        String xpath = "//*[contains(text(), '" + string + "')]";
        WebElement webElement = driver.findElement(By.xpath(xpath));
        webElement.isDisplayed();
    }

    public void sortIsApplied(String string) {
        String xpath = "//*[contains(text(), '" + string + "')]";
        WebElement webElement = driver.findElement(By.xpath(xpath));
        webElement.isDisplayed();
    }

    public void clickOnValue(String string) {
        String xpath = "//a[contains(text(), '" + string + "')]";
        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
        WebElement webElement = wait.until(ExpectedConditions.elementToBeClickable(By.xpath(xpath)));
        webElement.click();
    }

    public void clickOnMenu(){
        menuButton.click();
    }
}
