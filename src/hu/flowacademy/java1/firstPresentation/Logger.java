package hu.flowacademy.java1.firstPresentation;

public class Logger {
    //levels 1 info 2 warn 3 error
    public void print() {
        System.out.println("Basic method of logger use with parameters.");
    }

    public void print(int level, String message) {
        if(level == 1) {
            System.out.println("INFO: " + message);
        }
        if(level == 2) {
            System.out.println("WARN: " + message);
        }

    }

    public void print(int level, String message, long timestamp) {
        if(level == 1) {
            System.out.println(timestamp + " INFO: " + message);
        }
        if(level == 2) {
            System.out.println("WARN: " + message);
        }

    }
}
