package hu.flowacademy.java1.secondpresentation;

public class Torta extends Sutemeny{
    static int szelet;
    private static  String iz;

    public Torta(int szelet, String iz) {
        this.szelet = szelet;
        this.iz = iz;
    }

    public void getDiscountForSlices() {
        int szelet;
        szelet = 20;
        /*System.out.println(szelet);
        System.out.println(this.szelet);*/
    }

    public void info() {
        System.out.println("Ez egy " + iz + "ízű torta és " + szelet + " szeletes");
    }

    public int getSzelet() {
        return szelet;
    }

    public void setSzelet(int szelet) {
        this.szelet = szelet;
    }

    public String getIz() {
        return iz;
    }

    public void setIz(String iz) {
        this.iz = iz;
    }
}
