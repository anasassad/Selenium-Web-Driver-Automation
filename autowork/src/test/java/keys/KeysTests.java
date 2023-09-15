package keys;

import org.openqa.selenium.Keys;
import org.testng.annotations.Test;

import base.BaseTests;

import static org.testng.Assert.*;

public class KeysTests extends BaseTests{

    @Test
    public void testBackspace(){

        var keyPage = homePage.clickKeyPressesPage();
        keyPage.enterText("A" + Keys.BACK_SPACE);
        assertEquals(keyPage.getResult(),"You entered: BACK_SPACE");
        keyPage.naviagToPreviousPage();
    }

    @Test
    public void testPi(){

        var keyPage = homePage.clickKeyPressesPage();
        keyPage.enterPi();
    }
}
