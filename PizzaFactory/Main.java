public class Main {

    public static void main(String[] argv) {

        PizzaStore nyStore =  new NYPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Evgeniy ordered a " + pizza.getName() + "\n");


    }
}