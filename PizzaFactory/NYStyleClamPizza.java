public class NYStyleClamPizza extends Pizza {
	public NYStyleClamPizza() {
		name = "NY Deep Dish Clam Pizza";
		dough = "Extra Thick Crust Dough";
		sauce = "Plum Tomato Sauce";
 
		toppings.add("Grated Reggiano Clam");
		toppings.add("Hub");
		toppings.add("Yenllow Onion");
		toppings.add("Moka");
        toppings.add("Red Pepper");
	}
 
	void bake() {
        System.out.println("Bake for 25 minutes at 350*C");
    }
}