package functional.testSuite;

import functional.pageObjects.MeccaBingoPage;
import functional.pageObjects.RankInternational;
import functional.testBase.TestBase;
import org.testng.annotations.Test;

public class MeccaLoginTest extends TestBase {

    @Test
    public void meccaLoginTest() {

        driver.get("https://www.rank.com/");

        RankInternational rankHomePage = new RankInternational(getDriver());

        rankHomePage.verifyPageUrl();
        rankHomePage.verifyPageLoaded();
        rankHomePage.click(rankHomePage.getMeccaBingoLink());

        MeccaBingoPage meccaBingoPage = new MeccaBingoPage(getDriver());

        meccaBingoPage.verifyPageUrl();
        meccaBingoPage.verifyPageLoaded();
        meccaBingoPage.click(meccaBingoPage.loginButton);
        meccaBingoPage.verifyElementLoaded(meccaBingoPage.getLoginText());

        try {
            Thread.sleep(5000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
