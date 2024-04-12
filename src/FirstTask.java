// Гузенко Денис, домашняя работа

//Необходимо написать свою реализацию коллекции на выбор LinkedList или ArrayList(можно оба варианта).
//Должны быть основные методы add, get, remove, addAll(ДругаяКоллекция параметр), остальное на ваше усмотрение
//Плюс написать реализацию сортировки пузырьком с флагом, который прекращает сортировку, если коллекция уже отсортирована.

import java.util.ArrayList;
import java.util.Random;
public class FirstTask {
    public static void main(String[] args) {
        Random randomInt = new Random();
        ArrayList<Integer> firstArray = new ArrayList<>();
        ArrayList<Integer> secondArray = new ArrayList<>();

        for (int i = 1; i < randomInt.nextInt(100); i++){
            firstArray.add(randomInt.nextInt(100));
        }
        System.out.println(firstArray.get(0));
        firstArray.remove(3);
        System.out.println(firstArray + " - первый массив");
        secondArray.addAll(firstArray);
        System.out.println(secondArray + " - второй массив");

        bubbleSortWithFlag(firstArray);

        System.out.println(firstArray);
    }

    public static void bubbleSortWithFlag(ArrayList<Integer> array){
        boolean sorted = false; // флаг
        int n = array.size();
        while (!sorted) {
            sorted = true;
            for (int i = 1; i < n; i++){
                if (array.get(i - 1) > array.get(i)){
                    int temp = array.get(i - 1);
                    array.set(i - 1, array.get(i));
                    array.set(i, temp);
                    sorted = false;
                }
            }
        }
    }

}



