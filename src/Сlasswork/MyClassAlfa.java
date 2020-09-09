package Сlasswork;

import java.util.ArrayList;
import java.util.List;

class Main {

    /**
     *
     */

    public static void main(String[] args) {
//        MyClassAlfa myClassAlfa = new MyClassAlfa();
//        MyClassBeta myClassBeta = new MyClassBeta();
//
//        System.out.println(myClassAlfa.hashCode());
//        System.out.println(myClassBeta.hashCode());

        Exception ex = new Exception("Моё исключение");
        try {
            throw ex;
        }
        catch (Exception e) {
            System.out.println("Обработка исключения");
            System.out.println(e.getMessage());
        }


    }

}
//
//class MyClassAlfa {
//    List<String> list = new ArrayList<>();
//}
//
//class MyClassBeta extends MyClassAlfa{
//    List<String> list = new ArrayList<>();
//}
