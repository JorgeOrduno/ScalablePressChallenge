package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class WikiHome extends BasePage {

    public WikiHome(WebDriver driver, WebDriverWait wait) {
        super( driver, wait );
    }

    /***************** Web Elements **********************/

    By logo = By.xpath( "//div[@class='central-textlogo__image sprite svg-Wikipedia_wordmark']" );
    By btnSearch = By.xpath( "//button[@type='submit']" );


    /***************** End Web Elements **********************/

    /***************** Methods **********************/

    public void wikiLogo (){
        driver.manage().timeouts().implicitlyWait( 10,TimeUnit.SECONDS );
        getTitle( logo );
        Assert.assertEquals( "wikipedia","wikipedia" );
    }

    public void btnSearch(){
        clikcElement( btnSearch );
    }

    /***************** End Methods **********************/

}
