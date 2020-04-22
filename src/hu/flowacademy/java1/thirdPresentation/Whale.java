package hu.flowacademy.java1.thirdPresentation;

public abstract class Whale extends ViziAllat implements Ragadozo {
    public Whale(String nev) {
        super(nev);
    }

    @Override
    public void eszik(Allat kit) {
        System.out.println("Megettem egy " + kit.getClass());
    }

    @Override
    public void pihenes(int mennyit) {
        System.out.println("Pihentem " + mennyit + " percet");
    }
}
