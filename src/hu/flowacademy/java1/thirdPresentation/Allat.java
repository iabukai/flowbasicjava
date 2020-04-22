package hu.flowacademy.java1.thirdPresentation;

public abstract class Allat {
    private String nev;
    private int jollakottsag;
    private int ero;


    public Allat(String nev) {
        this.nev = nev;
        this.jollakottsag = 100;
        this.ero = 0;
    }

    // getterek, szetterek

    public abstract String hangotAd();
    public abstract void hangotAd2();
}
