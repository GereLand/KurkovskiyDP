package Classwork.Work170820;


class BaseClass {

    public String field1 = "field3";
    public String field2 = "field2";
    public String field3 = "field3";

}

class DerivedClass extends BaseClass {

    public String field4 = "field4";
    public String field5 = "field5";

}

class ExampleApp {

    public static void main(String[] args) {
        DerivedClass derivedClass = new DerivedClass();

        System.out.println(derivedClass.field1);
        System.out.println(derivedClass.field2);
        System.out.println(derivedClass.field3);
//        System.out.println(derivedClass.field4);
//        System.out.println(derivedClass.field5);

        System.out.println("hashCode -> " + derivedClass.hashCode());

        BaseClass baseClass = new DerivedClass();

        System.out.println(derivedClass.field1);
        System.out.println(derivedClass.field2);
        System.out.println(derivedClass.field3);

        System.out.println("hashCode -> " + baseClass.hashCode());
    }
}