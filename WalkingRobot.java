public class WalkingRobot extends BaseRobot {
    private final String gait;

    public WalkingRobot(String id, double batteryLevel, String gait) {
        super(id, batteryLevel);
        this.gait = gait;
    }

    public void walk() {
        if (!isRunning()) {
            System.out.println("WalkingRobot " + getId() + " is not active yet.");
            return;
        }

        System.out.println("WalkingRobot " + getId() + " is walking with a " + gait + " gait.");
    }

    public void move() {
        System.out.println("WalkingRobot " + getId() + " is taking one step forward.");
    }

    public void move(String direction) {
        System.out.println("WalkingRobot " + getId() + " is walking " + direction + ".");
    }

    public void move(String direction, int speed) {
        System.out.println("WalkingRobot " + getId() + " is walking " + direction + " at speed " + speed + ".");
    }
}
