public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }

    public void quack() {
        System.out.println("ПИИИИП");
    }

    public void display() {
        System.out.println("я резиновая уточка");
    }
}
