package university;

public class Employee extends Person{
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm " + getName() + ", working in the " + department + " department");
    }
}
