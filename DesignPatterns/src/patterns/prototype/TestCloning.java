package patterns.prototype;

public class TestCloning {

    static void main() {
        CloneFactory factory = new CloneFactory();
        Sheep sally = new Sheep();
        Sheep clonedShip = (Sheep) factory.getClone(sally);
        System.out.println(sally.hashCode() + " and " + clonedShip.hashCode());
    }
}
