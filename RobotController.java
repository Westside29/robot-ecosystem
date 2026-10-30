import java.util.ArrayList;
import java.util.List;

public class RobotController 
{
    private final List<Robot> robots = new ArrayList<>();

    public void addRobot(Robot robot) 
    {
        robots.add(robot);
    }

    public void removeRobot(Robot robot) 
    {
        robots.remove(robot);
    }

    public void startAll() throws BatteryLowException 
    {
        for (Robot robot : robots) 
            {
            robot.start();
        }
    }

    public void stopAll() 
    {
        for (Robot robot : robots) 
            {
            robot.stop();
        }
    }

    public void showStatus() 
    {
        for (Robot robot : robots) 
            {
            System.out.println(robot.status());
        }
    }
}
