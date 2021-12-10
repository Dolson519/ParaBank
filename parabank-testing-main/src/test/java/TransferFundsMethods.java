import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class TransferFundsMethods {
    private static WebDriver driver = Util.getDriver();


    public static void transfer_money() {
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[1]/ul/li[3]/a")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/p/input")).sendKeys("50");
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[1]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[2]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[1]/select[1]/option[3]")).click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/form/div[2]/input")).click();

    }
}








    /*WebElement send_cash = driver.findElement(By.xpath("//a[@href='/parabank/transfer.htm']"));
    send_cash.click();
    WebElement transfer_amount = driver.findElement(By.xpath("//input[@id='amount' and @name='input']"));
    transfer_amount.sendKeys("30");
   Select from_list= new Select(driver.findElement(By.xpath("//*[@id=\"fromAccountId\"]")));
   from_list.selectByVisibleText("12345");
   Select droplist = new Select(driver.findElement(By.xpath("//*[@id=\"toAccountId\"]")));
    droplist.selectByVisibleText("13344");
    WebElement transfer_button = driver.findElement(By.xpath(" //input[@class='button']"));
    transfer_button.click();
 String Account_balance= driver.findElement(By.xpath(" /html/body/div[1]/div[3]/div[2]/div/div/p[1]")).getText();
 System.out.println(Account_balance);



}*/




//" $10.00 has been transferred from account #30660 to account #13344.

