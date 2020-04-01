import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class HelloWorld {

    /**
     * This method is to validate our mvn dependencies
     * @param args
     */
    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver.exe");
        WebDriver wd = new ChromeDriver();
        wd.get("https://www.eltiempo.com/");
        wd.quit();
    }

}
