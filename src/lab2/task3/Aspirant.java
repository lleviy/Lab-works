package lab2.task3;

public class Aspirant extends Student{
    String scientificWork;

    public Aspirant(double averageMark) {
        super(averageMark);
    }

    @Override
    int getScholarship(){
        if (averageMark == 5) return 200;
        else return 180;
    }
}
