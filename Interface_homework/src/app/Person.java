
package app;

public abstract class Person {
    private String id;
    private String name;

    abstract void display(){}

    public Person(String id, String name){
        this.id = id;
        this.name = name;
    }

    public String getId() {
        return name;
    }

    public String getName() {
        return name;
    }
}