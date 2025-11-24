package patterns.facade;

public class TestBankAccount {
    static void main() {
        BankAccountFacade accessingBank = new BankAccountFacade(12345678, 1234);
        accessingBank.withdrawCash(50.00);
        accessingBank.withdrawCash(900.00);

        accessingBank.depositCash(200.00);
        accessingBank.displayBalance();
        System.out.println(accessingBank.hasEnoughCash(100.00));

    }
}
