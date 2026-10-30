public abstract class BaseRobot implements Robot {
    private final String id;
    private double batteryLevel;
    private boolean running;

    public BaseRobot(String id, double batteryLevel) 
    {
        this.id = id;
        this.batteryLevel = batteryLevel;
        this.running = false;
    }

    public String getId() 
    {
        return id;
    }

    public double getBatteryLevel() 
    {
        return batteryLevel;
    }

    public void setBatteryLevel(double batteryLevel) 
    {
        this.batteryLevel = batteryLevel;
    }

    public boolean isRunning() 
    {
        return running;
    }

    @Override
    public void start() throws BatteryLowException 
    {
        if (batteryLevel < 10) {
            throw new BatteryLowException("Battery too low to start robot " + id + ". Charge it first.");
        }
        running = true;
        System.out.println("Robot " + id + " has started.");
    }

    @Override
    public void stop() 
    {
        running = false;
        System.out.println("Robot " + id + " has stopped.");
    }

    @Override
    public String status() 
    {
        return "Robot " + id + " | Battery: " + batteryLevel + "% | Running: " + running;
    }
}
