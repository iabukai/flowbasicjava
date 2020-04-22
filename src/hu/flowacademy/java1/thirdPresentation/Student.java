package hu.flowacademy.java1.thirdPresentation;

public class Student extends Person {
    int id;
    String name;
    static int studentCount;

    public Student(int id, String name) {
        this.id = id;
        this.name = name;
        this.studentCount++;
    }

    @Override
    public void print() {
        System.out.println("Én egy Tanuló vagyok.");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }
}
