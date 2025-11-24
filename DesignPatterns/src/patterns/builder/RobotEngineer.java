package patterns.builder;

public class RobotEngineer {
    private final RobotBuilder builder;

    public RobotEngineer(RobotBuilder builder) {
        this.builder = builder;
    }

    public Robot getRobot(){
        return builder.getRobot();
    }

    public void makeRobot(){
        System.out.println("Building robot...");
        this.builder.buildRobotHead();
        this.builder.buildRobotTorso();
        this.builder.buildRobotArms();
        this.builder.buildRobotLegs();
        System.out.println("Robot built!");
    }
}
