package TaylorWikiChallenge;

import Pages.WikiHome;
import Pages.WikiSearchResults;
import org.testng.annotations.Test;

public class WikiTest extends BaseTest {

    @Test(priority = 0)
    public void openWikipediaAndSearch() throws InterruptedException {

        WikiHome wikihome = new WikiHome( driver,wait );
        WikiSearchResults searchResults = new WikiSearchResults(driver,wait);

        wikihome.navigateTo();
        wikihome.wikiLogo();
        wikihome.txtSendKeys( "taylor swift" );
        wikihome.btnSearch();
        searchResults.itsLoaded();
        searchResults.gettingStudioAlbums();
        searchResults.clickingAlbumToScrollDown();
        Thread.sleep( 10000 );
        searchResults.hovering();
        searchResults.gettingHoverText();

    }
}
