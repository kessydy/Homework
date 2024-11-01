package by.it_academy.homework11;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        String[] myArray = {"memory", "dream", "holiday", "spring"};
        HashMap<Integer, String> myMap = createMap(myArray);
        System.out.println(myMap);
        System.out.println(swapValues(myMap));

    }
//    Реализуйте метод, который поменяет ключи и значения в HashMap местами.
//    На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>.

    public static HashMap<Integer, String> createMap(String[] stringArray) {
        HashMap<Integer, String> map = new HashMap<>();
        for (int i = 0; i < stringArray.length; i++) {
            map.put(i, stringArray[i]);
        }
        return map;
    }

    public static HashMap<String, Integer> swapValues(HashMap<Integer, String> map) {
        HashMap<String, Integer> mapNew = new HashMap<>();
        Set<Integer> keySet = map.keySet();
        Collection<String> values = map.values();
        List <String> valuesToKey = new ArrayList<>();
        valuesToKey.addAll(values);
        List <Integer> keyToValues = new ArrayList<>();
        keyToValues.addAll(keySet);
        for (int i = 0; i < map.size(); i++) {
            mapNew.put(valuesToKey.get(i), keyToValues.get(i));
        }
        return mapNew;
    }

}
