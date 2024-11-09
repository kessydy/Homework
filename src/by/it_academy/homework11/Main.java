package by.it_academy.homework11;

import java.util.*;
//    Реализуйте метод, который поменяет ключи и значения в HashMap местами.
//    На вход в метод поступает HashMap<Integer, String>, надо вернуть HashMap<String, Integer>.
public class Main {
    public static void main(String[] args) {
        HashMap<Integer, String> map = new HashMap<>();
        map.put(1, "memory");
        map.put(2, "dream");
        map.put(3, "holiday");
        map.put(4, "spring");
        System.out.println(map);
        System.out.println(swapValues(map));
    }

    public static HashMap<String, Integer> swapValues(HashMap<Integer, String> map) {
        HashMap<String, Integer> mapNew = new LinkedHashMap<>();
        for (Map.Entry<Integer, String> changePair : map.entrySet()) {
            mapNew.put(changePair.getValue(), changePair.getKey());
        }
        return mapNew;
    }
}
