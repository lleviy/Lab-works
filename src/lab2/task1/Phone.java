package lab2.task1;

import java.math.BigInteger;

public class Phone {
    BigInteger number;
    int model;
    int weight;

    Phone(BigInteger number, int model, int weight){
        this(number, model);
        this.weight = weight;
    }

    Phone(BigInteger number, int model){
        this.number = number;
        this.model = model;
    }

    Phone(){

    }

    void receiveCall(String name){
        System.out.println("Звонит " + name);
    }

    void receiveCall(String name, BigInteger number){
        System.out.printf("Звонит: %s, номер телефона: %d\n", name, number);
    }

    BigInteger getNumber(){
        return number;
    }

    void sendMessage(BigInteger...numbers){
        System.out.print("Сообщение будет отправлено следующим номерам: ");
        for(BigInteger number : numbers){
            System.out.print(String.valueOf(number) + " ");
        }
    }
}
