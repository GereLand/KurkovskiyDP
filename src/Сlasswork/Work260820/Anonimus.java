package Сlasswork.Work260820;

import java.util.ArrayList;
import java.util.List;

interface Interface1 {
    void method();
}

/**
 * Лямбда выражения, это однооператорная лямбда...
 */

public class Anonimus {

    public static void main(String[] args) {

        Interface1 instance = new Interface1() {
            @Override
            public void method() {
                System.out.println("Какой то там англ текст.");
            }
        };
        instance.method();
    }

//    List<String> list = new ArrayList<>();
//    list.add("1");
//    list.add("2");
//    list.add("3");
//    list.stream().map(v -> v + "1").forBack(System.out.print("12345"));



}
