package hu.flowacademy.java1.SeventhPresentation;

import hu.flowacademy.java1.FifthPresentation.Car;

public class Enums {


    public static void main(String[] args) {
        Car car = new Car(1);
        if(car.getOsztalyzat().getCode()  == Car.Osztalyzat.CLASSIC.getCode()) {
            System.out.println("Ez egy klasszikus autó");
        }
    }
}
