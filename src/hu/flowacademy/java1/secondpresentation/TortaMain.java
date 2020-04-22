package hu.flowacademy.java1.secondpresentation;

public class TortaMain {
    public static void main(String[] args) {
        Torta[] tortak = new Torta[3];
        tortak[0] = new Torta(12,"csoki");
        tortak[1] = new SzulinapiTorta(12,"eper",13);
        // tortak[2] = new SzulinapiTorta(12,"eper",30);

        for (int i = 0; i < tortak.length ; i++) {

        }

        Torta t = new Torta(12,"csoki");
        //t.getDiscountForSlices();

        SzulinapiTorta szulinapiTorta = new SzulinapiTorta(40,"CSoki", 30);


    }
}
