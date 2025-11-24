package patterns.strategy;

public class AnimalPlay {
    static void main() {
        Animal sparky = new Dog();
        sparky.setName("Fido");
        sparky.setHeight(20);
        sparky.setWeight(10);
        sparky.setFavFood("Bread");
        sparky.setSound("bark");
        sparky.setFlyingType(new CantFly());
        System.out.println(sparky.getName() + " is " + sparky.getHeight() + " inches tall and weighs " + sparky.getWeight() + " pounds. He likes " + sparky.getFavFood() + " and plays with his " + sparky.tryToFly() + ".");

        Animal tweety = new Bird();
        tweety.setName("Tweety");
        tweety.setHeight(10);
        tweety.setWeight(1);
        tweety.setFavFood("Sweets");
        tweety.setSound("Tweet");
        tweety.setFlyingType(new ItFlys());
        System.out.println(tweety.getName() + " is " + tweety.getHeight() + " inches tall and weighs " + tweety.getWeight() + " pounds. He likes " + tweety.getFavFood() + " and plays with his " + tweety.tryToFly() + ".");
    }
}
