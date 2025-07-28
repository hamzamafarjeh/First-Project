package university;

public abstract class Person {
    protected String name;
    protected int age;
    protected WorkStrategy workStrategy;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void setWorkStrategy(WorkStrategy strategy) {
        this.workStrategy = strategy;
    }

    public void performWork() {
        if (workStrategy != null) {
            workStrategy.work();
        } else {
            System.out.println("No work strategy assigned.");
        }
    }

    public abstract void introduce();
}

