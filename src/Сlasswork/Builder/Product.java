package Сlasswork.Builder;

import java.util.ArrayList;
import java.util.List;

public class Product {

    private List<String> parts = new ArrayList<>();

    public void add(String part) {
        this.parts.add(part);
    }

    public void show() {
        parts.forEach(System.out::println);
    }
}
