package DEB.tests.homepage;

import org.testng.annotations.Test;
import DEB.framework.core.BaseTest;
import DEB.pageobjects.homepage.GoogleHomepage;

public class GoogleHomePageTests extends BaseTest {

    @Test
    public void homepageTests() {
        GoogleHomepage googleHomepage = new GoogleHomepage(getDriver());
    }
}
