package hu.flowacademy.java1.FifthPresentation;

public class Tartaly {
    private double tartalom = 0;
    private double terfogat;

    public Tartaly(double tartalom, double terfogat) {
        this.tartalom = tartalom;
        this.terfogat = terfogat;
    }

    public Tartaly(double terfogat) {
        this.terfogat = terfogat;
    }

    public double getTartalom() {
        return tartalom;
    }

    public void setTartalom(double tartalom) {
        this.tartalom = tartalom;
    }

    public double getTerfogat() {
        return terfogat;
    }

    public void setTerfogat(double terfogat) {
        this.terfogat = terfogat;
    }

    public void beletolt(double amount) throws MegteltException {
        if(getTartalom() + amount > this.terfogat) {
            this.tartalom = this.terfogat;
            throw new MegteltException("A tartály megtelt!");
        }
    }

    public void leereszt(double amount) throws KifogyottException {
        if(getTartalom()-amount < 0) {
            this.tartalom = 0;
            throw new KifogyottException("A tartály kifogyott");
        }
    }
}
