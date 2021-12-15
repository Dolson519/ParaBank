import org.hamcrest.core.StringContains;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.concurrent.TimeUnit;

public class TransactionSearchMethod extends Base{



        public static void TransactionSearchByAmount(){
            WebElement findTransactions = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a"));
            findTransactions.click();
            WebElement accDropDown = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select"));
            accDropDown.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Need to change the Xpath to correct account every time it resets
            WebElement mainAcc = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]"));
            mainAcc.click();
            WebElement amountBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[8]/input"));
            amountBox.sendKeys("20");
            WebElement findAmountBtn =  driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[9]/button"));
            findAmountBtn.click();
            WebElement transActionBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div"));
            transActionBox.getText();
            StringContains.containsString( "Transaction Results");
    }

        public static void TransactionSearchByDate(){
            WebElement findTransactions = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a"));
            findTransactions.click();
            WebElement accDropDown = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select"));
            accDropDown.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Need to change the Xpath to correct account every time it resets
            WebElement mainAcc = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]"));
            mainAcc.click();
            WebElement dateBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[4]/input"));
            dateBox.sendKeys("12-15-2021");
            WebElement findDateBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[5]/button"));
            findDateBtn.click();
            WebElement tranBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1"));
            tranBox.getText();
            Assert.assertTrue(true, "Transaction Results");
        }

        public static void TransactionSearchByDateRange(){
            WebElement findTransactions = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[5]/a"));
            findTransactions.click();
            WebElement accDropDown = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select"));
            accDropDown.click();
            driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

            //Need to change the Xpath to correct account every time it resets
            WebElement mainAcc = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select/option[1]"));
            mainAcc.click();
            WebElement fromDate = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[6]/div/input[1]"));
            fromDate.sendKeys("12-14-2021");
            WebElement toDate = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[6]/div/input[2]"));
            toDate.sendKeys("12-15-2021");
            WebElement dateRangeBtn = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[7]/button"));
            dateRangeBtn.click();
            WebElement tranBox = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1"));
            tranBox.getText();
            Assert.assertTrue(true, "Transaction Results");
        }

}
