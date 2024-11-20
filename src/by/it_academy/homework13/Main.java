package by.it_academy.homework13;

import java.io.*;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

//Создать файл с текстом, подсчитать в тексте количество знаков препинания и слов.
public class Main {
    static final String FILE_PATH = "resources/myText.txt";
    static String text = "In another moment down went Alice after it, never once considering how in the world she was " +
            "to get out again.";

    public static void main(String[] args) {
        writeTextFile(FILE_PATH, text);
        System.out.println(readFile(FILE_PATH));
        countPunctuationMarks(readFile(FILE_PATH));
        countWords(readFile(FILE_PATH));
    }

    private static void writeTextFile(String filePath, String text) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            writer.write(text);
        } catch (IOException e) {
            System.out.printf("Error occurred (write): %s%n", e.getMessage());
        }
    }

    private static String readFile(String filePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(filePath))) {
            String line = reader.readLine();
            if (line != null) {
                return line;
            }
        } catch (IOException e) {
            System.out.printf("Error occurred (read): %s%n", e.getMessage());
        }
        return null;
    }

    private static String textCorrect(String text) {
        text = text.trim();
        text = text
                .replaceAll("(\\s+)", " ")
                .replaceAll("\\s+,", ",")
                .replaceAll("\\s+\\.", ".")
                .replaceAll("\\s+\\)", ")")
                .replaceAll("\\s+\\?", "?");
        System.out.println(text);
        return text;
    }

    private static void countPunctuationMarks(String text) {
        Pattern pattern = Pattern.compile("[,.!?:\\-;’—”“()]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        System.out.println("Total matches: " + count);
    }

    private static void countWords(String text) {
        textCorrect(text);
        Pattern pattern = Pattern.compile("[\\s]");
        Matcher matcher = pattern.matcher(text);
        int count = 0;
        while (matcher.find()) {
            count++;
        }
        count++;
        System.out.println("Total words: " + count);
    }
}
