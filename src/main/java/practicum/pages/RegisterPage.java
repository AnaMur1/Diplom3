package practicum.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class RegisterPage extends Page {

    private final By registerLabel = By.xpath("//h2[text()='Регистрация']");
    private final By nameInput = By.xpath("//label[text()='Имя']/../input");
    private final By emailInput = By.xpath("//label[text()='Email']/../input");
    private final By passwordInput = By.xpath("//label[text()='Пароль']/../input");
    private final By registerButton = By.xpath("//button[text()='Зарегистрироваться']");
    private final By incorrectPasswordLabel = By.xpath("//p[text() = 'Некорректный пароль']");
    private final By enterButton = By.xpath("//a[text() = 'Войти']");

    public RegisterPage(WebDriver webDriver) {
        super(webDriver);
    }

    @Override
    public void waitForLoad() {
        waitForVisibility(registerLabel);
    }

    public void enterNewAccountData(String name, String email, String password) {
        enterName(name);
        enterEmail(email);
        enterPassword(password);
    }

    public void clickRegisterButton() {
        webDriver.findElement(registerButton).click();
    }

    public void enterPassword(String password) {
        webDriver.findElement(passwordInput).sendKeys(password);
    }

    public void enterEmail(String email) {
        webDriver.findElement(emailInput).sendKeys(email);
    }

    public void enterName(String name) {
        webDriver.findElement(nameInput).sendKeys(name);
    }

    public boolean isIncorrectPasswordLabelVisible() {
        return webDriver.findElement(incorrectPasswordLabel).isDisplayed();
    }

    public void clickLoginLink() {
        webDriver.findElement(enterButton).click();
    }
}
