public class Main {
	
	public static void main(String[] argv) {
		Tea myTea = new Tea();
		Coffee myCoffee = new Coffee();
		TeaWithHook myTeaWithHook = new TeaWithHook();
		CoffeeWithHook myCoffeeWithHook = new CoffeeWithHook();

		myTea.prepareRecipe();
		System.out.println("\n-----------------------------\n");

		myTeaWithHook.prepareRecipe();
		System.out.println("\n-----------------------------\n");

		myCoffee.prepareRecipe();
		System.out.println("\n-----------------------------\n");
		
		myCoffeeWithHook.prepareRecipe();
	}
}