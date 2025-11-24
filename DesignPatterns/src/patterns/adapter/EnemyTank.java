package patterns.adapter;

import java.util.Random;

public class EnemyTank implements EnemyAttacker{
    private final Random generator;

    public EnemyTank() {
        generator = new Random();
    }

    @Override
    public void fireWeapon() {
        int damage = generator.nextInt(10) + 1;
        System.out.println("Enemy Tank deals " + damage + " damage");
    }

    @Override
    public void driveForward() {
        int movement = generator.nextInt(5) + 1;
        System.out.println("Enemy Tank moves " + movement + " spaces");
    }

    @Override
    public void assignDriver(String driverName) {
        System.out.println(driverName + " is driving the tank");
    }
}
