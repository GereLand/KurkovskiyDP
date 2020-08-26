package Сlasswork.Work260820;

public enum Vehicles {
    AUDI(10000, "red"), BMW(20000, "green");

    private int coast;
    private String color;


    Vehicles(int coast, String color) {
        this.coast = coast;
        this.color = color;
    }

    public String getColor() {
        return this.color;
    }

    @Override
    public String toString() {
        return "Vehicles{" +
                "coast=" + coast +
                ", color='" + color + '\'' +
                '}';
    }
}
