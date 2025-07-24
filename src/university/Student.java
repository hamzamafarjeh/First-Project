package university;

public class Student extends Person {
    private String major;

    public Student(String name, int age, String major) {
        super(name, age);
        this.major = major;
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm " + getName() + ", I'm studying " + major + ".");
    }
}
