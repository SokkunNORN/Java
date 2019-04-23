
package app;

public class Intern extends Person{
    private String school;

    @Override
    public Intern(String id, String name) {
        super(id, name);
    }
    public Intern(String id, String name, String school) {
        super(id, name);
        this.school = school;
    }
    public String getSchool(String school) {
        return school;
    }

    @Override
    
}