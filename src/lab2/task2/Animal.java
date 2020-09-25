package lab2.task2;

public class Animal {
    String food;
    String location;

    public Animal(String food, String location){
        this.food = food;
        this.location = location;
    }

    void makeNoise(){
        System.out.println("Животное издает звук");
    }

    void eat(){
        System.out.println("Животное ест");
    }

    void sleep(){
        System.out.println("Животное спит");
    }
}
