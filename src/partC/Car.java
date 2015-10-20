package partC;

public class Car extends MotorVehicle
{
    
    public Car(String name)
    {
        super(name);
    }
    
    @Override
    public void TurnOn()
    {
        System.out.println(getName() + " is starting");
    }
    
    @Override
    public void TurnOff()
    {
        System.out.println(getName() + " is stopping");
    }
    
}
