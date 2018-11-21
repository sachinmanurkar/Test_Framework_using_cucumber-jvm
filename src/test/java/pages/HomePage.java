package pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.By;

public class HomePage {

    WebDriver driver;

    public HomePage(WebDriver driver) {
        this.driver = driver;
    }

    public boolean isSignOutLinkDisplayed() throws Throwable {
        return driver.findElement(By.cssSelector("a[href='/users/sign_out']")).isDisplayed();
    }
}


