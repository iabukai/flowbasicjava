package hu.flowacademy.java1.FifthPresentation;

public class Car implements Comparable {
    public enum Osztalyzat {
        CLASSIC (1),
        SPORT (2),
        VETERAN (3);

        private final int code;

        Osztalyzat(int code) {
            this.code = code;
        }

        public int getCode() {
            return code;
        }

    }
    private int id;
    private Owner owner;
    private int yearOfManufacture;
    private Osztalyzat osztalyzat;

    public Car(int id) {
        this.osztalyzat = Osztalyzat.CLASSIC;
        this.id = id;
    }

    public Osztalyzat getOsztalyzat() {
        return osztalyzat;
    }

    public void setOsztalyzat(Osztalyzat osztalyzat) {
        this.osztalyzat = osztalyzat;
    }

    public Car(int id, Owner owner, int yearOfManufacture) {
        this.id = id;
        this.owner = owner;
        this.yearOfManufacture = yearOfManufacture;
    }

    public Owner getOwner() {
        return owner;
    }

    public void setOwner(Owner owner) {
        this.owner = owner;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }



    public int getYearOfManufacture() {
        return yearOfManufacture;
    }

    public void setYearOfManufacture(int yearOfManufacture) {
        this.yearOfManufacture = yearOfManufacture;
    }

    @Override
    public String toString() {
        return "A " + id + " számú autó tulajdonosa " + owner.getOwner() + ". Az autó gyártási éve: " + yearOfManufacture ;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Car car = (Car) o;

        return owner.equals(car.owner);
    }

    @Override
    public int hashCode() {
        return owner.hashCode();
    }

    @Override
    public int compareTo(Object o) {
        Car car = (Car) o;
        if(this.yearOfManufacture > car.getYearOfManufacture()) {
            return 1;
        } else if (this.yearOfManufacture < car.getYearOfManufacture()) {
            return -1;
        }
        return 0;
    }

}
