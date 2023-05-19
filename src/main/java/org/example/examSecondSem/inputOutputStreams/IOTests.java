package org.example.examSecondSem.inputOutputStreams;

import java.io.*;

public class IOTests {
    public static void main(String[] args) throws FileNotFoundException {
//        useDefaultInputOutputStreams();
//        useBufferWithInputOutputStreams();
//        useReadersWithInputOutputStreams();
        useBufferedReaderAndDecoratorPattern();
    }

    // Default using FileInput-OutputStream example
    public static void useDefaultInputOutputStreams() throws FileNotFoundException {
        try (
                InputStream is = new FileInputStream("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\inputOutputStreams\\inputTest.txt");
                OutputStream os = new FileOutputStream("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\inputOutputStreams\\outputTest")
        ) {
            int r = is.read();

            while (r != -1) {
                os.write(r);
                r = is.read();
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void useBufferWithInputOutputStreams() {
        try (
                InputStream is = new FileInputStream("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\inputOutputStreams\\inputTest.txt");
                OutputStream os = new FileOutputStream("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\inputOutputStreams\\outputTest.txt")
        ) {
            byte[] buffer = new byte[15];
            int r = is.read(buffer);

            while (r != -1) {
                os.write(buffer, 0, 15);
                r = is.read(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void useReadersWithInputOutputStreams() {
        try (
                Reader reader = new FileReader("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\inputOutputStreams\\inputTest.txt");
                Writer writer = new FileWriter("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\inputOutputStreams\\outputTest.txt");
        ) {
            char[] buffer = new char[100];
            int r = reader.read(buffer);

            while (r != -1) {
                writer.write(buffer);
                r = reader.read(buffer);
            }
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }

    public static void useBufferedReaderAndDecoratorPattern() {
        try (
                InputStream reader = new FileInputStream("C:\\Users\\khali\\IdeaProjects\\java_practise\\src\\main\\java\\org\\example\\examSecondSem\\inputOutputStreams\\inputTest.txt");

        ){
            BufferedReader br = new BufferedReader(new InputStreamReader(reader, "utf-8"));
            String line = br.readLine();

            while (line != null) {
                System.out.println(line);
                line = br.readLine();
            }
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}