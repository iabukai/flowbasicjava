package hu.flowacademy.java1.fourthPresentation;

import java.io.FileNotFoundException;
import java.io.FileReader;

public class ExceptionTest {
    FileReader fileReader;

    public ExceptionTest() throws FileNotFoundException {
        try {
            fileReader = new FileReader("test.txt");
        } catch (FileNotFoundException e) {
            fileReader = new FileReader("test2.txt");
            e.printStackTrace();
        }
    }
}
