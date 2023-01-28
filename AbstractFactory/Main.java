public class Main
{
    public static void  main(String[] args)
    {
        Client client = null;

        client = new Client(new CocaColaFactory());
        client.Run();

        System.out.println("------------------------------");

        client = new Client(new PepsiFactory());
        client.Run();
    }
}