public class App {
    public static void main(String[] args) 
    {
        System.out.println("=== Robot Ecosystem Demo ===");

        FlyingRobot drone = new FlyingRobot("F-101", 85, 1200);
        MovingRobot rover = new MovingRobot("M-204", 72, 30);
        WalkingRobot walker = new WalkingRobot("W-330", 68, "bipedal");

        RobotController controller = new RobotController();
        controller.addRobot(drone);
        controller.addRobot(rover);
        controller.addRobot(walker);

        try {
            controller.startAll();

            drone.move();
            drone.move("north");
            drone.move("east", 45);
            drone.fly();

            rover.move();
            rover.move("left");
            rover.move("forward", 25);
            rover.drive();

            walker.move();
            walker.move("forward");
            walker.move("north", 4);
            walker.walk();

            controller.showStatus();
            controller.stopAll();

            System.out.println("\nTesting battery-low exception handling...");
            MovingRobot lowBatteryRobot = new MovingRobot("M-999", 5, 12);
            lowBatteryRobot.start();

        } catch (BatteryLowException e) {
            System.out.println("Exception caught: " + e.getMessage());
        }
    }
}
