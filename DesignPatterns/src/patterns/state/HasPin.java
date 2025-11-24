package patterns.state;

public class HasPin implements ATMState{
    private final ATMMachine atmMachine;
    public HasPin(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }
    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard() {
        System.out.println("Card removed");
        atmMachine.setATMState(atmMachine.getNoCard());
    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Already entered pin");
    }

    @Override
    public void requestCash(int amount) {
        if (amount > atmMachine.getCashInMachine()){
            atmMachine.setATMState(atmMachine.getNoCard());
            throw new IllegalStateException("Insufficient Funds");
        }
        else {
            atmMachine.setCashInMachine(atmMachine.getCashInMachine() - amount);
            System.out.println("Amount of " + amount + " requested");
            System.out.println("Balance is " + atmMachine.getCashInMachine());
            atmMachine.setATMState(atmMachine.getNoCard());
        }
    }


}
