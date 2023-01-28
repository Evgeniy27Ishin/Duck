public class CocaColaFactory extends AbstractFactory
{
    public  AbstractWater CreateWater()
    {
        return new CocaColaWater();
    }
    public  AbstractBottle CreateBottle()
    {
        return new CocaColaBottle();
    }
}