package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class UnitsPage {
   /* WebDriver driver;

    @FindBy(xpath = "//*[@id=\"kt_content\"]/div[2]/div/div/div[1]/a")
    private WebElement addButton;
    @FindBy( xpath= "//*[@id=\"__BVID__342\"]/div/div[1]/div[1]/input")
    private WebElement nameField;

    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[1]/div[2]/input")
    private WebElement priceField;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[1]/div[3]/input")
    private WebElement downpaymentField;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[2]/div[1]/input")
    private WebElement codeField;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[2]/div[2]/div")
    private WebElement projectDropdown;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[3]/div[1]/div")
    private WebElement customerDropdown;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[3]/div[2]/div")
    private WebElement categoryDropdown;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[4]/div[1]/div")
    private WebDriver countriesDropdown;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[4]/div[2]/div")
    private WebElement cityDropdown;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[4]/div[3]/div")
    private WebElement areasDropdown;

    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[4]/div[4]/div")
    private WebDriver districtsDropdown;
    @FindBy(xpath = "//*[@id=\"__BVID__365\"]")
    private WebElement statusToggle;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[7]/div[1]/div/div/div[1]")
    private WebElement fileUploadInput;
    @FindBy(xpath = "//*[@id=\"__BVID__342\"]/div/div[7]/div[2]/div/div[1]")
    private WebElement descriptionEditorFrame;
    @FindBy(xpath = "//*[@id=\"quill-container\"]/div[1]")
    private WebElement descriptionBody;
    @FindBy(xpath ="//*[@id=\"kt_content\"]/div[2]/div/div/div/div[2]/div[2]/div/div/button[1]")
    private WebElement saveButton;

    public UnitsPage(WebDriver driver) {
    }


    //Actions
    public void clickAddButton() {
    }
    public void enterName(String name) {
        nameField.sendKeys("Commercial Unit");
    }
    public void enterPrice(String price) {
        priceField.sendKeys("100000");
    }
    public void enterDownpayment(String downpayment) {
        downpaymentField.sendKeys("50000");
    }
    public void enterCode(String code){
        codeField.sendKeys("3333");
    }
    public void enterProject(String project) {
        projectDropdown.sendKeys("stars");
    }
    public void enterCustomer(String customer) {
        customerDropdown.sendKeys("خلود على");
    }
/*
    public void enterCountries(String countries) {
        countriesDropdown.sendKeys("Egypt");
    }
    public void enterCity(String city) {
        cityDropdown.sendKeys("Giza");
    }
    public void enterAreas(String areas) {
        areasDropdown.sendKeys("Hadayek Al Ahram");
    }
    public void enterDistricts(String districts) {
        districtsDropdown.sendKeys("First Gate");
    }
    public void toggleStatus() {
        statusToggle.click();
    }
    public void uploadFile(String filePath) {
        fileUploadInput.sendKeys(filePath);
    }
    public void enterDescription(String text) {
        driver.switchTo().frame(descriptionEditorFrame);
        descriptionBody.clear();
        descriptionBody.sendKeys(text);
        driver.switchTo().defaultContent();
    }*/
    public void clickSave() {
        
    }

}