import org.apache.logging.log4j.Logger;
import org.automation.framework.BrowserManager;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;

import static org.junit.jupiter.api.Assertions.assertTrue;
import org.apache.logging.log4j.LogManager;

public class DemoTest {
    BrowserManager manager = new BrowserManager();
    Logger log = LogManager.getRootLogger();

    @Test
    public void browserTest() {
        manager.openBrowser();
        log.info("Browser opened");
        WebDriver driver = manager.getDriver();
        driver.get("https://www.youtube.com");
        String url= driver.getCurrentUrl();
                assertTrue(url.contains("youtube"));
    }
}
