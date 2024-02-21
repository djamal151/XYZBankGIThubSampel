package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
    WebDriver driver;
    @FindBy(css = "[ng-click='customer()']") private WebElement customerLoginButton;
    @FindBy(css = "[ng-click='manager()']") private WebElement managerLoginButton;

    public  LoginPage(WebDriver driver){
        this.driver =driver;
        PageFactory.initElements(driver,this);

    }
    public LoginPage clickOnManageLoginButton(){
        managerLoginButton.click();
        return this;
    }
}
