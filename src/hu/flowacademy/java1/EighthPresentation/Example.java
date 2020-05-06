package hu.flowacademy.java1.EighthPresentation;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.IntSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class Example {
    public static void main(String[] args) throws IOException {
        List<Integer> list = getIntegers();
        //List<Integer> filtered = new ArrayList<>();
        /* Old school : list.forEach(elem -> {
            if(elem % 2 == 0) {
                filtered.add(elem);
            }
        });
        filtered.forEach(elem -> System.out.println(elem));*/
        List<Integer> filtered = list.stream().filter(elem -> elem % 2 == 0).collect(Collectors.toList());

        //filtered.forEach(elem -> System.out.println(elem));

        List<String> testData =  testStringData();
        testData.stream().forEach(System.out::println);
        System.out.println(testData.stream().count());
        testData.stream().sorted().forEach(System.out::println);
        System.out.println("-----------------------------------------------------------");
        List<Word> words = new ArrayList<>();

        testData.stream()
                .filter((elem) -> elem.matches("foo"))
                .map(elem -> new Word(elem))
                .forEach(elem -> words.add(elem));


        //testData.stream().forEach(elem->  words.add(new Word(elem)));
        System.out.println(words.toString());
        // words.addAll(testData.stream().map(elem -> new Word(elem)).collect(Collectors.toList()));
        /*words.stream()
                .filter(elem -> elem.name.length() == 3)
                .collect(Collectors.toList());*/
        System.out.println(words.toString());
        System.out.println("----------------------------------------------------------- 2 ");

        List<Person> personList = new ArrayList<>();
        List<Integer> phoneNumbas = new ArrayList<>();
        phoneNumbas.add(123213);
        phoneNumbas.add(12312321);
        phoneNumbas.add(11233);
        phoneNumbas.add(12312314);

        personList.add(new Person("Jack", phoneNumbas));
        personList.add(new Person("John", phoneNumbas));
        personList.add(new Person("Jennifer", phoneNumbas));

        personList.stream().flatMap(person -> person.phoneNumbers.stream()).forEach(
                System.out::println);

        IntStream.of(1,3,3,2,1).reduce((sum, elem) -> sum += elem);
        System.out.println("----------------------------------------------------------------");
        testData.stream()
                .sorted((a, b) -> {
                    System.out.println("Sort element, compare " + a + " to " + b);
                    return a.compareTo(b);
                })
                .map(str -> {
                    System.out.println("Map element: " + str);
                    return str;
                })
                .filter(str -> {
                    System.out.println("Filter element: " + str);
                    return str.length() > 3;
                })
                .forEach(str -> System.out .println("forEach loop: "+str));

        System.out.println("----------------------------------------------------------------");

        testData.stream()
                .filter(str -> {
                    System.out.println("Filter element: " + str);
                    return str.length() > 3;
                })
                .sorted((a, b) -> {
                    System.out.println("Sort element, compare " + a + " to " + b);
                    return a.compareTo(b);
                })
                .map(str -> {
                    System.out.println("Map element: " + str);
                    return str;
                })
                .forEach(str -> System.out .println("forEach loop: "+str));

        IntSummaryStatistics statistics = IntStream.of(1, 3, 5, 7, 9).summaryStatistics();
        System.out.println(statistics);

        IntStream.range(1,101).filter(elem -> elem % 5 == 0).forEach(System.out::println);

        String[] names = {"Al", "Ankit", "Kushal", "Brent", "Sarika", "amanda", "Hans", "Shivika", "Sarah"};
        Arrays.stream(names).filter(elem -> elem.startsWith("A")).forEach(System.out::println);
        Arrays.stream(names).filter(elem -> elem.startsWith("A")).collect(Collectors.toList()).toArray();

        Stream<String> cars = Files.lines(Paths.get("MOCK_DATA(1).csv"));
        cars.filter(elem -> Integer.parseInt(elem.split(",")[5]) == 1999).forEach(System.out::println);

    }


    private static List<Integer> getIntegers() {
        List<Integer> intList = new ArrayList<>();
        for (int i = 1; i <10 ; i++) {
            intList.add(i);
        }
        return intList;
    }

    private static List<String> testStringData() {
        List<String> strings = new ArrayList<>();
        strings.add("foo");
        strings.add("bar");
        strings.add("home");
        strings.add("world");
        /*strings.add("play");
        strings.add("animal");
        strings.add("sworld");
        strings.add("car");
        strings.add("sun");
        strings.add("java");*/
        return strings;
    }
}
