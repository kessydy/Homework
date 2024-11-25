package by.it_academy.homework14.lists;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

//Создать список строк List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
// Используя stream и lambda выполнить следующие действия:
//Удалить все содержащие “3”
//Отсортировать сперва по числу (по возрастанию), потом по букве (по убыванию)
//Отбросить первый и последний элемент
//Привести в uppercase
//Выдать на печать результат
//Напечатать количество оставшихся элементов
public class Main {
    public static void main(String[] args) {
        List<String> myList = Arrays.asList("a1", "a2", "a3", "b1", "b3", "c2", "c1", "c5");
        long count = myList.stream()
                .filter(str -> !str.contains("3"))
                .sorted(Comparator.comparing(str -> ((String) str).charAt(1))
                        .thenComparing(Comparator.comparing(str -> ((String) str).charAt(0)).reversed()))
                .skip(1)
                .sorted(Comparator.comparing(str -> ((String) str).charAt(1)).reversed()
                        .thenComparing(Comparator.comparing(str -> ((String) str).charAt(0))))
                .skip(1)
                .sorted(Comparator.comparing(str -> ((String) str).charAt(1))
                        .thenComparing(Comparator.comparing(str -> ((String) str).charAt(0)).reversed()))
                .map(String::toUpperCase)
                .peek(System.out::println)
                .count();
        System.out.println(count);
    }
}