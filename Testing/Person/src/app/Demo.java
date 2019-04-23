package app;
class Demo {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Dog dog = new Dog();
        animal.makeNoise();
        dog.makeNoise();
        animal.setInfo("Cola", "teal");
        System.out.println(animal.getInfo());
    }
}