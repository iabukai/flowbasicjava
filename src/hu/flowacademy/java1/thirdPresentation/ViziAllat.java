package hu.flowacademy.java1.thirdPresentation;

import hu.flowacademy.java1.fourthPresentation.Barkable;

public abstract class ViziAllat extends Allat implements Novenyevo, Barkable{
    public ViziAllat(String nev) {
        super(nev);
    }

    @Override
    public String hangotAd() {
        return "nem hallható a víz alatt";
    }

    @Override
    public void ugat() {

    }

    @Override
    public void pitiz() {

    }

    @Override
    public void visszahoz(Object obj) {

    }

    public void visszahoz() {

    }
}
