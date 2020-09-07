package Сlasswork.Adapter;

public class Adapter extends Adaptee implements ITarget{

    @Override
    public void request() {
        specificRequest();
    }
}
