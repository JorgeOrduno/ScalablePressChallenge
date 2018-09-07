package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasePage {

    public WebDriver driver;
    public WebDriverWait wait;

    /***************** Web Elements **********************/
    String URL = "https://wikipedia.org/";
    By txtSearchField = By.id( "searchInput");

    /***************** End Web Elements **********************/


    /***************** Methods **********************/

    public BasePage(WebDriver driver, WebDriverWait wait) {
        this.driver = driver;
        this.wait = wait;
    }

    public void clikcElement (By element){
        driver.findElement( element ).click();

    }

    public String getTitle(By element){

        return driver.findElement( element ).getText().toLowerCase();
    }

    public void txtSendKeys  (String text){
        driver.findElement( txtSearchField ).sendKeys( text );
    }

    public void navigateTo (){
        driver.get( URL );
    }

    /***************** End Methods **********************/

}
