package org.example.examSecondSem.taskFromAnotherGroup.secondTaskFromAnotherGroup;

import java.io.*;

public class Main {
    public static void main(String[] args) {
        String sourceFilePath = "путь_к_исходному_файлу.txt";
        int numCopies = 5;

        // Создаем отдельный поток для каждой копии файла
        for (int i = 1; i <= numCopies; i++) {
            String copyFilePath = "копия_" + i + ".bin";
            Thread copyThread = new Thread(() -> createBinaryCopy(sourceFilePath, copyFilePath));
            copyThread.start();
        }
    }

    private static void createBinaryCopy(String sourceFilePath, String copyFilePath) {
        try (BufferedReader reader = new BufferedReader(new FileReader(sourceFilePath));
             BufferedOutputStream writer = new BufferedOutputStream(new FileOutputStream(copyFilePath))) {

            // Читаем исходный файл построчно и записываем его содержимое в бинарный файл
            String line;
            while ((line = reader.readLine()) != null) {
                byte[] lineBytes = line.getBytes();
                writer.write(lineBytes);
            }

            System.out.println("Копия файла " + copyFilePath + " успешно создана.");
        } catch (IOException e) {
            System.out.println("Ошибка при создании копии файла " + copyFilePath + ": " + e.getMessage());
        }
    }
}

