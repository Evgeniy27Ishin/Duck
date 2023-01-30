public class Main
{
    public static void  main(String[] args)
    {
        Creator creator = null;
        Product product = null;

        System.out.println("------------------------------");

        creator = new ConcreteCreator(); 
        product = creator.FactoryMethod();
        creator.AnOperation();
    }
}