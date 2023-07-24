package utils;

import net.thucydides.core.webdriver.DriverSource;
import org.openqa.selenium.WebDriver;

public class WebDriverConfig implements DriverSource
{
    @Override
    public WebDriver newDriver() {
        System.setProperty("webdriver.chrome.driver", "Drivers/chromedriver.exe");
        return null;
    }

    @Override
    public boolean takesScreenshots() {
        return false;
    }
}
