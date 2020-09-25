package lab2.task3;

public class Student {
    String firstName,
            lastName,
            group;
    double averageMark;

    public Student(double averageMark){
        this.averageMark = averageMark;
    }

    int getScholarship(){
        if (averageMark == 5) return 100;
        else return 80;
    }
}
