package hu.flowacademy.java1.thirdPresentation;

import hu.flowacademy.java1.thirdPresentation.Person;
import hu.flowacademy.java1.thirdPresentation.PoliceOfficer;
import hu.flowacademy.java1.thirdPresentation.Soldier;
import hu.flowacademy.java1.thirdPresentation.Student;

import java.time.Period;

public class Example {
    public int count;
    private final int pcs;

    public Example() {
        this.pcs = 15;
    }

    public Example(int count, int pcs) {
        this.count = count;
        this.pcs = pcs;
    }

    public static void main(String[] args) {
        PoliceOfficer p = new PoliceOfficer();
        Soldier s = new Soldier();
        Student student = new Student(1,"Hello");
        p.print();
        s.print();
        student.print();
        Circle kor = new Circle();
        System.out.println(kor.getCornerCount());
        System.out.println(kor.getName());

    }
}
