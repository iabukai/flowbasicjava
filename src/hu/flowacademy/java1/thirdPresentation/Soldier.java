package hu.flowacademy.java1.thirdPresentation;

import hu.flowacademy.java1.thirdPresentation.Person;

public class Soldier extends Person {
    public Soldier() {
        super();
    }

    @Override
    public void print() {
        System.out.println("Én egy katona vagyok!");
    }

    public void attack() {
        System.out.println("Attack the enemy");
    }

}

