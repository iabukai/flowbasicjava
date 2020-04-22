package hu.flowacademy.java1.fourthPresentation;

import hu.flowacademy.java1.secondpresentation.Torta;

public class UpcastDownCast {

    public static void main(String[] args) {
        Dog doggo = new Dog();
        Dog morzsit = new PetDog();
        Dog rex = new PoliceDog();

        Dog[] dogs = new Dog[]{doggo,morzsit,rex};

        try {
            attack(dogs);
        } catch (CantAttackExceptions cantAttackExceptions) {
            System.out.println("Van olyan kutya a tömbben ami veszélyes;");
        }


    }

    private static void attack(Dog[] dogs) throws CantAttackExceptions {
        for (int i = 0; i < dogs.length; i++) {
            if(!dogs[i].hasAbilityToAttack) {
                throw new CantAttackExceptions();
            }
        }
    }

    public static void test(Object obj) {
        System.out.println(obj instanceof Barkable);
    }

    public static void ugat(Barkable dog) {
      //  System.out.println(dog.getType() + " típusú kutya ugat");
        dog.ugat();
        ((PoliceDog) dog).secretId();
    }
}

