package hu.flowacademy.java1;

public class ArithmeticOperators {
    public static void main(String[] args)
    {
        // +  -  *   /  %
        int num = 5;
        // first 5 gets printed and then
        // decremented to 4
        System.out.println("Post decrement = " + num--);

        System.out.println("num = " + num);

        // num was 4, decremented to 3
        // then printed
        System.out.println("Pre decrement = " + --num);

        //Example. this code runs at the beginning of december:
        int currentMonth = 11;
        int nextMonth = currentMonth++;
        if(nextMonth == 12) {
            System.out.println("Bónuszra jogosult!");
        } else {
            System.out.println("Bónuszra csak a 12. hónapban jogosult");
        }

    }
}
