package university;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student("Hamza", 21, "Cybersecurity");
        Person s2 = new Student( "Ahmad",  20, "Computer Science");
        Person e1 = new Employee("Mr. Sabry", 30, "IT Services");

        s1.introduce();
        s2.introduce();
        e1.introduce();


        if (s1 instanceof Student) {
            ((Student) s1).study();
        }
        if (s2 instanceof Student) {
            ((Student) s2).study();
        }
        if (e1 instanceof Employee) {
            ((Employee) e1).work();
        }
    }
}


