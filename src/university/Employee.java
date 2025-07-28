package university;

public class Employee extends Person{
    public Employee(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hello, I'm employee " + name + ", I'm " + age + " years old.");
    }
}
