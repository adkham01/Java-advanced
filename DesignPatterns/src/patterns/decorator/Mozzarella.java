package patterns.decorator;

public class Mozzarella extends ToppingDecorator{
    public Mozzarella(Pizza pizza) {
        super(pizza);
        System.out.println("Adding Dough");
        System.out.println("Adding Mozzarella");
    }

    @Override
    public String getDescription() {
        return super.getDescription() + "Mozzarella";
    }

    @Override
    public double getCost() {
        return super.getCost() + 0.50;
    }
}
