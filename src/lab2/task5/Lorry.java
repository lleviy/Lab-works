package lab2.task5;

public class Lorry extends Car{

    double liftingCapacity;

    @Override
    void start() {
        System.out.println("Грузовик поехал");
    }

    @Override
    void stop() {
        System.out.println("Грузовик остановился");
    }

    @Override
    void printInfo(String model, String type, double weight, Engine engine) {

    }
}
