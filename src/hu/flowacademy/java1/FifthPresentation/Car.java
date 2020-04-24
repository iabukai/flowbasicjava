package hu.flowacademy.java1.FifthPresentation;

public class Car {
    private int id;
    private Owner owner;
    private int yearOfManufacture;

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
}
