package patterns.facade;

public class FundsCheck {

    private double balance;

    public FundsCheck() {
        balance = 1000.00;
    }

    public double getBalance() {
        return balance;
    }

    public void decreaseCashInAccount(double amount){
        balance -= amount;
        System.out.println("Success\tBalance is " + balance);
    }

    public void increaseCashInAccount(double amount){
        balance += amount;
        System.out.println("Success\tBalance is " + balance);
    }

    public boolean hasEnoughCash(double amount){
        if(balance >= amount){
            decreaseCashInAccount(amount);
            return true;
        }
        else {
            System.out.println("Insufficient funds");
            System.out.println("Balance is " + balance);
            return false;
        }
    }

    public void displayBalance(){
        System.out.println("Balance is " + balance);
    }

    public void depositCash(double amount){
        System.out.println("Depositing " + amount + "\nCurrent balance is " + balance);
        increaseCashInAccount(amount);
    }
}
