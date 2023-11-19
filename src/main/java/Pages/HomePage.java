package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

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

    public boolean sortIsApplied(String string) {
        String xpath = "//*[contains(text(), '" + string + "')]";
        WebElement webElement = driver.findElement(By.xpath(xpath));
        return webElement.isDisplayed();
    }

    public void clickOnValue(String string){
        String xpath = "//*[contains(text(), '" + string + "')]";
        WebElement webElement = driver.findElement(By.xpath(xpath));
        webElement.click();
    }

    public void clickOnMenu(){
        menuButton.click();
    }
}
