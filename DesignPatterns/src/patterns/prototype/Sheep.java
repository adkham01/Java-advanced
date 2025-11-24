package patterns.prototype;

public class Sheep implements Animal{
    public Sheep(){
        System.out.println("Sheep is made");
    }

    @Override
    public Animal makeCopy() {
        System.out.println("Sheep is being made");
        Sheep ship = null;
        try {
            ship = (Sheep) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new RuntimeException(e);
        }

        return ship;

    }

    @Override
    public String toString() {
        return "Sheep";
    }
}
