public class NYPizzaStore extends PizzaStore {
    
    protected Pizza creatPizza(String type) {
        if (type.equals("cheese")) {
            return new NYStyleCheesePizza();
        }
        else {
            return null;
        }
    }
}