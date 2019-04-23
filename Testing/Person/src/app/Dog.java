
package app;

class Dog extends Animal {
    public Dog() {}
    public Dog(String name, String color) {
        super(name, color);
    }
    @Override
    public void makeNoise() {
        System.out.println("Woah......!");
    }
}