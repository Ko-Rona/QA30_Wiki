package tests;

import configWiki.ConfigurationWiki;
import org.testng.Assert;
import org.testng.annotations.Test;
import wikiScreens.MainScreen;

public class LaunchTest extends ConfigurationWiki {

@Test
    public void launchTest(){
    String detail = new MainScreen(driver).getDetail();
    Assert.assertEquals(detail, "In the news");
}
}
