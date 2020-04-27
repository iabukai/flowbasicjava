package hu.flowacademy.java1.sixthPresentation;

import hu.flowacademy.java1.FifthPresentation.Car;

import java.util.*;

public class SixthPresentation {
    public static void main(String[] args) {

        List<Integer> test = new ArrayList<>(); //tömbös megvalósítás

        List<Integer> test2 = new LinkedList<>(); //láncolt listás megvalósítás

        test.add(1123);
        test.add(2435);
        test.add(3345765);
        test.add(4123215);
        test.add(521321);
        test.add(634543);
        test.add(712321);

        test2.add(4123215);
        test2.add(2435);
        test2.add(123213123);

        /*Iterator it = test.iterator();
        while(it.hasNext()) {
            System.out.println(it.next());
            it.remove();
        }*/

        test.remove(new Integer(1123));
        test.remove(5);
        printList(test);
        test.removeAll(test2);

        test.add(0,2020); // indexre való beszúrás

        printList(test);
        System.out.println(test.contains(521321));
        System.out.println(test.contains(78788956));

        //Listiterator
        test.add(1213213);
        test.add(1211233);
        test.add(123);

        List<Integer> listiteratortest = new ArrayList<>(); //tömbös megvalósítás
        listiteratortest.add(1);
        listiteratortest.add(2);
        listiteratortest.add(3);
        listiteratortest.add(4);
        listiteratortest.add(5);
        listiteratortest.add(6);


        ListIterator listiteratortestIt = listiteratortest.listIterator(); // kétirányú pásztázást valósít meg
        System.out.println(listiteratortestIt.next());
        listiteratortestIt.set(111111111);
        listiteratortestIt.next();
        listiteratortestIt.next();
        listiteratortestIt.add(22222222);
        printList(listiteratortest);

        List listaKonstruktor = new ArrayList<>(test);

         //ForEach
        for(Integer szam : test) {
            System.out.println("Itt tartunk a listánkban: " + szam);
        }

        //Set
        HashSet<String> hashSetTest = new HashSet<>(); // Hasítótáblás implementáció
        TreeSet<String> treeHashSettest = new TreeSet<>(); //Piros fekete fa algoritmus alapján
        hashSetTest.add("SAD");
        hashSetTest.add("ASD");
        hashSetTest.add("SAD");

        treeHashSettest.add("ASDSAD");
        treeHashSettest.add("ASD");
        treeHashSettest.add("ASD");
        treeHashSettest.add("SAD");
        treeHashSettest.add("SADlksadjlkjsad");

        System.out.println(hashSetTest.size());
        hashSetTest.addAll(treeHashSettest);

        Iterator<String> it = hashSetTest.iterator();

        for(String elem : hashSetTest) {
            System.out.println(elem);
        }/*
        while (it.hasNext()) {
            System.out.println(it.next());
        }*/
        System.out.println("--------------------------------");
        //HashCodes
        Map<String, String> map = new HashMap<>();
        Map<String, String> map1 = new TreeMap<>();

        map.put("Pékárú", "Perec");
        map.put("Sport", "Foci");
        map.put("Film", "Trópusi Vihar");
        Iterator it3 = map.entrySet().iterator();
        while(it3.hasNext()){
            System.out.println(it3.next());
        }
        System.out.println("--------------------------------");

        map.remove("Pékárú");

        System.out.println(map.containsKey("Film"));
        System.out.println(map.containsKey("Sorozat"));

        System.out.println(map.containsValue("Foci"));
        System.out.println(map.containsValue("Röplabda"));

        for(Map.Entry<String, String> entry: map.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }

        List<String> asd = new ArrayList<>();
        asd.add("asd");
        asd.add("lkj");
        asd.add("98712");

        asd.forEach((szoveg) -> {
            szoveg += "ASDSDSASADSADS";


            System.out.println(szoveg);

        });

        map.forEach((key,value)-> {
            System.out.println(key);
            System.out.println(value);
        });

    }

    public static void printList(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println("..............");
    }


    public static void printSet(Set set) {
/*
        for (int i = 0; i < set.size(); i++) {
            System.out.println(set.);
        }
        System.out.println("..............");
        */
    }
}
