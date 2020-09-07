package Сlasswork.FactoryMethod;

public abstract class Creator {

    private Product product;

    public void anOperator() { product = factoryMethod();}

    public abstract Product factoryMethod();
}
