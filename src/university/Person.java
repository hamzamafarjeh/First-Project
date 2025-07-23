package university;

public abstract class Person {
    private String name;
    private int age;

    public Person() {

    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public abstract void introduce();


    public String getName() {
        return name;
    }

    public void setName(String name) {
        if (name != null && name.length() >= 2) {
            this.name = name;
        }
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        if (age > 0 && age < 120) {
            this.age = age;
        }
    }
}
