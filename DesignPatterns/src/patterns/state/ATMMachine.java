package patterns.state;

public class ATMMachine {
    private ATMState hasCard;
    private ATMState noCard;
    private ATMState hasCorrectPin;
    private ATMState atmOutOfCash;
    private ATMState atmState;

    private int cashInMachine = 2000;
    private boolean correctPin = false;

    public ATMMachine(){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfCash = new NoCash(this);
        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfCash;
        }
    }

    public void setATMState(ATMState atmState){
        this.atmState = atmState;
    }

    public void setCashInMachine(int cashInMachine) {
        this.cashInMachine = cashInMachine;
    }

    public void insertCard(){
        atmState.insertCard();
    }

    public void ejectCard(){
        atmState.ejectCard();
    }

    public void requestCash(int amount){
        atmState.requestCash(amount);
    }

    public void insertPin(int pin){
        atmState.insertPin(pin);
    }

    public ATMState getHasCard() {
        return hasCard;
    }

    public ATMState getNoCard() {
        return noCard;
    }

    public ATMState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public ATMState getAtmOutOfCash() {
        return atmOutOfCash;
    }

    public ATMState getAtmState() {
        return atmState;
    }

    public int getCashInMachine() {
        return cashInMachine;
    }

    public boolean isCorrectPin() {
        return correctPin;
    }

    public void setHasCorrectPin(boolean correctPin) {
        this.correctPin = correctPin;
    }
}
