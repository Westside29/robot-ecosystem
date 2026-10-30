public interface Robot 
{
    void start() throws BatteryLowException;
    void stop();
    String status();
}
