package lab2.task2;

public class Dog extends Animal {

    String collar;

    public Dog(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise(){
        System.out.println("Собака лает");
    }

    @Override
    void eat(){
        System.out.println("Собака ест");
    }
}
