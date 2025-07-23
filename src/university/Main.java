package university;

public class Main {
    public static void main(String[] args) {
        Person s1 = new Student("Hamza", 21, "Cybersecurity");
        Person s2 = new Student( "Ahmad",  20, "Computer Science");
        Person s3 = new Student( "Saeed",  18, "BIT");
        Person s4 = new Student( "Malik",  22, "Civil Engineering");
        Person e1 = new Employee("Mr. Sabry", 30, "IT Services");
        Person e2 = new Employee("Mr. Mohammed", 36, "business");
        Person e3 = new Employee("Mr. Moath", 41, "Arts");
        Person e4 = new Employee("Mr. Omar", 39, "Engineering");


        s1.introduce();
        s2.introduce();
        s3.introduce();
        s4.introduce();
        e1.introduce();
        e2.introduce();
        e3.introduce();
        e4.introduce();



        if (s1 instanceof Student) {
            ((Student) s1).study();
        }
        if (s2 instanceof Student) {
            ((Student) s2).study();
        }
        if (s3 instanceof Student) {
            ((Student) s3).study();
        }
        if (s4 instanceof Student) {
            ((Student) s4).study();
        }
        if (e1 instanceof Employee) {
            ((Employee) e1).work();
        }
        if (e2 instanceof Employee) {
            ((Employee) e2).work();
        }
        if (e3 instanceof Employee) {
            ((Employee) e3).work();
        }
        if (e4 instanceof Employee) {
            ((Employee) e4).work();
        }
    }
}


