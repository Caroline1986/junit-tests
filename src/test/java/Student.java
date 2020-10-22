import java.util.ArrayList;

public class Student {
    private String name;
    private long id;
    private ArrayList<Integer> grades;


    public Student( long id, String name) {
        this.name = name;
        this.id = id;
        this.grades = new ArrayList<>();
    }

    public static long getId(long id) {
      return id;

    }

    public static String getName(String name) {
        return name;
    }

    public double addGrade(int grade) {
        this.grades.add(grade);
        return 0;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public ArrayList<Integer> getGrade() {
        return this.grades;
    }

    public double getGradeAverage() {
        double sum = 0;
        for (int grade: this.grades){
            sum += grade;
        }return sum / this.grades.size();
    }
}
