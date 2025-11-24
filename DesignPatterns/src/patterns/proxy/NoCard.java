package patterns.proxy;

public class NoCard extends AtmState {
    public NoCard(AtmMachine atmMachine) {
        super();
        System.out.println("No Card in machine");
    }
}
