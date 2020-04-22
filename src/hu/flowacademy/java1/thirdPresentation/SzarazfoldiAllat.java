package hu.flowacademy.java1.thirdPresentation;

public abstract class SzarazfoldiAllat extends Allat implements Ragadozo {
    public SzarazfoldiAllat(String nev) {
        super(nev);
    }

    private int labakSzama;

    public int getLabakSzama() {
        return labakSzama;
    }

    public void setLabakSzama(int labakSzama) {
        this.labakSzama = labakSzama;
    }

}
