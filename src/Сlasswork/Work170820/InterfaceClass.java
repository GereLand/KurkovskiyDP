package Classwork.Work170820;


interface Interface1 {
    void show();
}

interface Interface2 extends Interface1{
    void method();
}

public class InterfaceClass {

    public String field1 = "field3";
    public String field2 = "field2";
    public String field3 = "field3";

}

class DerivedInterfaceClass extends InterfaceClass {

    public String field4 = "field4";
    public String field5 = "field5";

}

class ExampleInterfaceApp {

    public static void main(String[] args) {
        DerivedInterfaceClass derivedInterfaceClass = new DerivedInterfaceClass();

        System.out.println(derivedInterfaceClass.field1);
        System.out.println(derivedInterfaceClass.field2);
        System.out.println(derivedInterfaceClass.field3);
//        System.out.println(derivedClass.field4);
//        System.out.println(derivedClass.field5);

        System.out.println("hashCode -> " + derivedInterfaceClass.hashCode());

        BaseClass baseClass = new DerivedClass();

        System.out.println(derivedInterfaceClass.field1);
        System.out.println(derivedInterfaceClass.field2);
        System.out.println(derivedInterfaceClass.field3);

        System.out.println("hashCode -> " + baseClass.hashCode());
    }
}