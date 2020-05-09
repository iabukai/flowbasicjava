package hu.flowacademy.java1.EighthPresentation;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ExampleLambda {
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

        String test = "10000";
      /*  Comparator<Integer> compareTo10000 = (Integer o1, Integer o2) -> {
            /*Integer asd = Integer.parseInt(test);
            if(p1.getAge() > p2.getAge()) {
                return 1;
            } else if (p1.getAge() < p2.getAge()) {
                return -1;
            }
            return 0;
        };*/
        test = "asdhkjhjsadk";
        //Comparator<Integer> integerComparator3 = Comparator::naturalOrder();
        //list.sort(compareTo10000);
        Comparator<Integer> integerComparator3 = (Integer o1, Integer o2) -> o1.compareTo(o2);
        //list.sort(compareTo10000);

        //LambdaInterface lambdaInterface = () -> System.out.println("hello");
        //lambdaInterface.printRandom();



    }

    public void printIt() {

    }

    private static List<Integer> getIntegers() {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <10 ; i++) {
            intList.add(i);
        }
        return intList;
    }


}
