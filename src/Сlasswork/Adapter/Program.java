package Сlasswork.Adapter;

public class Program {

    public static void main(String[] args) {
        ITarget target = new Adapter();
        target.request();
    }
}
