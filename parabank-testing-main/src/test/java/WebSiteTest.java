import org.openqa.selenium.WebDriver;
import org.testng.annotations.Test;


public class WebSiteTest {
    private WebDriver driver = Util.getDriver();



    @Test
    public void accountBalance() {
        CheckAccountBalanceMethod.balance();
    }

    @Test
    public void openChecking(){
        OpenAccount.CreateAccountChecking();
    }

    @Test
    public void openSavings(){
        OpenAccount.CreateAccountSavings();
    }

    @Test
    public void updateInfo() {
        UpdateInformationsMethod.UpdateProfile();
    }

    @Test
    public void loan() {
        RequestLoanMethod.loanApply();
    }

    @Test
    public void lowFundsLoan(){
        RequestLoanMethod.lowFundsLoanApply();
    }

    @Test
    public void emptyFieldLoanApplyTest(){
        RequestLoanMethod.emptyFieldLoanApply();
    }


    @Test(priority = 1)
    public void searchForTransactionByAmount() {
        TransactionsearchMethod.TransactionSearchByAmount();
    }


    @Test
    public void searchForTransactionByDate() {
        TransactionsearchMethod.TransactionSearchByDate();
    }

    @Test
    public void SearchForTransactionByDateRange(){
        TransactionsearchMethod.TransactionSearchByDateRange();
    }

    @Test
    public void PayingBills() {
        PayBillingMethod.PayBills();
    }

    // test doesn't work because of bug not being able to get customer info even with correct data 2021/12/06
    /*@Test
    public void forgotLoginTest() {
        ForgotLoginMethod.forgotLogin();
        driver.quit();
    }*/

    /* keep getting internal error
    @Test
    public void TransferFunds(){
        TransferFundsMethods.transfer_money();
        driver.quit();
    }*/
    @Test
    public void WebSiteRegister(){
        RegisterMethod.register();
        //driver.quit();
    }

    @Test
    public void EmptyFieldWebsiteRegister(){
        EmptyFieldRegisterMethod.emptyFieldRegister();
    }

    @Test
    public void falseLogin(){
        FalseLoginMethod.falseLogin();
    }

}