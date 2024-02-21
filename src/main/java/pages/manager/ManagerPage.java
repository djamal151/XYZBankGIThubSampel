package pages.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ManagerPage {
    WebDriver driver;
    @FindBy(css = "[ng-click='addCust()']") private WebElement addCustomerButton;
    @FindBy(css = "[ng-click='openAccount()']") private WebElement openAccountButton;
    @FindBy(css = "[ng-click='showCust()']") private WebElement customersButton;

    public ManagerPage(WebDriver driver) {
        this.driver = driver;
        PageFactory.initElements(driver,this);
    }
public ManagerPage clickOnAddCustomerButton(){
        addCustomerButton.click();
        return this;

}

}
