package hu.flowacademy.java1;

public class StaticObj {
    static private int count = 0;
    public StaticObj() {
        this.count++;
        System.out.println("A rendszerben már " + count + "darab osztálypéldányunk van ");
    }

    @Override
    public String toString() {
        return "Az én nevem " + this + " és " + count + "darab hasonló osztálypéldány van a memóriában." ;
    }

    public static int getCount() {
        return count;
    }
}
