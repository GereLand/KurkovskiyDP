package Сlasswork.Prototype;

public abstract class Prototype {
    protected int id;

    public  Prototype (int id) {
        this.id = id;
    }

    public  abstract  Prototype clone();
}
