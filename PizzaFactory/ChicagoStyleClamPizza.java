public class ChicagoStyleClamPizza extends Pizza {

    public ChicagoStyleClamPizza() {
        name = "Chicago Style Sauce and Clam Pizza";
        dough = "Extra Thick Crust Dough";
        sauce = "Plum Tomato Sauce";

        toppings.add("Grated Reggiano Clam");
    }
    
    void bake() {
        System.out.println("Bake for 25 minutes at 350*C");
    }
}