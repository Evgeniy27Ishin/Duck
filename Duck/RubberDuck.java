public class RubberDuck extends Duck {

    public RubberDuck() {
        flyBehavior = new FlyNoWay();
    }

    public void quack() {
        System.out.println("������");
    }

    public void display() {
        System.out.println("� ��������� ������");
    }
}
