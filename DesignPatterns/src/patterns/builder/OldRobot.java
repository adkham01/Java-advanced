package patterns.builder;

public class OldRobot implements RobotBuilder{
    private final Robot robot;

    public OldRobot() {
        robot = new Robot();
    }

    @Override
    public void buildRobotHead() {
        robot.setRobotHead("Tin head");
    }

    @Override
    public void buildRobotTorso() {
        robot.setRobotTorso("Tin torso");
    }

    @Override
    public void buildRobotArms() {
        robot.setRobotArms("Blowtorch arms");
    }

    @Override
    public void buildRobotLegs() {
        robot.setRobotLegs("Roller Skates");
    }

    @Override
    public Robot getRobot() {
        return robot;
    }

    @Override
    public String toString() {
        return robot.getRobotHead() + " " + robot.getRobotTorso() + " " + robot.getRobotArms() + " " + robot.getRobotLegs();
    }
}
