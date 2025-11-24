package patterns.proxy;

public class AtmMachine implements GetAtmData{
    private AtmState hasCard;
    private AtmState noCard;
    private AtmState hasCorrectPin;
    private AtmState atmOutOfCash;
    private AtmState atmState;

    private double cashInMachine;

    public AtmMachine(){
        hasCard = new HasCard(this);
        noCard = new NoCard(this);
        hasCorrectPin = new HasPin(this);
        atmOutOfCash = new NoCash(this);
        atmState = noCard;

        if(cashInMachine < 0){
            atmState = atmOutOfCash;
        }
    }

    public AtmState getHasCard() {
        return hasCard;
    }

    public AtmState getNoCard() {
        return noCard;
    }

    public AtmState getHasCorrectPin() {
        return hasCorrectPin;
    }

    public AtmState getAtmOutOfCash() {
        return atmOutOfCash;
    }

    public AtmState getAtmState() {
        return atmState;
    }


    @Override
    public AtmState getAtmData() {
        return atmState;
    }

    @Override
    public double getCashInMachine() {
        return cashInMachine;
    }

}
