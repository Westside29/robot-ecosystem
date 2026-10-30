public class FlyingRobot extends BaseRobot 
{
    private int altitude;

    public FlyingRobot(String id, double batteryLevel, int altitude) {
        super(id, batteryLevel);
        this.altitude = altitude;
    }

    public void fly() 
    {
        if (!isRunning()) {
            System.out.println("FlyingRobot " + getId() + " is not active yet.");
            return;
        }

        System.out.println("FlyingRobot " + getId() + " is flying at altitude " + altitude + "m.");
    }

    public void move() 
    {
        System.out.println("FlyingRobot " + getId() + " is hovering in place.");
    }

    public void move(String direction) {
        System.out.println("FlyingRobot " + getId() + " is moving " + direction + " in the air.");
    }

    public void move(String direction, int speed) 
    {
        System.out.println("FlyingRobot " + getId() + " is moving " + direction + " at speed " + speed + " km/h.");
    }
}
