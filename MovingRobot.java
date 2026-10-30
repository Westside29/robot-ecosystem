public class MovingRobot extends BaseRobot
 {
    private int speed;

    public MovingRobot(String id, double batteryLevel, int speed) 
    {
        super(id, batteryLevel);
        this.speed = speed;
    }

    public void drive()
     {
        if (!isRunning()) {
            System.out.println("MovingRobot " + getId() + " is not active yet.");
            return;
        }

        System.out.println("MovingRobot " + getId() + " is driving at " + speed + " km/h.");
    }

    public void move()
     {
        System.out.println("MovingRobot " + getId() + " is moving forward.");
    }

    public void move(String direction) {
        System.out.println("MovingRobot " + getId() + " is moving " + direction + ".");
    }

    public void move(String direction, int speed) {
        System.out.println("MovingRobot " + getId() + " is moving " + direction + " at speed " + speed + " km/h.");
    }
}
