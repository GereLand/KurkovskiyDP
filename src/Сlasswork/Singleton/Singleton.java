package Сlasswork.Singleton;

class MyClass {
    public static void main(String[] args) {
        Singleton instance1 = Singleton.instance();
        Singleton instance2 = Singleton.instance();

        System.out.println(instance1 == instance2);

        instance1.anOperation();
        String data = instance1.getSingletonData();
        System.out.println(data);
    }
}

public class Singleton {

    private static Singleton uniqueInstance = null;
    private String singletonData;

    public static Singleton instance() {
        if (uniqueInstance == null) {
            uniqueInstance = new Singleton();
        }
        return uniqueInstance;
    }

    public void anOperation() {
        singletonData = "singletonData";
    }

    public String getSingletonData() {
        return singletonData;
    }
}
