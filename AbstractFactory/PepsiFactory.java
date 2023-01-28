public class PepsiFactory extends AbstractFactory
{
    public AbstractWater CreateWater()
    {
        return new PepsiWater();
    }
    public  AbstractBottle CreateBottle()
    {
        return new PepsiBottle();
    }
}