package SeleniumTestTask04;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeOptions;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SeleniumTest {
    @Test
    public void browserTest(){
        System.setProperty("webdriver.chrome.driver", "C:/Users/Comp/Desktop/chromedriver-win64");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://google.com");
        WebElement searchBox = webDriver.findElement(By.name("q"));
        searchBox.sendKeys("Selenium");
        searchBox.submit();
        List<WebElement> searchResult =  webDriver.findElements(By.cssSelector("div"));
        boolean isFind = false;
        for (WebElement element: searchResult){
            if (element.getText().contains("https://www.selenium.dev/")){
                isFind = true;
                break;
            }
        }
        webDriver.quit();
        assertTrue(isFind);
    }
}
