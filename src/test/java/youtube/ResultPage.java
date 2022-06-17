package youtube;

import base.BaseSeleniumPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ResultPage extends BaseSeleniumPage {
    @FindBy(xpath = "//a[contains(@title, '#69')]")
    private WebElement video;

    public ResultPage() {
        PageFactory.initElements(driver, this);
    }

    public String startVideo()
    {
        video.click();
        return "Success";
    }
}
