import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.edge.EdgeDriver;


public class AlertDemo {

    public static void main(String[] args) throws InterruptedException {
        System.setProperty("webdriver.http.factory", "jdk-http-client");
        System.setProperty("webdriver.edge.driver", "D:\\webdriver\\msedgedriver.exe");

        WebDriver driver = new EdgeDriver();
        driver.get("https://www.baidu.com");

        driver.findElement(By.id("s-usersetting-top")).click();
        driver.findElement(By.linkText("搜索设置")).click();
        Thread.sleep(2000);

        //保存设置
        driver.findElement(By.className("prefpanelgo")).click();
        Thread.sleep(2000);
        //接收弹窗
        driver.switchTo().alert().accept();
        Thread.sleep(2000);

        driver.quit();
    }
}
