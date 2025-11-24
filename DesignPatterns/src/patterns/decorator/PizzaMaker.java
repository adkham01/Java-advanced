package patterns.decorator;

public class PizzaMaker {
    static void main() {
        Pizza basicPizza = new TomatoSauce(new Mozzarella(new PlainPizza()));

        System.out.println( basicPizza.getDescription() + " costs " + basicPizza.getCost());
    }
}
