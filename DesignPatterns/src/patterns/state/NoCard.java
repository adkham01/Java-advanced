package patterns.state;

public class NoCard implements ATMState{

    private final ATMMachine atmMachine;
    public NoCard(ATMMachine atmMachine) {
        this.atmMachine = atmMachine;
    }

    @Override
    public void insertCard() {
        System.out.println("Please enter a Pin");
        atmMachine.setATMState(atmMachine.getHasCard());
    }

    @Override
    public void ejectCard() {
        System.out.println("Please insert a Card");

    }

    @Override
    public void insertPin(int pin) {
        System.out.println("Please insert a Card");
    }

    @Override
    public void requestCash(int amount) {
        System.out.println("Please insert a Card");
    }

    public ATMMachine getAtmMachine() {
        return atmMachine;
    }
}
