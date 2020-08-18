package Classwork.Work120820;

public class MyClass {

    abstract class MyClassAnimal {

        private String type;
        private String color;
        private int maxSize;

        public abstract void cat();

        public abstract void brake();

        public String getModel() {
            return type;
        }

        public void setModel(String type) {
            this.type = type;
        }

        public String getColor() {
            return color;
        }

        public void setColor(String color) {
            this.color = color;
        }

        public int getmaxSize() {
            return maxSize;
        }

        public void setMaxSpeed(int maxSize) {
            this.maxSize = maxSize;
        }

        class WaitCat extends MyClassAnimal {

            @Override
            public void cat() {
                System.out.println("Ангорская порода - пушистый гавнюк");
            }

            @Override
            public void brake() {
                System.out.println("Белый");
            }
        }
    }
}