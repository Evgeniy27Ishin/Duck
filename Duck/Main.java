public class Main {

    public static void main(String[] argv) {
        Duck mallard = new MallardDuck();
        mallard.display();
        mallard.quack();
        mallard.swim();
        mallard.performFly();
        System.out.println("----------------------");

        Duck redhead = new RedheadDuck();
        redhead.display();
        redhead.quack();
        redhead.swim();
        redhead.performFly();
        System.out.println("----------------------");

        Duck rubber = new RubberDuck();
        rubber.display();
        rubber.quack();
        rubber.swim();
        rubber.performFly();
        System.out.println("----------------------");

        Duck decoy = new DecoyDuck();
        decoy.display();
        decoy.quack();
        decoy.swim();
        decoy.performFly();
        System.out.println("----------------------");
    }
}