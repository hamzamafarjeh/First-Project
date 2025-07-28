package university;

public class Student extends Person {
    public Student(String name, int age) {
        super(name, age);
    }

    @Override
    public void introduce() {
        System.out.println("Hi, I'm student " + name + ", I'm " + age + " years old.");
    }
}
