package lab3.task2;

import lab3.task1.MyCollection;

public class Box {
    public MyCollection<Fruit> fruits = new MyCollection<Fruit>();

    public float getWeight(){
        float weight = 0;
        for (int i = 0; i < fruits.size(); i++){
            weight += fruits.get(i).weight;
        }
        return weight;
    }

    public boolean Compare(Box anotherBox){
        if (getWeight() == anotherBox.getWeight()){
            return true;
        }
        return false;
    }

    public void shift(Box anotherBox){
        anotherBox.fruits = fruits;
        fruits = new MyCollection<Fruit>();
    }
}
