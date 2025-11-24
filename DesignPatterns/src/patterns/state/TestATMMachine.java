package patterns.state;

public class TestATMMachine {
    static void main() {
        ATMMachine machine = new ATMMachine();
        machine.insertCard();
        machine.ejectCard();
        machine.insertCard();
        machine.insertPin(1234);
        machine.requestCash(100);
        machine.requestCash(1000);
        machine.insertCard();
        machine.insertPin(1234);
    }
}
