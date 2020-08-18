package Classwork.Work120820;


class MyClass1 {
    public static void main(String[] args) {
        AbstractHandler abstractHandler = null;

        abstractHandler = new XMLHandler();
        abstractHandler.open("open");
        abstractHandler.change("change");
        abstractHandler.save("save");
        abstractHandler.create("create");

        abstractHandler = new TXTHandler();
        abstractHandler.open("open");
        abstractHandler.change("change");
        abstractHandler.save("save");
        abstractHandler.create("create");

        abstractHandler = new DOCHandler();
        abstractHandler.open("open");
        abstractHandler.change("change");
        abstractHandler.save("save");
        abstractHandler.create("create");
    }
}


abstract class AbstractHandler {

    public abstract void create(String size);

    public abstract void open(String type);

    public abstract void change(String discription);

    public abstract void save(String name);


}

class XMLHandler extends AbstractHandler {

    @Override
    public void open(String type) {
        System.out.println("type XML");
    }

    @Override
    public void create(String size) {
        System.out.println("size XML");
    }

    @Override
    public void change(String discription) {
        System.out.println("discription XML");
    }

    @Override
    public void save(String name) {
        System.out.println("name XML");
    }
}

class TXTHandler extends AbstractHandler {

    @Override
    public void open(String type) {
        System.out.println("type TXT");
    }

    @Override
    public void create(String size) {
        System.out.println("size TXT");
    }

    @Override
    public void change(String discription) {
        System.out.println("discription TXT");
    }

    @Override
    public void save(String name) {
        System.out.println("name TXT");
    }
}

class DOCHandler extends AbstractHandler {

    @Override
    public void open(String type) {
        System.out.println("type DOC");
    }

    @Override
    public void create(String size) {
        System.out.println("size DOC");
    }

    @Override
    public void change(String discription) {
        System.out.println("discription DOC");
    }

    @Override
    public void save(String name) {
        System.out.println("name DOC");
    }
}