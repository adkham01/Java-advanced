package patterns.template;

import java.util.Random;

public class ItalianHoagie extends Hoagie{

    private String[] meatUsed = {"beef", "pork", "chicken"};
    private String[] cheeseUsed = {"mozzarella", "parmigiano"};
    private String[] veggiesUsed = {"peppers", "tomatoes", "onions"};
    private Random generator = new Random();


    @Override
    public void addMeat() {
        System.out.println( "Adding meat: " + meatUsed[generator.nextInt(3)]);
    }

    @Override
    public void addCheese() {
        System.out.println( "Adding cheese: " + cheeseUsed[generator.nextInt(2)]);
    }

    @Override
    public void addVeggies() {
        System.out.println( "Adding veggies: " + veggiesUsed[generator.nextInt(3)]);
    }

    @Override
    public void wrapTheHoagie() {
        System.out.println("The hoagie is ready");
    }

    @Override
    public boolean wantMeat() {
        return true;
    }

    @Override
    public boolean wantCheese() {
        return true;
    }

    @Override
    public boolean wantVeggies() {
        return true;
    }
}
