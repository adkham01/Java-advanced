package patterns.state;

public class HasCard implements ATMState{
    private final ATMMachine atmMachine;

    public HasCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Card already inserted");
    }

    @Override
    public void ejectCard() {
        atmMachine.setATMState(atmMachine.getNoCard());
        System.out.println("Card removed");
    }

    @Override
    public void insertPin(int pin) {
        if(pin == 1234){
            System.out.println("Pin Correct");
            atmMachine.setHasCorrectPin(true);
            atmMachine.setATMState(atmMachine.getHasCorrectPin());
        }
        else {
            System.out.println("Something is wrong with the Pin");
            atmMachine.setATMState(atmMachine.getNoCard());
        }
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Enter pin first");
    }
}
