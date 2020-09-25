package lab1;

import java.util.Scanner;

public class Main {
    public static void last_number(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println(value % 10);
    }

    public static void sum_of_digits(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        System.out.println((value % 10) + (value / 100) + (value / 10) % 10);
    }

    public static void one_to_positive(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0){
            value += 1;
        }
        System.out.println(value);
    }

    public static void positive_negative(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value > 0){
            value += 1;
        }
        else if (value < 0){
            value -= 1;
        }
        else {
            value = 10;
        }
        System.out.println(value);
    }

    public static void min_number() {
        System.out.println("Введите 3 числа через enter: ");
        Scanner scanner = new Scanner(System.in);
        int array[] = new int[3];
        for (int i = 0; i < 3; i++) {
            array[i] = scanner.nextInt();
        }
        int min = array[0];
        for (int i = 1; i < 3; i++) {
            if (min > array[i]) {
                min = array[i];
            }
        }
        System.out.println(min);
    }

    public static void describe_number(){
        System.out.println("Введите число: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        String description = "";
        if (value == 0) {
            description += "Нулевое число";
        }
        if (value > 0){
            description += "Положительное ";
        }
        else if (value < 0){
            description += "Отрицательное ";
        }
        if (value % 2 != 0){
            description += "нечетное число";
        }
        else{
            description += "четное число";
        }
        System.out.println(description);
    }

    public static void talk_cost() {
        System.out.println("Введите код города: ");
        Scanner scanner = new Scanner(System.in);
        int value = scanner.nextInt();
        if (value == 905){
            System.out.println(10 * 4.15);
        }
        else if (value == 194){
            System.out.println(10 * 1.98);
        }
        else if (value == 491){
            System.out.println(10 * 2.69);
        }
        else if (value == 800){
            System.out.println(10 * 5.00);
        }
    }

    public static void about_array() {
        int[] array = {1,-10,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        int size = array.length;
        int max = array[0];
        int positive_sum = 0;
        int positive_count = 0;
        int negative_sum = 0;
        int negative_count = 0;
        int negative_odd_sum = 0;
        int negative_average = 0;
        for (int i = 0; i < size; i++){
            if (array[i] > max) {
                max = array[i];
            }
            if (array[i] > 0){
                positive_sum += array[i];
                positive_count += 1;
            }
            if (array[i] < 0){
                negative_sum += array[i];
                negative_count += 1;
                if (array[i] % 2 == 0) {
                    negative_odd_sum += array[i];
                }
            }
        }
        negative_average = negative_sum / negative_count;
        System.out.println("максимальное значение: " + max);
        System.out.println("сумма положительных элементов: " + positive_sum);
        System.out.println("сумма четных отрицательных элементов: " + negative_odd_sum);
        System.out.println("количество положительных элементов: " + positive_count);
        System.out.println("среднее арифметическое отрицательных элементов: " + negative_average);
    }

    public static void reverse_array() {
        int[] array = {15,10,51,-6,-5,3,-10,-34,0,32,56,-12,24,-52};
        int len = array.length - 1;
        for (int i = 0; i < array.length / 2; i++){
            int temp = array[i];
            array[i] = array[len];
            array[len] = temp;
            len--;
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void nulls_to_end() {
        int[] array = {15,10,0,-6,-5,3,0,-34,0,32,56,0,24,-52};
        int len = array.length;
        int j = 0;
        for (int i = 0; i < len; i++) {
            if (array[i] != 0) {
                if (j < i) {
                    int temp = array[i];
                    array[i] = array[j];
                    array[j] = temp;
                }
                j++;
            }
        }
        for (int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");
        }
    }

    public static void main(String[] args) {
//        last_number();
//        sum_of_digits();
//        one_to_positive();
//        positive_negative();
//        min_number();
//        describe_number();
//        reverse_array();
//        nulls_to_end();
    }
}
