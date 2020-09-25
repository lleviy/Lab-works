package lab2.task5;

public class SportCar extends Car{
    double limitSpeed;

    @Override
    void start() {
        System.out.println("Спорткар поехал");
    }

    @Override
    void stop() {
        System.out.println("Спорткар остановился");
    }

    @Override
    void printInfo(String model, String type, double weight, Engine engine) {

    }
}
