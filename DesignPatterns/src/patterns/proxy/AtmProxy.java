package patterns.proxy;

public class AtmProxy implements GetAtmData{

    @Override
    public AtmState getAtmData() {
        AtmMachine machine = new AtmMachine();
        return machine.getAtmData()  ;
    }

    @Override
    public double getCashInMachine() {
        AtmMachine machine = new AtmMachine();
        return machine.getCashInMachine();
    }
}
