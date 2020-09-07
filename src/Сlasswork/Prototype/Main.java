package Сlasswork.Prototype;

public class Main {

    public static void main(String[] args) {
        Prototype prototype = null;
        Prototype clone = null;

        prototype = new ConcretePrototype1(1);
        clone = prototype.clone();

        prototype = new ConcretePrototype1(2);
        clone = prototype.clone();

        prototype = new ConcretePrototype1(3);
        clone = prototype.clone();
    }

}
