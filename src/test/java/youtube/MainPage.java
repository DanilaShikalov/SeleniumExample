package youtube;

import base.BaseSeleniumPage;
import config.ConfigProvider;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class MainPage extends BaseSeleniumPage {
    @FindBy(xpath = "//input[@id = 'search']")
    private WebElement searchField;

    @FindBy(xpath = "//button[@id = 'search-icon-legacy']")
    private WebElement searchButton;

    public MainPage() {
        driver.get(ConfigProvider.URL);
        PageFactory.initElements(driver, this);
    }

    public ResultPage searchVideo(String search)
    {
        searchField.sendKeys(search);
        searchButton.click();
        return new ResultPage();
    }
}
