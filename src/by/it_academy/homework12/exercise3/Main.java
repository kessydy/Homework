package by.it_academy.homework12.exercise3;

import java.util.*;

public class Main {
    public static void main(String[] args) {
// Напишите метод, который получает на вход массив элементов типа К (Generic)
// и возвращает Map<K, Integer>, где K — значение из массива, а Integer — количество вхождений в массив.
// Сигнатура метода: <K> Map<K, Integer> arrayToMap(K[] ks)
        String[] strArray = {"Change", "Array", "To", "Map",  "Array", "To", "Map", "Change", "Array"};
        System.out.println(arrayToMap(strArray));
    }

    public static <K> Map<K, Integer> arrayToMap(K[] ks) {
        Map <K, Integer> mapArray = new HashMap<>();
        for (K elem : ks){
            int count = mapArray.getOrDefault(elem, 0);
            mapArray.put(elem, count+1);
        }
        return mapArray;
    }
}
