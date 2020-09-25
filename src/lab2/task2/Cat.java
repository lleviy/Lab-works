package lab2.task2;

public class Cat extends Animal {

    public Cat(String food, String location) {
        super(food, location);
    }

    @Override
    void makeNoise(){
        System.out.println("Кот мяукает");
    }

    @Override
    void eat(){
        System.out.println("Кот ест");
    }
}
