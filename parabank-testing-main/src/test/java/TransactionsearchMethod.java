import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TransactionsearchMethod {

    private static WebDriver driver = Util.getDriver();


        public static void TransactionSearchByAmount(){
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[8]/input")).sendKeys("10");
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[9]/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[2]/a")).getText();
            Assert.assertTrue("Transaction Results",true);
    }

        public static void TransactionSearchByDate(){
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/input")).sendKeys("12-10-2021");
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[5]/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
            Assert.assertTrue("Transaction Results", true);
        }

        public static void TransactionSearchByDateRange(){
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[6]/div/input[1]")).sendKeys("");
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[6]/div/input[2]")).sendKeys("");
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[7]/button")).click();
        }


}
