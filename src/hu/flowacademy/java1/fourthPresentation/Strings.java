package hu.flowacademy.java1.fourthPresentation;

import hu.flowacademy.java1.thirdPresentation.Person;

import javax.swing.*;
import java.util.NoSuchElementException;
import java.util.StringTokenizer;

public class Strings {
    public static void main(String[] args) {
        Dog doggo = new Dog();
        Dog doggo2 = new Dog();
        //System.out.println(doggo == doggo2);
        String str1 = "abc";
        String str2 = "abc";

        String str3 = new String("abc");

        //true
        System.out.println(str1 == str2);
        //false
        System.out.println(str1 == str3);
        //true
        System.out.println(str1.equals(str3));

        String str4 = "abc";
        String str5 = "ab";

        str5 += "c";
        System.out.println(str4);
        System.out.println(str5);
        System.out.println(str4 == str5);
        System.out.println(str4.equals(str5));

        str5 = str5.intern();
        System.out.println("AFter intern " + (str4 == str5));

        "GeeksforGeeks".length();  // returns 13

        "GeeksforGeeks".charAt(3); // returns  ‘k’
        "GeeksforGeeks".substring(3); // returns "ksforGeeks"
        "GeeksforGeeks".substring(2, 5); // returns "eks"
        String s1 = "Geeks";
        String s2 = "forGeeks";
        String output = s1.concat(s2); // returns "GeeksforGeeks"


        String s = "Learn Share Learn";
        int output1 = s.indexOf("Share"); // returns 6


        String s3 = "Learn Share Learn";
        String code = "1728362163#name#id#lkdsakjdlas#asldkjalkjsd";
        int output2 = s.indexOf("#",3);// returns 13

        String s123 = "Learn Share Learn";
        int output3 = s.lastIndexOf("a"); // returns 14

        Boolean out = "Geeks".equals("Geeks"); // returns true
        Boolean out1 = "Geeks".equals("geeks"); // returns false

        Boolean out2= "Geeks".equalsIgnoreCase("Geeks"); // returns true
        Boolean out3 = "Geeks".equalsIgnoreCase("geeks"); // returns true

        int out4= s1.compareTo(s2);  // where s1 ans s2 are
        /*This returns difference s1-s2. If :
        out < 0  // s1 comes before s2
        out = 0  // s1 and s2 are equal.
        out > 0   // s1 comes after s2.*/

        int out5 = s1.compareToIgnoreCase(s2);
        // where s1 ans s2 are
        // strings to be compared

        String word1 = "HeLLo";
        String word2 = word1.toLowerCase(); // returns "hello"

        String word3 = "HeLLo";
        String word4 = word1.toUpperCase(); // returns "HELLO"

        String word5 = " Learn Share Learn ";
        String word6 = word1.trim(); // returns "Learn Share Learn"


        String s10 = "feeksforfeeks";
        String s22 = "feeksforfeeks".replace('f' ,'g'); // returns "geeksgorgeeks"

        StringBuilder stringBuilder = new StringBuilder();
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("Hello");
        System.out.println(stringBuilder.capacity());
        stringBuilder.append("HelloHelloHello1");
        System.out.println(stringBuilder.capacity());
        System.out.println(stringBuilder.toString());
        try {
            Person p = new Person(1,"jon");
            Person p2 = new Person(1,"jack");
            Person p3 = new Person(1,"July");
            Person p4 = new Person(1,"Péntek");

                Person[] tomb = new Person[4];
                tomb[0] = p;
                tomb[1] = p2;
                tomb[2] = p3;
                tomb[3] = p4;


            StringBuilder personNames = new StringBuilder();
            for (int i = 0; i < tomb.length ; i++) {
                personNames.append(tomb[i].getPersonName());
                personNames.append(';');
            }
            System.out.println(personNames.toString());
            System.out.println("---------------------------------------------------");
            StringTokenizer tokenizer = new StringTokenizer(personNames.toString(), ";");

            while(tokenizer.hasMoreTokens()) {
                System.out.println(tokenizer.nextToken());
            }

            System.out.println(tokenizer.nextToken());
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        } catch (NoSuchElementException e) {
            System.out.println(e.toString());
            System.out.println(e.getMessage());
            System.out.println(e.getStackTrace());
        }
    }
}
