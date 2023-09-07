package dropdown;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import base.BaseTests;

public class DropdownTests extends BaseTests{

    @Test
    public void testSelectOption(){

        var dropdownPage = homePage.clickDropdown();
        String option = "Option 1";
        dropdownPage.selectFromDropdown(option);
        var selectedOption = dropdownPage.getSelectedOption();

        assertEquals(selectedOption,"Option 1","Mismatch Selected Option");


    }
}
