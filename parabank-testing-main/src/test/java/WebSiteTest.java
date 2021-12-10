import org.junit.After;
import org.junit.Before;
import org.junit.jupiter.api.Test;
import org.openqa.selenium.WebDriver;


public class WebSiteTest {
    private WebDriver driver = Util.getDriver();



    @Before
    public void deleteCookies() {
        driver.manage().deleteAllCookies();
    }

    @Before
    public void maxWindow() {
        driver.manage().window().maximize();
    }

    @After
    public void TearDown(){
        driver.quit();
    }

    @Test
    public void WebSiteRegister() {
        RegisterMethod.register();
        driver.get("https://parabank.parasoft.com/parabank/index.htm");
        driver.quit();
    }

    @Test
    public void EmptyFieldWebsiteRegister(){
        EmptyFieldRegisterMethod.emptyFieldRegister();
        driver.quit();
    }


    @Test
    public void Login() {
        LoginMethod.login();
        driver.quit();
    }

    @Test
    public void falseLogin(){
        FalseLoginMethod.falseLogin();
        driver.quit();
    }

    // test doesn't work because of bug not being able to get customer info even with correct data 2021/12/06
    /*@Test
    public void forgotLoginTest() {
        ForgotLoginMethod.forgotLogin();
        driver.quit();

    }*/


    @Test
    public void AccountBalance() {
        LoginMethod.login();
        CheckAccountBalanceMethod.balance();
        //driver.quit();
    }



    @Test
    public void OpenChecking(){
        LoginMethod.login();
        OpenAccount.CreateAccountChecking();
        driver.quit();
    }


    @Test
    public void OpenSavings(){
        LoginMethod.login();
        OpenAccount.CreateAccountSavings();
        driver.quit();
    }




    @Test
    public void UpdateInfo() {
        LoginMethod.login();
        UpdateInformationsMethod.UpdateProfile();
        driver.quit();
    }


    @Test
    public void Loan() {
        LoginMethod.login();
        RequestLoanMethod.loanApply();
        driver.quit();
    }

    @Test
    public void LowFundsLoan(){
        LoginMethod.login();
        RequestLoanMethod.lowFundsLoanApply();
        driver.quit();
    }

    @Test
    public void EmptyFieldLoanApplyTest(){
        LoginMethod.login();
        RequestLoanMethod.emptyFieldLoanApply();
        driver.quit();
    }


    @Test
    public void SearchForTransactionByAmount() {
        LoginMethod.login();
        TransactionsearchMethod.TransactionSearchByAmount();
        driver.quit();
    }


    @Test
    public void SearchForTransactionByDate() {
        LoginMethod.login();
        TransactionsearchMethod.TransactionSearchByDate();
        driver.quit();
    }

    @Test
    public void SearchForTransactionByDateRange(){
        LoginMethod.login();
        TransactionsearchMethod.TransactionSearchByDateRange();
        driver.quit();
    }



    @Test
    public void PayingBills() {
        LoginMethod.login();
        PayBillingMethod.PayBills();
        driver.quit();
    }

    /*@Test
    public void TransferFunds(){
        LoginMethod.login();
        TransferFundsMethods.transfer_money();
        driver.quit();
    }*/



}