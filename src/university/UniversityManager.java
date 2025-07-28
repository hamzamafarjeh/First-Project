package university;

public class UniversityManager {
    private static UniversityManager instance;

    private UniversityManager() {}

    public static UniversityManager getInstance() {
        if (instance == null) {
            instance = new UniversityManager();
        }
        return instance;
    }

    public void manage() {
        System.out.println("Managing university system...");
    }
}
