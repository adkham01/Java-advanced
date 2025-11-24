package patterns.strategy;

public class Animal {
    private String name;
    private double height;
    private String favFood;
    private double weight;
    private double speed;
    private String sound;
    private Flys flyingType;

    public Flys getFlyingType() {
        return flyingType;
    }

    public void setFlyingType(Flys flyingType) {
        this.flyingType = flyingType;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public String getFavFood() {
        return favFood;
    }

    public void setFavFood(String favFood) {
        this.favFood = favFood;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        if (weight < 0) {
            this.weight = weight;
        } else {
            System.out.println("Weight must be greater than 0");
        }
    }

    public double getSpeed() {
        return speed;
    }

    public void setSpeed(double speed) {
        this.speed = speed;
    }

    public String getSound() {
        return sound;
    }

    public void setSound(String sound) {
        this.sound = sound;
    }

    public String tryToFly() {
        return flyingType.fly();
    }
}
