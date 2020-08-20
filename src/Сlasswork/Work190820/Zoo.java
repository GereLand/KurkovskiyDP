package Сlasswork.Work190820;

import java.util.ArrayList;
import java.util.List;

class Zoo {
    private String [] list = null;
    private int index = 0;

    public Zoo() {
        list = new String[8];
    }

    public void add(String animal) {
        if (index < list.length) {
            this.list[index] = animal;
            index++;
        }
    }

//    public void remove(int index) {
//
//    }
//
//    public void show (int index) {
//        this.list.remove(index);
//    }

    public static void main(String[] args) {
//        Zoo.add = new Zoo();
//        Zoo.add("Кошка");
//        Zoo.add("Собака");
//        Zoo.add("Корова");
//        Zoo.add("Енотик1");
//        Zoo.add("Енотик2");
//        Zoo.add("Енотик3");
//        Zoo.add("Енотик4");
//        Zoo.add("Енотик5");
//        Zoo.add("Енотик6");
//        Zoo.add("Енотик7");
//        Zoo.add("Енотик8");
    }
}