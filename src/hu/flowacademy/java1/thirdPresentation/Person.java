package hu.flowacademy.java1.thirdPresentation;

import java.util.Objects;

public class Person {
    // public / private friendly/package private protected
    int personId;
    private String name;
    private int age;
    private String sex;

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

    public  void print() {

    };
}

