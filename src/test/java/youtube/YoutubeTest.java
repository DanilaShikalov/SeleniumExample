package youtube;

import base.BaseSeleniumTest;
import config.ConfigProvider;
import org.junit.Test;
import org.junit.Assert;

public class YoutubeTest extends BaseSeleniumTest  {

    @Test
    public void checkVideo()
    {
        String result = new MainPage().searchVideo(ConfigProvider.SEARCH).startVideo();
        Assert.assertEquals(result, "Success");
    }
}
