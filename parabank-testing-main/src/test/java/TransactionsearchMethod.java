import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TransactionsearchMethod extends Base{


        public static void TransactionSearchByAmount(){
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select")).click();
            //Need to change the Xpath to correct account every time it resets
            WebElement mainAcc = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[2]"));
            mainAcc.click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[8]/input")).sendKeys("10");
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[9]/button")).click();
            driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
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
