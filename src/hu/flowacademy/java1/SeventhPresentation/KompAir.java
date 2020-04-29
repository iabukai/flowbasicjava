package hu.flowacademy.java1.SeventhPresentation;

import hu.flowacademy.java1.FifthPresentation.Car;
import hu.flowacademy.java1.FifthPresentation.CarMain;
import hu.flowacademy.java1.thirdPresentation.Person;
import jdk.swing.interop.SwingInterOpUtils;

import java.io.IOException;
import java.util.*;

public class KompAir {
    public static void main(String[] args) {

        Integer kicsi = -100;
        Integer kicsi2 = 100;
        Integer nagy = 1000;
        Integer nagy2 = 1000;
        System.out.println("------------------------------- Integer Compare ");
        System.out.println(Integer.compare(kicsi,nagy)); // kisebb
        System.out.println(Integer.compare(nagy2,nagy)); // egyenlő
        System.out.println(Integer.compare(nagy2,kicsi)); // nagyobb

        System.out.println(kicsi.compareTo(nagy2));
        // System.out.println(Integer.compareUnsigned(kicsi,kicsi2)); //házi Stackoverflow

        String compareTest = "c";
        String compareTest2 = "b";
        String compareTest3 = "a";

        System.out.println("------------------------------- String Compare ");
        System.out.println(compareTest.compareTo(compareTest2));
        System.out.println(compareTest.compareTo(compareTest3));
        System.out.println(compareTest2.compareTo(compareTest2));
        System.out.println("------------------------------- String Compare Vol2");

        compareTest = "Kóla";
        compareTest2 = "Puska";
        compareTest3 = "Sültkrumpli";

        System.out.println(compareTest.compareTo(compareTest2));
        System.out.println(compareTest.compareTo(compareTest3));
        System.out.println(compareTest2.compareTo(compareTest2));



        System.out.println("------------------------------- Sort");
        Car car = new Car(3);
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(1000);
        list.add(100);
        list.add(100000);
        list.add(10000);

        Collections.sort(list);
        for(Integer elem : list) {
            System.out.println(elem);
        }

        Car car2 = new Car(3);
        List<Car> carList = null;
        try {
            carList = CarMain.getCars();
            Collections.sort(carList);
            for (Car elem : carList) {
                System.out.println(elem.getYearOfManufacture());
            }
        } catch (IOException e) {
            System.out.println("Nem találtuk meg a forrásfájlt vagy valami genya történt" +  e.getMessage());

        }
        List<Person> personList = new ArrayList<>();

        Collections.sort(personList, new AgeComparator());













    }
}
