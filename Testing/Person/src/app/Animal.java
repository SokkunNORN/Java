
package app;
class Animal {
    private String name;
    private String color;
    public Animal() {}
    public Animal(String name, String color) {
        this.name = name;
        this.color = color;
    }
    public void makeNoise() {
        System.out.println("How can i make noise!!!");
    }
    public String getInfo() {
        return this.name + " that has color: " + this.color;
    }
    public void setInfo(String name, String color) {
        this.name = name;
        this.color = color;
    }
}