package hu.flowacademy.java1.secondpresentation;

public class SzulinapiTorta extends Torta {
    int gyertyakSzama;
    int szelet;

    public SzulinapiTorta(int szelet, String iz, int gyertyakSzama) {
        super(szelet, iz);
        this.szelet = 30;
        this.gyertyakSzama = gyertyakSzama;
        //A paraméterben érkezett szelet
        System.out.println(szelet);
        // SzulinapiTorta szelet attribútuma
        System.out.println(this.szelet);
        // Ősosztályban lévő szelet attribútum
        System.out.println(super.szelet);
    }

    @Override
    public int getSzelet() {
        return szelet;
    }

    public int getGyertyakSzama() {
        return gyertyakSzama;
    }

    public void setGyertyakSzama(int gyertyakSzama) {
        this.gyertyakSzama = gyertyakSzama;
    }

    @Override
    public void info() {
        System.out.println( "Ez egy szülinapi torta és a gyertyák száma: " + gyertyakSzama + ". Az íze " + getIz() +". " + getSzelet() + " szeletes");
    }
}
