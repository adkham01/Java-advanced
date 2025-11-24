package patterns.template;

import java.util.Random;

public class VeggieHoagie extends Hoagie{
    private String[] veggiesUsed = {"peppers", "tomatoes", "onions"};
    private Random generator = new Random();

    @Override
    public void addMeat() {

    }

    @Override
    public void addCheese() {

    }

    @Override
    public void addVeggies() {
        System.out.println( "Adding veggies: " + veggiesUsed[generator.nextInt(3)]);
    }

    @Override
    public void wrapTheHoagie() {
        System.out.println( "Veggie hoagie is ready");
    }

    @Override
    public boolean wantMeat() {
        return false;
    }

    @Override
    public boolean wantCheese() {
        return false;
    }

    @Override
    public boolean wantVeggies() {
        return true;
    }
}
