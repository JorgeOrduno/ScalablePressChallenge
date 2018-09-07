package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;


public class WikiSearchResults extends BasePage {

    public WikiSearchResults(WebDriver driver, WebDriverWait wait) {
        super( driver, wait );
    }

    /***************** Web Elements **********************/
    By footerDisplayed = By.xpath( "//li[@id='footer-info-lastmod']" );
    By albumText = By.xpath( "//table[@class='nowraplinks vcard hlist collapsible expanded navbox-inner mw-collapsible mw-made-collapsible']//tbody//tr[3]//td[1]" );
    By albumTitle = By.xpath( "//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/th" );
    By hoverSelection = By.xpath( "//*[@id=\"mw-content-text\"]/div/div[17]/table/tbody/tr[3]/td/div/ul/li[6]/i/a" );
    By hoverObject = By.className( "mwe-popups" );


    /***************** End Web Elements **********************/



    /***************** Methods **********************/


    public void itsLoaded(){
        if(driver.findElement( footerDisplayed ).isDisplayed()){
            System.out.println("Success");
        }

    }

    public void gettingStudioAlbums(){
        System.out.println("Llego");
        clikcElement( albumText );
        String albumesCompared = getTitle( albumText );
        String albumes = getTitle( albumText );
        System.out.println(albumes);
        org.testng.Assert.assertEquals( albumesCompared,albumes );
    }

    public void clickingAlbumToScrollDown(){
        clikcElement( albumTitle );
    }

    public void hovering (){
        Actions action = new Actions(driver);
        WebElement element = driver.findElement(hoverSelection);
        action.moveToElement(element).build().perform();
    }

    public void gettingHoverText(){
        Boolean hover = driver.findElement( hoverObject ).isDisplayed();
        Assert.assertTrue( hover );
    }

    /***************** End Methods **********************/
}
