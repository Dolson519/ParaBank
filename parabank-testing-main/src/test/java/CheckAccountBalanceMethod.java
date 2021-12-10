import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;


public class CheckAccountBalanceMethod {
    private static WebDriver driver = Util.getDriver();


    public static void balance() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[2]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div")).getText();
        Assert.assertEquals("1070.00", "1070.00", "1070.00");

    }


}



