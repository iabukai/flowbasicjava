package hu.flowacademy.java1.thirdPresentation;

public class UniversityMain {
    public static void main(String[] args) {
        University u = new University();
        University szeged = new UniversityOfSzeged();
        UniversityOfDebrecen universityOfDebrecen = new UniversityOfDebrecen();
        System.out.println(u.code);
        System.out.println(szeged.code);
        System.out.println(universityOfDebrecen.code);
        System.out.println(universityOfDebrecen.getClass().toString().lastIndexOf('.'));

    }
}
