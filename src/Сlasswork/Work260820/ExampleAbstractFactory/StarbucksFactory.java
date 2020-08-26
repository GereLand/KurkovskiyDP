package Сlasswork.Work260820.ExampleAbstractFactory;

public class StarbucksFactory extends AbstractFactory{
    @Override
    public AbstractBattle createBattle() {
        return new StarbucksBattle();
    }

    @Override
    public AbstractCofee createCofee() {
        return new StarbucksCofee();
    }

    @Override
    public AbstractCower createCower() {
        return new StarbucksCower();
    }
}
