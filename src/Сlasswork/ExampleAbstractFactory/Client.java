package Сlasswork.ExampleAbstractFactory;

public class Client {
    private AbstractBattle battle;
    private AbstractCofee cofee;
    private AbstractCower cower;

    public Client(AbstractFactory factory) {
        this.battle = factory.createBattle();
        this.cofee = factory.createCofee();
        this.cower = factory.createCower();
    }

    public void run() {
        this.battle.interract(cofee);
        this.battle.interract(cower);
    }
}
