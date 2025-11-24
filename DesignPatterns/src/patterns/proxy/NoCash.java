package patterns.proxy;

public class NoCash extends AtmState {
    public NoCash(AtmMachine atmMachine) {
        super();
        System.out.println("No Cash in machine");
    }
}
