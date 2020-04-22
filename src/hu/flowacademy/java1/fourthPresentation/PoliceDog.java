package hu.flowacademy.java1.fourthPresentation;

/**
 * Police Dog has an extra method secretId()
 */
public class PoliceDog extends PetDog {

    public PoliceDog() {
        hasAbilityToAttack = true;
    }

    public String secretId() {
        System.out.println("ID");
        return "ID";
    }

    public String getType () {
        System.out.println("I am a Police Dog");
        return "Police Dog";
    }


}
