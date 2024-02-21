package utils;

import org.openqa.selenium.WebDriver;
import pages.LoginPage;
import pages.manager.AddCustomerPage;
import pages.manager.ManagerPage;

public class BaseTest {
   protected WebDriver driver;
   public LoginPage loginpage;
   public ManagerPage managerpage;
   public AddCustomerPage addCustomerPage;
    public PropertyLoader propertyLoader = new PropertyLoader();




}
