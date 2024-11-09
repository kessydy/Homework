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
        List <K> countList = new ArrayList<>(Arrays.asList(ks));
        Set <K> uniqSet = new HashSet<>(Arrays.asList(ks));
        List <K> uniqList = new ArrayList<>(uniqSet);
        Map <K, Integer> mapArray = new HashMap<>();
        for (int i = 0; i < uniqList.size(); i++) {
            int count = Collections.frequency(countList, uniqList.get(i));
            mapArray.put(countList.get(i), count);
            }
        return mapArray;
    }
}
