package patterns.facade;

public class BankAccountFacade {

    private final int accountNumber;
    private final int securityCode;
    private final boolean isActiveAccount;
    private final AccountNumberCheck accountNumberCheck;
    private final SecurityCodeCheck securityCodeCheck;
    private final FundsCheck fundsCheck;

    public BankAccountFacade(int accountNumber, int securityCode) {
        this.accountNumber = accountNumber;
        this.securityCode = securityCode;
        accountNumberCheck = new AccountNumberCheck();
        securityCodeCheck = new SecurityCodeCheck();
        fundsCheck = new FundsCheck();
        isActiveAccount = isActiveAccount();
        WelcomeToBank welcomeToBank = new WelcomeToBank();
    }

    private interface AccountOperation{
        void execute();
    }

    private void executeOperation(AccountOperation operation){
        if(!isActiveAccount){
            System.out.println("Please check your account number and security code");
            return;
        }
        operation.execute();
    }

    private boolean checkAccountNumber() {
        return accountNumberCheck.isActiveAccount(accountNumber);
    }

    private boolean checkSecurityCode() {
        return securityCodeCheck.isValidSecurityCode(securityCode);
    }

    public boolean isActiveAccount() {
        return checkAccountNumber() && checkSecurityCode();
    }

    public void withdrawCash(double amount) {
        executeOperation(() -> fundsCheck.decreaseCashInAccount(amount));
    }

    public void depositCash(double amount) {
        executeOperation(() -> fundsCheck.depositCash(amount));
    }

    public void displayBalance() {
        if(isActiveAccount){
            System.out.println("Balance is " + fundsCheck.getBalance());
        }
        else {
            System.out.println("Please check your account number and security code");
        }
    }

    public boolean hasEnoughCash(double amount){
        if(isActiveAccount){
            fundsCheck.hasEnoughCash(amount);
            return true;
        }
        else {
            System.out.println("Please check your account number and security code");
            return false;
        }
    }



}
