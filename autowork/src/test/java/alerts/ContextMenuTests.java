package alerts;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import base.BaseTests;

public class ContextMenuTests extends BaseTests {

    @Test
    public void rightClickOnThContext(){
        var contextMenuPage = homePage.clickContextMenuPage();

        contextMenuPage.rightClickInContextRect();
        String text = contextMenuPage.getAlertBodyText();
        assertEquals(text, "You selected a context menu", "Text content dosen't match");
    }
}
