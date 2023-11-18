package SeleniumTestTask5;

//Нужно написать сквозной тест с использованием Selenium, который авторизует пользователя на сайте https://www.saucedemo.com/.
//Данные для входа - логин: "standard_user", пароль: "secret_sauce".
//Проверить, что авторизация прошла успешно и отображаются товары.
//Вам необходимо использовать WebDriver для открытия страницы и методы sendKeys() для ввода данных в поля формы,
// и submit() для отправки формы. После этого, проверьте, что на странице отображаются продукты (productsLabel.getText() = "Products").

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import static org.assertj.core.api.Assertions.assertThat;

public class SeleniumTest {
    @Test
    public void testAuthorization() {
        String login = "standard_user";
        String password = "secret_sauce";
        System.setProperty("webdriver.chrome.driver", "C:/Users/Comp/Desktop/chromedriver-win64");
        WebDriver webDriver = new ChromeDriver();
        webDriver.get("https://www.saucedemo.com/");
        WebElement loginBox = webDriver.findElement(By.name("user-name"));
        WebElement passwordBox = webDriver.findElement(By.name("password"));
        loginBox.sendKeys(login);
        passwordBox.sendKeys(password);
        WebElement loginButton = webDriver.findElement(By.id("login-button"));
        loginButton.click();
        WebElement productLabel = webDriver.findElement(By.className("title"));
        String findTExt = productLabel.getText();
        webDriver.quit();
        assertThat(findTExt).isEqualTo("Products");
    }
}
