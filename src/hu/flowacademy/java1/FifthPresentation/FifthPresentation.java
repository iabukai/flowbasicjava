package hu.flowacademy.java1.FifthPresentation;

import java.io.*;

public class FifthPresentation {
    //Try Catch
    //FileWriter
    public static void main(String[] args) throws IOException {
        FileWriter  fileWriter = new FileWriter("Test.txt");
        try {

        FileReader fileReader;

            fileWriter.write("Hello");
            fileWriter.write("Hellolksadjsa");
            fileWriter.write("Hellolksadjsa");
            fileWriter.flush();
            fileWriter.write("Hello");
            fileWriter.write("Hellolksadjsa");
            fileWriter.write("Hellolksadjsa");
            fileWriter.close();
            FileReader fileReader1 = new FileReader("Test.txt");
            System.out.println(fileReader1.read());

            RandomAccessFile randomAccessFile = new RandomAccessFile("Test.txt", "rw");
            System.out.println(randomAccessFile.readLine());

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } finally {
            fileWriter.close();
        }

    }

}
