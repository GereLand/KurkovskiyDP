package Сlasswork.ExampleAbstractFactory;

public class StarbucksBattle extends AbstractBattle{
    @Override
    public void interract(AbstractCofee cofee) {
        System.out.println(this + " interact with " + cofee);
    }

    @Override
    public void interract(AbstractCower cower) {
        System.out.println(this + " interact with " + cower);
    }
}
