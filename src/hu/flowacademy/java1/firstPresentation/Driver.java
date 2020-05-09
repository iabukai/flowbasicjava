package hu.flowacademy.java1.firstPresentation;

import hu.flowacademy.java1.thirdPresentation.Allat;
import hu.flowacademy.java1.thirdPresentation.Person;
import hu.flowacademy.java1.thirdPresentation.ViziAllat;
import hu.flowacademy.java1.thirdPresentation.Whale;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

final public class Driver implements Cloneable {

    private String name;
    private final int age;
    // private int age;
    public static void main(String[] args) throws CloneNotSupportedException {
        int id = 23;
        try {
            FileReader fileReader = new FileReader(new File("hELLO.TXT"));
        } catch (FileNotFoundException exception) {


        }
        String pName = "Jon";
        String valami = new String("ASKDLJSA");
        Person p = null;
        /*p = new Person(id, pName);
        System.out.println(p instanceof Person);*/
        Person.year = 13123;
        Driver driver = new Driver();
        driver.setName("asdds");

        //driver = null;

        String s1 = new String("HELLO");
        String s2 = new String("HELLO");
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));

        //Allat allat = new Whale();

        List<String> asdsa = new ArrayList<>();
        driver.setName("Laci");

        Driver driver2 = (Driver) driver.clone();
        driver2.setName("Józsi");
        System.out.println(driver2.getName());
        System.out.println(driver.getName());


    }

    public Driver() {
        this.age = 123;

    }

    public Driver(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {

        return name;
    }

    public Integer getAge() {
        return age;
    }


    public void setName(String name) {
        System.out.println("SETNAME CALLED" + age);
        this.name = name;
    }
}
