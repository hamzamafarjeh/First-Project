package university;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void introduce() {
        System.out.println("I'm a student named " + getName() + ", studying " + major + ".");
    }

    public void study() {
        System.out.println(getName() + " is studying " + major + ".");
    }

    public String getMajor() {
        return major;
    }

    public void setMajor(String major) {
        if (major != null && !major.isEmpty()) {
            this.major = major;
        }
    }
}
