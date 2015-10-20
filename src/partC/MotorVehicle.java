package partC;

public abstract class MotorVehicle
{
    public abstract void TurnOn();
    public abstract void TurnOff();
    private String name;
    
    public MotorVehicle(String name)
    {
        this.name = name;
    }
    
    public String getName()
    {
        return name;
    }
    
    
}
