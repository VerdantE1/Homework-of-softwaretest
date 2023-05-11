import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class Browser {
    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");
        WebDriver driver= new EdgeDriver();

        driver.get("https://www.baidu.com");

        driver.manage().window().maximize();
        Thread.sleep(2000);

        driver.get("https://m.baidu.com");
        driver.manage().window().setSize(new Dimension(480, 800));
        Thread.sleep(2000);

        driver.quit();
    }
}
