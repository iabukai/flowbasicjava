package hu.flowacademy.java1.FifthPresentation;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;

public class CarMain {
    public static void main(String[] args) throws IOException {

        BufferedReader bufferedReader = new BufferedReader((new FileReader("MOCK_DATA(1).csv")));
        String line = bufferedReader.readLine(); // 1,Gerald,Shooter,gshooter0@is.gd,Male,1997

        Car[] cars = new Car[1000];
        int count = 0;
        while (line != null) {
            String[] broken = line.split(","); // [1, Gerald, Shooter, gshooter0@is.gd, Male, 1997]
            System.out.println(Arrays.toString(broken));
            Owner owner = new Owner(broken[1].concat(broken[2]), broken[3]);
            cars[count] = new Car(Integer.parseInt(broken[0]), owner, Integer.parseInt(broken[5]));

            //utómunka
            count++;
            line = bufferedReader.readLine();
           /* StringTokenizer stringTokenizer = new StringTokenizer(line, ",");

            int id = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken() + " " +stringTokenizer.nextToken();
            Owner owner = new Owner(name, stringTokenizer.nextToken());

            stringTokenizer.nextToken();

            int yom = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(count);
            cars[count] = new Car(id, owner, yom);
*/

        }

        for (int i = 0; i < cars.length ; i++) {
            //System.out.println(cars[i]);
        }
    }
    public static List<Car> getCars() throws IOException {
        BufferedReader bufferedReader = new BufferedReader((new FileReader("MOCK_DATA(1).csv")));
        String line = bufferedReader.readLine(); // 1,Gerald,Shooter,gshooter0@is.gd,Male,1997

        Car[] cars = new Car[1000];
        int count = 0;
        while (line != null) {
            String[] broken = line.split(","); // [1, Gerald, Shooter, gshooter0@is.gd, Male, 1997]
            System.out.println(Arrays.toString(broken));
            Owner owner = new Owner(broken[1].concat(broken[2]), broken[3]);
            cars[count] = new Car(Integer.parseInt(broken[0]), owner, Integer.parseInt(broken[5]));

            //utómunka
            count++;
            line = bufferedReader.readLine();
           /* StringTokenizer stringTokenizer = new StringTokenizer(line, ",");

            int id = Integer.parseInt(stringTokenizer.nextToken());
            String name = stringTokenizer.nextToken() + " " +stringTokenizer.nextToken();
            Owner owner = new Owner(name, stringTokenizer.nextToken());

            stringTokenizer.nextToken();

            int yom = Integer.parseInt(stringTokenizer.nextToken());

            System.out.println(count);
            cars[count] = new Car(id, owner, yom);
*/

        }
        return Arrays.asList(cars);
    }
}

