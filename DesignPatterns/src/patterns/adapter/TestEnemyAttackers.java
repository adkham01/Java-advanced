package patterns.adapter;

public class TestEnemyAttackers {
    static void main() {
        EnemyTank rx7Tank = new EnemyTank();
        EnemyRobot robot = new EnemyRobot();
        EnemyAttacker robotAdapter = new EnemyRobotAdapter(robot);
        System.out.println("The Enemy Robot");
        robot.reactToHuman("Paul");
        robot.walkForward();
        robot.smashWithHands();

        System.out.println("The Enemy Tank");
        rx7Tank.assignDriver("John");
        rx7Tank.driveForward();
        rx7Tank.fireWeapon();

        System.out.println("The Robot with Adapter");

        robotAdapter.assignDriver("Simon");
        robotAdapter.driveForward();
        robotAdapter.fireWeapon();
    }
}
