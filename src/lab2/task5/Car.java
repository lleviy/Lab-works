package lab2.task5;

public abstract class Car {
    String model;
    String type;
    double weight;
    Engine engine;

    abstract void start();
    abstract void stop();
    abstract void printInfo(String model, String type, double weight, Engine engine);
    void turnRight(){
        System.out.println("Поворот направо");
    }
    void turnLeft(){
        System.out.println("Поворот налево");
    }
}
