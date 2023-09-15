package alerts;

import org.testng.annotations.Test;
import static org.testng.Assert.*;
import base.BaseTests;

public class FileUploadTests extends BaseTests{

    @Test
    public void testFileUpload(){
        var uploadPage = homePage.clickFileUploadPage();
        uploadPage.uploadFile("C:\\Users\\Curva\\Downloads\\AnasAssad.pdf");
        String uploadedFiles = uploadPage.getUploadedFiles();
        assertEquals(uploadedFiles, "AnasAssad.pdf", "Uploaded files not found");
    }
}
