package by.it_academy.homework12.exercise1;

import java.util.*;
//Реализуйте функцию для подсчета количества вхождений каждого элемента в список и возврата списка элементов,
// которые встречаются более одного раза. Для этого используйте метод Collections.frequency
//Сигнатура функции public List<T> findDuplicates(List<T> list)
//Пример: учитывая список [1,2,3,1,4,5,2] функция должна вернуть [1,2]
public class Main {
    public static void main(String[] args) {
        List<Integer> integerList = new ArrayList<>();
        Collections.addAll(integerList, 1, 2, 3, 1, 4, 5, 2);
        System.out.println(findDuplicates(integerList));
        List<String> stringList = new ArrayList<>();
        Collections.addAll(stringList, "Anny", "Jane", "Janett", "Cyry", "Anny", "Bob", "Bob");
        System.out.println(findDuplicates(stringList));
    }

    public static <T> List<T> findDuplicates(List<T> list) {
        Set<T> duplicates = new LinkedHashSet<>();
        for (int i = 0; i < list.size(); i++) {
            int count = Collections.frequency(list, list.get(i));
            if (count > 1) {
                duplicates.add(list.get(i));
            }
        }
        return new ArrayList<>(duplicates);
    }
}
