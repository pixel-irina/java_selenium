import org.openqa.selenium.Webdriver;
import org.openqa.selenium.support.ui.Wevbdriverwait;

public class second {
    private Webdriver driver;
    private WebdriverWait wait;

    @Before
    public void start (){
        driver = new chromedriver();
        wait = new Webdriverwait (driver, timeOutinSeconds: 10);
    }
    @Test
    public void second (){
        driver.get("https://bash.im/search");
        driver.findElement(By.name("text")).sendKeys ("1");
        driver.findElement(By.tagname("button")).click();
        wait.until (titleIs("Цитата #1 – Цитатник Рунета "));
    }
    @After
    public void stop() {
        driver.quit();
        driver = null;
    }
}
