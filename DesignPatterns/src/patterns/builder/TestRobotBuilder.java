package patterns.builder;

public class TestRobotBuilder {
    static void main() {
        RobotBuilder builder =  new OldRobot();
        RobotEngineer engineer = new RobotEngineer(builder);
        engineer.makeRobot();
        Robot robot = engineer.getRobot();
        System.out.println(robot);
    }
}
