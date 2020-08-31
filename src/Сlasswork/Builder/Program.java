package Сlasswork.Builder;

public class Program {

    public static void main(String[] args) {
        Builder builder = new ConcreateBuilder();
        Director director = new Director(builder);

        director.construct();

        Product product = builder.getResult();
        product.show();
    }
}
