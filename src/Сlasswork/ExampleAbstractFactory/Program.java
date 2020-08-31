package Сlasswork.ExampleAbstractFactory;

public class Program {

    public static void main(String[] args) {
        Client client = null;

        client = new Client(new StarbucksFactory());
        client.run();

//        client = new Client(...);
//        client.run();
    }

}
