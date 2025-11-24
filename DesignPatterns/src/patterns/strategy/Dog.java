package patterns.strategy;

public class Dog extends Animal{
    void digHole(){
        System.out.println("Dug hole");
    }
    public Dog(){
        super();
        setSound("bark");
        setFlyingType(new CantFly());
    }
}
