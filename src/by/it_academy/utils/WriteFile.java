package by.it_academy.utils;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class WriteFile {

    public static void writeTextFile(String filePath, String ... v) {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(filePath))) {
            for (int i = 0; i < v.length; i++) {
                writer.write(v[i]);
                writer.newLine();
            }
        } catch (IOException e) {
            System.out.printf("Error occurred (write): %s%n", e.getMessage());
        }
    }
}
