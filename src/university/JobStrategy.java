package university;

public class JobStrategy implements WorkStrategy{
    @Override
    public void work() {
        System.out.println("I'm working in the university.");
    }
}
