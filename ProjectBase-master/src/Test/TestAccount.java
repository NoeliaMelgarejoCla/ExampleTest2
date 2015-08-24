package tests;

import org.junit.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import pages.*;


public class TestAccount {

    @Test
    protected void setUp() {
        LoginPage loginPage=new LoginPage();
        mainApp=loginPage.setUsernameTxt("noelia.melgarejo.c@jalasoft.com").setPasswordTxt("TesInt10").clickLoginBtn();
    }
}
