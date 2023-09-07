package login;
import org.testng.annotations.Test;
import static org.testng.Assert.*;

import base.BaseTests;

public class LoginTests extends BaseTests{

    @Test
    public void testSuccessfulLogin(){

        String flashTextResult = loginPage.fillInForm();

        assertTrue(flashTextResult.contains("logged into a secure area"),"Alert Text is incorrect");
    }
}
