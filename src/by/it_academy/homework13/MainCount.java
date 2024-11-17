package by.it_academy.homework13;

import java.io.*;

//Прочитать файл по строкам. Подсчитать количество символов 'a' в файле. Заменить содержимое файла на число символов 'a'
public class MainCount {
    static final String FILE_PATH = "resources/myText2.txt";
    static String text1 = "In another moment down went Alice after it, never once considering how in the world she was " +
            "to get out again.";
    static String text2 = "The rabbit-hole went straight on like a tunnel for some way, and then dipped suddenly " +
            "down, so suddenly that Alice had not a moment to think about stopping herself before she found herself " +
            "falling down a very deep well.";

    public static void main(String[] args) throws IOException {
        writeTextFile(FILE_PATH, text1, text2);
        writeIntFile(FILE_PATH, readAndCountFile(FILE_PATH));

    }

    private static void writeTextFile(String filePath, String text1, String text2) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text1);
            writer.newLine();
            writer.write(text2);
        } catch (IOException e) {
            System.out.printf("Error occurred (write): %s%n", e.getMessage());
        }
    }

    private static void writeIntFile(String filePath, Integer count) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(count.toString());
        } catch (IOException e) {
            System.out.printf("Error occurred (write): %s%n", e.getMessage());
        }
    }

    private static Integer readAndCountFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            Integer count = 0;
            String line;
            while ((line = reader.readLine()) != null) {
                for (char symbol : line.toCharArray()) {
                    if (symbol == 'a') {
                        count++;
                    }
                }
                System.out.println(line);
            }
            System.out.println(count);
            return count;
        } catch (IOException e) {
            System.out.printf("Error occurred (read): %s%n", e.getMessage());
        }
        return 0;
    }
}
