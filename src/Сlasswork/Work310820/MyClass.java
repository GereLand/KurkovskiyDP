package Сlasswork.Work310820;

import java.util.ArrayList;
import java.util.List;

public class MyClass<T> {

    private List list = null;

    public MyClass() {
        this.list = new ArrayList<T>();
    }

    public <T> void add(T element) {
        list.add(element);
    }



    public <R> Object getElement(int index) {
        return (R) list.get(index);
    }

    public  int getCount(){
        return list.size();
    }
}

class Program {

    public static void main(String[] args) {

        MyClass<String> instance = new MyClass<>();
        instance.add("My string temp");
        System.out.println((String) instance.getElement (0));
        System.out.println(instance.getCount ());

        MyClass<Integer> instance1 = new MyClass<>();
        instance1.add(2143532);
        System.out.println((Integer) instance1.getElement (0));
        System.out.println(instance1.getCount ());
    }
}