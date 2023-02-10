public class Main {

    public static void main(String[] argv) {

        PizzaStore nyStore =  new NYPizzaStore();
        PizzaStore chicagoStore = new ChicagoPizzaStore();

        Pizza pizza = nyStore.orderPizza("cheese");
        System.out.println("Evgeniy ordered a " + pizza.getName() + "\n");

        pizza = chicagoStore.orderPizza("cheese");
        System.out.println("Ishin ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("veggie");
		System.out.println("Evgeniy ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("veggie");
		System.out.println("Ishin ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("clam");
		System.out.println("Evgeniy ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("clam");
		System.out.println("Ishin ordered a " + pizza.getName() + "\n");

        pizza = nyStore.orderPizza("pepperoni");
		System.out.println("Evgeniy ordered a " + pizza.getName() + "\n");
 
		pizza = chicagoStore.orderPizza("pepperoni");
		System.out.println("Ishin ordered a " + pizza.getName() + "\n");
    }
}