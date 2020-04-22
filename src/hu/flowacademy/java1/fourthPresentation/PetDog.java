package hu.flowacademy.java1.fourthPresentation;

/**
 * Pet Dog has an extra method dogName()
 */
public class PetDog extends Dog {

    @Override
    public String getType () {
        System.out.println("PetDog");
        return "PetDog";
    }

    public String dogName () {
        System.out.println("I don't have Name !!");
        return "NO Name";
    }
}
