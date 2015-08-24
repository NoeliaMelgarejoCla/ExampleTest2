package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


public class Account {
    private WebDriver driver;
    private WebDriverWait wait;
    @FindBy(id = "cpn1")
    @CacheLookup
    private WebElement campingName;
    @FindBy(id = "cpn16")
    @CacheLookup
    private WebElement check;
    @FindBy(css = "#bottomButtonRow > input[name=\"save\"]")
    @CacheLookup
    private WebElement saveBtn;

    @FindBy(id = "acc2")
    @CacheLookup
    private WebElement setAccountname;

    public Account(WebDriver driver){
        this.driver=driver;
        wait=new WebDriverWait(driver,15);
        PageFactory.initElements(driver,this);

    }
    public Account setCampingName(String CampingName) {

        campingName.clear();
        campingName.sendKeys(CampingName);
        return this;
    }

    public AddAccount setcheck() {
        check.click();
        return this;
    }
    public Account setAccountName(String setAccountName) {

        setAccountname.clear();
        setAccountname.sendKeys(setAccountName);
        return this;
    }

    public Container clickSave() {
        wait.until(ExpectedConditions.elementToBeClickable(saveBtn));
        saveBtn.click();

        return new Container(driver);
    }
