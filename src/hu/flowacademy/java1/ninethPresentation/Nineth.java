package hu.flowacademy.java1.ninethPresentation;

import hu.flowacademy.java1.thirdPresentation.Person;

import java.util.ArrayList;
import java.util.List;

public class Nineth {
    String member = "asdsad";
    static Integer member2 = 1;

    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        var szoveg = "ASDSJKSD";
        var szam = 12.0;
        var szam2 = 1;

        var list2 = new ArrayList<>();
        list2.add("asddsa");
        list2.add(1,1);
        list2.add(new Person());
        list2.forEach(elem -> System.out.println(elem.toString()));
        /*var vmi;
        var vmi2 = null;*/
        //InnerClass innerClass = new InnerClass();
        Person person1 = new Person();
        person1.print();

        Person person = new Person() {
            @Override
            public void print() {
                System.out.println("ANONYMUS CLASSSBÓL");
            }

        };

        Person person3 = new Person(1,"ksadlkaslj") {
            @Override
            public void print() {
                System.out.println("ANONYMUS CLASSSBÓL");
            }

        };
        person.print();


    }

    public InnerClass getNewInnerClassInstance() {
       return new InnerClass();
    }

    class InnerClass {
        public InnerClass() {
            member = "asdsa";
            member2 = 100;
        }
    }

    static class StaticInnerClass {
        static String something = "adsasd";

        public StaticInnerClass() {
            // member = "asdsa";
            member2 = 100;
            Nineth nine = new Nineth();


        }
    }

}
