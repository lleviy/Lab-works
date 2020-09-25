package lab2.task2;

public class Horse extends Animal {

    String mane;

    public Horse(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise(){
        System.out.println("Лошадь издает звук");
    }

    @Override
    void eat(){
        System.out.println("Лошадь ест");
    }
}
