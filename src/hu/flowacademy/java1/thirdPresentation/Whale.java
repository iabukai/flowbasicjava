package hu.flowacademy.java1.thirdPresentation;

public class Whale extends ViziAllat implements Ragadozo {
    public Whale(String nev) {
        super(nev);
    }

    @Override
    public void hangotAd2() {

    }

    @Override
    public void eszik(Allat kit) {
        System.out.println("Megettem egy " + kit.getClass());
    }

    @Override
    public void pihenes(int mennyit) {
        System.out.println("Pihentem " + mennyit + " percet");
    }

    @Override
    public void eszik() {

    }
}
