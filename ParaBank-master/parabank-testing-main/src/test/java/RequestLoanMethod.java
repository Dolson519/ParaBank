
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

public class RequestLoanMethod extends Base{


public static void loanApply(){
    WebElement requestloan = driver.findElement(By.xpath("//a[@href='/parabank/requestloan.htm']"));
    requestloan.click();
    WebElement request_amount= driver.findElement(By.xpath("//input[@id='amount']"));
    request_amount.sendKeys("200");
    WebElement downpayment= driver.findElement(By.xpath("//input[@id='downPayment']"));
    downpayment.sendKeys("30");
    WebElement apply_now = driver.findElement(By.xpath("//input[@class='button']"));
    apply_now.click();
   WebElement account_overview = driver.findElement(By.xpath("//*[@id=\"leftPanel\"]/ul/li[2]/a"));
   account_overview.click();
   WebElement select_account = driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/table/tbody/tr[1]/td[1]/a"));
   select_account.click();
   driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div[2]/table/tbody/tr[1]/td[2]/a")).getText();
    Assert.assertTrue(true,"Down Payment for Loan");
    }

    public static void lowFundsLoanApply(){
        WebElement requestloan = driver.findElement(By.xpath("//a[@href='/parabank/requestloan.htm']"));
        requestloan.click();
        WebElement request_amount= driver.findElement(By.xpath("//input[@id='amount']"));
        request_amount.sendKeys("1000");
        WebElement downpayment= driver.findElement(By.xpath("//input[@id='downPayment']"));
        downpayment.sendKeys("900");
        WebElement apply_now = driver.findElement(By.xpath("//input[@class='button']"));
        apply_now.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/div/p")).getText();
        Assert.assertTrue(true,"You do not have sufficient funds for the given down payment.");
    }

    public static void emptyFieldLoanApply(){
        WebElement requestloan = driver.findElement(By.xpath("//a[@href='/parabank/requestloan.htm']"));
        requestloan.click();
        WebElement request_amount= driver.findElement(By.xpath("//input[@id='amount']"));
        request_amount.sendKeys("");
        WebElement downpayment= driver.findElement(By.xpath("//input[@id='downPayment']"));
        downpayment.sendKeys("900");
        WebElement apply_now = driver.findElement(By.xpath("//input[@class='button']"));
        apply_now.click();
        driver.findElement(By.xpath("/html/body/div[1]/div[3]/div[2]/div/div/h1")).getText();
        Assert.assertTrue(true,"Error!");
    }
}
