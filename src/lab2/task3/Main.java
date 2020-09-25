package lab2.task3;

public class Main {
    public static void main(String[] args) {
        Student bob = new Aspirant(4);

        Student[] students = {
                new Student(3.7),
                new Aspirant(5),
                new Student(4.8)
        };

        for (Student student : students){
            student.getScholarship();
        }
    }
}
