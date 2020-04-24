package hu.flowacademy.java1.FifthPresentation;

import javax.annotation.processing.Filer;
import java.io.*;
import java.nio.Buffer;

public class ReadWriteExamples {
    public static void main(String[] args) throws IOException {
        //Read Example
        BufferedReader bufferedReader = new BufferedReader((new FileReader("Test.txt")));
        String line = bufferedReader.readLine();
        while (line != null) {
            System.out.println(line);
            line = bufferedReader.readLine();
        }
        //Write Example
        BufferedWriter writer = new BufferedWriter(new FileWriter("WriteTest.txt"));
        writer.write("HUN\n");
        writer.write("USA\n");
        writer.append("RUS");
        writer.flush();
        writer.newLine();
        writer.newLine();
        writer.newLine();
        writer.write("FRA");
        writer.close();

        /*writer = new BufferedWriter(new FileWriter("WriteTest.txt"));
        writer.append("HELLO ZITA");
        writer.flush();
        writer.close();*/

        FileWriter fileWriter = new FileWriter("WriteTest.txt", true);
        fileWriter.append("HELLO").append("hkjsadhkjsa").append("asdlkkjsadlsa");
        fileWriter.write("asdlkadjsk");




    }
}
