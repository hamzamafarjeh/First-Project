package university;

import java.util.*;
import java.util.stream.*;

public class Main {
    public static void main(String[] args) {
        UniversityManager manager = UniversityManager.getInstance();
        manager.manage();

        Person student = PersonFactory.createPerson("student", "Hamza", 22);

        Person employee = PersonFactory.createPerson("employee", "Dr.Sabry", 30);

        student.setWorkStrategy(new StudyStrategy());
        employee.setWorkStrategy(new JobStrategy());

        student.introduce();
        student.performWork();

        employee.introduce();
        employee.performWork();
    }
}


