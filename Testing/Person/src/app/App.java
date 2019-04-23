package app;

public class App {
    public static void main(String[] args) throws Exception {
        System.out.println("Hello Java");
        Parent parent = new Parent();
        Child child = new Child();
        parent.marry();
        child.marry();
    }
}