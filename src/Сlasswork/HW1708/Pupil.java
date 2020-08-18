package Сlasswork.HW1708;

public abstract class Pupil {
    private String name;
    private int age;

    public Pupil(String name, int age) {
        this.name = name;
        this.age = age;
    }


    public abstract void study();

    public abstract void read();

    public abstract void write();

    public abstract void relax();
}