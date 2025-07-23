package university;

public class Employee extends Person{
    private String department;

    public Employee(String name, int age, String department) {
        super(name, age);
        this.department = department;
    }

    @Override
    public void introduce() {
        System.out.println("I'm an employee named " + getName() + ", working in the " + department + " department.");
    }

    public void work() {
        System.out.println(getName() + " works in the " + department + " department.");
    }

    public String getDepartment() {
        return department;
    }

    public void setDepartment(String department) {
        if (department != null && !department.isEmpty()) {
            this.department = department;
        }
    }
}
