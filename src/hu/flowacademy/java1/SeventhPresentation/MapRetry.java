package hu.flowacademy.java1.SeventhPresentation;

import hu.flowacademy.java1.FifthPresentation.Car;
import hu.flowacademy.java1.FifthPresentation.Owner;

import java.util.HashMap;
import java.util.Map;

public class MapRetry {
    /*
    Bucket: Node<K,V>[]
    Default Capacity = 16

    Node<K,V>
        int hash
        K key
        V Value
        Node<K,V> next

       Hash függvény: key.hashCode() % CAPACITY

        0
        1 :
        2 : Laci | 2360507 | 89 | next -> n | 17 | 90 | null
        3
        4
        5
        6
        .
        ..
        ..
        12 : Ádám | 5852847 | 90 | null ->

     */
    public static void main(String[] args) {
        Map<String, Integer> hashmaptest = new HashMap<>();
        System.out.println("Ádám".hashCode());
        System.out.println("Ádám".hashCode() % 16);
        System.out.println("Laci".hashCode());
        System.out.println("Laci".hashCode() % 16);
        hashmaptest.put("Ádám", 90);
        hashmaptest.put("Laci", 89);

        hashmaptest.get("Ádám");
        // "Ádám".hashcode() % 16 = 12

        System.out.println("------------------------------ rossz hashcode ");

        Owner owner1 = new Owner("Johanna", "sad@asd.asd");
        Owner owner2 = new Owner("Johanna", "sad@asd.asd");
        Owner owner3 = new Owner("Johanna", "sad@asd.asd");

        Car car = new Car(1, owner1, 1999);
        Car car2 = new Car(1, owner2, 1989);



        System.out.println(car2.hashCode());
        System.out.println(car2.hashCode() % 16); // 2

        System.out.println(car.equals(car2));

        Map<Car, Integer> hashmaptest2 = new HashMap<>();
        System.out.println(car.hashCode());
        System.out.println(car.hashCode() % 16); //4
        hashmaptest2.put(car2, 1500);
        hashmaptest2.put(car, 1000);


/*
        0
        1 car2 | 93122545 | 1500 | null
        2
        3
        4 car | 1209271652 | 1000 | -> car | 456456456564 | 1000 | ->
 */
        Car car3 = new Car(1, owner3, 2000);


        System.out.println(car3.hashCode() % 16); // 2
        System.out.println(car2.equals(car3)); // true

        System.out.println(hashmaptest2.get(car3));


        System.out.println(car.hashCode());
        System.out.println(car2.hashCode());
        System.out.println(car3.hashCode());
    }

    @Override
    public int hashCode() {
        return super.hashCode();
    }

    @Override
    public boolean equals(Object obj) {
        return super.equals(obj);
    }
}
