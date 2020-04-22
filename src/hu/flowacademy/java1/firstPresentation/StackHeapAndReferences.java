package hu.flowacademy.java1.firstPresentation;

import java.util.Arrays;

public class StackHeapAndReferences {

    public static void main(String[] args) {
        int[] numbers = {1, 9, 8, 9, 1, 1, 1, 0};
        int[] codes = {123,1235,45,465,87676,9873456};
        //Öröklődésnél elővenni
        //System.out.println(codes instanceof Object);

        // Print References
        System.out.println("Codes " + codes );
        System.out.println("Numbers" + numbers);
        System.out.println("NUmbers 0. eleme: " + numbers[0]);
        numbers = codes;
        System.out.println(Arrays.toString(numbers));

        //Mit írunk itt ki?
        System.out.println("NUmbers 0. eleme " + numbers[0]);
        System.out.println("Codes " + codes);
        System.out.println("Numbers" + numbers);
        codes[0] = 100;
        System.out.println("NUmbers 0. eleme " + numbers[0]);

        numbers = Arrays.copyOf(codes, codes.length);
        System.out.println("Codes " + codes);
        System.out.println("Numbers" + numbers);

        codes[0] = 10000;
        System.out.println("NUmbers 0. eleme " + numbers[0]);
        System.out.println("Codes 0. eleme " + codes[0]);

        //Mi történik az eredeti numbers-el?
    }



}
