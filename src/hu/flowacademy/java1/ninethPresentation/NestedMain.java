package hu.flowacademy.java1.ninethPresentation;

public class NestedMain {
    public static void main(String[] args) {
        Nineth nineth = new Nineth();
        // Nineth.InnerClass innerClass = new Nineth.InnerClass();
        nineth.getNewInnerClassInstance();

        System.out.println(nineth.getClass());
        System.out.println(nineth.getNewInnerClassInstance().getClass());

    }
}
