package university;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Student("Hamza", 21, "Cybersecurity"));
        people.add(new Student("Ahmad", 20, "Computer Science"));
        people.add(new Student("Saeed", 18, "BIT"));
        people.add(new Student("Malik", 22, "Civil Engineering"));
        people.add(new Employee("Mr.Sabry", 30, "IT Services"));
        people.add(new Employee("Mr.Mohammed", 36, "Business"));
        people.add(new Employee("Mr.Moath", 41, "Arts"));
        people.add(new Employee("Mr.Omar", 39, "Engineering"));


        System.out.println("Introductions :");
        for (Person p : people) {
            p.introduce();
        }


        PersonFilter ageFilter = person -> person.getAge() >= 19;
        System.out.println("\n People older than 19:");


        people.stream()
                .filter(ageFilter::filter)
                .forEach(p -> System.out.println(p.getName() + " is " + p.getAge()));


        System.out.println("\n Checking types:");
        for (Person p : people) {
            if (p instanceof Student) {
                System.out.println(p.getName() + " is a Student.");
            } else if (p instanceof Employee) {
                System.out.println(p.getName() + " is an Employee.");
            }
        }
    }
}


