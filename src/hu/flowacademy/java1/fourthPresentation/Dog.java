package hu.flowacademy.java1.fourthPresentation;

public class Dog implements Barkable {
    boolean hasAbilityToAttack = false;
    public String getType () {
        System.out.println("NormalDog");
        return "NormalDog";
    }

    @Override
    public void ugat() {
        System.out.println("Ugat");
    }

    @Override
    public void pitiz() {
        System.out.println("Pitiz");
    }

    @Override
    public void visszahoz(Object obj) {
        System.out.println("Visszahozta a " + obj.toString());
    }
}
