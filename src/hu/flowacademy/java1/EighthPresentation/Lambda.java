package hu.flowacademy.java1.EighthPresentation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Lambda {
    static String harmadik = "Harmadik";
    private String negyedik = "negyedik";


    public static void main(String[] args) {
        List<Integer> list = getIntegers();
        list.forEach((elem) -> {
           // System.out.println("HELLO");
            System.out.println(elem);
        });

        Comparator<Integer> integerComparator = new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1.compareTo(o2);
            }
        };
        list.sort(integerComparator);
        Comparator<Integer> integerComparator2 = (Integer o1, Integer o2) -> { return o1.compareTo(o2); };
        //Comparator<Integer> integerComparator3 = Comparator::naturalOrder();
        list.sort(integerComparator2);
        Comparator<Integer> integerComparator3 = (Integer o1, Integer o2) -> o1.compareTo(o2);
        list.sort(integerComparator2);

        //LambdaInterface lambdaInterface = () -> System.out.println("hello");
        //lambdaInterface.printRandom();

        Lambda lambda = new Lambda();
        lambda.printIt();


    }

    public void printIt() {
        String prefix = "Ez itt a prefix: ";
        LambdaInterface printItToMe = (param) -> {
           System.out.println(prefix + param + harmadik + negyedik);
        };



        printItToMe.printRandom("HELLO Printit");
        harmadik = " Túl jó ez ";
        printItToMe.printRandom("HELLO Printit");
    }

    private static List<Integer> getIntegers() {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <10 ; i++) {
            intList.add(i);
        }
        return intList;
    }


}
