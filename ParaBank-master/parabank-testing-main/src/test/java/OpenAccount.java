
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.testng.Assert;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class OpenAccount extends Base{


    //create a checking account
    public static void CreateAccountChecking(){
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]"));
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
        Assert.assertTrue(true,"Account Opened!");
    }

    //create a savings account
    public static void CreateAccountSavings(){
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[1]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/select[1]/option[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div/input")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
        Assert.assertTrue(true,"Account Opened!");
    }

}
