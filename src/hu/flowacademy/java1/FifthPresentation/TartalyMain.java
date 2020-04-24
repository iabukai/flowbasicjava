package hu.flowacademy.java1.FifthPresentation;

import java.io.FileReader;

public class TartalyMain {
    public static void main(String[] args) {
        Tartaly olaj = new Tartaly(0, 100 );
        Tartaly repceolaj = new Tartaly(20, 100 );

        int telitartalyok = 0;

        try {
            olaj.beletolt(120);
            repceolaj.leereszt(30);
        } catch (MegteltException e) {
            telitartalyok++;
            e.printStackTrace();
        } catch (KifogyottException k) {
            //NEM HAGYJUK ÜRESEN!! // EZ VESZÉLYES!
        }

    }
}
