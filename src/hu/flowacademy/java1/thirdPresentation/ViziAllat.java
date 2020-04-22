package hu.flowacademy.java1.thirdPresentation;

public abstract class ViziAllat extends Allat implements  Novenyevo{
    public ViziAllat(String nev) {
        super(nev);
    }

    @Override
    public String hangotAd() {
        return "nem hallható a víz alatt";
    }

}
