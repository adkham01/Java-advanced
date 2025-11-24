package patterns.proxy;

public class TestAtmMachine {
    static void main() {
        GetAtmData atmProxy = new AtmProxy();
        System.out.println("\nCurrent ATM state: " + atmProxy.getAtmData());
        System.out.println("\nCash in machine: " + atmProxy.getCashInMachine());
    }
}
