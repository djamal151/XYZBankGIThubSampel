import org.testng.annotations.Test;
import pages.manager.ManagerPage;
import utils.BaseTest;

public class ManagerPageTest extends BaseTest {
    @Test
    public  void FirstTest(){
        loginpage.clickOnManageLoginButton();
        loginpage.clickOnManageLoginButton();
    }


}
