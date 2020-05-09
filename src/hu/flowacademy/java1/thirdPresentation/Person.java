package hu.flowacademy.java1.thirdPresentation;

import java.util.Comparator;
import java.util.Objects;

public class Person {
    // public / private friendly/package private protected
    int personId;
    private String name;
    private int age;
    private String sex;
    public static int year = 2020;

    public Person() {
        this.personId = 0;
        this.name ="undefined";
    }

    public Person(int personId, String pName) {
        this.personId = personId;
        setPersonName(pName);
    }

    public String getPersonName() {
        return name;
    }

    public String getPersonInfo(){
        return "A személy neve: " + name;

    }

    public void setPersonName(String name) {
        this.name = name;
        // StackOverflow
        // setPersonName("barmi");
    }

    public void print() {
        System.out.println("EREDETI PRINT");
    };

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static Integer getYear() {
        return year;
    }

    public static void setYear(Integer year) {
        Person.year = year;
    }
}

