package university;

public class PersonFactory {
    public static Person createPerson(String type, String name, int age) {
        if (type.equalsIgnoreCase("student")) {
            return new Student(name, age);
        } else if (type.equalsIgnoreCase("employee")) {
            return new Employee(name, age);
        } else {
            throw new IllegalArgumentException("Invalid person type: " + type);
        }
    }
}
