package pages.manager;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {
    WebDriver driver;
    public AddCustomerPage(){
        this.driver=driver;
        PageFactory.initElements(driver,this);
    }
}
