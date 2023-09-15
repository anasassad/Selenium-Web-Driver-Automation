package keys;

import org.testng.annotations.Test;
import static org.testng.Assert.*;

import base.BaseTests;

public class HorizontalSliderTests extends BaseTests {

    @Test
    public void testSliding(){
        var sliderPage = homePage.clickHorizontalSliderPage();
        sliderPage.tapSlider();
        assertEquals(sliderPage.getResult(),"4");
    }
}
