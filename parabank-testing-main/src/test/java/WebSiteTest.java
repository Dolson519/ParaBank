import org.testng.annotations.Test;


public class WebSiteTest extends Base{



    @Test
    public void accountBalance() {
        CheckAccountBalanceMethod.balance();
    }

    //@Test
    //public void openChecking(){
        //OpenAccount.CreateAccountChecking();
    //}

    //@Test
    //public void openSavings(){
        //OpenAccount.CreateAccountSavings();
   // }

    @Test
    public void updateInfo() {
        UpdateInformationsMethod.UpdateProfile();
    }

    //@Test
    //public void loan() {
        //RequestLoanMethod.loanApply();
    //}

    @Test
    public void lowFundsLoan(){
        RequestLoanMethod.lowFundsLoanApply();
    }

    @Test
    public void emptyFieldLoanApplyTest(){
        RequestLoanMethod.emptyFieldLoanApply();
    }


    @Test(priority = 14)
    public void searchForTransactionByAmount() {
        TransactionSearchMethod.TransactionSearchByAmount();
    }


    @Test
    public void searchForTransactionByDate() {
        TransactionSearchMethod.TransactionSearchByDate();
    }

    @Test
    public void SearchForTransactionByDateRange(){
        TransactionSearchMethod.TransactionSearchByDateRange();
    }

    @Test
    public void PayingBills() {
        PayBillingMethod.PayBills();
    }

    // test doesn't work because of bug not being able to get customer info even with correct data 2021/12/06
    /*@Test
    public void forgotLoginTest() {
        ForgotLoginMethod.forgotLogin();
    }*/


    @Test
    public void TransferFunds(){
        TransferFundsMethods.transfer_money();
    }

    @Test
    public void WebSiteRegister(){
        RegisterMethod.register();
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