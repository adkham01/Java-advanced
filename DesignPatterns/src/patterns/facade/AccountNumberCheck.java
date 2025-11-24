package patterns.facade;

public class AccountNumberCheck {

    private final int accountNumber;

    public AccountNumberCheck() {
        accountNumber = 12345678;
    }


    public boolean isActiveAccount(int accNumberToCheck) {
        return accNumberToCheck == getAccountNumber();
    }

    public int getAccountNumber() {
        return accountNumber;
    }
}
