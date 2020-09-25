package lab2.task2;

public class Main {
    public static void main(String[] args) {
        Veterinarian veterinarian = new Veterinarian();
        Animal[] animals = new Animal[3];
        animals[0] = new Dog("Мясо", "Двор");
        animals[1] = new Cat("Молоко", "Дом");
        animals[2] = new Horse("Трава", "Ферма");

        for (Animal animal : animals) {
            veterinarian.treatAnimal(animal);
        }
    }
}
